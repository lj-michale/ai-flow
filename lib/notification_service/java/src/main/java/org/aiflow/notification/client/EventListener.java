/*
 * Copyright 2022 The AI Flow Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.aiflow.notification.client;

import com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.aiflow.notification.entity.EventMeta;
import org.aiflow.notification.proto.NotificationServiceGrpc;
import org.apache.commons.collections4.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import static org.aiflow.notification.client.EmbeddedNotificationClient.listAllEvents;

public class EventListener {

    private static final Logger logger = LoggerFactory.getLogger(EventListener.class);
    private final NotificationServiceGrpc.NotificationServiceBlockingStub serviceStub;
    private final String namespace;
    private final List<String> eventKeys;
    private final long startOffset;
    private final ListenerProcessor listernerProcessor;
    private final ExecutorService executorService;
    private final int timeoutSeconds;
    private volatile boolean isRunning = true;

    public EventListener(
            NotificationServiceGrpc.NotificationServiceBlockingStub serviceStub,
            String namespace,
            List<String> eventKeys,
            long startOffset,
            ListenerProcessor listernerProcessor,
            Integer timeoutSeconds) {
        this.serviceStub = serviceStub;
        this.namespace = namespace;
        this.eventKeys = eventKeys;
        this.startOffset = startOffset;
        this.listernerProcessor = listernerProcessor;
        this.timeoutSeconds = timeoutSeconds;
        this.executorService =
                Executors.newSingleThreadExecutor(
                        new ThreadFactoryBuilder()
                                .setDaemon(true)
                                .setNameFormat("listen-notification-%d")
                                .build());
    }

    public void start() {
        this.executorService.submit(listenEvents());
    }

    public void shutdown() {
        this.isRunning = false;
        this.executorService.shutdown();
        try {
            this.executorService.awaitTermination(5000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException ex) {
            logger.error("gRPC channel shutdown interrupted");
        }
    }

    private boolean match(String eventKey, String namespace, EventMeta event) {
        if (eventKey != null && !eventKey.equals(event.getKey())) {
            return false;
        }
        if (namespace != null && !namespace.equals(event.getNamespace())) {
            return false;
        }
        return true;
    }

    private List<EventMeta> filterEvents(List<String> eventKeys, List<EventMeta> events) {
        if (eventKeys == null) {
            return events;
        }
        List<EventMeta> results = new ArrayList<>();
        for (EventMeta event : events) {
            for (String key : eventKeys) {
                if (match(key, this.namespace, event)) {
                    results.add(event);
                    break;
                }
            }
        }
        return results;
    }

    public Runnable listenEvents() {
        return () -> {
            long listenOffset = this.startOffset;
            while (this.isRunning) {
                try {
                    if (Thread.currentThread().isInterrupted()) {
                        break;
                    }
                    List<EventMeta> events =
                            listAllEvents(
                                    this.serviceStub,
                                    null,
                                    listenOffset,
                                    null,
                                    this.timeoutSeconds);
                    if (events.size() > 0) {
                        events = filterEvents(eventKeys, events);
                    }
                    if (CollectionUtils.isNotEmpty(events)) {
                        this.listernerProcessor.process(events);
                        listenOffset = events.get(events.size() - 1).getOffset();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new RuntimeException("Error while listening notification", e);
                }
            }
        };
    }
}

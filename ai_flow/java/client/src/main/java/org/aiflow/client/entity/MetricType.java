/*
 * Copyright 2022 The AI Flow Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aiflow.client.entity;

import org.aiflow.client.proto.Message;

public enum MetricType {
    DATASET(Message.MetricTypeProto.DATASET),
    MODEL(Message.MetricTypeProto.MODEL);

    private Message.MetricTypeProto metricType;

    MetricType(Message.MetricTypeProto metricType) {
        this.metricType = metricType;
    }

    public Message.MetricTypeProto getMetricType() {
        return metricType;
    }

    public static MetricType getMetricTypeFromValue(Message.MetricTypeProto value) {
        for (MetricType t : values()) {
            if (t.getMetricType().equals(value)) {
                return t;
            }
        }
        return null;
    }
}

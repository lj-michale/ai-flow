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

package org.aiflow.notification.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 * <pre>
 * AirFlowService provides notification function rest endpoint of NotificationService for Notification Service component.
 * Functions of NotificationService include:
 *  1.Send event.
 *  2.List events.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.29.0-SNAPSHOT)",
    comments = "Source: notification_service.proto")
public final class NotificationServiceGrpc {

  private NotificationServiceGrpc() {}

  public static final String SERVICE_NAME = "notification_service.NotificationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse> getSendEventMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "sendEvent",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse> getSendEventMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse> getSendEventMethod;
    if ((getSendEventMethod = NotificationServiceGrpc.getSendEventMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getSendEventMethod = NotificationServiceGrpc.getSendEventMethod) == null) {
          NotificationServiceGrpc.getSendEventMethod = getSendEventMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "sendEvent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("sendEvent"))
              .build();
        }
      }
    }
    return getSendEventMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> getListEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listEvents",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> getListEventsMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> getListEventsMethod;
    if ((getListEventsMethod = NotificationServiceGrpc.getListEventsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getListEventsMethod = NotificationServiceGrpc.getListEventsMethod) == null) {
          NotificationServiceGrpc.getListEventsMethod = getListEventsMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("listEvents"))
              .build();
        }
      }
    }
    return getListEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse> getCountEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "countEvents",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse> getCountEventsMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse> getCountEventsMethod;
    if ((getCountEventsMethod = NotificationServiceGrpc.getCountEventsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getCountEventsMethod = NotificationServiceGrpc.getCountEventsMethod) == null) {
          NotificationServiceGrpc.getCountEventsMethod = getCountEventsMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "countEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("countEvents"))
              .build();
        }
      }
    }
    return getCountEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> getListAllEventsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listAllEvents",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> getListAllEventsMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> getListAllEventsMethod;
    if ((getListAllEventsMethod = NotificationServiceGrpc.getListAllEventsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getListAllEventsMethod = NotificationServiceGrpc.getListAllEventsMethod) == null) {
          NotificationServiceGrpc.getListAllEventsMethod = getListAllEventsMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listAllEvents"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("listAllEvents"))
              .build();
        }
      }
    }
    return getListAllEventsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getNotifyMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notify",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getNotifyMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getNotifyMethod;
    if ((getNotifyMethod = NotificationServiceGrpc.getNotifyMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getNotifyMethod = NotificationServiceGrpc.getNotifyMethod) == null) {
          NotificationServiceGrpc.getNotifyMethod = getNotifyMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "notify"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("notify"))
              .build();
        }
      }
    }
    return getNotifyMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse> getListMembersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listMembers",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse> getListMembersMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse> getListMembersMethod;
    if ((getListMembersMethod = NotificationServiceGrpc.getListMembersMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getListMembersMethod = NotificationServiceGrpc.getListMembersMethod) == null) {
          NotificationServiceGrpc.getListMembersMethod = getListMembersMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listMembers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("listMembers"))
              .build();
        }
      }
    }
    return getListMembersMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getNotifyNewMemberMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "notifyNewMember",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getNotifyNewMemberMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getNotifyNewMemberMethod;
    if ((getNotifyNewMemberMethod = NotificationServiceGrpc.getNotifyNewMemberMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getNotifyNewMemberMethod = NotificationServiceGrpc.getNotifyNewMemberMethod) == null) {
          NotificationServiceGrpc.getNotifyNewMemberMethod = getNotifyNewMemberMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "notifyNewMember"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("notifyNewMember"))
              .build();
        }
      }
    }
    return getNotifyNewMemberMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse> getRegisterClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "registerClient",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse> getRegisterClientMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse> getRegisterClientMethod;
    if ((getRegisterClientMethod = NotificationServiceGrpc.getRegisterClientMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getRegisterClientMethod = NotificationServiceGrpc.getRegisterClientMethod) == null) {
          NotificationServiceGrpc.getRegisterClientMethod = getRegisterClientMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "registerClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("registerClient"))
              .build();
        }
      }
    }
    return getRegisterClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getDeleteClientMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteClient",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getDeleteClientMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> getDeleteClientMethod;
    if ((getDeleteClientMethod = NotificationServiceGrpc.getDeleteClientMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getDeleteClientMethod = NotificationServiceGrpc.getDeleteClientMethod) == null) {
          NotificationServiceGrpc.getDeleteClientMethod = getDeleteClientMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteClient"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("deleteClient"))
              .build();
        }
      }
    }
    return getDeleteClientMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse> getIsClientExistsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "isClientExists",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse> getIsClientExistsMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse> getIsClientExistsMethod;
    if ((getIsClientExistsMethod = NotificationServiceGrpc.getIsClientExistsMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getIsClientExistsMethod = NotificationServiceGrpc.getIsClientExistsMethod) == null) {
          NotificationServiceGrpc.getIsClientExistsMethod = getIsClientExistsMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "isClientExists"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("isClientExists"))
              .build();
        }
      }
    }
    return getIsClientExistsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse> getTimestampToEventOffsetMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "timestampToEventOffset",
      requestType = org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest.class,
      responseType = org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest,
      org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse> getTimestampToEventOffsetMethod() {
    io.grpc.MethodDescriptor<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse> getTimestampToEventOffsetMethod;
    if ((getTimestampToEventOffsetMethod = NotificationServiceGrpc.getTimestampToEventOffsetMethod) == null) {
      synchronized (NotificationServiceGrpc.class) {
        if ((getTimestampToEventOffsetMethod = NotificationServiceGrpc.getTimestampToEventOffsetMethod) == null) {
          NotificationServiceGrpc.getTimestampToEventOffsetMethod = getTimestampToEventOffsetMethod =
              io.grpc.MethodDescriptor.<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest, org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "timestampToEventOffset"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NotificationServiceMethodDescriptorSupplier("timestampToEventOffset"))
              .build();
        }
      }
    }
    return getTimestampToEventOffsetMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NotificationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceStub>() {
        @java.lang.Override
        public NotificationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceStub(channel, callOptions);
        }
      };
    return NotificationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceBlockingStub>() {
        @java.lang.Override
        public NotificationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceBlockingStub(channel, callOptions);
        }
      };
    return NotificationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NotificationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NotificationServiceFutureStub>() {
        @java.lang.Override
        public NotificationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NotificationServiceFutureStub(channel, callOptions);
        }
      };
    return NotificationServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   * AirFlowService provides notification function rest endpoint of NotificationService for Notification Service component.
   * Functions of NotificationService include:
   *  1.Send event.
   *  2.List events.
   * </pre>
   */
  public static abstract class NotificationServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     * Send event.
     * </pre>
     */
    public void sendEvent(org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSendEventMethod(), responseObserver);
    }

    /**
     * <pre>
     * List events.
     * </pre>
     */
    public void listEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Count events.
     * </pre>
     */
    public void countEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCountEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * List all events
     * </pre>
     */
    public void listAllEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListAllEventsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Accepts notifications from other members.
     * </pre>
     */
    public void notify(org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyMethod(), responseObserver);
    }

    /**
     * <pre>
     * List current living members.
     * </pre>
     */
    public void listMembers(org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListMembersMethod(), responseObserver);
    }

    /**
     * <pre>
     * Notify current members that there is a new member added.
     * </pre>
     */
    public void notifyNewMember(org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getNotifyNewMemberMethod(), responseObserver);
    }

    /**
     * <pre>
     * Register notification client in the db of notification service
     * </pre>
     */
    public void registerClient(org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Delete notification client
     * </pre>
     */
    public void deleteClient(org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteClientMethod(), responseObserver);
    }

    /**
     * <pre>
     * Check if a notification client has been registered in the db
     * </pre>
     */
    public void isClientExists(org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getIsClientExistsMethod(), responseObserver);
    }

    /**
     * <pre>
     * Get the event offset by timestamp
     * </pre>
     */
    public void timestampToEventOffset(org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getTimestampToEventOffsetMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSendEventMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse>(
                  this, METHODID_SEND_EVENT)))
          .addMethod(
            getListEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse>(
                  this, METHODID_LIST_EVENTS)))
          .addMethod(
            getCountEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse>(
                  this, METHODID_COUNT_EVENTS)))
          .addMethod(
            getListAllEventsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse>(
                  this, METHODID_LIST_ALL_EVENTS)))
          .addMethod(
            getNotifyMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>(
                  this, METHODID_NOTIFY)))
          .addMethod(
            getListMembersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse>(
                  this, METHODID_LIST_MEMBERS)))
          .addMethod(
            getNotifyNewMemberMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>(
                  this, METHODID_NOTIFY_NEW_MEMBER)))
          .addMethod(
            getRegisterClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse>(
                  this, METHODID_REGISTER_CLIENT)))
          .addMethod(
            getDeleteClientMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>(
                  this, METHODID_DELETE_CLIENT)))
          .addMethod(
            getIsClientExistsMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse>(
                  this, METHODID_IS_CLIENT_EXISTS)))
          .addMethod(
            getTimestampToEventOffsetMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest,
                org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse>(
                  this, METHODID_TIMESTAMP_TO_EVENT_OFFSET)))
          .build();
    }
  }

  /**
   * <pre>
   * AirFlowService provides notification function rest endpoint of NotificationService for Notification Service component.
   * Functions of NotificationService include:
   *  1.Send event.
   *  2.List events.
   * </pre>
   */
  public static final class NotificationServiceStub extends io.grpc.stub.AbstractAsyncStub<NotificationServiceStub> {
    private NotificationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send event.
     * </pre>
     */
    public void sendEvent(org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSendEventMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List events.
     * </pre>
     */
    public void listEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Count events.
     * </pre>
     */
    public void countEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCountEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List all events
     * </pre>
     */
    public void listAllEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListAllEventsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Accepts notifications from other members.
     * </pre>
     */
    public void notify(org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * List current living members.
     * </pre>
     */
    public void listMembers(org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Notify current members that there is a new member added.
     * </pre>
     */
    public void notifyNewMember(org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getNotifyNewMemberMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Register notification client in the db of notification service
     * </pre>
     */
    public void registerClient(org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Delete notification client
     * </pre>
     */
    public void deleteClient(org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Check if a notification client has been registered in the db
     * </pre>
     */
    public void isClientExists(org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getIsClientExistsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     * Get the event offset by timestamp
     * </pre>
     */
    public void timestampToEventOffset(org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest request,
        io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getTimestampToEventOffsetMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   * AirFlowService provides notification function rest endpoint of NotificationService for Notification Service component.
   * Functions of NotificationService include:
   *  1.Send event.
   *  2.List events.
   * </pre>
   */
  public static final class NotificationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NotificationServiceBlockingStub> {
    private NotificationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send event.
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse sendEvent(org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest request) {
      return blockingUnaryCall(
          getChannel(), getSendEventMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List events.
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse listEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Count events.
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse countEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getCountEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List all events
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse listAllEvents(org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListAllEventsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Accepts notifications from other members.
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse notify(org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotifyMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * List current living members.
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse listMembers(org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMembersMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Notify current members that there is a new member added.
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse notifyNewMember(org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest request) {
      return blockingUnaryCall(
          getChannel(), getNotifyNewMemberMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Register notification client in the db of notification service
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse registerClient(org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest request) {
      return blockingUnaryCall(
          getChannel(), getRegisterClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Delete notification client
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse deleteClient(org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteClientMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Check if a notification client has been registered in the db
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse isClientExists(org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getIsClientExistsMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     * Get the event offset by timestamp
     * </pre>
     */
    public org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse timestampToEventOffset(org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest request) {
      return blockingUnaryCall(
          getChannel(), getTimestampToEventOffsetMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   * AirFlowService provides notification function rest endpoint of NotificationService for Notification Service component.
   * Functions of NotificationService include:
   *  1.Send event.
   *  2.List events.
   * </pre>
   */
  public static final class NotificationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NotificationServiceFutureStub> {
    private NotificationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     * Send event.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse> sendEvent(
        org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSendEventMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> listEvents(
        org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Count events.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse> countEvents(
        org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCountEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List all events
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse> listAllEvents(
        org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListAllEventsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Accepts notifications from other members.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> notify(
        org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * List current living members.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse> listMembers(
        org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMembersMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Notify current members that there is a new member added.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> notifyNewMember(
        org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getNotifyNewMemberMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Register notification client in the db of notification service
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse> registerClient(
        org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Delete notification client
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse> deleteClient(
        org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteClientMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Check if a notification client has been registered in the db
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse> isClientExists(
        org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getIsClientExistsMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     * Get the event offset by timestamp
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse> timestampToEventOffset(
        org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getTimestampToEventOffsetMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SEND_EVENT = 0;
  private static final int METHODID_LIST_EVENTS = 1;
  private static final int METHODID_COUNT_EVENTS = 2;
  private static final int METHODID_LIST_ALL_EVENTS = 3;
  private static final int METHODID_NOTIFY = 4;
  private static final int METHODID_LIST_MEMBERS = 5;
  private static final int METHODID_NOTIFY_NEW_MEMBER = 6;
  private static final int METHODID_REGISTER_CLIENT = 7;
  private static final int METHODID_DELETE_CLIENT = 8;
  private static final int METHODID_IS_CLIENT_EXISTS = 9;
  private static final int METHODID_TIMESTAMP_TO_EVENT_OFFSET = 10;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SEND_EVENT:
          serviceImpl.sendEvent((org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.SendEventsResponse>) responseObserver);
          break;
        case METHODID_LIST_EVENTS:
          serviceImpl.listEvents((org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse>) responseObserver);
          break;
        case METHODID_COUNT_EVENTS:
          serviceImpl.countEvents((org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CountEventsResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL_EVENTS:
          serviceImpl.listAllEvents((org.aiflow.notification.proto.NotificationServiceOuterClass.ListAllEventsRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListEventsResponse>) responseObserver);
          break;
        case METHODID_NOTIFY:
          serviceImpl.notify((org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>) responseObserver);
          break;
        case METHODID_LIST_MEMBERS:
          serviceImpl.listMembers((org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.ListMembersResponse>) responseObserver);
          break;
        case METHODID_NOTIFY_NEW_MEMBER:
          serviceImpl.notifyNewMember((org.aiflow.notification.proto.NotificationServiceOuterClass.NotifyNewMemberRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>) responseObserver);
          break;
        case METHODID_REGISTER_CLIENT:
          serviceImpl.registerClient((org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.RegisterClientResponse>) responseObserver);
          break;
        case METHODID_DELETE_CLIENT:
          serviceImpl.deleteClient((org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.CommonResponse>) responseObserver);
          break;
        case METHODID_IS_CLIENT_EXISTS:
          serviceImpl.isClientExists((org.aiflow.notification.proto.NotificationServiceOuterClass.ClientIdRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.isClientExistsResponse>) responseObserver);
          break;
        case METHODID_TIMESTAMP_TO_EVENT_OFFSET:
          serviceImpl.timestampToEventOffset((org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetRequest) request,
              (io.grpc.stub.StreamObserver<org.aiflow.notification.proto.NotificationServiceOuterClass.TimeToOffsetResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.aiflow.notification.proto.NotificationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationService");
    }
  }

  private static final class NotificationServiceFileDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier {
    NotificationServiceFileDescriptorSupplier() {}
  }

  private static final class NotificationServiceMethodDescriptorSupplier
      extends NotificationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (NotificationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NotificationServiceFileDescriptorSupplier())
              .addMethod(getSendEventMethod())
              .addMethod(getListEventsMethod())
              .addMethod(getCountEventsMethod())
              .addMethod(getListAllEventsMethod())
              .addMethod(getNotifyMethod())
              .addMethod(getListMembersMethod())
              .addMethod(getNotifyNewMemberMethod())
              .addMethod(getRegisterClientMethod())
              .addMethod(getDeleteClientMethod())
              .addMethod(getIsClientExistsMethod())
              .addMethod(getTimestampToEventOffsetMethod())
              .build();
        }
      }
    }
    return result;
  }
}

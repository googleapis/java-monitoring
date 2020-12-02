/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.monitoring.v3;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/** */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/monitoring/v3/notification_service.proto")
public final class NotificationChannelServiceGrpc {

  private NotificationChannelServiceGrpc() {}

  public static final String SERVICE_NAME = "google.monitoring.v3.NotificationChannelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,
          com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>
      getListNotificationChannelDescriptorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotificationChannelDescriptors",
      requestType = com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest.class,
      responseType = com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,
          com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>
      getListNotificationChannelDescriptorsMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,
            com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>
        getListNotificationChannelDescriptorsMethod;
    if ((getListNotificationChannelDescriptorsMethod =
            NotificationChannelServiceGrpc.getListNotificationChannelDescriptorsMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getListNotificationChannelDescriptorsMethod =
                NotificationChannelServiceGrpc.getListNotificationChannelDescriptorsMethod)
            == null) {
          NotificationChannelServiceGrpc.getListNotificationChannelDescriptorsMethod =
              getListNotificationChannelDescriptorsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,
                          com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              SERVICE_NAME, "ListNotificationChannelDescriptors"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "ListNotificationChannelDescriptors"))
                      .build();
        }
      }
    }
    return getListNotificationChannelDescriptorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,
          com.google.monitoring.v3.NotificationChannelDescriptor>
      getGetNotificationChannelDescriptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotificationChannelDescriptor",
      requestType = com.google.monitoring.v3.GetNotificationChannelDescriptorRequest.class,
      responseType = com.google.monitoring.v3.NotificationChannelDescriptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,
          com.google.monitoring.v3.NotificationChannelDescriptor>
      getGetNotificationChannelDescriptorMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,
            com.google.monitoring.v3.NotificationChannelDescriptor>
        getGetNotificationChannelDescriptorMethod;
    if ((getGetNotificationChannelDescriptorMethod =
            NotificationChannelServiceGrpc.getGetNotificationChannelDescriptorMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getGetNotificationChannelDescriptorMethod =
                NotificationChannelServiceGrpc.getGetNotificationChannelDescriptorMethod)
            == null) {
          NotificationChannelServiceGrpc.getGetNotificationChannelDescriptorMethod =
              getGetNotificationChannelDescriptorMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,
                          com.google.monitoring.v3.NotificationChannelDescriptor>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetNotificationChannelDescriptor"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.GetNotificationChannelDescriptorRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.NotificationChannelDescriptor
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "GetNotificationChannelDescriptor"))
                      .build();
        }
      }
    }
    return getGetNotificationChannelDescriptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListNotificationChannelsRequest,
          com.google.monitoring.v3.ListNotificationChannelsResponse>
      getListNotificationChannelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListNotificationChannels",
      requestType = com.google.monitoring.v3.ListNotificationChannelsRequest.class,
      responseType = com.google.monitoring.v3.ListNotificationChannelsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListNotificationChannelsRequest,
          com.google.monitoring.v3.ListNotificationChannelsResponse>
      getListNotificationChannelsMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.ListNotificationChannelsRequest,
            com.google.monitoring.v3.ListNotificationChannelsResponse>
        getListNotificationChannelsMethod;
    if ((getListNotificationChannelsMethod =
            NotificationChannelServiceGrpc.getListNotificationChannelsMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getListNotificationChannelsMethod =
                NotificationChannelServiceGrpc.getListNotificationChannelsMethod)
            == null) {
          NotificationChannelServiceGrpc.getListNotificationChannelsMethod =
              getListNotificationChannelsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.ListNotificationChannelsRequest,
                          com.google.monitoring.v3.ListNotificationChannelsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListNotificationChannels"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListNotificationChannelsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListNotificationChannelsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "ListNotificationChannels"))
                      .build();
        }
      }
    }
    return getListNotificationChannelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getGetNotificationChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotificationChannel",
      requestType = com.google.monitoring.v3.GetNotificationChannelRequest.class,
      responseType = com.google.monitoring.v3.NotificationChannel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getGetNotificationChannelMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.GetNotificationChannelRequest,
            com.google.monitoring.v3.NotificationChannel>
        getGetNotificationChannelMethod;
    if ((getGetNotificationChannelMethod =
            NotificationChannelServiceGrpc.getGetNotificationChannelMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getGetNotificationChannelMethod =
                NotificationChannelServiceGrpc.getGetNotificationChannelMethod)
            == null) {
          NotificationChannelServiceGrpc.getGetNotificationChannelMethod =
              getGetNotificationChannelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.GetNotificationChannelRequest,
                          com.google.monitoring.v3.NotificationChannel>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetNotificationChannel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.GetNotificationChannelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.NotificationChannel.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "GetNotificationChannel"))
                      .build();
        }
      }
    }
    return getGetNotificationChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.CreateNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getCreateNotificationChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateNotificationChannel",
      requestType = com.google.monitoring.v3.CreateNotificationChannelRequest.class,
      responseType = com.google.monitoring.v3.NotificationChannel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.CreateNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getCreateNotificationChannelMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.CreateNotificationChannelRequest,
            com.google.monitoring.v3.NotificationChannel>
        getCreateNotificationChannelMethod;
    if ((getCreateNotificationChannelMethod =
            NotificationChannelServiceGrpc.getCreateNotificationChannelMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getCreateNotificationChannelMethod =
                NotificationChannelServiceGrpc.getCreateNotificationChannelMethod)
            == null) {
          NotificationChannelServiceGrpc.getCreateNotificationChannelMethod =
              getCreateNotificationChannelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.CreateNotificationChannelRequest,
                          com.google.monitoring.v3.NotificationChannel>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateNotificationChannel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.CreateNotificationChannelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.NotificationChannel.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "CreateNotificationChannel"))
                      .build();
        }
      }
    }
    return getCreateNotificationChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.UpdateNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getUpdateNotificationChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UpdateNotificationChannel",
      requestType = com.google.monitoring.v3.UpdateNotificationChannelRequest.class,
      responseType = com.google.monitoring.v3.NotificationChannel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.UpdateNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getUpdateNotificationChannelMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.UpdateNotificationChannelRequest,
            com.google.monitoring.v3.NotificationChannel>
        getUpdateNotificationChannelMethod;
    if ((getUpdateNotificationChannelMethod =
            NotificationChannelServiceGrpc.getUpdateNotificationChannelMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getUpdateNotificationChannelMethod =
                NotificationChannelServiceGrpc.getUpdateNotificationChannelMethod)
            == null) {
          NotificationChannelServiceGrpc.getUpdateNotificationChannelMethod =
              getUpdateNotificationChannelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.UpdateNotificationChannelRequest,
                          com.google.monitoring.v3.NotificationChannel>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "UpdateNotificationChannel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.UpdateNotificationChannelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.NotificationChannel.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "UpdateNotificationChannel"))
                      .build();
        }
      }
    }
    return getUpdateNotificationChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.DeleteNotificationChannelRequest, com.google.protobuf.Empty>
      getDeleteNotificationChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteNotificationChannel",
      requestType = com.google.monitoring.v3.DeleteNotificationChannelRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.DeleteNotificationChannelRequest, com.google.protobuf.Empty>
      getDeleteNotificationChannelMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.DeleteNotificationChannelRequest, com.google.protobuf.Empty>
        getDeleteNotificationChannelMethod;
    if ((getDeleteNotificationChannelMethod =
            NotificationChannelServiceGrpc.getDeleteNotificationChannelMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getDeleteNotificationChannelMethod =
                NotificationChannelServiceGrpc.getDeleteNotificationChannelMethod)
            == null) {
          NotificationChannelServiceGrpc.getDeleteNotificationChannelMethod =
              getDeleteNotificationChannelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.DeleteNotificationChannelRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteNotificationChannel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.DeleteNotificationChannelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "DeleteNotificationChannel"))
                      .build();
        }
      }
    }
    return getDeleteNotificationChannelMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest,
          com.google.protobuf.Empty>
      getSendNotificationChannelVerificationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "SendNotificationChannelVerificationCode",
      requestType = com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest,
          com.google.protobuf.Empty>
      getSendNotificationChannelVerificationCodeMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest,
            com.google.protobuf.Empty>
        getSendNotificationChannelVerificationCodeMethod;
    if ((getSendNotificationChannelVerificationCodeMethod =
            NotificationChannelServiceGrpc.getSendNotificationChannelVerificationCodeMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getSendNotificationChannelVerificationCodeMethod =
                NotificationChannelServiceGrpc.getSendNotificationChannelVerificationCodeMethod)
            == null) {
          NotificationChannelServiceGrpc.getSendNotificationChannelVerificationCodeMethod =
              getSendNotificationChannelVerificationCodeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              SERVICE_NAME, "SendNotificationChannelVerificationCode"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3
                                  .SendNotificationChannelVerificationCodeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "SendNotificationChannelVerificationCode"))
                      .build();
        }
      }
    }
    return getSendNotificationChannelVerificationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest,
          com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>
      getGetNotificationChannelVerificationCodeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetNotificationChannelVerificationCode",
      requestType = com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest.class,
      responseType = com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest,
          com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>
      getGetNotificationChannelVerificationCodeMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest,
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>
        getGetNotificationChannelVerificationCodeMethod;
    if ((getGetNotificationChannelVerificationCodeMethod =
            NotificationChannelServiceGrpc.getGetNotificationChannelVerificationCodeMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getGetNotificationChannelVerificationCodeMethod =
                NotificationChannelServiceGrpc.getGetNotificationChannelVerificationCodeMethod)
            == null) {
          NotificationChannelServiceGrpc.getGetNotificationChannelVerificationCodeMethod =
              getGetNotificationChannelVerificationCodeMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest,
                          com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(
                              SERVICE_NAME, "GetNotificationChannelVerificationCode"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3
                                  .GetNotificationChannelVerificationCodeResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "GetNotificationChannelVerificationCode"))
                      .build();
        }
      }
    }
    return getGetNotificationChannelVerificationCodeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.VerifyNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getVerifyNotificationChannelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "VerifyNotificationChannel",
      requestType = com.google.monitoring.v3.VerifyNotificationChannelRequest.class,
      responseType = com.google.monitoring.v3.NotificationChannel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.VerifyNotificationChannelRequest,
          com.google.monitoring.v3.NotificationChannel>
      getVerifyNotificationChannelMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.VerifyNotificationChannelRequest,
            com.google.monitoring.v3.NotificationChannel>
        getVerifyNotificationChannelMethod;
    if ((getVerifyNotificationChannelMethod =
            NotificationChannelServiceGrpc.getVerifyNotificationChannelMethod)
        == null) {
      synchronized (NotificationChannelServiceGrpc.class) {
        if ((getVerifyNotificationChannelMethod =
                NotificationChannelServiceGrpc.getVerifyNotificationChannelMethod)
            == null) {
          NotificationChannelServiceGrpc.getVerifyNotificationChannelMethod =
              getVerifyNotificationChannelMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.VerifyNotificationChannelRequest,
                          com.google.monitoring.v3.NotificationChannel>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "VerifyNotificationChannel"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.VerifyNotificationChannelRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.NotificationChannel.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new NotificationChannelServiceMethodDescriptorSupplier(
                              "VerifyNotificationChannel"))
                      .build();
        }
      }
    }
    return getVerifyNotificationChannelMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static NotificationChannelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationChannelServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<NotificationChannelServiceStub>() {
          @java.lang.Override
          public NotificationChannelServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NotificationChannelServiceStub(channel, callOptions);
          }
        };
    return NotificationChannelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NotificationChannelServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationChannelServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<NotificationChannelServiceBlockingStub>() {
          @java.lang.Override
          public NotificationChannelServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NotificationChannelServiceBlockingStub(channel, callOptions);
          }
        };
    return NotificationChannelServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static NotificationChannelServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NotificationChannelServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<NotificationChannelServiceFutureStub>() {
          @java.lang.Override
          public NotificationChannelServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new NotificationChannelServiceFutureStub(channel, callOptions);
          }
        };
    return NotificationChannelServiceFutureStub.newStub(factory, channel);
  }

  /** */
  public abstract static class NotificationChannelServiceImplBase
      implements io.grpc.BindableService {

    /** */
    public void listNotificationChannelDescriptors(
        com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListNotificationChannelDescriptorsMethod(), responseObserver);
    }

    /** */
    public void getNotificationChannelDescriptor(
        com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannelDescriptor>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetNotificationChannelDescriptorMethod(), responseObserver);
    }

    /** */
    public void listNotificationChannels(
        com.google.monitoring.v3.ListNotificationChannelsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListNotificationChannelsMethod(), responseObserver);
    }

    /** */
    public void getNotificationChannel(
        com.google.monitoring.v3.GetNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnimplementedUnaryCall(getGetNotificationChannelMethod(), responseObserver);
    }

    /** */
    public void createNotificationChannel(
        com.google.monitoring.v3.CreateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnimplementedUnaryCall(getCreateNotificationChannelMethod(), responseObserver);
    }

    /** */
    public void updateNotificationChannel(
        com.google.monitoring.v3.UpdateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnimplementedUnaryCall(getUpdateNotificationChannelMethod(), responseObserver);
    }

    /** */
    public void deleteNotificationChannel(
        com.google.monitoring.v3.DeleteNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteNotificationChannelMethod(), responseObserver);
    }

    /** */
    public void sendNotificationChannelVerificationCode(
        com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(
          getSendNotificationChannelVerificationCodeMethod(), responseObserver);
    }

    /** */
    public void getNotificationChannelVerificationCode(
        com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<
                com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(
          getGetNotificationChannelVerificationCodeMethod(), responseObserver);
    }

    /** */
    public void verifyNotificationChannel(
        com.google.monitoring.v3.VerifyNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnimplementedUnaryCall(getVerifyNotificationChannelMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListNotificationChannelDescriptorsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest,
                      com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>(
                      this, METHODID_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS)))
          .addMethod(
              getGetNotificationChannelDescriptorMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.GetNotificationChannelDescriptorRequest,
                      com.google.monitoring.v3.NotificationChannelDescriptor>(
                      this, METHODID_GET_NOTIFICATION_CHANNEL_DESCRIPTOR)))
          .addMethod(
              getListNotificationChannelsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.ListNotificationChannelsRequest,
                      com.google.monitoring.v3.ListNotificationChannelsResponse>(
                      this, METHODID_LIST_NOTIFICATION_CHANNELS)))
          .addMethod(
              getGetNotificationChannelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.GetNotificationChannelRequest,
                      com.google.monitoring.v3.NotificationChannel>(
                      this, METHODID_GET_NOTIFICATION_CHANNEL)))
          .addMethod(
              getCreateNotificationChannelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.CreateNotificationChannelRequest,
                      com.google.monitoring.v3.NotificationChannel>(
                      this, METHODID_CREATE_NOTIFICATION_CHANNEL)))
          .addMethod(
              getUpdateNotificationChannelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.UpdateNotificationChannelRequest,
                      com.google.monitoring.v3.NotificationChannel>(
                      this, METHODID_UPDATE_NOTIFICATION_CHANNEL)))
          .addMethod(
              getDeleteNotificationChannelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.DeleteNotificationChannelRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_NOTIFICATION_CHANNEL)))
          .addMethod(
              getSendNotificationChannelVerificationCodeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest,
                      com.google.protobuf.Empty>(
                      this, METHODID_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE)))
          .addMethod(
              getGetNotificationChannelVerificationCodeMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest,
                      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>(
                      this, METHODID_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE)))
          .addMethod(
              getVerifyNotificationChannelMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.VerifyNotificationChannelRequest,
                      com.google.monitoring.v3.NotificationChannel>(
                      this, METHODID_VERIFY_NOTIFICATION_CHANNEL)))
          .build();
    }
  }

  /** */
  public static final class NotificationChannelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<NotificationChannelServiceStub> {
    private NotificationChannelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationChannelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationChannelServiceStub(channel, callOptions);
    }

    /** */
    public void listNotificationChannelDescriptors(
        com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNotificationChannelDescriptorsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getNotificationChannelDescriptor(
        com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannelDescriptor>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNotificationChannelDescriptorMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void listNotificationChannels(
        com.google.monitoring.v3.ListNotificationChannelsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListNotificationChannelsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListNotificationChannelsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getNotificationChannel(
        com.google.monitoring.v3.GetNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNotificationChannelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void createNotificationChannel(
        com.google.monitoring.v3.CreateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateNotificationChannelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void updateNotificationChannel(
        com.google.monitoring.v3.UpdateNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getUpdateNotificationChannelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void deleteNotificationChannel(
        com.google.monitoring.v3.DeleteNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteNotificationChannelMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void sendNotificationChannelVerificationCode(
        com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel()
              .newCall(getSendNotificationChannelVerificationCodeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void getNotificationChannelVerificationCode(
        com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request,
        io.grpc.stub.StreamObserver<
                com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetNotificationChannelVerificationCodeMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /** */
    public void verifyNotificationChannel(
        com.google.monitoring.v3.VerifyNotificationChannelRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getVerifyNotificationChannelMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /** */
  public static final class NotificationChannelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<NotificationChannelServiceBlockingStub> {
    private NotificationChannelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationChannelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationChannelServiceBlockingStub(channel, callOptions);
    }

    /** */
    public com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse
        listNotificationChannelDescriptors(
            com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListNotificationChannelDescriptorsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.monitoring.v3.NotificationChannelDescriptor getNotificationChannelDescriptor(
        com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNotificationChannelDescriptorMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.monitoring.v3.ListNotificationChannelsResponse listNotificationChannels(
        com.google.monitoring.v3.ListNotificationChannelsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListNotificationChannelsMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.monitoring.v3.NotificationChannel getNotificationChannel(
        com.google.monitoring.v3.GetNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetNotificationChannelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.monitoring.v3.NotificationChannel createNotificationChannel(
        com.google.monitoring.v3.CreateNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateNotificationChannelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.monitoring.v3.NotificationChannel updateNotificationChannel(
        com.google.monitoring.v3.UpdateNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getUpdateNotificationChannelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty deleteNotificationChannel(
        com.google.monitoring.v3.DeleteNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteNotificationChannelMethod(), getCallOptions(), request);
    }

    /** */
    public com.google.protobuf.Empty sendNotificationChannelVerificationCode(
        com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request) {
      return blockingUnaryCall(
          getChannel(),
          getSendNotificationChannelVerificationCodeMethod(),
          getCallOptions(),
          request);
    }

    /** */
    public com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse
        getNotificationChannelVerificationCode(
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request) {
      return blockingUnaryCall(
          getChannel(),
          getGetNotificationChannelVerificationCodeMethod(),
          getCallOptions(),
          request);
    }

    /** */
    public com.google.monitoring.v3.NotificationChannel verifyNotificationChannel(
        com.google.monitoring.v3.VerifyNotificationChannelRequest request) {
      return blockingUnaryCall(
          getChannel(), getVerifyNotificationChannelMethod(), getCallOptions(), request);
    }
  }

  /** */
  public static final class NotificationChannelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<NotificationChannelServiceFutureStub> {
    private NotificationChannelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NotificationChannelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NotificationChannelServiceFutureStub(channel, callOptions);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>
        listNotificationChannelDescriptors(
            com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListNotificationChannelDescriptorsMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.NotificationChannelDescriptor>
        getNotificationChannelDescriptor(
            com.google.monitoring.v3.GetNotificationChannelDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNotificationChannelDescriptorMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.ListNotificationChannelsResponse>
        listNotificationChannels(com.google.monitoring.v3.ListNotificationChannelsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListNotificationChannelsMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.NotificationChannel>
        getNotificationChannel(com.google.monitoring.v3.GetNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNotificationChannelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.NotificationChannel>
        createNotificationChannel(
            com.google.monitoring.v3.CreateNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateNotificationChannelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.NotificationChannel>
        updateNotificationChannel(
            com.google.monitoring.v3.UpdateNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getUpdateNotificationChannelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteNotificationChannel(
            com.google.monitoring.v3.DeleteNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteNotificationChannelMethod(), getCallOptions()), request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        sendNotificationChannelVerificationCode(
            com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest request) {
      return futureUnaryCall(
          getChannel()
              .newCall(getSendNotificationChannelVerificationCodeMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>
        getNotificationChannelVerificationCode(
            com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetNotificationChannelVerificationCodeMethod(), getCallOptions()),
          request);
    }

    /** */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.NotificationChannel>
        verifyNotificationChannel(
            com.google.monitoring.v3.VerifyNotificationChannelRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getVerifyNotificationChannelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS = 0;
  private static final int METHODID_GET_NOTIFICATION_CHANNEL_DESCRIPTOR = 1;
  private static final int METHODID_LIST_NOTIFICATION_CHANNELS = 2;
  private static final int METHODID_GET_NOTIFICATION_CHANNEL = 3;
  private static final int METHODID_CREATE_NOTIFICATION_CHANNEL = 4;
  private static final int METHODID_UPDATE_NOTIFICATION_CHANNEL = 5;
  private static final int METHODID_DELETE_NOTIFICATION_CHANNEL = 6;
  private static final int METHODID_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE = 7;
  private static final int METHODID_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE = 8;
  private static final int METHODID_VERIFY_NOTIFICATION_CHANNEL = 9;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NotificationChannelServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NotificationChannelServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_NOTIFICATION_CHANNEL_DESCRIPTORS:
          serviceImpl.listNotificationChannelDescriptors(
              (com.google.monitoring.v3.ListNotificationChannelDescriptorsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.monitoring.v3.ListNotificationChannelDescriptorsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_CHANNEL_DESCRIPTOR:
          serviceImpl.getNotificationChannelDescriptor(
              (com.google.monitoring.v3.GetNotificationChannelDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannelDescriptor>)
                  responseObserver);
          break;
        case METHODID_LIST_NOTIFICATION_CHANNELS:
          serviceImpl.listNotificationChannels(
              (com.google.monitoring.v3.ListNotificationChannelsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.monitoring.v3.ListNotificationChannelsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_CHANNEL:
          serviceImpl.getNotificationChannel(
              (com.google.monitoring.v3.GetNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>)
                  responseObserver);
          break;
        case METHODID_CREATE_NOTIFICATION_CHANNEL:
          serviceImpl.createNotificationChannel(
              (com.google.monitoring.v3.CreateNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>)
                  responseObserver);
          break;
        case METHODID_UPDATE_NOTIFICATION_CHANNEL:
          serviceImpl.updateNotificationChannel(
              (com.google.monitoring.v3.UpdateNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>)
                  responseObserver);
          break;
        case METHODID_DELETE_NOTIFICATION_CHANNEL:
          serviceImpl.deleteNotificationChannel(
              (com.google.monitoring.v3.DeleteNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_SEND_NOTIFICATION_CHANNEL_VERIFICATION_CODE:
          serviceImpl.sendNotificationChannelVerificationCode(
              (com.google.monitoring.v3.SendNotificationChannelVerificationCodeRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_GET_NOTIFICATION_CHANNEL_VERIFICATION_CODE:
          serviceImpl.getNotificationChannelVerificationCode(
              (com.google.monitoring.v3.GetNotificationChannelVerificationCodeRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.monitoring.v3.GetNotificationChannelVerificationCodeResponse>)
                  responseObserver);
          break;
        case METHODID_VERIFY_NOTIFICATION_CHANNEL:
          serviceImpl.verifyNotificationChannel(
              (com.google.monitoring.v3.VerifyNotificationChannelRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.NotificationChannel>)
                  responseObserver);
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

  private abstract static class NotificationChannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NotificationChannelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.monitoring.v3.NotificationServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NotificationChannelService");
    }
  }

  private static final class NotificationChannelServiceFileDescriptorSupplier
      extends NotificationChannelServiceBaseDescriptorSupplier {
    NotificationChannelServiceFileDescriptorSupplier() {}
  }

  private static final class NotificationChannelServiceMethodDescriptorSupplier
      extends NotificationChannelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NotificationChannelServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NotificationChannelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new NotificationChannelServiceFileDescriptorSupplier())
                      .addMethod(getListNotificationChannelDescriptorsMethod())
                      .addMethod(getGetNotificationChannelDescriptorMethod())
                      .addMethod(getListNotificationChannelsMethod())
                      .addMethod(getGetNotificationChannelMethod())
                      .addMethod(getCreateNotificationChannelMethod())
                      .addMethod(getUpdateNotificationChannelMethod())
                      .addMethod(getDeleteNotificationChannelMethod())
                      .addMethod(getSendNotificationChannelVerificationCodeMethod())
                      .addMethod(getGetNotificationChannelVerificationCodeMethod())
                      .addMethod(getVerifyNotificationChannelMethod())
                      .build();
        }
      }
    }
    return result;
  }
}

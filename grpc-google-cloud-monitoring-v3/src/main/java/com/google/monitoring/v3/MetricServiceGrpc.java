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

/**
 *
 *
 * <pre>
 * Manages metric descriptors, monitored resource descriptors, and
 * time series data.
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler",
    comments = "Source: google/monitoring/v3/metric_service.proto")
public final class MetricServiceGrpc {

  private MetricServiceGrpc() {}

  public static final String SERVICE_NAME = "google.monitoring.v3.MetricService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,
          com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>
      getListMonitoredResourceDescriptorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMonitoredResourceDescriptors",
      requestType = com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest.class,
      responseType = com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,
          com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>
      getListMonitoredResourceDescriptorsMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,
            com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>
        getListMonitoredResourceDescriptorsMethod;
    if ((getListMonitoredResourceDescriptorsMethod =
            MetricServiceGrpc.getListMonitoredResourceDescriptorsMethod)
        == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getListMonitoredResourceDescriptorsMethod =
                MetricServiceGrpc.getListMonitoredResourceDescriptorsMethod)
            == null) {
          MetricServiceGrpc.getListMonitoredResourceDescriptorsMethod =
              getListMonitoredResourceDescriptorsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,
                          com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListMonitoredResourceDescriptors"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier(
                              "ListMonitoredResourceDescriptors"))
                      .build();
        }
      }
    }
    return getListMonitoredResourceDescriptorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,
          com.google.api.MonitoredResourceDescriptor>
      getGetMonitoredResourceDescriptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMonitoredResourceDescriptor",
      requestType = com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest.class,
      responseType = com.google.api.MonitoredResourceDescriptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,
          com.google.api.MonitoredResourceDescriptor>
      getGetMonitoredResourceDescriptorMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,
            com.google.api.MonitoredResourceDescriptor>
        getGetMonitoredResourceDescriptorMethod;
    if ((getGetMonitoredResourceDescriptorMethod =
            MetricServiceGrpc.getGetMonitoredResourceDescriptorMethod)
        == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getGetMonitoredResourceDescriptorMethod =
                MetricServiceGrpc.getGetMonitoredResourceDescriptorMethod)
            == null) {
          MetricServiceGrpc.getGetMonitoredResourceDescriptorMethod =
              getGetMonitoredResourceDescriptorMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,
                          com.google.api.MonitoredResourceDescriptor>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetMonitoredResourceDescriptor"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.api.MonitoredResourceDescriptor.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier(
                              "GetMonitoredResourceDescriptor"))
                      .build();
        }
      }
    }
    return getGetMonitoredResourceDescriptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListMetricDescriptorsRequest,
          com.google.monitoring.v3.ListMetricDescriptorsResponse>
      getListMetricDescriptorsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListMetricDescriptors",
      requestType = com.google.monitoring.v3.ListMetricDescriptorsRequest.class,
      responseType = com.google.monitoring.v3.ListMetricDescriptorsResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListMetricDescriptorsRequest,
          com.google.monitoring.v3.ListMetricDescriptorsResponse>
      getListMetricDescriptorsMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.ListMetricDescriptorsRequest,
            com.google.monitoring.v3.ListMetricDescriptorsResponse>
        getListMetricDescriptorsMethod;
    if ((getListMetricDescriptorsMethod = MetricServiceGrpc.getListMetricDescriptorsMethod)
        == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getListMetricDescriptorsMethod = MetricServiceGrpc.getListMetricDescriptorsMethod)
            == null) {
          MetricServiceGrpc.getListMetricDescriptorsMethod =
              getListMetricDescriptorsMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.ListMetricDescriptorsRequest,
                          com.google.monitoring.v3.ListMetricDescriptorsResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "ListMetricDescriptors"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListMetricDescriptorsRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListMetricDescriptorsResponse
                                  .getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier("ListMetricDescriptors"))
                      .build();
        }
      }
    }
    return getListMetricDescriptorsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetMetricDescriptorRequest, com.google.api.MetricDescriptor>
      getGetMetricDescriptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetMetricDescriptor",
      requestType = com.google.monitoring.v3.GetMetricDescriptorRequest.class,
      responseType = com.google.api.MetricDescriptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.GetMetricDescriptorRequest, com.google.api.MetricDescriptor>
      getGetMetricDescriptorMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.GetMetricDescriptorRequest, com.google.api.MetricDescriptor>
        getGetMetricDescriptorMethod;
    if ((getGetMetricDescriptorMethod = MetricServiceGrpc.getGetMetricDescriptorMethod) == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getGetMetricDescriptorMethod = MetricServiceGrpc.getGetMetricDescriptorMethod)
            == null) {
          MetricServiceGrpc.getGetMetricDescriptorMethod =
              getGetMetricDescriptorMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.GetMetricDescriptorRequest,
                          com.google.api.MetricDescriptor>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "GetMetricDescriptor"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.GetMetricDescriptorRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.api.MetricDescriptor.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier("GetMetricDescriptor"))
                      .build();
        }
      }
    }
    return getGetMetricDescriptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.CreateMetricDescriptorRequest, com.google.api.MetricDescriptor>
      getCreateMetricDescriptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateMetricDescriptor",
      requestType = com.google.monitoring.v3.CreateMetricDescriptorRequest.class,
      responseType = com.google.api.MetricDescriptor.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.CreateMetricDescriptorRequest, com.google.api.MetricDescriptor>
      getCreateMetricDescriptorMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.CreateMetricDescriptorRequest, com.google.api.MetricDescriptor>
        getCreateMetricDescriptorMethod;
    if ((getCreateMetricDescriptorMethod = MetricServiceGrpc.getCreateMetricDescriptorMethod)
        == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getCreateMetricDescriptorMethod = MetricServiceGrpc.getCreateMetricDescriptorMethod)
            == null) {
          MetricServiceGrpc.getCreateMetricDescriptorMethod =
              getCreateMetricDescriptorMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.CreateMetricDescriptorRequest,
                          com.google.api.MetricDescriptor>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "CreateMetricDescriptor"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.CreateMetricDescriptorRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.api.MetricDescriptor.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier("CreateMetricDescriptor"))
                      .build();
        }
      }
    }
    return getCreateMetricDescriptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.DeleteMetricDescriptorRequest, com.google.protobuf.Empty>
      getDeleteMetricDescriptorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteMetricDescriptor",
      requestType = com.google.monitoring.v3.DeleteMetricDescriptorRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.DeleteMetricDescriptorRequest, com.google.protobuf.Empty>
      getDeleteMetricDescriptorMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.DeleteMetricDescriptorRequest, com.google.protobuf.Empty>
        getDeleteMetricDescriptorMethod;
    if ((getDeleteMetricDescriptorMethod = MetricServiceGrpc.getDeleteMetricDescriptorMethod)
        == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getDeleteMetricDescriptorMethod = MetricServiceGrpc.getDeleteMetricDescriptorMethod)
            == null) {
          MetricServiceGrpc.getDeleteMetricDescriptorMethod =
              getDeleteMetricDescriptorMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.DeleteMetricDescriptorRequest,
                          com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(
                          generateFullMethodName(SERVICE_NAME, "DeleteMetricDescriptor"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.DeleteMetricDescriptorRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier("DeleteMetricDescriptor"))
                      .build();
        }
      }
    }
    return getDeleteMetricDescriptorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListTimeSeriesRequest,
          com.google.monitoring.v3.ListTimeSeriesResponse>
      getListTimeSeriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ListTimeSeries",
      requestType = com.google.monitoring.v3.ListTimeSeriesRequest.class,
      responseType = com.google.monitoring.v3.ListTimeSeriesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.ListTimeSeriesRequest,
          com.google.monitoring.v3.ListTimeSeriesResponse>
      getListTimeSeriesMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.ListTimeSeriesRequest,
            com.google.monitoring.v3.ListTimeSeriesResponse>
        getListTimeSeriesMethod;
    if ((getListTimeSeriesMethod = MetricServiceGrpc.getListTimeSeriesMethod) == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getListTimeSeriesMethod = MetricServiceGrpc.getListTimeSeriesMethod) == null) {
          MetricServiceGrpc.getListTimeSeriesMethod =
              getListTimeSeriesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.ListTimeSeriesRequest,
                          com.google.monitoring.v3.ListTimeSeriesResponse>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ListTimeSeries"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListTimeSeriesRequest.getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.ListTimeSeriesResponse.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier("ListTimeSeries"))
                      .build();
        }
      }
    }
    return getListTimeSeriesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<
          com.google.monitoring.v3.CreateTimeSeriesRequest, com.google.protobuf.Empty>
      getCreateTimeSeriesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateTimeSeries",
      requestType = com.google.monitoring.v3.CreateTimeSeriesRequest.class,
      responseType = com.google.protobuf.Empty.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<
          com.google.monitoring.v3.CreateTimeSeriesRequest, com.google.protobuf.Empty>
      getCreateTimeSeriesMethod() {
    io.grpc.MethodDescriptor<
            com.google.monitoring.v3.CreateTimeSeriesRequest, com.google.protobuf.Empty>
        getCreateTimeSeriesMethod;
    if ((getCreateTimeSeriesMethod = MetricServiceGrpc.getCreateTimeSeriesMethod) == null) {
      synchronized (MetricServiceGrpc.class) {
        if ((getCreateTimeSeriesMethod = MetricServiceGrpc.getCreateTimeSeriesMethod) == null) {
          MetricServiceGrpc.getCreateTimeSeriesMethod =
              getCreateTimeSeriesMethod =
                  io.grpc.MethodDescriptor
                      .<com.google.monitoring.v3.CreateTimeSeriesRequest, com.google.protobuf.Empty>
                          newBuilder()
                      .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
                      .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateTimeSeries"))
                      .setSampledToLocalTracing(true)
                      .setRequestMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.monitoring.v3.CreateTimeSeriesRequest
                                  .getDefaultInstance()))
                      .setResponseMarshaller(
                          io.grpc.protobuf.ProtoUtils.marshaller(
                              com.google.protobuf.Empty.getDefaultInstance()))
                      .setSchemaDescriptor(
                          new MetricServiceMethodDescriptorSupplier("CreateTimeSeries"))
                      .build();
        }
      }
    }
    return getCreateTimeSeriesMethod;
  }

  /** Creates a new async stub that supports all call types for the service */
  public static MetricServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricServiceStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<MetricServiceStub>() {
          @java.lang.Override
          public MetricServiceStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MetricServiceStub(channel, callOptions);
          }
        };
    return MetricServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static MetricServiceBlockingStub newBlockingStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricServiceBlockingStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<MetricServiceBlockingStub>() {
          @java.lang.Override
          public MetricServiceBlockingStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MetricServiceBlockingStub(channel, callOptions);
          }
        };
    return MetricServiceBlockingStub.newStub(factory, channel);
  }

  /** Creates a new ListenableFuture-style stub that supports unary calls on the service */
  public static MetricServiceFutureStub newFutureStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<MetricServiceFutureStub> factory =
        new io.grpc.stub.AbstractStub.StubFactory<MetricServiceFutureStub>() {
          @java.lang.Override
          public MetricServiceFutureStub newStub(
              io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
            return new MetricServiceFutureStub(channel, callOptions);
          }
        };
    return MetricServiceFutureStub.newStub(factory, channel);
  }

  /**
   *
   *
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public abstract static class MetricServiceImplBase implements io.grpc.BindableService {

    /**
     *
     *
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMonitoredResourceDescriptors(
        com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListMonitoredResourceDescriptorsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMonitoredResourceDescriptor(
        com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MonitoredResourceDescriptor> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMonitoredResourceDescriptorMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMetricDescriptors(
        com.google.monitoring.v3.ListMetricDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMetricDescriptorsResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListMetricDescriptorsMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMetricDescriptor(
        com.google.monitoring.v3.GetMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnimplementedUnaryCall(getGetMetricDescriptorMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics).
     * </pre>
     */
    public void createMetricDescriptor(
        com.google.monitoring.v3.CreateMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateMetricDescriptorMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics) can be
     * deleted.
     * </pre>
     */
    public void deleteMetricDescriptor(
        com.google.monitoring.v3.DeleteMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getDeleteMetricDescriptorMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listTimeSeries(
        com.google.monitoring.v3.ListTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListTimeSeriesResponse>
            responseObserver) {
      asyncUnimplementedUnaryCall(getListTimeSeriesMethod(), responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public void createTimeSeries(
        com.google.monitoring.v3.CreateTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnimplementedUnaryCall(getCreateTimeSeriesMethod(), responseObserver);
    }

    @java.lang.Override
    public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
              getListMonitoredResourceDescriptorsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest,
                      com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>(
                      this, METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS)))
          .addMethod(
              getGetMonitoredResourceDescriptorMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest,
                      com.google.api.MonitoredResourceDescriptor>(
                      this, METHODID_GET_MONITORED_RESOURCE_DESCRIPTOR)))
          .addMethod(
              getListMetricDescriptorsMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.ListMetricDescriptorsRequest,
                      com.google.monitoring.v3.ListMetricDescriptorsResponse>(
                      this, METHODID_LIST_METRIC_DESCRIPTORS)))
          .addMethod(
              getGetMetricDescriptorMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.GetMetricDescriptorRequest,
                      com.google.api.MetricDescriptor>(this, METHODID_GET_METRIC_DESCRIPTOR)))
          .addMethod(
              getCreateMetricDescriptorMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.CreateMetricDescriptorRequest,
                      com.google.api.MetricDescriptor>(this, METHODID_CREATE_METRIC_DESCRIPTOR)))
          .addMethod(
              getDeleteMetricDescriptorMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.DeleteMetricDescriptorRequest,
                      com.google.protobuf.Empty>(this, METHODID_DELETE_METRIC_DESCRIPTOR)))
          .addMethod(
              getListTimeSeriesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.ListTimeSeriesRequest,
                      com.google.monitoring.v3.ListTimeSeriesResponse>(
                      this, METHODID_LIST_TIME_SERIES)))
          .addMethod(
              getCreateTimeSeriesMethod(),
              asyncUnaryCall(
                  new MethodHandlers<
                      com.google.monitoring.v3.CreateTimeSeriesRequest, com.google.protobuf.Empty>(
                      this, METHODID_CREATE_TIME_SERIES)))
          .build();
    }
  }

  /**
   *
   *
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public static final class MetricServiceStub
      extends io.grpc.stub.AbstractAsyncStub<MetricServiceStub> {
    private MetricServiceStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricServiceStub build(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricServiceStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMonitoredResourceDescriptors(
        com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request,
        io.grpc.stub.StreamObserver<
                com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMonitoredResourceDescriptorsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMonitoredResourceDescriptor(
        com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MonitoredResourceDescriptor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMonitoredResourceDescriptorMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listMetricDescriptors(
        com.google.monitoring.v3.ListMetricDescriptorsRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMetricDescriptorsResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMetricDescriptorsMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public void getMetricDescriptor(
        com.google.monitoring.v3.GetMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetMetricDescriptorMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics).
     * </pre>
     */
    public void createMetricDescriptor(
        com.google.monitoring.v3.CreateMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateMetricDescriptorMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics) can be
     * deleted.
     * </pre>
     */
    public void deleteMetricDescriptor(
        com.google.monitoring.v3.DeleteMetricDescriptorRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getDeleteMetricDescriptorMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public void listTimeSeries(
        com.google.monitoring.v3.ListTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListTimeSeriesResponse>
            responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListTimeSeriesMethod(), getCallOptions()),
          request,
          responseObserver);
    }

    /**
     *
     *
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public void createTimeSeries(
        com.google.monitoring.v3.CreateTimeSeriesRequest request,
        io.grpc.stub.StreamObserver<com.google.protobuf.Empty> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCreateTimeSeriesMethod(), getCallOptions()),
          request,
          responseObserver);
    }
  }

  /**
   *
   *
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public static final class MetricServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<MetricServiceBlockingStub> {
    private MetricServiceBlockingStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricServiceBlockingStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse
        listMonitoredResourceDescriptors(
            com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMonitoredResourceDescriptorsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.api.MonitoredResourceDescriptor getMonitoredResourceDescriptor(
        com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMonitoredResourceDescriptorMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.monitoring.v3.ListMetricDescriptorsResponse listMetricDescriptors(
        com.google.monitoring.v3.ListMetricDescriptorsRequest request) {
      return blockingUnaryCall(
          getChannel(), getListMetricDescriptorsMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.api.MetricDescriptor getMetricDescriptor(
        com.google.monitoring.v3.GetMetricDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetMetricDescriptorMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics).
     * </pre>
     */
    public com.google.api.MetricDescriptor createMetricDescriptor(
        com.google.monitoring.v3.CreateMetricDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateMetricDescriptorMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics) can be
     * deleted.
     * </pre>
     */
    public com.google.protobuf.Empty deleteMetricDescriptor(
        com.google.monitoring.v3.DeleteMetricDescriptorRequest request) {
      return blockingUnaryCall(
          getChannel(), getDeleteMetricDescriptorMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.monitoring.v3.ListTimeSeriesResponse listTimeSeries(
        com.google.monitoring.v3.ListTimeSeriesRequest request) {
      return blockingUnaryCall(getChannel(), getListTimeSeriesMethod(), getCallOptions(), request);
    }

    /**
     *
     *
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public com.google.protobuf.Empty createTimeSeries(
        com.google.monitoring.v3.CreateTimeSeriesRequest request) {
      return blockingUnaryCall(
          getChannel(), getCreateTimeSeriesMethod(), getCallOptions(), request);
    }
  }

  /**
   *
   *
   * <pre>
   * Manages metric descriptors, monitored resource descriptors, and
   * time series data.
   * </pre>
   */
  public static final class MetricServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<MetricServiceFutureStub> {
    private MetricServiceFutureStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected MetricServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new MetricServiceFutureStub(channel, callOptions);
    }

    /**
     *
     *
     * <pre>
     * Lists monitored resource descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>
        listMonitoredResourceDescriptors(
            com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMonitoredResourceDescriptorsMethod(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Gets a single monitored resource descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.api.MonitoredResourceDescriptor>
        getMonitoredResourceDescriptor(
            com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMonitoredResourceDescriptorMethod(), getCallOptions()),
          request);
    }

    /**
     *
     *
     * <pre>
     * Lists metric descriptors that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.ListMetricDescriptorsResponse>
        listMetricDescriptors(com.google.monitoring.v3.ListMetricDescriptorsRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListMetricDescriptorsMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Gets a single metric descriptor. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.MetricDescriptor>
        getMetricDescriptor(com.google.monitoring.v3.GetMetricDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetMetricDescriptorMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates a new metric descriptor.
     * User-created metric descriptors define
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics).
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.api.MetricDescriptor>
        createMetricDescriptor(com.google.monitoring.v3.CreateMetricDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateMetricDescriptorMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Deletes a metric descriptor. Only user-created
     * [custom metrics](https://cloud.google.com/monitoring/custom-metrics) can be
     * deleted.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        deleteMetricDescriptor(com.google.monitoring.v3.DeleteMetricDescriptorRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getDeleteMetricDescriptorMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Lists time series that match a filter. This method does not require a Stackdriver account.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<
            com.google.monitoring.v3.ListTimeSeriesResponse>
        listTimeSeries(com.google.monitoring.v3.ListTimeSeriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getListTimeSeriesMethod(), getCallOptions()), request);
    }

    /**
     *
     *
     * <pre>
     * Creates or adds data to one or more time series.
     * The response is empty if all time series in the request were written.
     * If any time series could not be written, a corresponding failure message is
     * included in the error response.
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<com.google.protobuf.Empty>
        createTimeSeries(com.google.monitoring.v3.CreateTimeSeriesRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCreateTimeSeriesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS = 0;
  private static final int METHODID_GET_MONITORED_RESOURCE_DESCRIPTOR = 1;
  private static final int METHODID_LIST_METRIC_DESCRIPTORS = 2;
  private static final int METHODID_GET_METRIC_DESCRIPTOR = 3;
  private static final int METHODID_CREATE_METRIC_DESCRIPTOR = 4;
  private static final int METHODID_DELETE_METRIC_DESCRIPTOR = 5;
  private static final int METHODID_LIST_TIME_SERIES = 6;
  private static final int METHODID_CREATE_TIME_SERIES = 7;

  private static final class MethodHandlers<Req, Resp>
      implements io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
          io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final MetricServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(MetricServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_LIST_MONITORED_RESOURCE_DESCRIPTORS:
          serviceImpl.listMonitoredResourceDescriptors(
              (com.google.monitoring.v3.ListMonitoredResourceDescriptorsRequest) request,
              (io.grpc.stub.StreamObserver<
                      com.google.monitoring.v3.ListMonitoredResourceDescriptorsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_MONITORED_RESOURCE_DESCRIPTOR:
          serviceImpl.getMonitoredResourceDescriptor(
              (com.google.monitoring.v3.GetMonitoredResourceDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.MonitoredResourceDescriptor>)
                  responseObserver);
          break;
        case METHODID_LIST_METRIC_DESCRIPTORS:
          serviceImpl.listMetricDescriptors(
              (com.google.monitoring.v3.ListMetricDescriptorsRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListMetricDescriptorsResponse>)
                  responseObserver);
          break;
        case METHODID_GET_METRIC_DESCRIPTOR:
          serviceImpl.getMetricDescriptor(
              (com.google.monitoring.v3.GetMetricDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor>) responseObserver);
          break;
        case METHODID_CREATE_METRIC_DESCRIPTOR:
          serviceImpl.createMetricDescriptor(
              (com.google.monitoring.v3.CreateMetricDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.api.MetricDescriptor>) responseObserver);
          break;
        case METHODID_DELETE_METRIC_DESCRIPTOR:
          serviceImpl.deleteMetricDescriptor(
              (com.google.monitoring.v3.DeleteMetricDescriptorRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
          break;
        case METHODID_LIST_TIME_SERIES:
          serviceImpl.listTimeSeries(
              (com.google.monitoring.v3.ListTimeSeriesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.monitoring.v3.ListTimeSeriesResponse>)
                  responseObserver);
          break;
        case METHODID_CREATE_TIME_SERIES:
          serviceImpl.createTimeSeries(
              (com.google.monitoring.v3.CreateTimeSeriesRequest) request,
              (io.grpc.stub.StreamObserver<com.google.protobuf.Empty>) responseObserver);
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

  private abstract static class MetricServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier,
          io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    MetricServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("MetricService");
    }
  }

  private static final class MetricServiceFileDescriptorSupplier
      extends MetricServiceBaseDescriptorSupplier {
    MetricServiceFileDescriptorSupplier() {}
  }

  private static final class MetricServiceMethodDescriptorSupplier
      extends MetricServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    MetricServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (MetricServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor =
              result =
                  io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
                      .setSchemaDescriptor(new MetricServiceFileDescriptorSupplier())
                      .addMethod(getListMonitoredResourceDescriptorsMethod())
                      .addMethod(getGetMonitoredResourceDescriptorMethod())
                      .addMethod(getListMetricDescriptorsMethod())
                      .addMethod(getGetMetricDescriptorMethod())
                      .addMethod(getCreateMetricDescriptorMethod())
                      .addMethod(getDeleteMetricDescriptorMethod())
                      .addMethod(getListTimeSeriesMethod())
                      .addMethod(getCreateTimeSeriesMethod())
                      .build();
        }
      }
    }
    return result;
  }
}

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
package com.google.cloud.monitoring.v3;

import com.google.api.core.BetaApi;
import com.google.monitoring.v3.CreateServiceLevelObjectiveRequest;
import com.google.monitoring.v3.CreateServiceRequest;
import com.google.monitoring.v3.DeleteServiceLevelObjectiveRequest;
import com.google.monitoring.v3.DeleteServiceRequest;
import com.google.monitoring.v3.GetServiceLevelObjectiveRequest;
import com.google.monitoring.v3.GetServiceRequest;
import com.google.monitoring.v3.ListServiceLevelObjectivesRequest;
import com.google.monitoring.v3.ListServiceLevelObjectivesResponse;
import com.google.monitoring.v3.ListServicesRequest;
import com.google.monitoring.v3.ListServicesResponse;
import com.google.monitoring.v3.Service;
import com.google.monitoring.v3.ServiceLevelObjective;
import com.google.monitoring.v3.ServiceMonitoringServiceGrpc.ServiceMonitoringServiceImplBase;
import com.google.monitoring.v3.UpdateServiceLevelObjectiveRequest;
import com.google.monitoring.v3.UpdateServiceRequest;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

@javax.annotation.Generated("by GAPIC")
@BetaApi
public class MockServiceMonitoringServiceImpl extends ServiceMonitoringServiceImplBase {
  private List<AbstractMessage> requests;
  private Queue<Object> responses;

  public MockServiceMonitoringServiceImpl() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  public List<AbstractMessage> getRequests() {
    return requests;
  }

  public void addResponse(AbstractMessage response) {
    responses.add(response);
  }

  public void setResponses(List<AbstractMessage> responses) {
    this.responses = new LinkedList<Object>(responses);
  }

  public void addException(Exception exception) {
    responses.add(exception);
  }

  public void reset() {
    requests = new ArrayList<>();
    responses = new LinkedList<>();
  }

  @Override
  public void createService(
      CreateServiceRequest request, StreamObserver<Service> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Service) {
      requests.add(request);
      responseObserver.onNext((Service) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getService(GetServiceRequest request, StreamObserver<Service> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Service) {
      requests.add(request);
      responseObserver.onNext((Service) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listServices(
      ListServicesRequest request, StreamObserver<ListServicesResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListServicesResponse) {
      requests.add(request);
      responseObserver.onNext((ListServicesResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateService(
      UpdateServiceRequest request, StreamObserver<Service> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Service) {
      requests.add(request);
      responseObserver.onNext((Service) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteService(DeleteServiceRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void createServiceLevelObjective(
      CreateServiceLevelObjectiveRequest request,
      StreamObserver<ServiceLevelObjective> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ServiceLevelObjective) {
      requests.add(request);
      responseObserver.onNext((ServiceLevelObjective) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void getServiceLevelObjective(
      GetServiceLevelObjectiveRequest request,
      StreamObserver<ServiceLevelObjective> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ServiceLevelObjective) {
      requests.add(request);
      responseObserver.onNext((ServiceLevelObjective) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void listServiceLevelObjectives(
      ListServiceLevelObjectivesRequest request,
      StreamObserver<ListServiceLevelObjectivesResponse> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ListServiceLevelObjectivesResponse) {
      requests.add(request);
      responseObserver.onNext((ListServiceLevelObjectivesResponse) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void updateServiceLevelObjective(
      UpdateServiceLevelObjectiveRequest request,
      StreamObserver<ServiceLevelObjective> responseObserver) {
    Object response = responses.remove();
    if (response instanceof ServiceLevelObjective) {
      requests.add(request);
      responseObserver.onNext((ServiceLevelObjective) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }

  @Override
  public void deleteServiceLevelObjective(
      DeleteServiceLevelObjectiveRequest request, StreamObserver<Empty> responseObserver) {
    Object response = responses.remove();
    if (response instanceof Empty) {
      requests.add(request);
      responseObserver.onNext((Empty) response);
      responseObserver.onCompleted();
    } else if (response instanceof Exception) {
      responseObserver.onError((Exception) response);
    } else {
      responseObserver.onError(new IllegalArgumentException("Unrecognized response type"));
    }
  }
}

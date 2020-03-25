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

import com.google.api.core.ApiFunction;
import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.paging.AbstractFixedSizeCollection;
import com.google.api.gax.paging.AbstractPage;
import com.google.api.gax.paging.AbstractPagedListResponse;
import com.google.api.gax.rpc.PageContext;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.monitoring.v3.stub.ServiceMonitoringServiceStub;
import com.google.cloud.monitoring.v3.stub.ServiceMonitoringServiceStubSettings;
import com.google.common.util.concurrent.MoreExecutors;
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
import com.google.monitoring.v3.ProjectName;
import com.google.monitoring.v3.Service;
import com.google.monitoring.v3.ServiceLevelObjective;
import com.google.monitoring.v3.ServiceLevelObjectiveName;
import com.google.monitoring.v3.ServiceName;
import com.google.monitoring.v3.UpdateServiceLevelObjectiveRequest;
import com.google.monitoring.v3.UpdateServiceRequest;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND SERVICE
/**
 * Service Description: The Cloud Monitoring Service-Oriented Monitoring API has endpoints for
 * managing and querying aspects of a workspace's services. These include the `Service`'s monitored
 * resources, its Service-Level Objectives, and a taxonomy of categorized Health Metrics.
 *
 * <p>This class provides the ability to make remote calls to the backing service through method
 * calls that map to API methods. Sample code to get started:
 *
 * <pre>
 * <code>
 * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
 *   ProjectName parent = ProjectName.of("[PROJECT]");
 *   Service service = Service.newBuilder().build();
 *   Service response = serviceMonitoringServiceClient.createService(parent, service);
 * }
 * </code>
 * </pre>
 *
 * <p>Note: close() needs to be called on the serviceMonitoringServiceClient object to clean up
 * resources such as threads. In the example above, try-with-resources is used, which automatically
 * calls close().
 *
 * <p>The surface of this class includes several types of Java methods for each of the API's
 * methods:
 *
 * <ol>
 *   <li>A "flattened" method. With this type of method, the fields of the request type have been
 *       converted into function parameters. It may be the case that not all fields are available as
 *       parameters, and not every API method will have a flattened method entry point.
 *   <li>A "request object" method. This type of method only takes one parameter, a request object,
 *       which must be constructed before the call. Not every API method will have a request object
 *       method.
 *   <li>A "callable" method. This type of method takes no parameters and returns an immutable API
 *       callable object, which can be used to initiate calls to the service.
 * </ol>
 *
 * <p>See the individual methods for example code.
 *
 * <p>Many parameters require resource names to be formatted in a particular way. To assist with
 * these names, this class includes a format method for each type of name, and additionally a parse
 * method to extract the individual identifiers contained within names that are returned.
 *
 * <p>This class can be customized by passing in a custom instance of
 * ServiceMonitoringServiceSettings to create(). For example:
 *
 * <p>To customize credentials:
 *
 * <pre>
 * <code>
 * ServiceMonitoringServiceSettings serviceMonitoringServiceSettings =
 *     ServiceMonitoringServiceSettings.newBuilder()
 *         .setCredentialsProvider(FixedCredentialsProvider.create(myCredentials))
 *         .build();
 * ServiceMonitoringServiceClient serviceMonitoringServiceClient =
 *     ServiceMonitoringServiceClient.create(serviceMonitoringServiceSettings);
 * </code>
 * </pre>
 *
 * To customize the endpoint:
 *
 * <pre>
 * <code>
 * ServiceMonitoringServiceSettings serviceMonitoringServiceSettings =
 *     ServiceMonitoringServiceSettings.newBuilder().setEndpoint(myEndpoint).build();
 * ServiceMonitoringServiceClient serviceMonitoringServiceClient =
 *     ServiceMonitoringServiceClient.create(serviceMonitoringServiceSettings);
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
public class ServiceMonitoringServiceClient implements BackgroundResource {
  private final ServiceMonitoringServiceSettings settings;
  private final ServiceMonitoringServiceStub stub;

  /** Constructs an instance of ServiceMonitoringServiceClient with default settings. */
  public static final ServiceMonitoringServiceClient create() throws IOException {
    return create(ServiceMonitoringServiceSettings.newBuilder().build());
  }

  /**
   * Constructs an instance of ServiceMonitoringServiceClient, using the given settings. The
   * channels are created based on the settings passed in, or defaults for any settings that are not
   * set.
   */
  public static final ServiceMonitoringServiceClient create(
      ServiceMonitoringServiceSettings settings) throws IOException {
    return new ServiceMonitoringServiceClient(settings);
  }

  /**
   * Constructs an instance of ServiceMonitoringServiceClient, using the given stub for making
   * calls. This is for advanced usage - prefer to use ServiceMonitoringServiceSettings}.
   */
  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public static final ServiceMonitoringServiceClient create(ServiceMonitoringServiceStub stub) {
    return new ServiceMonitoringServiceClient(stub);
  }

  /**
   * Constructs an instance of ServiceMonitoringServiceClient, using the given settings. This is
   * protected so that it is easy to make a subclass, but otherwise, the static factory methods
   * should be preferred.
   */
  protected ServiceMonitoringServiceClient(ServiceMonitoringServiceSettings settings)
      throws IOException {
    this.settings = settings;
    this.stub = ((ServiceMonitoringServiceStubSettings) settings.getStubSettings()).createStub();
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  protected ServiceMonitoringServiceClient(ServiceMonitoringServiceStub stub) {
    this.settings = null;
    this.stub = stub;
  }

  public final ServiceMonitoringServiceSettings getSettings() {
    return settings;
  }

  @BetaApi("A restructuring of stub classes is planned, so this may break in the future")
  public ServiceMonitoringServiceStub getStub() {
    return stub;
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Service service = Service.newBuilder().build();
   *   Service response = serviceMonitoringServiceClient.createService(parent, service);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent workspace. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param service Required. The `Service` to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service createService(ProjectName parent, Service service) {
    CreateServiceRequest request =
        CreateServiceRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setService(service)
            .build();
    return createService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Service service = Service.newBuilder().build();
   *   Service response = serviceMonitoringServiceClient.createService(parent.toString(), service);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent workspace. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]
   * @param service Required. The `Service` to create.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service createService(String parent, Service service) {
    CreateServiceRequest request =
        CreateServiceRequest.newBuilder().setParent(parent).setService(service).build();
    return createService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Service service = Service.newBuilder().build();
   *   CreateServiceRequest request = CreateServiceRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setService(service)
   *     .build();
   *   Service response = serviceMonitoringServiceClient.createService(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service createService(CreateServiceRequest request) {
    return createServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   Service service = Service.newBuilder().build();
   *   CreateServiceRequest request = CreateServiceRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setService(service)
   *     .build();
   *   ApiFuture&lt;Service&gt; future = serviceMonitoringServiceClient.createServiceCallable().futureCall(request);
   *   // Do something
   *   Service response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateServiceRequest, Service> createServiceCallable() {
    return stub.createServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get the named `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   Service response = serviceMonitoringServiceClient.getService(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `Service`. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service getService(ServiceName name) {
    GetServiceRequest request =
        GetServiceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    return getService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get the named `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   Service response = serviceMonitoringServiceClient.getService(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `Service`. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service getService(String name) {
    GetServiceRequest request = GetServiceRequest.newBuilder().setName(name).build();
    return getService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get the named `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   GetServiceRequest request = GetServiceRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   Service response = serviceMonitoringServiceClient.getService(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service getService(GetServiceRequest request) {
    return getServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get the named `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   GetServiceRequest request = GetServiceRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Service&gt; future = serviceMonitoringServiceClient.getServiceCallable().futureCall(request);
   *   // Do something
   *   Service response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetServiceRequest, Service> getServiceCallable() {
    return stub.getServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List `Service`s for this workspace.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (Service element : serviceMonitoringServiceClient.listServices(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent containing the listed services, either a
   *     project or a Monitoring Workspace. The formats are:
   *     <p>projects/[PROJECT_ID_OR_NUMBER] workspaces/[HOST_PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices(ProjectName parent) {
    ListServicesRequest request =
        ListServicesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List `Service`s for this workspace.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   for (Service element : serviceMonitoringServiceClient.listServices(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent containing the listed services, either a
   *     project or a Monitoring Workspace. The formats are:
   *     <p>projects/[PROJECT_ID_OR_NUMBER] workspaces/[HOST_PROJECT_ID_OR_NUMBER]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices(String parent) {
    ListServicesRequest request = ListServicesRequest.newBuilder().setParent(parent).build();
    return listServices(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List `Service`s for this workspace.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   ListServicesRequest request = ListServicesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (Service element : serviceMonitoringServiceClient.listServices(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServicesPagedResponse listServices(ListServicesRequest request) {
    return listServicesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List `Service`s for this workspace.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   ListServicesRequest request = ListServicesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListServicesPagedResponse&gt; future = serviceMonitoringServiceClient.listServicesPagedCallable().futureCall(request);
   *   // Do something
   *   for (Service element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListServicesRequest, ListServicesPagedResponse>
      listServicesPagedCallable() {
    return stub.listServicesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List `Service`s for this workspace.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ProjectName parent = ProjectName.of("[PROJECT]");
   *   ListServicesRequest request = ListServicesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListServicesResponse response = serviceMonitoringServiceClient.listServicesCallable().call(request);
   *     for (Service element : response.getServicesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListServicesRequest, ListServicesResponse> listServicesCallable() {
    return stub.listServicesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update this `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   Service service = Service.newBuilder().build();
   *   Service response = serviceMonitoringServiceClient.updateService(service);
   * }
   * </code></pre>
   *
   * @param service Required. The `Service` to draw updates from. The given `name` specifies the
   *     resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service updateService(Service service) {
    UpdateServiceRequest request = UpdateServiceRequest.newBuilder().setService(service).build();
    return updateService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update this `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   Service service = Service.newBuilder().build();
   *   UpdateServiceRequest request = UpdateServiceRequest.newBuilder()
   *     .setService(service)
   *     .build();
   *   Service response = serviceMonitoringServiceClient.updateService(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final Service updateService(UpdateServiceRequest request) {
    return updateServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update this `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   Service service = Service.newBuilder().build();
   *   UpdateServiceRequest request = UpdateServiceRequest.newBuilder()
   *     .setService(service)
   *     .build();
   *   ApiFuture&lt;Service&gt; future = serviceMonitoringServiceClient.updateServiceCallable().futureCall(request);
   *   // Do something
   *   Service response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateServiceRequest, Service> updateServiceCallable() {
    return stub.updateServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Soft delete this `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   serviceMonitoringServiceClient.deleteService(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `Service` to delete. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteService(ServiceName name) {
    DeleteServiceRequest request =
        DeleteServiceRequest.newBuilder().setName(name == null ? null : name.toString()).build();
    deleteService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Soft delete this `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   serviceMonitoringServiceClient.deleteService(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `Service` to delete. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteService(String name) {
    DeleteServiceRequest request = DeleteServiceRequest.newBuilder().setName(name).build();
    deleteService(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Soft delete this `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   DeleteServiceRequest request = DeleteServiceRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   serviceMonitoringServiceClient.deleteService(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteService(DeleteServiceRequest request) {
    deleteServiceCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Soft delete this `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName name = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   DeleteServiceRequest request = DeleteServiceRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = serviceMonitoringServiceClient.deleteServiceCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteServiceRequest, Empty> deleteServiceCallable() {
    return stub.deleteServiceCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `ServiceLevelObjective` for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.createServiceLevelObjective(parent, serviceLevelObjective);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent `Service`. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * @param serviceLevelObjective Required. The `ServiceLevelObjective` to create. The provided
   *     `name` will be respected if no `ServiceLevelObjective` exists with this name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective createServiceLevelObjective(
      ServiceName parent, ServiceLevelObjective serviceLevelObjective) {
    CreateServiceLevelObjectiveRequest request =
        CreateServiceLevelObjectiveRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .setServiceLevelObjective(serviceLevelObjective)
            .build();
    return createServiceLevelObjective(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `ServiceLevelObjective` for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.createServiceLevelObjective(parent.toString(), serviceLevelObjective);
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent `Service`. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   * @param serviceLevelObjective Required. The `ServiceLevelObjective` to create. The provided
   *     `name` will be respected if no `ServiceLevelObjective` exists with this name.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective createServiceLevelObjective(
      String parent, ServiceLevelObjective serviceLevelObjective) {
    CreateServiceLevelObjectiveRequest request =
        CreateServiceLevelObjectiveRequest.newBuilder()
            .setParent(parent)
            .setServiceLevelObjective(serviceLevelObjective)
            .build();
    return createServiceLevelObjective(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `ServiceLevelObjective` for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
   *   CreateServiceLevelObjectiveRequest request = CreateServiceLevelObjectiveRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setServiceLevelObjective(serviceLevelObjective)
   *     .build();
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.createServiceLevelObjective(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective createServiceLevelObjective(
      CreateServiceLevelObjectiveRequest request) {
    return createServiceLevelObjectiveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Create a `ServiceLevelObjective` for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
   *   CreateServiceLevelObjectiveRequest request = CreateServiceLevelObjectiveRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .setServiceLevelObjective(serviceLevelObjective)
   *     .build();
   *   ApiFuture&lt;ServiceLevelObjective&gt; future = serviceMonitoringServiceClient.createServiceLevelObjectiveCallable().futureCall(request);
   *   // Do something
   *   ServiceLevelObjective response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<CreateServiceLevelObjectiveRequest, ServiceLevelObjective>
      createServiceLevelObjectiveCallable() {
    return stub.createServiceLevelObjectiveCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get a `ServiceLevelObjective` by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.getServiceLevelObjective(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `ServiceLevelObjective` to get. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective getServiceLevelObjective(ServiceLevelObjectiveName name) {
    GetServiceLevelObjectiveRequest request =
        GetServiceLevelObjectiveRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    return getServiceLevelObjective(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get a `ServiceLevelObjective` by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.getServiceLevelObjective(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `ServiceLevelObjective` to get. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective getServiceLevelObjective(String name) {
    GetServiceLevelObjectiveRequest request =
        GetServiceLevelObjectiveRequest.newBuilder().setName(name).build();
    return getServiceLevelObjective(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get a `ServiceLevelObjective` by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   GetServiceLevelObjectiveRequest request = GetServiceLevelObjectiveRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.getServiceLevelObjective(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective getServiceLevelObjective(
      GetServiceLevelObjectiveRequest request) {
    return getServiceLevelObjectiveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Get a `ServiceLevelObjective` by name.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   GetServiceLevelObjectiveRequest request = GetServiceLevelObjectiveRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;ServiceLevelObjective&gt; future = serviceMonitoringServiceClient.getServiceLevelObjectiveCallable().futureCall(request);
   *   // Do something
   *   ServiceLevelObjective response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<GetServiceLevelObjectiveRequest, ServiceLevelObjective>
      getServiceLevelObjectiveCallable() {
    return stub.getServiceLevelObjectiveCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List the `ServiceLevelObjective`s for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   for (ServiceLevelObjective element : serviceMonitoringServiceClient.listServiceLevelObjectives(parent).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent containing the listed SLOs, either a
   *     project or a Monitoring Workspace. The formats are:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   *     workspaces/[HOST_PROJECT_ID_OR_NUMBER]/services/-
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServiceLevelObjectivesPagedResponse listServiceLevelObjectives(
      ServiceName parent) {
    ListServiceLevelObjectivesRequest request =
        ListServiceLevelObjectivesRequest.newBuilder()
            .setParent(parent == null ? null : parent.toString())
            .build();
    return listServiceLevelObjectives(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List the `ServiceLevelObjective`s for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   for (ServiceLevelObjective element : serviceMonitoringServiceClient.listServiceLevelObjectives(parent.toString()).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param parent Required. Resource name of the parent containing the listed SLOs, either a
   *     project or a Monitoring Workspace. The formats are:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
   *     workspaces/[HOST_PROJECT_ID_OR_NUMBER]/services/-
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServiceLevelObjectivesPagedResponse listServiceLevelObjectives(String parent) {
    ListServiceLevelObjectivesRequest request =
        ListServiceLevelObjectivesRequest.newBuilder().setParent(parent).build();
    return listServiceLevelObjectives(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List the `ServiceLevelObjective`s for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   ListServiceLevelObjectivesRequest request = ListServiceLevelObjectivesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   for (ServiceLevelObjective element : serviceMonitoringServiceClient.listServiceLevelObjectives(request).iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ListServiceLevelObjectivesPagedResponse listServiceLevelObjectives(
      ListServiceLevelObjectivesRequest request) {
    return listServiceLevelObjectivesPagedCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List the `ServiceLevelObjective`s for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   ListServiceLevelObjectivesRequest request = ListServiceLevelObjectivesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   ApiFuture&lt;ListServiceLevelObjectivesPagedResponse&gt; future = serviceMonitoringServiceClient.listServiceLevelObjectivesPagedCallable().futureCall(request);
   *   // Do something
   *   for (ServiceLevelObjective element : future.get().iterateAll()) {
   *     // doThingsWith(element);
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<
          ListServiceLevelObjectivesRequest, ListServiceLevelObjectivesPagedResponse>
      listServiceLevelObjectivesPagedCallable() {
    return stub.listServiceLevelObjectivesPagedCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * List the `ServiceLevelObjective`s for the given `Service`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceName parent = ServiceName.of("[PROJECT]", "[SERVICE]");
   *   ListServiceLevelObjectivesRequest request = ListServiceLevelObjectivesRequest.newBuilder()
   *     .setParent(parent.toString())
   *     .build();
   *   while (true) {
   *     ListServiceLevelObjectivesResponse response = serviceMonitoringServiceClient.listServiceLevelObjectivesCallable().call(request);
   *     for (ServiceLevelObjective element : response.getServiceLevelObjectivesList()) {
   *       // doThingsWith(element);
   *     }
   *     String nextPageToken = response.getNextPageToken();
   *     if (!Strings.isNullOrEmpty(nextPageToken)) {
   *       request = request.toBuilder().setPageToken(nextPageToken).build();
   *     } else {
   *       break;
   *     }
   *   }
   * }
   * </code></pre>
   */
  public final UnaryCallable<ListServiceLevelObjectivesRequest, ListServiceLevelObjectivesResponse>
      listServiceLevelObjectivesCallable() {
    return stub.listServiceLevelObjectivesCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update the given `ServiceLevelObjective`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.updateServiceLevelObjective(serviceLevelObjective);
   * }
   * </code></pre>
   *
   * @param serviceLevelObjective Required. The `ServiceLevelObjective` to draw updates from. The
   *     given `name` specifies the resource to update.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective updateServiceLevelObjective(
      ServiceLevelObjective serviceLevelObjective) {
    UpdateServiceLevelObjectiveRequest request =
        UpdateServiceLevelObjectiveRequest.newBuilder()
            .setServiceLevelObjective(serviceLevelObjective)
            .build();
    return updateServiceLevelObjective(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update the given `ServiceLevelObjective`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
   *   UpdateServiceLevelObjectiveRequest request = UpdateServiceLevelObjectiveRequest.newBuilder()
   *     .setServiceLevelObjective(serviceLevelObjective)
   *     .build();
   *   ServiceLevelObjective response = serviceMonitoringServiceClient.updateServiceLevelObjective(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final ServiceLevelObjective updateServiceLevelObjective(
      UpdateServiceLevelObjectiveRequest request) {
    return updateServiceLevelObjectiveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Update the given `ServiceLevelObjective`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjective serviceLevelObjective = ServiceLevelObjective.newBuilder().build();
   *   UpdateServiceLevelObjectiveRequest request = UpdateServiceLevelObjectiveRequest.newBuilder()
   *     .setServiceLevelObjective(serviceLevelObjective)
   *     .build();
   *   ApiFuture&lt;ServiceLevelObjective&gt; future = serviceMonitoringServiceClient.updateServiceLevelObjectiveCallable().futureCall(request);
   *   // Do something
   *   ServiceLevelObjective response = future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<UpdateServiceLevelObjectiveRequest, ServiceLevelObjective>
      updateServiceLevelObjectiveCallable() {
    return stub.updateServiceLevelObjectiveCallable();
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete the given `ServiceLevelObjective`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   serviceMonitoringServiceClient.deleteServiceLevelObjective(name);
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `ServiceLevelObjective` to delete. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteServiceLevelObjective(ServiceLevelObjectiveName name) {
    DeleteServiceLevelObjectiveRequest request =
        DeleteServiceLevelObjectiveRequest.newBuilder()
            .setName(name == null ? null : name.toString())
            .build();
    deleteServiceLevelObjective(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete the given `ServiceLevelObjective`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   serviceMonitoringServiceClient.deleteServiceLevelObjective(name.toString());
   * }
   * </code></pre>
   *
   * @param name Required. Resource name of the `ServiceLevelObjective` to delete. The format is:
   *     <p>projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteServiceLevelObjective(String name) {
    DeleteServiceLevelObjectiveRequest request =
        DeleteServiceLevelObjectiveRequest.newBuilder().setName(name).build();
    deleteServiceLevelObjective(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete the given `ServiceLevelObjective`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   DeleteServiceLevelObjectiveRequest request = DeleteServiceLevelObjectiveRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   serviceMonitoringServiceClient.deleteServiceLevelObjective(request);
   * }
   * </code></pre>
   *
   * @param request The request object containing all of the parameters for the API call.
   * @throws com.google.api.gax.rpc.ApiException if the remote call fails
   */
  public final void deleteServiceLevelObjective(DeleteServiceLevelObjectiveRequest request) {
    deleteServiceLevelObjectiveCallable().call(request);
  }

  // AUTO-GENERATED DOCUMENTATION AND METHOD
  /**
   * Delete the given `ServiceLevelObjective`.
   *
   * <p>Sample code:
   *
   * <pre><code>
   * try (ServiceMonitoringServiceClient serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create()) {
   *   ServiceLevelObjectiveName name = ServiceLevelObjectiveName.of("[PROJECT]", "[SERVICE]", "[SERVICE_LEVEL_OBJECTIVE]");
   *   DeleteServiceLevelObjectiveRequest request = DeleteServiceLevelObjectiveRequest.newBuilder()
   *     .setName(name.toString())
   *     .build();
   *   ApiFuture&lt;Void&gt; future = serviceMonitoringServiceClient.deleteServiceLevelObjectiveCallable().futureCall(request);
   *   // Do something
   *   future.get();
   * }
   * </code></pre>
   */
  public final UnaryCallable<DeleteServiceLevelObjectiveRequest, Empty>
      deleteServiceLevelObjectiveCallable() {
    return stub.deleteServiceLevelObjectiveCallable();
  }

  @Override
  public final void close() {
    stub.close();
  }

  @Override
  public void shutdown() {
    stub.shutdown();
  }

  @Override
  public boolean isShutdown() {
    return stub.isShutdown();
  }

  @Override
  public boolean isTerminated() {
    return stub.isTerminated();
  }

  @Override
  public void shutdownNow() {
    stub.shutdownNow();
  }

  @Override
  public boolean awaitTermination(long duration, TimeUnit unit) throws InterruptedException {
    return stub.awaitTermination(duration, unit);
  }

  public static class ListServicesPagedResponse
      extends AbstractPagedListResponse<
          ListServicesRequest,
          ListServicesResponse,
          Service,
          ListServicesPage,
          ListServicesFixedSizeCollection> {

    public static ApiFuture<ListServicesPagedResponse> createAsync(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ApiFuture<ListServicesResponse> futureResponse) {
      ApiFuture<ListServicesPage> futurePage =
          ListServicesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<ListServicesPage, ListServicesPagedResponse>() {
            @Override
            public ListServicesPagedResponse apply(ListServicesPage input) {
              return new ListServicesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListServicesPagedResponse(ListServicesPage page) {
      super(page, ListServicesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListServicesPage
      extends AbstractPage<ListServicesRequest, ListServicesResponse, Service, ListServicesPage> {

    private ListServicesPage(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ListServicesResponse response) {
      super(context, response);
    }

    private static ListServicesPage createEmptyPage() {
      return new ListServicesPage(null, null);
    }

    @Override
    protected ListServicesPage createPage(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ListServicesResponse response) {
      return new ListServicesPage(context, response);
    }

    @Override
    public ApiFuture<ListServicesPage> createPageAsync(
        PageContext<ListServicesRequest, ListServicesResponse, Service> context,
        ApiFuture<ListServicesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListServicesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListServicesRequest,
          ListServicesResponse,
          Service,
          ListServicesPage,
          ListServicesFixedSizeCollection> {

    private ListServicesFixedSizeCollection(List<ListServicesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListServicesFixedSizeCollection createEmptyCollection() {
      return new ListServicesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListServicesFixedSizeCollection createCollection(
        List<ListServicesPage> pages, int collectionSize) {
      return new ListServicesFixedSizeCollection(pages, collectionSize);
    }
  }

  public static class ListServiceLevelObjectivesPagedResponse
      extends AbstractPagedListResponse<
          ListServiceLevelObjectivesRequest,
          ListServiceLevelObjectivesResponse,
          ServiceLevelObjective,
          ListServiceLevelObjectivesPage,
          ListServiceLevelObjectivesFixedSizeCollection> {

    public static ApiFuture<ListServiceLevelObjectivesPagedResponse> createAsync(
        PageContext<
                ListServiceLevelObjectivesRequest,
                ListServiceLevelObjectivesResponse,
                ServiceLevelObjective>
            context,
        ApiFuture<ListServiceLevelObjectivesResponse> futureResponse) {
      ApiFuture<ListServiceLevelObjectivesPage> futurePage =
          ListServiceLevelObjectivesPage.createEmptyPage().createPageAsync(context, futureResponse);
      return ApiFutures.transform(
          futurePage,
          new ApiFunction<
              ListServiceLevelObjectivesPage, ListServiceLevelObjectivesPagedResponse>() {
            @Override
            public ListServiceLevelObjectivesPagedResponse apply(
                ListServiceLevelObjectivesPage input) {
              return new ListServiceLevelObjectivesPagedResponse(input);
            }
          },
          MoreExecutors.directExecutor());
    }

    private ListServiceLevelObjectivesPagedResponse(ListServiceLevelObjectivesPage page) {
      super(page, ListServiceLevelObjectivesFixedSizeCollection.createEmptyCollection());
    }
  }

  public static class ListServiceLevelObjectivesPage
      extends AbstractPage<
          ListServiceLevelObjectivesRequest,
          ListServiceLevelObjectivesResponse,
          ServiceLevelObjective,
          ListServiceLevelObjectivesPage> {

    private ListServiceLevelObjectivesPage(
        PageContext<
                ListServiceLevelObjectivesRequest,
                ListServiceLevelObjectivesResponse,
                ServiceLevelObjective>
            context,
        ListServiceLevelObjectivesResponse response) {
      super(context, response);
    }

    private static ListServiceLevelObjectivesPage createEmptyPage() {
      return new ListServiceLevelObjectivesPage(null, null);
    }

    @Override
    protected ListServiceLevelObjectivesPage createPage(
        PageContext<
                ListServiceLevelObjectivesRequest,
                ListServiceLevelObjectivesResponse,
                ServiceLevelObjective>
            context,
        ListServiceLevelObjectivesResponse response) {
      return new ListServiceLevelObjectivesPage(context, response);
    }

    @Override
    public ApiFuture<ListServiceLevelObjectivesPage> createPageAsync(
        PageContext<
                ListServiceLevelObjectivesRequest,
                ListServiceLevelObjectivesResponse,
                ServiceLevelObjective>
            context,
        ApiFuture<ListServiceLevelObjectivesResponse> futureResponse) {
      return super.createPageAsync(context, futureResponse);
    }
  }

  public static class ListServiceLevelObjectivesFixedSizeCollection
      extends AbstractFixedSizeCollection<
          ListServiceLevelObjectivesRequest,
          ListServiceLevelObjectivesResponse,
          ServiceLevelObjective,
          ListServiceLevelObjectivesPage,
          ListServiceLevelObjectivesFixedSizeCollection> {

    private ListServiceLevelObjectivesFixedSizeCollection(
        List<ListServiceLevelObjectivesPage> pages, int collectionSize) {
      super(pages, collectionSize);
    }

    private static ListServiceLevelObjectivesFixedSizeCollection createEmptyCollection() {
      return new ListServiceLevelObjectivesFixedSizeCollection(null, 0);
    }

    @Override
    protected ListServiceLevelObjectivesFixedSizeCollection createCollection(
        List<ListServiceLevelObjectivesPage> pages, int collectionSize) {
      return new ListServiceLevelObjectivesFixedSizeCollection(pages, collectionSize);
    }
  }
}

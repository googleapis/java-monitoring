package com.example.monitoring;

import com.google.api.MetricDescriptor;
import com.google.cloud.monitoring.v3.MetricServiceClient;
import com.google.monitoring.v3.ListMetricDescriptorsRequest;
import com.google.monitoring.v3.ProjectName;

import java.io.IOException;

public class ListMetricDescriptorsSample {
  /**
   * Returns the first page of all metric descriptors.
   */
  void listMetricDescriptors() throws IOException {
    // [START monitoring_list_descriptors]
    // Your Google Cloud Platform project ID
    String projectId = System.getProperty("projectId");

    final MetricServiceClient client = MetricServiceClient.create();
    ProjectName name = ProjectName.of(projectId);

    ListMetricDescriptorsRequest request = ListMetricDescriptorsRequest
            .newBuilder()
            .setName(name.toString())
            .build();
    MetricServiceClient.ListMetricDescriptorsPagedResponse response = client.listMetricDescriptors(request);

    System.out.println("Listing descriptors: ");

    for (MetricDescriptor d : response.iterateAll()) {
      System.out.println(d.getName() + " " + d.getDisplayName());
    }
    // [END monitoring_list_descriptors]
  }
}

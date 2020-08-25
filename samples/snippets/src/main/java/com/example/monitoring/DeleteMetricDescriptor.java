/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.monitoring;

// [START monitoring_delete_metric]
import com.google.api.gax.rpc.ApiException;
import com.google.cloud.monitoring.v3.MetricServiceClient;
import com.google.monitoring.v3.MetricDescriptorName;
import com.google.monitoring.v3.ProjectName;
import java.io.IOException;

// Sample to delete metric descriptor
public class DeleteMetricDescriptor {

  public static void main(String[] args) throws IOException {
    // TODO(developer): Replace these variables before running the sample.
    String projectId = "your-project-id";
    deleteMetricDescriptor(projectId, ProjectName.of(projectId).toString());
  }

  public static void deleteMetricDescriptor(String projectId, String name) throws IOException {
    // Initialize client that will be used to send requests. This client only needs to be created
    // once, and can be reused for multiple requests.
    try (MetricServiceClient metricServiceClient = MetricServiceClient.create()) {
      MetricDescriptorName metricName = MetricDescriptorName.of(projectId, name);
      // Deletes a metric descriptor
      metricServiceClient.deleteMetricDescriptor(metricName);
      System.out.println("metric descriptor deleted successfully" + name);
    } catch (ApiException ex) {
      System.out.print("\nmetric descriptor was not deleted." + ex.toString());
    }
  }
}
// [END monitoring_delete_metric]

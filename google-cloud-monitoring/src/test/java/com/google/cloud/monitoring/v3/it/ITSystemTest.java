/*
 * Copyright 2019 Google LLC
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
package com.google.cloud.monitoring.v3.it;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.google.api.MetricDescriptor;
import com.google.api.MetricDescriptor.MetricKind;
import com.google.api.MetricDescriptor.ValueType;
import com.google.api.MonitoredResource;
import com.google.api.MonitoredResourceDescriptor;
import com.google.cloud.ServiceOptions;
import com.google.cloud.monitoring.v3.AlertPolicyServiceClient;
import com.google.cloud.monitoring.v3.GroupServiceClient;
import com.google.cloud.monitoring.v3.MetricServiceClient;
import com.google.cloud.monitoring.v3.ServiceMonitoringServiceClient;
import com.google.cloud.monitoring.v3.UptimeCheckServiceClient;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.monitoring.v3.Aggregation;
import com.google.monitoring.v3.AlertPolicy;
import com.google.monitoring.v3.AlertPolicy.Condition;
import com.google.monitoring.v3.AlertPolicy.Condition.MetricThreshold;
import com.google.monitoring.v3.AlertPolicyName;
import com.google.monitoring.v3.ComparisonType;
import com.google.monitoring.v3.Group;
import com.google.monitoring.v3.GroupName;
import com.google.monitoring.v3.MetricDescriptorName;
import com.google.monitoring.v3.ProjectName;
import com.google.monitoring.v3.Service;
import com.google.monitoring.v3.Service.Custom;
import com.google.monitoring.v3.Service.Telemetry;
import com.google.monitoring.v3.ServiceName;
import com.google.monitoring.v3.UpdateAlertPolicyRequest;
import com.google.monitoring.v3.UptimeCheckConfig;
import com.google.monitoring.v3.UptimeCheckConfigName;
import com.google.protobuf.BoolValue;
import com.google.protobuf.Duration;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class ITSystemTest {
  private static AlertPolicyServiceClient client;
  private static GroupServiceClient groupServiceClient;
  private static MetricServiceClient metricServiceClient;
  private static UptimeCheckServiceClient uptimeCheckServiceClient;
  private static ServiceMonitoringServiceClient serviceMonitoringServiceClient;
  private static String alertPolicyName;
  private static String groupName;
  private static String metricDescriptorName;
  private static String serviceName;

  private static final String PROJECT = ServiceOptions.getDefaultProjectId();
  private static final String ID = UUID.randomUUID().toString().substring(0, 8);
  private static final String ALERT_POLICY_DISPLAY_NAME = "test-alert-policy-" + ID;
  private static final String METRIC_FILTER =
      "metric.type=\"compute.googleapis.com/instance/cpu/utilization\" AND resource.type=\"gce_instance\"";
  private static final String GROUP_DISPLAY_NAME = "test-group-" + ID;
  private static final String GROUP_FILTER = "resource.metadata.name=starts_with(\"test-\")";
  private static final String METRIC_DESCRIPTOR_DISPLAY_NAME = "test-metric-descriptor-" + ID;
  private static final String METRIC_DESCRIPTOR_TYPE = "custom.googleapis.com/invoice/paid/amount";
  private static final String UPTIME_CHECK_CONFIG = "test-uptime-config-" + ID;
  private static final String MONITORED_RESOURCE_TYPE = "uptime_url";
  private static final String UPTIME_CHECK_CONFIG_NAME =
      UptimeCheckConfigName.of(PROJECT, UPTIME_CHECK_CONFIG).toString();
  private static final String SERVICE_NAME = "test-service-" + ID;
  private static final Map<String, String> MONITORED_RESOURCE_LABEL =
      ImmutableMap.of("project_id", PROJECT, "host", "www.google.com");
  private static final ProjectName FORMATTED_PROJECT = ProjectName.of(PROJECT);
  private static final Duration AGGREGATION_DURATION = Duration.newBuilder().setSeconds(60).build();
  private static final Aggregation AGGREGATION =
      Aggregation.newBuilder()
          .setAlignmentPeriod(AGGREGATION_DURATION)
          .setCrossSeriesReducer(Aggregation.Reducer.REDUCE_MEAN)
          .setPerSeriesAligner(Aggregation.Aligner.ALIGN_MAX)
          .build();
  private static final Duration METRIC_DURATION = Duration.newBuilder().setSeconds(900).build();
  private static final MetricThreshold METRIC_THRESHOLD =
      AlertPolicy.Condition.MetricThreshold.newBuilder()
          .setComparison(ComparisonType.COMPARISON_GT)
          .addAggregations(AGGREGATION)
          .setDuration(METRIC_DURATION)
          .setFilter(METRIC_FILTER)
          .build();
  private static final Condition CONDITION =
      AlertPolicy.Condition.newBuilder()
          .setDisplayName(ALERT_POLICY_DISPLAY_NAME)
          .setConditionThreshold(METRIC_THRESHOLD)
          .build();
  private static final MonitoredResource MONITORED_RESOURCE =
      MonitoredResource.newBuilder()
          .putAllLabels(MONITORED_RESOURCE_LABEL)
          .setType(MONITORED_RESOURCE_TYPE)
          .build();
  private static final Custom CUSTOM = Service.Custom.newBuilder().build();

  @BeforeClass
  public static void setUp() throws Exception {

    /* create AlertPolicy */
    client = AlertPolicyServiceClient.create();
    AlertPolicy alertPolicy =
        AlertPolicy.newBuilder()
            .setDisplayName(ALERT_POLICY_DISPLAY_NAME)
            .addConditions(CONDITION)
            .setCombiner(AlertPolicy.ConditionCombinerType.AND)
            .build();
    AlertPolicy actualAlertPolicy = client.createAlertPolicy(FORMATTED_PROJECT, alertPolicy);
    alertPolicyName =
        AlertPolicyName.of(
                PROJECT,
                actualAlertPolicy
                    .getName()
                    .substring(actualAlertPolicy.getName().lastIndexOf('/') + 1))
            .toString();

    /* create GroupServiceClient */
    groupServiceClient = GroupServiceClient.create();
    Group group =
        Group.newBuilder().setDisplayName(GROUP_DISPLAY_NAME).setFilter(GROUP_FILTER).build();
    Group actualGroup = groupServiceClient.createGroup(FORMATTED_PROJECT, group);
    groupName =
        GroupName.of(
                PROJECT,
                actualGroup.getName().substring(actualGroup.getName().lastIndexOf("/") + 1))
            .toString();

    /* create MetricServiceClient */
    metricServiceClient = MetricServiceClient.create();
    MetricDescriptor metricDescriptor =
        MetricDescriptor.newBuilder()
            .setDisplayName(METRIC_DESCRIPTOR_DISPLAY_NAME)
            .setType(METRIC_DESCRIPTOR_TYPE)
            .setMetricKind(MetricKind.GAUGE)
            .setValueType(ValueType.BOOL)
            .build();
    MetricDescriptor actualMetricDescriptor =
        metricServiceClient.createMetricDescriptor(FORMATTED_PROJECT, metricDescriptor);
    metricDescriptorName =
        MetricDescriptorName.of(
                PROJECT,
                actualMetricDescriptor
                    .getName()
                    .substring(actualMetricDescriptor.getName().indexOf("custom.googleapis.com")))
            .toString();

    /* create MetricServiceClient */
    serviceMonitoringServiceClient = ServiceMonitoringServiceClient.create();
    Service service = Service.newBuilder().setDisplayName(SERVICE_NAME).setCustom(CUSTOM).build();
    Service actualService =
        serviceMonitoringServiceClient.createService(FORMATTED_PROJECT, service);
    serviceName =
        ServiceName.of(
                PROJECT,
                actualService.getName().substring(actualService.getName().lastIndexOf("/") + 1))
            .toString();

    /* create UptimeCheckServiceClient */
    uptimeCheckServiceClient = UptimeCheckServiceClient.create();
    UptimeCheckConfig uptimeCheckConfig =
        UptimeCheckConfig.newBuilder()
            .setMonitoredResource(MONITORED_RESOURCE)
            .setDisplayName(UPTIME_CHECK_CONFIG)
            .build();
    uptimeCheckServiceClient.createUptimeCheckConfig(
        FORMATTED_PROJECT.toString(), uptimeCheckConfig);
  }

  @AfterClass
  public static void tearDown() {
    client.deleteAlertPolicy(alertPolicyName);
    client.close();
    groupServiceClient.deleteGroup(groupName);
    groupServiceClient.close();
    metricServiceClient.deleteMetricDescriptor(metricDescriptorName);
    metricServiceClient.close();
    serviceMonitoringServiceClient.deleteService(serviceName);
    serviceMonitoringServiceClient.close();
    uptimeCheckServiceClient.deleteUptimeCheckConfig(UPTIME_CHECK_CONFIG_NAME);
    uptimeCheckServiceClient.close();
  }

  @Test
  public void getAlertPolicyTest() {
    AlertPolicy alertPolicy = client.getAlertPolicy(alertPolicyName);
    assertAlertPolicy(alertPolicy);
  }

  @Test
  public void listAlertPoliciesTest() {
    List<AlertPolicy> alertPolicyList =
        Lists.newArrayList(client.listAlertPolicies(FORMATTED_PROJECT).iterateAll());
    for (AlertPolicy alertPolicy : alertPolicyList) {
      if (ALERT_POLICY_DISPLAY_NAME.equals(alertPolicy.getDisplayName())) {
        assertAlertPolicy(alertPolicy);
      }
    }
  }

  @Test
  public void updateAlertPolicyTest() {
    BoolValue boolValue = BoolValue.newBuilder().setValue(Boolean.TRUE).build();
    AlertPolicy alertPolicy =
        AlertPolicy.newBuilder()
            .setName(alertPolicyName)
            .setDisplayName(ALERT_POLICY_DISPLAY_NAME)
            .addConditions(CONDITION)
            .setCombiner(AlertPolicy.ConditionCombinerType.AND)
            .setEnabled(boolValue)
            .build();
    UpdateAlertPolicyRequest alertPolicyRequest =
        UpdateAlertPolicyRequest.newBuilder().setAlertPolicy(alertPolicy).build();
    AlertPolicy updateAlertPolicy = client.updateAlertPolicy(alertPolicyRequest);
    assertEquals(boolValue, updateAlertPolicy.getEnabled());
    assertAlertPolicy(updateAlertPolicy);
  }

  @Test
  public void getGroupTest() {
    Group group = groupServiceClient.getGroup(groupName);
    assertNotNull(group);
    assertGroup(group);
  }

  @Test
  public void listGroupsTest() {
    List<Group> groups =
        Lists.newArrayList(groupServiceClient.listGroups(FORMATTED_PROJECT).iterateAll());
    for (Group group : groups) {
      if (groupName.equals(group.getName())) {
        assertGroup(group);
      }
    }
  }

  @Test
  public void updateGroupTest() {
    Group group =
        Group.newBuilder()
            .setName(groupName)
            .setDisplayName(GROUP_DISPLAY_NAME)
            .setFilter(GROUP_FILTER)
            .setIsCluster(Boolean.TRUE)
            .build();
    Group updateGroup = groupServiceClient.updateGroup(group);
    assertGroup(updateGroup);
    assertEquals(Boolean.TRUE, group.getIsCluster());
  }

  @Test
  public void listGroupMembersTest() {
    List<MonitoredResource> monitoredResources =
        Lists.newArrayList(groupServiceClient.listGroupMembers(groupName).iterateAll());
    assertNotNull(monitoredResources);
    assertTrue(monitoredResources.size() > 0);
    assertFalse(monitoredResources.contains(null));
  }

  @Test
  public void getMetricDescriptorTest() {
    MetricDescriptor metricDescriptor =
        metricServiceClient.getMetricDescriptor(metricDescriptorName);
    assertMetricDescriptor(metricDescriptor);
  }

  @Test
  public void listMetricDescriptorsTest() {
    List<MetricDescriptor> metricDescriptors =
        Lists.newArrayList(
            metricServiceClient.listMetricDescriptors(FORMATTED_PROJECT).iterateAll());
    for (MetricDescriptor metricDescriptor : metricDescriptors) {
      if (metricDescriptorName.equals(metricDescriptor.getName())) {
        assertMetricDescriptor(metricDescriptor);
      }
    }
  }

  @Test
  public void listMonitoredResourceDescriptorsTest() {
    List<MonitoredResourceDescriptor> monitoredResourceDescriptors =
        Lists.newArrayList(
            metricServiceClient.listMonitoredResourceDescriptors(FORMATTED_PROJECT).iterateAll());
    assertNotNull(monitoredResourceDescriptors);
    assertTrue(monitoredResourceDescriptors.size() > 0);
  }

  @Test
  public void getUptimeCheckConfigTest() {
    UptimeCheckConfig uptimeCheckConfig =
        uptimeCheckServiceClient.getUptimeCheckConfig(UPTIME_CHECK_CONFIG_NAME);
    assertUptimeCheckConfig(uptimeCheckConfig);
  }

  @Test
  public void listUptimeCheckConfigsTest() {
    List<UptimeCheckConfig> uptimeCheckConfigs =
        Lists.newArrayList(
            uptimeCheckServiceClient
                .listUptimeCheckConfigs(FORMATTED_PROJECT.toString())
                .iterateAll());
    for (UptimeCheckConfig uptimeCheckConfig : uptimeCheckConfigs) {
      if (UPTIME_CHECK_CONFIG_NAME.equals(uptimeCheckConfig.getName())) {
        assertUptimeCheckConfig(uptimeCheckConfig);
      }
    }
  }

  @Test
  public void updateUptimeCheckConfigTest() {
    UptimeCheckConfig.HttpCheck httpCheck =
        UptimeCheckConfig.HttpCheck.newBuilder().setPath("/").setPort(80).build();
    UptimeCheckConfig uptimeCheckConfig =
        UptimeCheckConfig.newBuilder()
            .setName(UPTIME_CHECK_CONFIG_NAME)
            .setMonitoredResource(MONITORED_RESOURCE)
            .setDisplayName(UPTIME_CHECK_CONFIG)
            .setHttpCheck(httpCheck)
            .build();
    UptimeCheckConfig updateUptimeCheckConfig =
        uptimeCheckServiceClient.updateUptimeCheckConfig(uptimeCheckConfig);
    assertUptimeCheckConfig(updateUptimeCheckConfig);
    assertEquals(httpCheck, updateUptimeCheckConfig.getHttpCheck());
  }

  @Test
  public void getServiceTest() {
    Service service = serviceMonitoringServiceClient.getService(serviceName);
    assertServiceDetail(service);
  }

  @Test
  public void listServicesTest() {
    List<Service> services =
        Lists.newArrayList(
            serviceMonitoringServiceClient.listServices(FORMATTED_PROJECT).iterateAll());
    for (Service service : services) {
      if (SERVICE_NAME.equals(service.getDisplayName())) {
        assertServiceDetail(service);
      }
    }
  }

  @Test
  public void updateServiceTest() {
    Telemetry telemetry = Service.Telemetry.newBuilder().build();
    Service service =
        Service.newBuilder()
            .setName(serviceName)
            .setDisplayName(SERVICE_NAME)
            .setCustom(CUSTOM)
            .setTelemetry(telemetry)
            .build();
    Service actualService = serviceMonitoringServiceClient.updateService(service);
    assertServiceDetail(actualService);
    assertEquals(telemetry, actualService.getTelemetry());
  }

  private void assertAlertPolicy(AlertPolicy alertPolicy) {
    assertNotNull(alertPolicy);
    assertEquals(alertPolicyName, alertPolicy.getName());
    assertEquals(ALERT_POLICY_DISPLAY_NAME, alertPolicy.getDisplayName());

    List<Condition> conditions = alertPolicy.getConditionsList();
    for (Condition condition : conditions) {
      assertEquals(ALERT_POLICY_DISPLAY_NAME, condition.getDisplayName());

      /* MetricThreshold */
      MetricThreshold metricThreshold = condition.getConditionThreshold();
      assertEquals(METRIC_THRESHOLD, metricThreshold);
      assertEquals(ComparisonType.COMPARISON_GT, metricThreshold.getComparison());
      assertEquals(METRIC_DURATION, metricThreshold.getDuration());
      assertEquals(METRIC_FILTER, metricThreshold.getFilter());

      /* Aggregation */
      Aggregation aggregation = metricThreshold.getAggregations(0);
      assertEquals(AGGREGATION, aggregation);
      assertEquals(AGGREGATION_DURATION, aggregation.getAlignmentPeriod());
      assertEquals(Aggregation.Reducer.REDUCE_MEAN, aggregation.getCrossSeriesReducer());
      assertEquals(Aggregation.Aligner.ALIGN_MAX, aggregation.getPerSeriesAligner());
    }
  }

  private void assertGroup(Group group) {
    assertNotNull(group);
    assertEquals(groupName, group.getName());
    assertEquals(GROUP_DISPLAY_NAME, group.getDisplayName());
    assertEquals(GROUP_FILTER, group.getFilter());
  }

  private void assertMetricDescriptor(MetricDescriptor metricDescriptor) {
    assertNotNull(metricDescriptor);
    assertEquals(metricDescriptorName, metricDescriptor.getName());
    assertEquals(METRIC_DESCRIPTOR_DISPLAY_NAME, metricDescriptor.getDisplayName());
    assertEquals(MetricKind.GAUGE, metricDescriptor.getMetricKind());
    assertEquals(ValueType.BOOL, metricDescriptor.getValueType());
  }

  private void assertUptimeCheckConfig(UptimeCheckConfig uptimeCheckConfig) {
    assertNotNull(uptimeCheckConfig);
    assertEquals(UPTIME_CHECK_CONFIG_NAME, uptimeCheckConfig.getName());
    assertEquals(UPTIME_CHECK_CONFIG, uptimeCheckConfig.getDisplayName());
    assertEquals(MONITORED_RESOURCE, uptimeCheckConfig.getMonitoredResource());

    /* Monitored Resource*/
    MonitoredResource monitoredResource = uptimeCheckConfig.getMonitoredResource();
    assertNotNull(monitoredResource);
    assertEquals(MONITORED_RESOURCE_LABEL, monitoredResource.getLabelsMap());
    assertEquals(MONITORED_RESOURCE_TYPE, monitoredResource.getType());
  }

  private void assertServiceDetail(Service service) {
    assertNotNull(service);
    assertEquals(SERVICE_NAME, service.getDisplayName());
    assertEquals(CUSTOM, service.getCustom());
  }
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/uptime_service.proto

package com.google.monitoring.v3;

public interface CreateUptimeCheckConfigRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateUptimeCheckConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
   * which to create the Uptime check. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) in
   * which to create the Uptime check. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Required. The new Uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the uptimeCheckConfig field is set.
   */
  boolean hasUptimeCheckConfig();
  /**
   * <pre>
   * Required. The new Uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The uptimeCheckConfig.
   */
  com.google.monitoring.v3.UptimeCheckConfig getUptimeCheckConfig();
  /**
   * <pre>
   * Required. The new Uptime check configuration.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckConfig uptime_check_config = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.v3.UptimeCheckConfigOrBuilder getUptimeCheckConfigOrBuilder();
}

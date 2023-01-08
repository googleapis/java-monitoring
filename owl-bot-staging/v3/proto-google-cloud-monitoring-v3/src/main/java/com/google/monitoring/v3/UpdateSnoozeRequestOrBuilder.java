// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/snooze_service.proto

package com.google.monitoring.v3;

public interface UpdateSnoozeRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.UpdateSnoozeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. The `Snooze` to update. Must have the name field present.
   * </pre>
   *
   * <code>.google.monitoring.v3.Snooze snooze = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the snooze field is set.
   */
  boolean hasSnooze();
  /**
   * <pre>
   * Required. The `Snooze` to update. Must have the name field present.
   * </pre>
   *
   * <code>.google.monitoring.v3.Snooze snooze = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The snooze.
   */
  com.google.monitoring.v3.Snooze getSnooze();
  /**
   * <pre>
   * Required. The `Snooze` to update. Must have the name field present.
   * </pre>
   *
   * <code>.google.monitoring.v3.Snooze snooze = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.monitoring.v3.SnoozeOrBuilder getSnoozeOrBuilder();

  /**
   * <pre>
   * Required. The fields to update.
   * For each field listed in `update_mask`:
   *   * If the `Snooze` object supplied in the `UpdateSnoozeRequest` has a
   *     value for that field, the value of the field in the existing `Snooze`
   *     will be set to the value of the field in the supplied `Snooze`.
   *   * If the field does not have a value in the supplied `Snooze`, the field
   *     in the existing `Snooze` is set to its default value.
   * Fields not listed retain their existing value.
   * The following are the field names that are accepted in `update_mask`:
   *   * `display_name`
   *   * `interval.start_time`
   *   * `interval.end_time`
   * That said, the start time and end time of the `Snooze` determines which
   * fields can legally be updated. Before attempting an update, users should
   * consult the documentation for `UpdateSnoozeRequest`, which talks about
   * which fields can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   * <pre>
   * Required. The fields to update.
   * For each field listed in `update_mask`:
   *   * If the `Snooze` object supplied in the `UpdateSnoozeRequest` has a
   *     value for that field, the value of the field in the existing `Snooze`
   *     will be set to the value of the field in the supplied `Snooze`.
   *   * If the field does not have a value in the supplied `Snooze`, the field
   *     in the existing `Snooze` is set to its default value.
   * Fields not listed retain their existing value.
   * The following are the field names that are accepted in `update_mask`:
   *   * `display_name`
   *   * `interval.start_time`
   *   * `interval.end_time`
   * That said, the start time and end time of the `Snooze` determines which
   * fields can legally be updated. Before attempting an update, users should
   * consult the documentation for `UpdateSnoozeRequest`, which talks about
   * which fields can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   * <pre>
   * Required. The fields to update.
   * For each field listed in `update_mask`:
   *   * If the `Snooze` object supplied in the `UpdateSnoozeRequest` has a
   *     value for that field, the value of the field in the existing `Snooze`
   *     will be set to the value of the field in the supplied `Snooze`.
   *   * If the field does not have a value in the supplied `Snooze`, the field
   *     in the existing `Snooze` is set to its default value.
   * Fields not listed retain their existing value.
   * The following are the field names that are accepted in `update_mask`:
   *   * `display_name`
   *   * `interval.start_time`
   *   * `interval.end_time`
   * That said, the start time and end time of the `Snooze` determines which
   * fields can legally be updated. Before attempting an update, users should
   * consult the documentation for `UpdateSnoozeRequest`, which talks about
   * which fields can be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}

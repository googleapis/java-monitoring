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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service_service.proto

package com.google.monitoring.v3;

public interface ListServiceLevelObjectivesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ListServiceLevelObjectivesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  java.util.List<com.google.monitoring.v3.ServiceLevelObjective> getServiceLevelObjectivesList();
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  com.google.monitoring.v3.ServiceLevelObjective getServiceLevelObjectives(int index);
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  int getServiceLevelObjectivesCount();
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder>
      getServiceLevelObjectivesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The `ServiceLevelObjective`s matching the specified filter.
   * </pre>
   *
   * <code>repeated .google.monitoring.v3.ServiceLevelObjective service_level_objectives = 1;</code>
   */
  com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder getServiceLevelObjectivesOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is set
   * to a non-empty value.  To see the additional results,
   * use that value as `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}

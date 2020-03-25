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
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

public interface ServiceLevelObjectiveOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.ServiceLevelObjective)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Resource name for this `ServiceLevelObjective`. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Resource name for this `ServiceLevelObjective`. The format is:
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]/serviceLevelObjectives/[SLO_NAME]
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Name used for UI elements listing this SLO.
   * </pre>
   *
   * <code>string display_name = 11;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Name used for UI elements listing this SLO.
   * </pre>
   *
   * <code>string display_name = 11;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The definition of good service, used to measure and calculate the quality
   * of the `Service`'s performance with respect to a single aspect of service
   * quality.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelIndicator service_level_indicator = 3;</code>
   *
   * @return Whether the serviceLevelIndicator field is set.
   */
  boolean hasServiceLevelIndicator();
  /**
   *
   *
   * <pre>
   * The definition of good service, used to measure and calculate the quality
   * of the `Service`'s performance with respect to a single aspect of service
   * quality.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelIndicator service_level_indicator = 3;</code>
   *
   * @return The serviceLevelIndicator.
   */
  com.google.monitoring.v3.ServiceLevelIndicator getServiceLevelIndicator();
  /**
   *
   *
   * <pre>
   * The definition of good service, used to measure and calculate the quality
   * of the `Service`'s performance with respect to a single aspect of service
   * quality.
   * </pre>
   *
   * <code>.google.monitoring.v3.ServiceLevelIndicator service_level_indicator = 3;</code>
   */
  com.google.monitoring.v3.ServiceLevelIndicatorOrBuilder getServiceLevelIndicatorOrBuilder();

  /**
   *
   *
   * <pre>
   * The fraction of service that must be good in order for this objective to be
   * met. `0 &lt; goal &lt;= 0.999`.
   * </pre>
   *
   * <code>double goal = 4;</code>
   *
   * @return The goal.
   */
  double getGoal();

  /**
   *
   *
   * <pre>
   * A rolling time period, semantically "in the past `&lt;rolling_period&gt;`".
   * Must be an integer multiple of 1 day no larger than 30 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration rolling_period = 5;</code>
   *
   * @return Whether the rollingPeriod field is set.
   */
  boolean hasRollingPeriod();
  /**
   *
   *
   * <pre>
   * A rolling time period, semantically "in the past `&lt;rolling_period&gt;`".
   * Must be an integer multiple of 1 day no larger than 30 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration rolling_period = 5;</code>
   *
   * @return The rollingPeriod.
   */
  com.google.protobuf.Duration getRollingPeriod();
  /**
   *
   *
   * <pre>
   * A rolling time period, semantically "in the past `&lt;rolling_period&gt;`".
   * Must be an integer multiple of 1 day no larger than 30 days.
   * </pre>
   *
   * <code>.google.protobuf.Duration rolling_period = 5;</code>
   */
  com.google.protobuf.DurationOrBuilder getRollingPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * A calendar period, semantically "since the start of the current
   * `&lt;calendar_period&gt;`". At this time, only `DAY`, `WEEK`, `FORTNIGHT`, and
   * `MONTH` are supported.
   * </pre>
   *
   * <code>.google.type.CalendarPeriod calendar_period = 6;</code>
   *
   * @return The enum numeric value on the wire for calendarPeriod.
   */
  int getCalendarPeriodValue();
  /**
   *
   *
   * <pre>
   * A calendar period, semantically "since the start of the current
   * `&lt;calendar_period&gt;`". At this time, only `DAY`, `WEEK`, `FORTNIGHT`, and
   * `MONTH` are supported.
   * </pre>
   *
   * <code>.google.type.CalendarPeriod calendar_period = 6;</code>
   *
   * @return The calendarPeriod.
   */
  com.google.type.CalendarPeriod getCalendarPeriod();

  public com.google.monitoring.v3.ServiceLevelObjective.PeriodCase getPeriodCase();
}

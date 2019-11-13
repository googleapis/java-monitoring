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
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/service.proto

package com.google.monitoring.v3;

public interface RequestBasedSliOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.RequestBasedSli)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * `good_total_ratio` is used when the ratio of `good_service` to
   * `total_service` is computed from two `TimeSeries`.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
   */
  boolean hasGoodTotalRatio();
  /**
   *
   *
   * <pre>
   * `good_total_ratio` is used when the ratio of `good_service` to
   * `total_service` is computed from two `TimeSeries`.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
   */
  com.google.monitoring.v3.TimeSeriesRatio getGoodTotalRatio();
  /**
   *
   *
   * <pre>
   * `good_total_ratio` is used when the ratio of `good_service` to
   * `total_service` is computed from two `TimeSeries`.
   * </pre>
   *
   * <code>.google.monitoring.v3.TimeSeriesRatio good_total_ratio = 1;</code>
   */
  com.google.monitoring.v3.TimeSeriesRatioOrBuilder getGoodTotalRatioOrBuilder();

  /**
   *
   *
   * <pre>
   * `distribution_cut` is used when `good_service` is a count of values
   * aggregated in a `Distribution` that fall into a good range. The
   * `total_service` is the total count of all values aggregated in the
   * `Distribution`.
   * </pre>
   *
   * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
   */
  boolean hasDistributionCut();
  /**
   *
   *
   * <pre>
   * `distribution_cut` is used when `good_service` is a count of values
   * aggregated in a `Distribution` that fall into a good range. The
   * `total_service` is the total count of all values aggregated in the
   * `Distribution`.
   * </pre>
   *
   * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
   */
  com.google.monitoring.v3.DistributionCut getDistributionCut();
  /**
   *
   *
   * <pre>
   * `distribution_cut` is used when `good_service` is a count of values
   * aggregated in a `Distribution` that fall into a good range. The
   * `total_service` is the total count of all values aggregated in the
   * `Distribution`.
   * </pre>
   *
   * <code>.google.monitoring.v3.DistributionCut distribution_cut = 3;</code>
   */
  com.google.monitoring.v3.DistributionCutOrBuilder getDistributionCutOrBuilder();

  public com.google.monitoring.v3.RequestBasedSli.MethodCase getMethodCase();
}

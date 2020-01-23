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
// source: google/monitoring/v3/mutation_record.proto

package com.google.monitoring.v3;

public interface MutationRecordOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.MutationRecord)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   *
   * @return Whether the mutateTime field is set.
   */
  boolean hasMutateTime();
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   *
   * @return The mutateTime.
   */
  com.google.protobuf.Timestamp getMutateTime();
  /**
   *
   *
   * <pre>
   * When the change occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp mutate_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getMutateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   *
   * @return The mutatedBy.
   */
  java.lang.String getMutatedBy();
  /**
   *
   *
   * <pre>
   * The email address of the user making the change.
   * </pre>
   *
   * <code>string mutated_by = 2;</code>
   *
   * @return The bytes for mutatedBy.
   */
  com.google.protobuf.ByteString getMutatedByBytes();
}

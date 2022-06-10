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
// source: google/monitoring/v3/metric.proto

package com.google.monitoring.v3;

public final class MetricProto {
  private MetricProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_Point_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_Point_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeSeries_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeSeries_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeSeriesDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeSeriesDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeSeriesDescriptor_ValueDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeSeriesDescriptor_ValueDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeSeriesData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeSeriesData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TimeSeriesData_PointData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TimeSeriesData_PointData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_LabelValue_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_LabelValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_QueryError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_QueryError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TextLocator_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TextLocator_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_TextLocator_Position_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_TextLocator_Position_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n!google/monitoring/v3/metric.proto\022\024goo"
          + "gle.monitoring.v3\032\026google/api/label.prot"
          + "o\032\027google/api/metric.proto\032#google/api/m"
          + "onitored_resource.proto\032!google/monitori"
          + "ng/v3/common.proto\"n\n\005Point\0224\n\010interval\030"
          + "\001 \001(\0132\".google.monitoring.v3.TimeInterva"
          + "l\022/\n\005value\030\002 \001(\0132 .google.monitoring.v3."
          + "TypedValue\"\317\002\n\nTimeSeries\022\"\n\006metric\030\001 \001("
          + "\0132\022.google.api.Metric\022/\n\010resource\030\002 \001(\0132"
          + "\035.google.api.MonitoredResource\0227\n\010metada"
          + "ta\030\007 \001(\0132%.google.api.MonitoredResourceM"
          + "etadata\022<\n\013metric_kind\030\003 \001(\0162\'.google.ap"
          + "i.MetricDescriptor.MetricKind\022:\n\nvalue_t"
          + "ype\030\004 \001(\0162&.google.api.MetricDescriptor."
          + "ValueType\022+\n\006points\030\005 \003(\0132\033.google.monit"
          + "oring.v3.Point\022\014\n\004unit\030\010 \001(\t\"\316\002\n\024TimeSer"
          + "iesDescriptor\0226\n\021label_descriptors\030\001 \003(\013"
          + "2\033.google.api.LabelDescriptor\022U\n\021point_d"
          + "escriptors\030\005 \003(\0132:.google.monitoring.v3."
          + "TimeSeriesDescriptor.ValueDescriptor\032\246\001\n"
          + "\017ValueDescriptor\022\013\n\003key\030\001 \001(\t\022:\n\nvalue_t"
          + "ype\030\002 \001(\0162&.google.api.MetricDescriptor."
          + "ValueType\022<\n\013metric_kind\030\003 \001(\0162\'.google."
          + "api.MetricDescriptor.MetricKind\022\014\n\004unit\030"
          + "\004 \001(\t\"\206\002\n\016TimeSeriesData\0226\n\014label_values"
          + "\030\001 \003(\0132 .google.monitoring.v3.LabelValue"
          + "\022B\n\npoint_data\030\002 \003(\0132..google.monitoring"
          + ".v3.TimeSeriesData.PointData\032x\n\tPointDat"
          + "a\0220\n\006values\030\001 \003(\0132 .google.monitoring.v3"
          + ".TypedValue\0229\n\rtime_interval\030\002 \001(\0132\".goo"
          + "gle.monitoring.v3.TimeInterval\"Z\n\nLabelV"
          + "alue\022\024\n\nbool_value\030\001 \001(\010H\000\022\025\n\013int64_valu"
          + "e\030\002 \001(\003H\000\022\026\n\014string_value\030\003 \001(\tH\000B\007\n\005val"
          + "ue\"Q\n\nQueryError\0222\n\007locator\030\001 \001(\0132!.goog"
          + "le.monitoring.v3.TextLocator\022\017\n\007message\030"
          + "\002 \001(\t\"\240\002\n\013TextLocator\022\016\n\006source\030\001 \001(\t\022B\n"
          + "\016start_position\030\002 \001(\0132*.google.monitorin"
          + "g.v3.TextLocator.Position\022@\n\014end_positio"
          + "n\030\003 \001(\0132*.google.monitoring.v3.TextLocat"
          + "or.Position\0229\n\016nested_locator\030\004 \001(\0132!.go"
          + "ogle.monitoring.v3.TextLocator\022\026\n\016nestin"
          + "g_reason\030\005 \001(\t\032(\n\010Position\022\014\n\004line\030\001 \001(\005"
          + "\022\016\n\006column\030\002 \001(\005B\303\001\n\030com.google.monitori"
          + "ng.v3B\013MetricProtoP\001Z>google.golang.org/"
          + "genproto/googleapis/monitoring/v3;monito"
          + "ring\252\002\032Google.Cloud.Monitoring.V3\312\002\032Goog"
          + "le\\Cloud\\Monitoring\\V3\352\002\035Google::Cloud::"
          + "Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.LabelProto.getDescriptor(),
              com.google.api.MetricProto.getDescriptor(),
              com.google.api.MonitoredResourceProto.getDescriptor(),
              com.google.monitoring.v3.CommonProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_Point_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_Point_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_Point_descriptor,
            new java.lang.String[] {
              "Interval", "Value",
            });
    internal_static_google_monitoring_v3_TimeSeries_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_TimeSeries_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeSeries_descriptor,
            new java.lang.String[] {
              "Metric", "Resource", "Metadata", "MetricKind", "ValueType", "Points", "Unit",
            });
    internal_static_google_monitoring_v3_TimeSeriesDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_TimeSeriesDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeSeriesDescriptor_descriptor,
            new java.lang.String[] {
              "LabelDescriptors", "PointDescriptors",
            });
    internal_static_google_monitoring_v3_TimeSeriesDescriptor_ValueDescriptor_descriptor =
        internal_static_google_monitoring_v3_TimeSeriesDescriptor_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_monitoring_v3_TimeSeriesDescriptor_ValueDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeSeriesDescriptor_ValueDescriptor_descriptor,
            new java.lang.String[] {
              "Key", "ValueType", "MetricKind", "Unit",
            });
    internal_static_google_monitoring_v3_TimeSeriesData_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_TimeSeriesData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeSeriesData_descriptor,
            new java.lang.String[] {
              "LabelValues", "PointData",
            });
    internal_static_google_monitoring_v3_TimeSeriesData_PointData_descriptor =
        internal_static_google_monitoring_v3_TimeSeriesData_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_TimeSeriesData_PointData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TimeSeriesData_PointData_descriptor,
            new java.lang.String[] {
              "Values", "TimeInterval",
            });
    internal_static_google_monitoring_v3_LabelValue_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_LabelValue_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_LabelValue_descriptor,
            new java.lang.String[] {
              "BoolValue", "Int64Value", "StringValue", "Value",
            });
    internal_static_google_monitoring_v3_QueryError_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_QueryError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_QueryError_descriptor,
            new java.lang.String[] {
              "Locator", "Message",
            });
    internal_static_google_monitoring_v3_TextLocator_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_TextLocator_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TextLocator_descriptor,
            new java.lang.String[] {
              "Source", "StartPosition", "EndPosition", "NestedLocator", "NestingReason",
            });
    internal_static_google_monitoring_v3_TextLocator_Position_descriptor =
        internal_static_google_monitoring_v3_TextLocator_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_TextLocator_Position_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_TextLocator_Position_descriptor,
            new java.lang.String[] {
              "Line", "Column",
            });
    com.google.api.LabelProto.getDescriptor();
    com.google.api.MetricProto.getDescriptor();
    com.google.api.MonitoredResourceProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

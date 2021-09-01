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
// source: google/monitoring/v3/notification.proto

package com.google.monitoring.v3;

public final class NotificationProto {
  private NotificationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\'google/monitoring/v3/notification.prot"
          + "o\022\024google.monitoring.v3\032\026google/api/labe"
          + "l.proto\032\035google/api/launch_stage.proto\032\031"
          + "google/api/resource.proto\032*google/monito"
          + "ring/v3/mutation_record.proto\032\036google/pr"
          + "otobuf/wrappers.proto\"\345\003\n\035NotificationCh"
          + "annelDescriptor\022\014\n\004name\030\006 \001(\t\022\014\n\004type\030\001 "
          + "\001(\t\022\024\n\014display_name\030\002 \001(\t\022\023\n\013description"
          + "\030\003 \001(\t\022+\n\006labels\030\004 \003(\0132\033.google.api.Labe"
          + "lDescriptor\022-\n\014launch_stage\030\007 \001(\0162\027.goog"
          + "le.api.LaunchStage:\240\002\352A\234\002\n7monitoring.go"
          + "ogleapis.com/NotificationChannelDescript"
          + "or\022Fprojects/{project}/notificationChann"
          + "elDescriptors/{channel_descriptor}\022Porga"
          + "nizations/{organization}/notificationCha"
          + "nnelDescriptors/{channel_descriptor}\022Dfo"
          + "lders/{folder}/notificationChannelDescri"
          + "ptors/{channel_descriptor}\022\001*\"\266\007\n\023Notifi"
          + "cationChannel\022\014\n\004type\030\001 \001(\t\022\014\n\004name\030\006 \001("
          + "\t\022\024\n\014display_name\030\003 \001(\t\022\023\n\013description\030\004"
          + " \001(\t\022E\n\006labels\030\005 \003(\01325.google.monitoring"
          + ".v3.NotificationChannel.LabelsEntry\022N\n\013u"
          + "ser_labels\030\010 \003(\01329.google.monitoring.v3."
          + "NotificationChannel.UserLabelsEntry\022Y\n\023v"
          + "erification_status\030\t \001(\0162<.google.monito"
          + "ring.v3.NotificationChannel.Verification"
          + "Status\022+\n\007enabled\030\013 \001(\0132\032.google.protobu"
          + "f.BoolValue\022=\n\017creation_record\030\014 \001(\0132$.g"
          + "oogle.monitoring.v3.MutationRecord\022>\n\020mu"
          + "tation_records\030\r \003(\0132$.google.monitoring"
          + ".v3.MutationRecord\032-\n\013LabelsEntry\022\013\n\003key"
          + "\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\0321\n\017UserLabelsE"
          + "ntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\"W\n\022"
          + "VerificationStatus\022#\n\037VERIFICATION_STATU"
          + "S_UNSPECIFIED\020\000\022\016\n\nUNVERIFIED\020\001\022\014\n\010VERIF"
          + "IED\020\002:\376\001\352A\372\001\n-monitoring.googleapis.com/"
          + "NotificationChannel\022>projects/{project}/"
          + "notificationChannels/{notification_chann"
          + "el}\022Horganizations/{organization}/notifi"
          + "cationChannels/{notification_channel}\022<f"
          + "olders/{folder}/notificationChannels/{no"
          + "tification_channel}\022\001*B\311\001\n\030com.google.mo"
          + "nitoring.v3B\021NotificationProtoP\001Z>google"
          + ".golang.org/genproto/googleapis/monitori"
          + "ng/v3;monitoring\252\002\032Google.Cloud.Monitori"
          + "ng.V3\312\002\032Google\\Cloud\\Monitoring\\V3\352\002\035Goo"
          + "gle::Cloud::Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.LabelProto.getDescriptor(),
              com.google.api.LaunchStageProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.MutationRecordProto.getDescriptor(),
              com.google.protobuf.WrappersProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannelDescriptor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannelDescriptor_descriptor,
            new java.lang.String[] {
              "Name", "Type", "DisplayName", "Description", "Labels", "LaunchStage",
            });
    internal_static_google_monitoring_v3_NotificationChannel_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_descriptor,
            new java.lang.String[] {
              "Type",
              "Name",
              "DisplayName",
              "Description",
              "Labels",
              "UserLabels",
              "VerificationStatus",
              "Enabled",
              "CreationRecord",
              "MutationRecords",
            });
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor =
        internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor =
        internal_static_google_monitoring_v3_NotificationChannel_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_NotificationChannel_UserLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.LabelProto.getDescriptor();
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.MutationRecordProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

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
// source: google/monitoring/v3/snooze_service.proto

package com.google.monitoring.v3;

public final class SnoozeServiceProto {
  private SnoozeServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateSnoozeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateSnoozeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListSnoozesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListSnoozesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListSnoozesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListSnoozesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetSnoozeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetSnoozeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateSnoozeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateSnoozeRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n)google/monitoring/v3/snooze_service.pr"
          + "oto\022\024google.monitoring.v3\032\034google/api/an"
          + "notations.proto\032\027google/api/client.proto"
          + "\032\037google/api/field_behavior.proto\032\031googl"
          + "e/api/resource.proto\032!google/monitoring/"
          + "v3/snooze.proto\032 google/protobuf/field_m"
          + "ask.proto\"\202\001\n\023CreateSnoozeRequest\0228\n\006par"
          + "ent\030\001 \001(\tB(\340A\002\372A\"\022 monitoring.googleapis"
          + ".com/Snooze\0221\n\006snooze\030\002 \001(\0132\034.google.mon"
          + "itoring.v3.SnoozeB\003\340A\002\"\224\001\n\022ListSnoozesRe"
          + "quest\0228\n\006parent\030\001 \001(\tB(\340A\002\372A\"\022 monitorin"
          + "g.googleapis.com/Snooze\022\023\n\006filter\030\002 \001(\tB"
          + "\003\340A\001\022\026\n\tpage_size\030\004 \001(\005B\003\340A\001\022\027\n\npage_tok"
          + "en\030\005 \001(\tB\003\340A\001\"]\n\023ListSnoozesResponse\022-\n\007"
          + "snoozes\030\001 \003(\0132\034.google.monitoring.v3.Sno"
          + "oze\022\027\n\017next_page_token\030\002 \001(\t\"J\n\020GetSnooz"
          + "eRequest\0226\n\004name\030\001 \001(\tB(\340A\002\372A\"\n monitori"
          + "ng.googleapis.com/Snooze\"~\n\023UpdateSnooze"
          + "Request\0221\n\006snooze\030\001 \001(\0132\034.google.monitor"
          + "ing.v3.SnoozeB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132"
          + "\032.google.protobuf.FieldMaskB\003\340A\0022\230\006\n\rSno"
          + "ozeService\022\230\001\n\014CreateSnooze\022).google.mon"
          + "itoring.v3.CreateSnoozeRequest\032\034.google."
          + "monitoring.v3.Snooze\"?\202\323\344\223\002)\"\037/v3/{paren"
          + "t=projects/*}/snoozes:\006snooze\332A\rparent,s"
          + "nooze\022\224\001\n\013ListSnoozes\022(.google.monitorin"
          + "g.v3.ListSnoozesRequest\032).google.monitor"
          + "ing.v3.ListSnoozesResponse\"0\202\323\344\223\002!\022\037/v3/"
          + "{parent=projects/*}/snoozes\332A\006parent\022\201\001\n"
          + "\tGetSnooze\022&.google.monitoring.v3.GetSno"
          + "ozeRequest\032\034.google.monitoring.v3.Snooze"
          + "\".\202\323\344\223\002!\022\037/v3/{name=projects/*/snoozes/*"
          + "}\332A\004name\022\244\001\n\014UpdateSnooze\022).google.monit"
          + "oring.v3.UpdateSnoozeRequest\032\034.google.mo"
          + "nitoring.v3.Snooze\"K\202\323\344\223\00202&/v3/{snooze."
          + "name=projects/*/snoozes/*}:\006snooze\332A\022sno"
          + "oze,update_mask\032\251\001\312A\031monitoring.googleap"
          + "is.com\322A\211\001https://www.googleapis.com/aut"
          + "h/cloud-platform,https://www.googleapis."
          + "com/auth/monitoring,https://www.googleap"
          + "is.com/auth/monitoring.readB\312\001\n\030com.goog"
          + "le.monitoring.v3B\022SnoozeServiceProtoP\001Z>"
          + "google.golang.org/genproto/googleapis/mo"
          + "nitoring/v3;monitoring\252\002\032Google.Cloud.Mo"
          + "nitoring.V3\312\002\032Google\\Cloud\\Monitoring\\V3"
          + "\352\002\035Google::Cloud::Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.SnoozeProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_CreateSnoozeRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_CreateSnoozeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateSnoozeRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Snooze",
            });
    internal_static_google_monitoring_v3_ListSnoozesRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListSnoozesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListSnoozesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListSnoozesResponse_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_ListSnoozesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListSnoozesResponse_descriptor,
            new java.lang.String[] {
              "Snoozes", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetSnoozeRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_GetSnoozeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetSnoozeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_UpdateSnoozeRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_UpdateSnoozeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateSnoozeRequest_descriptor,
            new java.lang.String[] {
              "Snooze", "UpdateMask",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.SnoozeProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

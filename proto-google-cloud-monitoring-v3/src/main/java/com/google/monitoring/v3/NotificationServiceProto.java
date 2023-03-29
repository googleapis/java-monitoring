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
// source: google/monitoring/v3/notification_service.proto

package com.google.monitoring.v3;

public final class NotificationServiceProto {
  private NotificationServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_ListNotificationChannelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/monitoring/v3/notification_serv"
          + "ice.proto\022\024google.monitoring.v3\032\034google/"
          + "api/annotations.proto\032\027google/api/client"
          + ".proto\032\037google/api/field_behavior.proto\032"
          + "\031google/api/resource.proto\032\'google/monit"
          + "oring/v3/notification.proto\032\033google/prot"
          + "obuf/empty.proto\032 google/protobuf/field_"
          + "mask.proto\032\037google/protobuf/timestamp.pr"
          + "oto\"\241\001\n)ListNotificationChannelDescripto"
          + "rsRequest\022M\n\004name\030\004 \001(\tB?\340A\002\372A9\0227monitor"
          + "ing.googleapis.com/NotificationChannelDe"
          + "scriptor\022\021\n\tpage_size\030\002 \001(\005\022\022\n\npage_toke"
          + "n\030\003 \001(\t\"\227\001\n*ListNotificationChannelDescr"
          + "iptorsResponse\022P\n\023channel_descriptors\030\001 "
          + "\003(\01323.google.monitoring.v3.NotificationC"
          + "hannelDescriptor\022\027\n\017next_page_token\030\002 \001("
          + "\t\"x\n\'GetNotificationChannelDescriptorReq"
          + "uest\022M\n\004name\030\003 \001(\tB?\340A\002\372A9\n7monitoring.g"
          + "oogleapis.com/NotificationChannelDescrip"
          + "tor\"\265\001\n CreateNotificationChannelRequest"
          + "\022C\n\004name\030\003 \001(\tB5\340A\002\372A/\022-monitoring.googl"
          + "eapis.com/NotificationChannel\022L\n\024notific"
          + "ation_channel\030\002 \001(\0132).google.monitoring."
          + "v3.NotificationChannelB\003\340A\002\"\257\001\n\037ListNoti"
          + "ficationChannelsRequest\022C\n\004name\030\005 \001(\tB5\340"
          + "A\002\372A/\022-monitoring.googleapis.com/Notific"
          + "ationChannel\022\016\n\006filter\030\006 \001(\t\022\020\n\010order_by"
          + "\030\007 \001(\t\022\021\n\tpage_size\030\003 \001(\005\022\022\n\npage_token\030"
          + "\004 \001(\t\"\231\001\n ListNotificationChannelsRespon"
          + "se\022H\n\025notification_channels\030\003 \003(\0132).goog"
          + "le.monitoring.v3.NotificationChannel\022\027\n\017"
          + "next_page_token\030\002 \001(\t\022\022\n\ntotal_size\030\004 \001("
          + "\005\"d\n\035GetNotificationChannelRequest\022C\n\004na"
          + "me\030\003 \001(\tB5\340A\002\372A/\n-monitoring.googleapis."
          + "com/NotificationChannel\"\241\001\n UpdateNotifi"
          + "cationChannelRequest\022/\n\013update_mask\030\002 \001("
          + "\0132\032.google.protobuf.FieldMask\022L\n\024notific"
          + "ation_channel\030\003 \001(\0132).google.monitoring."
          + "v3.NotificationChannelB\003\340A\002\"v\n DeleteNot"
          + "ificationChannelRequest\022C\n\004name\030\003 \001(\tB5\340"
          + "A\002\372A/\n-monitoring.googleapis.com/Notific"
          + "ationChannel\022\r\n\005force\030\005 \001(\010\"u\n.SendNotif"
          + "icationChannelVerificationCodeRequest\022C\n"
          + "\004name\030\001 \001(\tB5\340A\002\372A/\n-monitoring.googleap"
          + "is.com/NotificationChannel\"\245\001\n-GetNotifi"
          + "cationChannelVerificationCodeRequest\022C\n\004"
          + "name\030\001 \001(\tB5\340A\002\372A/\n-monitoring.googleapi"
          + "s.com/NotificationChannel\022/\n\013expire_time"
          + "\030\002 \001(\0132\032.google.protobuf.Timestamp\"o\n.Ge"
          + "tNotificationChannelVerificationCodeResp"
          + "onse\022\014\n\004code\030\001 \001(\t\022/\n\013expire_time\030\002 \001(\0132"
          + "\032.google.protobuf.Timestamp\"z\n VerifyNot"
          + "ificationChannelRequest\022C\n\004name\030\001 \001(\tB5\340"
          + "A\002\372A/\n-monitoring.googleapis.com/Notific"
          + "ationChannel\022\021\n\004code\030\002 \001(\tB\003\340A\0022\352\022\n\032Noti"
          + "ficationChannelService\022\354\001\n\"ListNotificat"
          + "ionChannelDescriptors\022?.google.monitorin"
          + "g.v3.ListNotificationChannelDescriptorsR"
          + "equest\032@.google.monitoring.v3.ListNotifi"
          + "cationChannelDescriptorsResponse\"C\202\323\344\223\0026"
          + "\0224/v3/{name=projects/*}/notificationChan"
          + "nelDescriptors\332A\004name\022\335\001\n GetNotificatio"
          + "nChannelDescriptor\022=.google.monitoring.v"
          + "3.GetNotificationChannelDescriptorReques"
          + "t\0323.google.monitoring.v3.NotificationCha"
          + "nnelDescriptor\"E\202\323\344\223\0028\0226/v3/{name=projec"
          + "ts/*/notificationChannelDescriptors/*}\332A"
          + "\004name\022\304\001\n\030ListNotificationChannels\0225.goo"
          + "gle.monitoring.v3.ListNotificationChanne"
          + "lsRequest\0326.google.monitoring.v3.ListNot"
          + "ificationChannelsResponse\"9\202\323\344\223\002,\022*/v3/{"
          + "name=projects/*}/notificationChannels\332A\004"
          + "name\022\265\001\n\026GetNotificationChannel\0223.google"
          + ".monitoring.v3.GetNotificationChannelReq"
          + "uest\032).google.monitoring.v3.Notification"
          + "Channel\";\202\323\344\223\002.\022,/v3/{name=projects/*/no"
          + "tificationChannels/*}\332A\004name\022\344\001\n\031CreateN"
          + "otificationChannel\0226.google.monitoring.v"
          + "3.CreateNotificationChannelRequest\032).goo"
          + "gle.monitoring.v3.NotificationChannel\"d\202"
          + "\323\344\223\002B\"*/v3/{name=projects/*}/notificatio"
          + "nChannels:\024notification_channel\332A\031name,n"
          + "otification_channel\022\203\002\n\031UpdateNotificati"
          + "onChannel\0226.google.monitoring.v3.UpdateN"
          + "otificationChannelRequest\032).google.monit"
          + "oring.v3.NotificationChannel\"\202\001\202\323\344\223\002Y2A/"
          + "v3/{notification_channel.name=projects/*"
          + "/notificationChannels/*}:\024notification_c"
          + "hannel\332A update_mask,notification_channe"
          + "l\022\256\001\n\031DeleteNotificationChannel\0226.google"
          + ".monitoring.v3.DeleteNotificationChannel"
          + "Request\032\026.google.protobuf.Empty\"A\202\323\344\223\002.*"
          + ",/v3/{name=projects/*/notificationChanne"
          + "ls/*}\332A\nname,force\022\334\001\n\'SendNotificationC"
          + "hannelVerificationCode\022D.google.monitori"
          + "ng.v3.SendNotificationChannelVerificatio"
          + "nCodeRequest\032\026.google.protobuf.Empty\"S\202\323"
          + "\344\223\002F\"A/v3/{name=projects/*/notificationC"
          + "hannels/*}:sendVerificationCode:\001*\332A\004nam"
          + "e\022\207\002\n&GetNotificationChannelVerification"
          + "Code\022C.google.monitoring.v3.GetNotificat"
          + "ionChannelVerificationCodeRequest\032D.goog"
          + "le.monitoring.v3.GetNotificationChannelV"
          + "erificationCodeResponse\"R\202\323\344\223\002E\"@/v3/{na"
          + "me=projects/*/notificationChannels/*}:ge"
          + "tVerificationCode:\001*\332A\004name\022\312\001\n\031VerifyNo"
          + "tificationChannel\0226.google.monitoring.v3"
          + ".VerifyNotificationChannelRequest\032).goog"
          + "le.monitoring.v3.NotificationChannel\"J\202\323"
          + "\344\223\0028\"3/v3/{name=projects/*/notificationC"
          + "hannels/*}:verify:\001*\332A\tname,code\032\251\001\312A\031mo"
          + "nitoring.googleapis.com\322A\211\001https://www.g"
          + "oogleapis.com/auth/cloud-platform,https:"
          + "//www.googleapis.com/auth/monitoring,htt"
          + "ps://www.googleapis.com/auth/monitoring."
          + "readB\320\001\n\030com.google.monitoring.v3B\030Notif"
          + "icationServiceProtoP\001Z>google.golang.org"
          + "/genproto/googleapis/monitoring/v3;monit"
          + "oring\252\002\032Google.Cloud.Monitoring.V3\312\002\032Goo"
          + "gle\\Cloud\\Monitoring\\V3\352\002\035Google::Cloud:"
          + ":Monitoring::V3b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.monitoring.v3.NotificationProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsRequest_descriptor,
            new java.lang.String[] {
              "Name", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelDescriptorsResponse_descriptor,
            new java.lang.String[] {
              "ChannelDescriptors", "NextPageToken",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelDescriptorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_monitoring_v3_CreateNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_CreateNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name", "NotificationChannel",
            });
    internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_monitoring_v3_ListNotificationChannelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelsRequest_descriptor,
            new java.lang.String[] {
              "Name", "Filter", "OrderBy", "PageSize", "PageToken",
            });
    internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_monitoring_v3_ListNotificationChannelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_ListNotificationChannelsResponse_descriptor,
            new java.lang.String[] {
              "NotificationChannels", "NextPageToken", "TotalSize",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_monitoring_v3_GetNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_UpdateNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "NotificationChannel",
            });
    internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_DeleteNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name", "Force",
            });
    internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_SendNotificationChannelVerificationCodeRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeRequest_descriptor,
            new java.lang.String[] {
              "Name", "ExpireTime",
            });
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_GetNotificationChannelVerificationCodeResponse_descriptor,
            new java.lang.String[] {
              "Code", "ExpireTime",
            });
    internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_monitoring_v3_VerifyNotificationChannelRequest_descriptor,
            new java.lang.String[] {
              "Name", "Code",
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
    com.google.monitoring.v3.NotificationProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

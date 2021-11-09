// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/monitoring/v3/alert.proto

package com.google.monitoring.v3;

public final class AlertProto {
  private AlertProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Documentation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n google/monitoring/v3/alert.proto\022\024goog" +
      "le.monitoring.v3\032\037google/api/field_behav" +
      "ior.proto\032\031google/api/resource.proto\032!go" +
      "ogle/monitoring/v3/common.proto\032*google/" +
      "monitoring/v3/mutation_record.proto\032\036goo" +
      "gle/protobuf/duration.proto\032\036google/prot" +
      "obuf/wrappers.proto\032\027google/rpc/status.p" +
      "roto\"\264\027\n\013AlertPolicy\022\014\n\004name\030\001 \001(\t\022\024\n\014di" +
      "splay_name\030\002 \001(\t\022F\n\rdocumentation\030\r \001(\0132" +
      "/.google.monitoring.v3.AlertPolicy.Docum" +
      "entation\022F\n\013user_labels\030\020 \003(\01321.google.m" +
      "onitoring.v3.AlertPolicy.UserLabelsEntry" +
      "\022?\n\nconditions\030\014 \003(\0132+.google.monitoring" +
      ".v3.AlertPolicy.Condition\022I\n\010combiner\030\006 " +
      "\001(\01627.google.monitoring.v3.AlertPolicy.C" +
      "onditionCombinerType\022+\n\007enabled\030\021 \001(\0132\032." +
      "google.protobuf.BoolValue\022$\n\010validity\030\022 " +
      "\001(\0132\022.google.rpc.Status\022\035\n\025notification_" +
      "channels\030\016 \003(\t\022=\n\017creation_record\030\n \001(\0132" +
      "$.google.monitoring.v3.MutationRecord\022=\n" +
      "\017mutation_record\030\013 \001(\0132$.google.monitori" +
      "ng.v3.MutationRecord\022G\n\016alert_strategy\030\025" +
      " \001(\0132/.google.monitoring.v3.AlertPolicy." +
      "AlertStrategy\0323\n\rDocumentation\022\017\n\007conten" +
      "t\030\001 \001(\t\022\021\n\tmime_type\030\002 \001(\t\032\326\r\n\tCondition" +
      "\022\014\n\004name\030\014 \001(\t\022\024\n\014display_name\030\006 \001(\t\022Z\n\023" +
      "condition_threshold\030\001 \001(\0132;.google.monit" +
      "oring.v3.AlertPolicy.Condition.MetricThr" +
      "esholdH\000\022U\n\020condition_absent\030\002 \001(\01329.goo" +
      "gle.monitoring.v3.AlertPolicy.Condition." +
      "MetricAbsenceH\000\022U\n\025condition_matched_log" +
      "\030\024 \001(\01324.google.monitoring.v3.AlertPolic" +
      "y.Condition.LogMatchH\000\022{\n#condition_moni" +
      "toring_query_language\030\023 \001(\0132L.google.mon" +
      "itoring.v3.AlertPolicy.Condition.Monitor" +
      "ingQueryLanguageConditionH\000\0325\n\007Trigger\022\017" +
      "\n\005count\030\001 \001(\005H\000\022\021\n\007percent\030\002 \001(\001H\000B\006\n\004ty" +
      "pe\032\206\003\n\017MetricThreshold\022\023\n\006filter\030\002 \001(\tB\003" +
      "\340A\002\0227\n\014aggregations\030\010 \003(\0132!.google.monit" +
      "oring.v3.Aggregation\022\032\n\022denominator_filt" +
      "er\030\t \001(\t\022C\n\030denominator_aggregations\030\n \003" +
      "(\0132!.google.monitoring.v3.Aggregation\0228\n" +
      "\ncomparison\030\004 \001(\0162$.google.monitoring.v3" +
      ".ComparisonType\022\027\n\017threshold_value\030\005 \001(\001" +
      "\022+\n\010duration\030\006 \001(\0132\031.google.protobuf.Dur" +
      "ation\022D\n\007trigger\030\007 \001(\01323.google.monitori" +
      "ng.v3.AlertPolicy.Condition.Trigger\032\320\001\n\r" +
      "MetricAbsence\022\023\n\006filter\030\001 \001(\tB\003\340A\002\0227\n\014ag" +
      "gregations\030\005 \003(\0132!.google.monitoring.v3." +
      "Aggregation\022+\n\010duration\030\002 \001(\0132\031.google.p" +
      "rotobuf.Duration\022D\n\007trigger\030\003 \001(\01323.goog" +
      "le.monitoring.v3.AlertPolicy.Condition.T" +
      "rigger\032\274\001\n\010LogMatch\022\023\n\006filter\030\001 \001(\tB\003\340A\002" +
      "\022c\n\020label_extractors\030\002 \003(\0132I.google.moni" +
      "toring.v3.AlertPolicy.Condition.LogMatch" +
      ".LabelExtractorsEntry\0326\n\024LabelExtractors" +
      "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032\244\001" +
      "\n MonitoringQueryLanguageCondition\022\r\n\005qu" +
      "ery\030\001 \001(\t\022+\n\010duration\030\002 \001(\0132\031.google.pro" +
      "tobuf.Duration\022D\n\007trigger\030\003 \001(\01323.google" +
      ".monitoring.v3.AlertPolicy.Condition.Tri" +
      "gger:\227\002\352A\223\002\n.monitoring.googleapis.com/A" +
      "lertPolicyCondition\022Fprojects/{project}/" +
      "alertPolicies/{alert_policy}/conditions/" +
      "{condition}\022Porganizations/{organization" +
      "}/alertPolicies/{alert_policy}/condition" +
      "s/{condition}\022Dfolders/{folder}/alertPol" +
      "icies/{alert_policy}/conditions/{conditi" +
      "on}\022\001*B\013\n\tcondition\032\273\001\n\rAlertStrategy\022f\n" +
      "\027notification_rate_limit\030\001 \001(\0132E.google." +
      "monitoring.v3.AlertPolicy.AlertStrategy." +
      "NotificationRateLimit\032B\n\025NotificationRat" +
      "eLimit\022)\n\006period\030\001 \001(\0132\031.google.protobuf" +
      ".Duration\0321\n\017UserLabelsEntry\022\013\n\003key\030\001 \001(" +
      "\t\022\r\n\005value\030\002 \001(\t:\0028\001\"a\n\025ConditionCombine" +
      "rType\022\027\n\023COMBINE_UNSPECIFIED\020\000\022\007\n\003AND\020\001\022" +
      "\006\n\002OR\020\002\022\036\n\032AND_WITH_MATCHING_RESOURCE\020\003:" +
      "\311\001\352A\305\001\n%monitoring.googleapis.com/AlertP" +
      "olicy\022/projects/{project}/alertPolicies/" +
      "{alert_policy}\0229organizations/{organizat" +
      "ion}/alertPolicies/{alert_policy}\022-folde" +
      "rs/{folder}/alertPolicies/{alert_policy}" +
      "\022\001*B\302\001\n\030com.google.monitoring.v3B\nAlertP" +
      "rotoP\001Z>google.golang.org/genproto/googl" +
      "eapis/monitoring/v3;monitoring\252\002\032Google." +
      "Cloud.Monitoring.V3\312\002\032Google\\Cloud\\Monit" +
      "oring\\V3\352\002\035Google::Cloud::Monitoring::V3" +
      "b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.FieldBehaviorProto.getDescriptor(),
          com.google.api.ResourceProto.getDescriptor(),
          com.google.monitoring.v3.CommonProto.getDescriptor(),
          com.google.monitoring.v3.MutationRecordProto.getDescriptor(),
          com.google.protobuf.DurationProto.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
          com.google.rpc.StatusProto.getDescriptor(),
        });
    internal_static_google_monitoring_v3_AlertPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "Documentation", "UserLabels", "Conditions", "Combiner", "Enabled", "Validity", "NotificationChannels", "CreationRecord", "MutationRecord", "AlertStrategy", });
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Documentation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Documentation_descriptor,
        new java.lang.String[] { "Content", "MimeType", });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor,
        new java.lang.String[] { "Name", "DisplayName", "ConditionThreshold", "ConditionAbsent", "ConditionMatchedLog", "ConditionMonitoringQueryLanguage", "Condition", });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Condition_Trigger_descriptor,
        new java.lang.String[] { "Count", "Percent", "Type", });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor.getNestedTypes().get(1);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricThreshold_descriptor,
        new java.lang.String[] { "Filter", "Aggregations", "DenominatorFilter", "DenominatorAggregations", "Comparison", "ThresholdValue", "Duration", "Trigger", });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor.getNestedTypes().get(2);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Condition_MetricAbsence_descriptor,
        new java.lang.String[] { "Filter", "Aggregations", "Duration", "Trigger", });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor.getNestedTypes().get(3);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor,
        new java.lang.String[] { "Filter", "LabelExtractors", });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Condition_LogMatch_LabelExtractorsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_Condition_descriptor.getNestedTypes().get(4);
    internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_Condition_MonitoringQueryLanguageCondition_descriptor,
        new java.lang.String[] { "Query", "Duration", "Trigger", });
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(2);
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor,
        new java.lang.String[] { "NotificationRateLimit", });
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_descriptor.getNestedTypes().get(0);
    internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_AlertStrategy_NotificationRateLimit_descriptor,
        new java.lang.String[] { "Period", });
    internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor =
      internal_static_google_monitoring_v3_AlertPolicy_descriptor.getNestedTypes().get(3);
    internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_google_monitoring_v3_AlertPolicy_UserLabelsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.monitoring.v3.CommonProto.getDescriptor();
    com.google.monitoring.v3.MutationRecordProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

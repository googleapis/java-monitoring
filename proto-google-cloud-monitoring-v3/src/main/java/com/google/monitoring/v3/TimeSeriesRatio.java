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

/**
 *
 *
 * <pre>
 * A `TimeSeriesRatio` specifies two `TimeSeries` to use for computing the
 * `good_service / total_service` ratio. The specified `TimeSeries` must have
 * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
 * DELTA` or `MetricKind = CUMULATIVE`. The `TimeSeriesRatio` must specify
 * exactly two of good, bad, and total, and the relationship `good_service +
 * bad_service = total_service` will be assumed.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.TimeSeriesRatio}
 */
public final class TimeSeriesRatio extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.TimeSeriesRatio)
    TimeSeriesRatioOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TimeSeriesRatio.newBuilder() to construct.
  private TimeSeriesRatio(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TimeSeriesRatio() {
    goodServiceFilter_ = "";
    badServiceFilter_ = "";
    totalServiceFilter_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TimeSeriesRatio();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private TimeSeriesRatio(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 34:
            {
              java.lang.String s = input.readStringRequireUtf8();

              goodServiceFilter_ = s;
              break;
            }
          case 42:
            {
              java.lang.String s = input.readStringRequireUtf8();

              badServiceFilter_ = s;
              break;
            }
          case 50:
            {
              java.lang.String s = input.readStringRequireUtf8();

              totalServiceFilter_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.ServiceMonitoringProto
        .internal_static_google_monitoring_v3_TimeSeriesRatio_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.TimeSeriesRatio.class,
            com.google.monitoring.v3.TimeSeriesRatio.Builder.class);
  }

  public static final int GOOD_SERVICE_FILTER_FIELD_NUMBER = 4;
  private volatile java.lang.Object goodServiceFilter_;
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying good service provided. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string good_service_filter = 4;</code>
   *
   * @return The goodServiceFilter.
   */
  public java.lang.String getGoodServiceFilter() {
    java.lang.Object ref = goodServiceFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      goodServiceFilter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying good service provided. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string good_service_filter = 4;</code>
   *
   * @return The bytes for goodServiceFilter.
   */
  public com.google.protobuf.ByteString getGoodServiceFilterBytes() {
    java.lang.Object ref = goodServiceFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      goodServiceFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BAD_SERVICE_FILTER_FIELD_NUMBER = 5;
  private volatile java.lang.Object badServiceFilter_;
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying bad service, either demanded service
   * that was not provided or demanded service that was of inadequate quality.
   * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
   * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string bad_service_filter = 5;</code>
   *
   * @return The badServiceFilter.
   */
  public java.lang.String getBadServiceFilter() {
    java.lang.Object ref = badServiceFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      badServiceFilter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying bad service, either demanded service
   * that was not provided or demanded service that was of inadequate quality.
   * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
   * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string bad_service_filter = 5;</code>
   *
   * @return The bytes for badServiceFilter.
   */
  public com.google.protobuf.ByteString getBadServiceFilterBytes() {
    java.lang.Object ref = badServiceFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      badServiceFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SERVICE_FILTER_FIELD_NUMBER = 6;
  private volatile java.lang.Object totalServiceFilter_;
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying total demanded service. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string total_service_filter = 6;</code>
   *
   * @return The totalServiceFilter.
   */
  public java.lang.String getTotalServiceFilter() {
    java.lang.Object ref = totalServiceFilter_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      totalServiceFilter_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
   * specifying a `TimeSeries` quantifying total demanded service. Must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`.
   * </pre>
   *
   * <code>string total_service_filter = 6;</code>
   *
   * @return The bytes for totalServiceFilter.
   */
  public com.google.protobuf.ByteString getTotalServiceFilterBytes() {
    java.lang.Object ref = totalServiceFilter_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      totalServiceFilter_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getGoodServiceFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, goodServiceFilter_);
    }
    if (!getBadServiceFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, badServiceFilter_);
    }
    if (!getTotalServiceFilterBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, totalServiceFilter_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getGoodServiceFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, goodServiceFilter_);
    }
    if (!getBadServiceFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, badServiceFilter_);
    }
    if (!getTotalServiceFilterBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, totalServiceFilter_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.TimeSeriesRatio)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.TimeSeriesRatio other = (com.google.monitoring.v3.TimeSeriesRatio) obj;

    if (!getGoodServiceFilter().equals(other.getGoodServiceFilter())) return false;
    if (!getBadServiceFilter().equals(other.getBadServiceFilter())) return false;
    if (!getTotalServiceFilter().equals(other.getTotalServiceFilter())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + GOOD_SERVICE_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getGoodServiceFilter().hashCode();
    hash = (37 * hash) + BAD_SERVICE_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getBadServiceFilter().hashCode();
    hash = (37 * hash) + TOTAL_SERVICE_FILTER_FIELD_NUMBER;
    hash = (53 * hash) + getTotalServiceFilter().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.TimeSeriesRatio parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.monitoring.v3.TimeSeriesRatio prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * A `TimeSeriesRatio` specifies two `TimeSeries` to use for computing the
   * `good_service / total_service` ratio. The specified `TimeSeries` must have
   * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
   * DELTA` or `MetricKind = CUMULATIVE`. The `TimeSeriesRatio` must specify
   * exactly two of good, bad, and total, and the relationship `good_service +
   * bad_service = total_service` will be assumed.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.TimeSeriesRatio}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.TimeSeriesRatio)
      com.google.monitoring.v3.TimeSeriesRatioOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_TimeSeriesRatio_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.TimeSeriesRatio.class,
              com.google.monitoring.v3.TimeSeriesRatio.Builder.class);
    }

    // Construct using com.google.monitoring.v3.TimeSeriesRatio.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      goodServiceFilter_ = "";

      badServiceFilter_ = "";

      totalServiceFilter_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.ServiceMonitoringProto
          .internal_static_google_monitoring_v3_TimeSeriesRatio_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeSeriesRatio getDefaultInstanceForType() {
      return com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeSeriesRatio build() {
      com.google.monitoring.v3.TimeSeriesRatio result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.TimeSeriesRatio buildPartial() {
      com.google.monitoring.v3.TimeSeriesRatio result =
          new com.google.monitoring.v3.TimeSeriesRatio(this);
      result.goodServiceFilter_ = goodServiceFilter_;
      result.badServiceFilter_ = badServiceFilter_;
      result.totalServiceFilter_ = totalServiceFilter_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.monitoring.v3.TimeSeriesRatio) {
        return mergeFrom((com.google.monitoring.v3.TimeSeriesRatio) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.TimeSeriesRatio other) {
      if (other == com.google.monitoring.v3.TimeSeriesRatio.getDefaultInstance()) return this;
      if (!other.getGoodServiceFilter().isEmpty()) {
        goodServiceFilter_ = other.goodServiceFilter_;
        onChanged();
      }
      if (!other.getBadServiceFilter().isEmpty()) {
        badServiceFilter_ = other.badServiceFilter_;
        onChanged();
      }
      if (!other.getTotalServiceFilter().isEmpty()) {
        totalServiceFilter_ = other.totalServiceFilter_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.monitoring.v3.TimeSeriesRatio parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.monitoring.v3.TimeSeriesRatio) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object goodServiceFilter_ = "";
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying good service provided. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string good_service_filter = 4;</code>
     *
     * @return The goodServiceFilter.
     */
    public java.lang.String getGoodServiceFilter() {
      java.lang.Object ref = goodServiceFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        goodServiceFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying good service provided. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string good_service_filter = 4;</code>
     *
     * @return The bytes for goodServiceFilter.
     */
    public com.google.protobuf.ByteString getGoodServiceFilterBytes() {
      java.lang.Object ref = goodServiceFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        goodServiceFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying good service provided. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string good_service_filter = 4;</code>
     *
     * @param value The goodServiceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setGoodServiceFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      goodServiceFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying good service provided. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string good_service_filter = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGoodServiceFilter() {

      goodServiceFilter_ = getDefaultInstance().getGoodServiceFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying good service provided. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string good_service_filter = 4;</code>
     *
     * @param value The bytes for goodServiceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setGoodServiceFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      goodServiceFilter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object badServiceFilter_ = "";
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying bad service, either demanded service
     * that was not provided or demanded service that was of inadequate quality.
     * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
     * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string bad_service_filter = 5;</code>
     *
     * @return The badServiceFilter.
     */
    public java.lang.String getBadServiceFilter() {
      java.lang.Object ref = badServiceFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        badServiceFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying bad service, either demanded service
     * that was not provided or demanded service that was of inadequate quality.
     * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
     * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string bad_service_filter = 5;</code>
     *
     * @return The bytes for badServiceFilter.
     */
    public com.google.protobuf.ByteString getBadServiceFilterBytes() {
      java.lang.Object ref = badServiceFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        badServiceFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying bad service, either demanded service
     * that was not provided or demanded service that was of inadequate quality.
     * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
     * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string bad_service_filter = 5;</code>
     *
     * @param value The badServiceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setBadServiceFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      badServiceFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying bad service, either demanded service
     * that was not provided or demanded service that was of inadequate quality.
     * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
     * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string bad_service_filter = 5;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBadServiceFilter() {

      badServiceFilter_ = getDefaultInstance().getBadServiceFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying bad service, either demanded service
     * that was not provided or demanded service that was of inadequate quality.
     * Must have `ValueType = DOUBLE` or `ValueType = INT64` and must have
     * `MetricKind = DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string bad_service_filter = 5;</code>
     *
     * @param value The bytes for badServiceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setBadServiceFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      badServiceFilter_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object totalServiceFilter_ = "";
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying total demanded service. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string total_service_filter = 6;</code>
     *
     * @return The totalServiceFilter.
     */
    public java.lang.String getTotalServiceFilter() {
      java.lang.Object ref = totalServiceFilter_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        totalServiceFilter_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying total demanded service. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string total_service_filter = 6;</code>
     *
     * @return The bytes for totalServiceFilter.
     */
    public com.google.protobuf.ByteString getTotalServiceFilterBytes() {
      java.lang.Object ref = totalServiceFilter_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        totalServiceFilter_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying total demanded service. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string total_service_filter = 6;</code>
     *
     * @param value The totalServiceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTotalServiceFilter(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      totalServiceFilter_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying total demanded service. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string total_service_filter = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalServiceFilter() {

      totalServiceFilter_ = getDefaultInstance().getTotalServiceFilter();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A [monitoring filter](https://cloud.google.com/monitoring/api/v3/filters)
     * specifying a `TimeSeries` quantifying total demanded service. Must have
     * `ValueType = DOUBLE` or `ValueType = INT64` and must have `MetricKind =
     * DELTA` or `MetricKind = CUMULATIVE`.
     * </pre>
     *
     * <code>string total_service_filter = 6;</code>
     *
     * @param value The bytes for totalServiceFilter to set.
     * @return This builder for chaining.
     */
    public Builder setTotalServiceFilterBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      totalServiceFilter_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.TimeSeriesRatio)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.TimeSeriesRatio)
  private static final com.google.monitoring.v3.TimeSeriesRatio DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.TimeSeriesRatio();
  }

  public static com.google.monitoring.v3.TimeSeriesRatio getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TimeSeriesRatio> PARSER =
      new com.google.protobuf.AbstractParser<TimeSeriesRatio>() {
        @java.lang.Override
        public TimeSeriesRatio parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new TimeSeriesRatio(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<TimeSeriesRatio> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TimeSeriesRatio> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.TimeSeriesRatio getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

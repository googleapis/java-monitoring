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
// source: google/monitoring/v3/metric_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `CreateMetricDescriptor` request.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.CreateMetricDescriptorRequest}
 */
public final class CreateMetricDescriptorRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.CreateMetricDescriptorRequest)
    CreateMetricDescriptorRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateMetricDescriptorRequest.newBuilder() to construct.
  private CreateMetricDescriptorRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateMetricDescriptorRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateMetricDescriptorRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.MetricServiceProto
        .internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.CreateMetricDescriptorRequest.class,
            com.google.monitoring.v3.CreateMetricDescriptorRequest.Builder.class);
  }

  public static final int NAME_FIELD_NUMBER = 3;
  private volatile java.lang.Object name_;
  /**
   *
   *
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   * 4
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
   * which to execute the request. The format is:
   * 4
   *     projects/[PROJECT_ID_OR_NUMBER]
   * </pre>
   *
   * <code>
   * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METRIC_DESCRIPTOR_FIELD_NUMBER = 2;
  private com.google.api.MetricDescriptor metricDescriptor_;
  /**
   *
   *
   * <pre>
   * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
   * descriptor.
   * </pre>
   *
   * <code>
   * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the metricDescriptor field is set.
   */
  @java.lang.Override
  public boolean hasMetricDescriptor() {
    return metricDescriptor_ != null;
  }
  /**
   *
   *
   * <pre>
   * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
   * descriptor.
   * </pre>
   *
   * <code>
   * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The metricDescriptor.
   */
  @java.lang.Override
  public com.google.api.MetricDescriptor getMetricDescriptor() {
    return metricDescriptor_ == null
        ? com.google.api.MetricDescriptor.getDefaultInstance()
        : metricDescriptor_;
  }
  /**
   *
   *
   * <pre>
   * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
   * descriptor.
   * </pre>
   *
   * <code>
   * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.api.MetricDescriptorOrBuilder getMetricDescriptorOrBuilder() {
    return getMetricDescriptor();
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
    if (metricDescriptor_ != null) {
      output.writeMessage(2, getMetricDescriptor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, name_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metricDescriptor_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getMetricDescriptor());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, name_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.monitoring.v3.CreateMetricDescriptorRequest)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.CreateMetricDescriptorRequest other =
        (com.google.monitoring.v3.CreateMetricDescriptorRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasMetricDescriptor() != other.hasMetricDescriptor()) return false;
    if (hasMetricDescriptor()) {
      if (!getMetricDescriptor().equals(other.getMetricDescriptor())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasMetricDescriptor()) {
      hash = (37 * hash) + METRIC_DESCRIPTOR_FIELD_NUMBER;
      hash = (53 * hash) + getMetricDescriptor().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest parseFrom(
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

  public static Builder newBuilder(
      com.google.monitoring.v3.CreateMetricDescriptorRequest prototype) {
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
   * The `CreateMetricDescriptor` request.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.CreateMetricDescriptorRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.CreateMetricDescriptorRequest)
      com.google.monitoring.v3.CreateMetricDescriptorRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.CreateMetricDescriptorRequest.class,
              com.google.monitoring.v3.CreateMetricDescriptorRequest.Builder.class);
    }

    // Construct using com.google.monitoring.v3.CreateMetricDescriptorRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      name_ = "";

      if (metricDescriptorBuilder_ == null) {
        metricDescriptor_ = null;
      } else {
        metricDescriptor_ = null;
        metricDescriptorBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.MetricServiceProto
          .internal_static_google_monitoring_v3_CreateMetricDescriptorRequest_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateMetricDescriptorRequest getDefaultInstanceForType() {
      return com.google.monitoring.v3.CreateMetricDescriptorRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateMetricDescriptorRequest build() {
      com.google.monitoring.v3.CreateMetricDescriptorRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.CreateMetricDescriptorRequest buildPartial() {
      com.google.monitoring.v3.CreateMetricDescriptorRequest result =
          new com.google.monitoring.v3.CreateMetricDescriptorRequest(this);
      result.name_ = name_;
      if (metricDescriptorBuilder_ == null) {
        result.metricDescriptor_ = metricDescriptor_;
      } else {
        result.metricDescriptor_ = metricDescriptorBuilder_.build();
      }
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
      if (other instanceof com.google.monitoring.v3.CreateMetricDescriptorRequest) {
        return mergeFrom((com.google.monitoring.v3.CreateMetricDescriptorRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.CreateMetricDescriptorRequest other) {
      if (other == com.google.monitoring.v3.CreateMetricDescriptorRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        onChanged();
      }
      if (other.hasMetricDescriptor()) {
        mergeMetricDescriptor(other.getMetricDescriptor());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 18:
              {
                input.readMessage(
                    getMetricDescriptorFieldBuilder().getBuilder(), extensionRegistry);

                break;
              } // case 18
            case 26:
              {
                name_ = input.readStringRequireUtf8();

                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     * 4
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     * 4
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     * 4
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      name_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     * 4
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {

      name_ = getDefaultInstance().getName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The [project](https://cloud.google.com/monitoring/api/v3#project_name) on
     * which to execute the request. The format is:
     * 4
     *     projects/[PROJECT_ID_OR_NUMBER]
     * </pre>
     *
     * <code>
     * string name = 3 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      name_ = value;
      onChanged();
      return this;
    }

    private com.google.api.MetricDescriptor metricDescriptor_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.MetricDescriptor,
            com.google.api.MetricDescriptor.Builder,
            com.google.api.MetricDescriptorOrBuilder>
        metricDescriptorBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the metricDescriptor field is set.
     */
    public boolean hasMetricDescriptor() {
      return metricDescriptorBuilder_ != null || metricDescriptor_ != null;
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The metricDescriptor.
     */
    public com.google.api.MetricDescriptor getMetricDescriptor() {
      if (metricDescriptorBuilder_ == null) {
        return metricDescriptor_ == null
            ? com.google.api.MetricDescriptor.getDefaultInstance()
            : metricDescriptor_;
      } else {
        return metricDescriptorBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetricDescriptor(com.google.api.MetricDescriptor value) {
      if (metricDescriptorBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metricDescriptor_ = value;
        onChanged();
      } else {
        metricDescriptorBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setMetricDescriptor(com.google.api.MetricDescriptor.Builder builderForValue) {
      if (metricDescriptorBuilder_ == null) {
        metricDescriptor_ = builderForValue.build();
        onChanged();
      } else {
        metricDescriptorBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeMetricDescriptor(com.google.api.MetricDescriptor value) {
      if (metricDescriptorBuilder_ == null) {
        if (metricDescriptor_ != null) {
          metricDescriptor_ =
              com.google.api.MetricDescriptor.newBuilder(metricDescriptor_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          metricDescriptor_ = value;
        }
        onChanged();
      } else {
        metricDescriptorBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearMetricDescriptor() {
      if (metricDescriptorBuilder_ == null) {
        metricDescriptor_ = null;
        onChanged();
      } else {
        metricDescriptor_ = null;
        metricDescriptorBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.MetricDescriptor.Builder getMetricDescriptorBuilder() {

      onChanged();
      return getMetricDescriptorFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.api.MetricDescriptorOrBuilder getMetricDescriptorOrBuilder() {
      if (metricDescriptorBuilder_ != null) {
        return metricDescriptorBuilder_.getMessageOrBuilder();
      } else {
        return metricDescriptor_ == null
            ? com.google.api.MetricDescriptor.getDefaultInstance()
            : metricDescriptor_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The new [custom metric](https://cloud.google.com/monitoring/custom-metrics)
     * descriptor.
     * </pre>
     *
     * <code>
     * .google.api.MetricDescriptor metric_descriptor = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.api.MetricDescriptor,
            com.google.api.MetricDescriptor.Builder,
            com.google.api.MetricDescriptorOrBuilder>
        getMetricDescriptorFieldBuilder() {
      if (metricDescriptorBuilder_ == null) {
        metricDescriptorBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.api.MetricDescriptor,
                com.google.api.MetricDescriptor.Builder,
                com.google.api.MetricDescriptorOrBuilder>(
                getMetricDescriptor(), getParentForChildren(), isClean());
        metricDescriptor_ = null;
      }
      return metricDescriptorBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.CreateMetricDescriptorRequest)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.CreateMetricDescriptorRequest)
  private static final com.google.monitoring.v3.CreateMetricDescriptorRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.CreateMetricDescriptorRequest();
  }

  public static com.google.monitoring.v3.CreateMetricDescriptorRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateMetricDescriptorRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateMetricDescriptorRequest>() {
        @java.lang.Override
        public CreateMetricDescriptorRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<CreateMetricDescriptorRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateMetricDescriptorRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.CreateMetricDescriptorRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

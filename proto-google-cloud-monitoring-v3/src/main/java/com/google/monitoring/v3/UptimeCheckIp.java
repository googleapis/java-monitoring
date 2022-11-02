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
// source: google/monitoring/v3/uptime.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * Contains the region, location, and list of IP
 * addresses where checkers in the location run from.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.UptimeCheckIp}
 */
public final class UptimeCheckIp extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.UptimeCheckIp)
    UptimeCheckIpOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UptimeCheckIp.newBuilder() to construct.
  private UptimeCheckIp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UptimeCheckIp() {
    region_ = 0;
    location_ = "";
    ipAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UptimeCheckIp();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.UptimeProto
        .internal_static_google_monitoring_v3_UptimeCheckIp_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.UptimeProto
        .internal_static_google_monitoring_v3_UptimeCheckIp_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.UptimeCheckIp.class,
            com.google.monitoring.v3.UptimeCheckIp.Builder.class);
  }

  public static final int REGION_FIELD_NUMBER = 1;
  private int region_;
  /**
   *
   *
   * <pre>
   * A broad region category in which the IP address is located.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
   *
   * @return The enum numeric value on the wire for region.
   */
  @java.lang.Override
  public int getRegionValue() {
    return region_;
  }
  /**
   *
   *
   * <pre>
   * A broad region category in which the IP address is located.
   * </pre>
   *
   * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
   *
   * @return The region.
   */
  @java.lang.Override
  public com.google.monitoring.v3.UptimeCheckRegion getRegion() {
    @SuppressWarnings("deprecation")
    com.google.monitoring.v3.UptimeCheckRegion result =
        com.google.monitoring.v3.UptimeCheckRegion.valueOf(region_);
    return result == null ? com.google.monitoring.v3.UptimeCheckRegion.UNRECOGNIZED : result;
  }

  public static final int LOCATION_FIELD_NUMBER = 2;
  private volatile java.lang.Object location_;
  /**
   *
   *
   * <pre>
   * A more specific location within the region that typically encodes
   * a particular city/town/metro (and its containing state/province or country)
   * within the broader umbrella region category.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A more specific location within the region that typically encodes
   * a particular city/town/metro (and its containing state/province or country)
   * within the broader umbrella region category.
   * </pre>
   *
   * <code>string location = 2;</code>
   *
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int IP_ADDRESS_FIELD_NUMBER = 3;
  private volatile java.lang.Object ipAddress_;
  /**
   *
   *
   * <pre>
   * The IP address from which the Uptime check originates. This is a fully
   * specified IP address (not an IP address range). Most IP addresses, as of
   * this publication, are in IPv4 format; however, one should not rely on the
   * IP addresses being in IPv4 format indefinitely, and should support
   * interpreting this field in either IPv4 or IPv6 format.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   *
   * @return The ipAddress.
   */
  @java.lang.Override
  public java.lang.String getIpAddress() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipAddress_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The IP address from which the Uptime check originates. This is a fully
   * specified IP address (not an IP address range). Most IP addresses, as of
   * this publication, are in IPv4 format; however, one should not rely on the
   * IP addresses being in IPv4 format indefinitely, and should support
   * interpreting this field in either IPv4 or IPv6 format.
   * </pre>
   *
   * <code>string ip_address = 3;</code>
   *
   * @return The bytes for ipAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIpAddressBytes() {
    java.lang.Object ref = ipAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ipAddress_ = b;
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
    if (region_ != com.google.monitoring.v3.UptimeCheckRegion.REGION_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, region_);
    }
    if (!getLocationBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, location_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ipAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (region_ != com.google.monitoring.v3.UptimeCheckRegion.REGION_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, region_);
    }
    if (!getLocationBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, location_);
    }
    if (!getIpAddressBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ipAddress_);
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
    if (!(obj instanceof com.google.monitoring.v3.UptimeCheckIp)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.UptimeCheckIp other = (com.google.monitoring.v3.UptimeCheckIp) obj;

    if (region_ != other.region_) return false;
    if (!getLocation().equals(other.getLocation())) return false;
    if (!getIpAddress().equals(other.getIpAddress())) return false;
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
    hash = (37 * hash) + REGION_FIELD_NUMBER;
    hash = (53 * hash) + region_;
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (37 * hash) + IP_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getIpAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.UptimeCheckIp parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.UptimeCheckIp prototype) {
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
   * Contains the region, location, and list of IP
   * addresses where checkers in the location run from.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.UptimeCheckIp}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.UptimeCheckIp)
      com.google.monitoring.v3.UptimeCheckIpOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.UptimeProto
          .internal_static_google_monitoring_v3_UptimeCheckIp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.UptimeProto
          .internal_static_google_monitoring_v3_UptimeCheckIp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.UptimeCheckIp.class,
              com.google.monitoring.v3.UptimeCheckIp.Builder.class);
    }

    // Construct using com.google.monitoring.v3.UptimeCheckIp.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      region_ = 0;

      location_ = "";

      ipAddress_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.UptimeProto
          .internal_static_google_monitoring_v3_UptimeCheckIp_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.UptimeCheckIp getDefaultInstanceForType() {
      return com.google.monitoring.v3.UptimeCheckIp.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.UptimeCheckIp build() {
      com.google.monitoring.v3.UptimeCheckIp result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.UptimeCheckIp buildPartial() {
      com.google.monitoring.v3.UptimeCheckIp result =
          new com.google.monitoring.v3.UptimeCheckIp(this);
      result.region_ = region_;
      result.location_ = location_;
      result.ipAddress_ = ipAddress_;
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
      if (other instanceof com.google.monitoring.v3.UptimeCheckIp) {
        return mergeFrom((com.google.monitoring.v3.UptimeCheckIp) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.UptimeCheckIp other) {
      if (other == com.google.monitoring.v3.UptimeCheckIp.getDefaultInstance()) return this;
      if (other.region_ != 0) {
        setRegionValue(other.getRegionValue());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
        onChanged();
      }
      if (!other.getIpAddress().isEmpty()) {
        ipAddress_ = other.ipAddress_;
        onChanged();
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
            case 8:
              {
                region_ = input.readEnum();

                break;
              } // case 8
            case 18:
              {
                location_ = input.readStringRequireUtf8();

                break;
              } // case 18
            case 26:
              {
                ipAddress_ = input.readStringRequireUtf8();

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

    private int region_ = 0;
    /**
     *
     *
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     *
     * @return The enum numeric value on the wire for region.
     */
    @java.lang.Override
    public int getRegionValue() {
      return region_;
    }
    /**
     *
     *
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     *
     * @param value The enum numeric value on the wire for region to set.
     * @return This builder for chaining.
     */
    public Builder setRegionValue(int value) {

      region_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     *
     * @return The region.
     */
    @java.lang.Override
    public com.google.monitoring.v3.UptimeCheckRegion getRegion() {
      @SuppressWarnings("deprecation")
      com.google.monitoring.v3.UptimeCheckRegion result =
          com.google.monitoring.v3.UptimeCheckRegion.valueOf(region_);
      return result == null ? com.google.monitoring.v3.UptimeCheckRegion.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     *
     * @param value The region to set.
     * @return This builder for chaining.
     */
    public Builder setRegion(com.google.monitoring.v3.UptimeCheckRegion value) {
      if (value == null) {
        throw new NullPointerException();
      }

      region_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A broad region category in which the IP address is located.
     * </pre>
     *
     * <code>.google.monitoring.v3.UptimeCheckRegion region = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegion() {

      region_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      location_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {

      location_ = getDefaultInstance().getLocation();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A more specific location within the region that typically encodes
     * a particular city/town/metro (and its containing state/province or country)
     * within the broader umbrella region category.
     * </pre>
     *
     * <code>string location = 2;</code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      location_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object ipAddress_ = "";
    /**
     *
     *
     * <pre>
     * The IP address from which the Uptime check originates. This is a fully
     * specified IP address (not an IP address range). Most IP addresses, as of
     * this publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely, and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     *
     * @return The ipAddress.
     */
    public java.lang.String getIpAddress() {
      java.lang.Object ref = ipAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP address from which the Uptime check originates. This is a fully
     * specified IP address (not an IP address range). Most IP addresses, as of
     * this publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely, and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     *
     * @return The bytes for ipAddress.
     */
    public com.google.protobuf.ByteString getIpAddressBytes() {
      java.lang.Object ref = ipAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ipAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The IP address from which the Uptime check originates. This is a fully
     * specified IP address (not an IP address range). Most IP addresses, as of
     * this publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely, and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     *
     * @param value The ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddress(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      ipAddress_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP address from which the Uptime check originates. This is a fully
     * specified IP address (not an IP address range). Most IP addresses, as of
     * this publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely, and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIpAddress() {

      ipAddress_ = getDefaultInstance().getIpAddress();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The IP address from which the Uptime check originates. This is a fully
     * specified IP address (not an IP address range). Most IP addresses, as of
     * this publication, are in IPv4 format; however, one should not rely on the
     * IP addresses being in IPv4 format indefinitely, and should support
     * interpreting this field in either IPv4 or IPv6 format.
     * </pre>
     *
     * <code>string ip_address = 3;</code>
     *
     * @param value The bytes for ipAddress to set.
     * @return This builder for chaining.
     */
    public Builder setIpAddressBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      ipAddress_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.UptimeCheckIp)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.UptimeCheckIp)
  private static final com.google.monitoring.v3.UptimeCheckIp DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.UptimeCheckIp();
  }

  public static com.google.monitoring.v3.UptimeCheckIp getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UptimeCheckIp> PARSER =
      new com.google.protobuf.AbstractParser<UptimeCheckIp>() {
        @java.lang.Override
        public UptimeCheckIp parsePartialFrom(
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

  public static com.google.protobuf.Parser<UptimeCheckIp> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UptimeCheckIp> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.UptimeCheckIp getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

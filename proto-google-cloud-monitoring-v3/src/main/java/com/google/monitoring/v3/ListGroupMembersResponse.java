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
// source: google/monitoring/v3/group_service.proto

package com.google.monitoring.v3;

/**
 *
 *
 * <pre>
 * The `ListGroupMembers` response.
 * </pre>
 *
 * Protobuf type {@code google.monitoring.v3.ListGroupMembersResponse}
 */
public final class ListGroupMembersResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.monitoring.v3.ListGroupMembersResponse)
    ListGroupMembersResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListGroupMembersResponse.newBuilder() to construct.
  private ListGroupMembersResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListGroupMembersResponse() {
    members_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListGroupMembersResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListGroupMembersResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
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
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                members_ = new java.util.ArrayList<com.google.api.MonitoredResource>();
                mutable_bitField0_ |= 0x00000001;
              }
              members_.add(
                  input.readMessage(com.google.api.MonitoredResource.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          case 24:
            {
              totalSize_ = input.readInt32();
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
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        members_ = java.util.Collections.unmodifiableList(members_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.monitoring.v3.GroupServiceProto
        .internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.monitoring.v3.GroupServiceProto
        .internal_static_google_monitoring_v3_ListGroupMembersResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.monitoring.v3.ListGroupMembersResponse.class,
            com.google.monitoring.v3.ListGroupMembersResponse.Builder.class);
  }

  public static final int MEMBERS_FIELD_NUMBER = 1;
  private java.util.List<com.google.api.MonitoredResource> members_;
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.api.MonitoredResource> getMembersList() {
    return members_;
  }
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.api.MonitoredResourceOrBuilder>
      getMembersOrBuilderList() {
    return members_;
  }
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  @java.lang.Override
  public int getMembersCount() {
    return members_.size();
  }
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  @java.lang.Override
  public com.google.api.MonitoredResource getMembers(int index) {
    return members_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A set of monitored resources in the group.
   * </pre>
   *
   * <code>repeated .google.api.MonitoredResource members = 1;</code>
   */
  @java.lang.Override
  public com.google.api.MonitoredResourceOrBuilder getMembersOrBuilder(int index) {
    return members_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is
   * set to a non-empty value.  To see the additional results, use that value as
   * `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If there are more results than have been returned, then this field is
   * set to a non-empty value.  To see the additional results, use that value as
   * `page_token` in the next call to this method.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_SIZE_FIELD_NUMBER = 3;
  private int totalSize_;
  /**
   *
   *
   * <pre>
   * The total number of elements matching this request.
   * </pre>
   *
   * <code>int32 total_size = 3;</code>
   *
   * @return The totalSize.
   */
  @java.lang.Override
  public int getTotalSize() {
    return totalSize_;
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
    for (int i = 0; i < members_.size(); i++) {
      output.writeMessage(1, members_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      output.writeInt32(3, totalSize_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < members_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, members_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    if (totalSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(3, totalSize_);
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
    if (!(obj instanceof com.google.monitoring.v3.ListGroupMembersResponse)) {
      return super.equals(obj);
    }
    com.google.monitoring.v3.ListGroupMembersResponse other =
        (com.google.monitoring.v3.ListGroupMembersResponse) obj;

    if (!getMembersList().equals(other.getMembersList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (getTotalSize() != other.getTotalSize()) return false;
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
    if (getMembersCount() > 0) {
      hash = (37 * hash) + MEMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getMembersList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (37 * hash) + TOTAL_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getTotalSize();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse parseFrom(
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

  public static Builder newBuilder(com.google.monitoring.v3.ListGroupMembersResponse prototype) {
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
   * The `ListGroupMembers` response.
   * </pre>
   *
   * Protobuf type {@code google.monitoring.v3.ListGroupMembersResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.monitoring.v3.ListGroupMembersResponse)
      com.google.monitoring.v3.ListGroupMembersResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_ListGroupMembersResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.monitoring.v3.ListGroupMembersResponse.class,
              com.google.monitoring.v3.ListGroupMembersResponse.Builder.class);
    }

    // Construct using com.google.monitoring.v3.ListGroupMembersResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMembersFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        membersBuilder_.clear();
      }
      nextPageToken_ = "";

      totalSize_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.monitoring.v3.GroupServiceProto
          .internal_static_google_monitoring_v3_ListGroupMembersResponse_descriptor;
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListGroupMembersResponse getDefaultInstanceForType() {
      return com.google.monitoring.v3.ListGroupMembersResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListGroupMembersResponse build() {
      com.google.monitoring.v3.ListGroupMembersResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.monitoring.v3.ListGroupMembersResponse buildPartial() {
      com.google.monitoring.v3.ListGroupMembersResponse result =
          new com.google.monitoring.v3.ListGroupMembersResponse(this);
      int from_bitField0_ = bitField0_;
      if (membersBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          members_ = java.util.Collections.unmodifiableList(members_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.members_ = members_;
      } else {
        result.members_ = membersBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      result.totalSize_ = totalSize_;
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
      if (other instanceof com.google.monitoring.v3.ListGroupMembersResponse) {
        return mergeFrom((com.google.monitoring.v3.ListGroupMembersResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.monitoring.v3.ListGroupMembersResponse other) {
      if (other == com.google.monitoring.v3.ListGroupMembersResponse.getDefaultInstance())
        return this;
      if (membersBuilder_ == null) {
        if (!other.members_.isEmpty()) {
          if (members_.isEmpty()) {
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMembersIsMutable();
            members_.addAll(other.members_);
          }
          onChanged();
        }
      } else {
        if (!other.members_.isEmpty()) {
          if (membersBuilder_.isEmpty()) {
            membersBuilder_.dispose();
            membersBuilder_ = null;
            members_ = other.members_;
            bitField0_ = (bitField0_ & ~0x00000001);
            membersBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getMembersFieldBuilder()
                    : null;
          } else {
            membersBuilder_.addAllMessages(other.members_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      if (other.getTotalSize() != 0) {
        setTotalSize(other.getTotalSize());
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
      com.google.monitoring.v3.ListGroupMembersResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.monitoring.v3.ListGroupMembersResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.api.MonitoredResource> members_ =
        java.util.Collections.emptyList();

    private void ensureMembersIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        members_ = new java.util.ArrayList<com.google.api.MonitoredResource>(members_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.MonitoredResource,
            com.google.api.MonitoredResource.Builder,
            com.google.api.MonitoredResourceOrBuilder>
        membersBuilder_;

    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public java.util.List<com.google.api.MonitoredResource> getMembersList() {
      if (membersBuilder_ == null) {
        return java.util.Collections.unmodifiableList(members_);
      } else {
        return membersBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public int getMembersCount() {
      if (membersBuilder_ == null) {
        return members_.size();
      } else {
        return membersBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public com.google.api.MonitoredResource getMembers(int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);
      } else {
        return membersBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder setMembers(int index, com.google.api.MonitoredResource value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.set(index, value);
        onChanged();
      } else {
        membersBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder setMembers(int index, com.google.api.MonitoredResource.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.set(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder addMembers(com.google.api.MonitoredResource value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(value);
        onChanged();
      } else {
        membersBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder addMembers(int index, com.google.api.MonitoredResource value) {
      if (membersBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMembersIsMutable();
        members_.add(index, value);
        onChanged();
      } else {
        membersBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder addMembers(com.google.api.MonitoredResource.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder addMembers(int index, com.google.api.MonitoredResource.Builder builderForValue) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.add(index, builderForValue.build());
        onChanged();
      } else {
        membersBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder addAllMembers(
        java.lang.Iterable<? extends com.google.api.MonitoredResource> values) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, members_);
        onChanged();
      } else {
        membersBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder clearMembers() {
      if (membersBuilder_ == null) {
        members_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        membersBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public Builder removeMembers(int index) {
      if (membersBuilder_ == null) {
        ensureMembersIsMutable();
        members_.remove(index);
        onChanged();
      } else {
        membersBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public com.google.api.MonitoredResource.Builder getMembersBuilder(int index) {
      return getMembersFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public com.google.api.MonitoredResourceOrBuilder getMembersOrBuilder(int index) {
      if (membersBuilder_ == null) {
        return members_.get(index);
      } else {
        return membersBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public java.util.List<? extends com.google.api.MonitoredResourceOrBuilder>
        getMembersOrBuilderList() {
      if (membersBuilder_ != null) {
        return membersBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(members_);
      }
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public com.google.api.MonitoredResource.Builder addMembersBuilder() {
      return getMembersFieldBuilder()
          .addBuilder(com.google.api.MonitoredResource.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public com.google.api.MonitoredResource.Builder addMembersBuilder(int index) {
      return getMembersFieldBuilder()
          .addBuilder(index, com.google.api.MonitoredResource.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A set of monitored resources in the group.
     * </pre>
     *
     * <code>repeated .google.api.MonitoredResource members = 1;</code>
     */
    public java.util.List<com.google.api.MonitoredResource.Builder> getMembersBuilderList() {
      return getMembersFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.api.MonitoredResource,
            com.google.api.MonitoredResource.Builder,
            com.google.api.MonitoredResourceOrBuilder>
        getMembersFieldBuilder() {
      if (membersBuilder_ == null) {
        membersBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.api.MonitoredResource,
                com.google.api.MonitoredResource.Builder,
                com.google.api.MonitoredResourceOrBuilder>(
                members_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        members_ = null;
      }
      return membersBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is
     * set to a non-empty value.  To see the additional results, use that value as
     * `page_token` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is
     * set to a non-empty value.  To see the additional results, use that value as
     * `page_token` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is
     * set to a non-empty value.  To see the additional results, use that value as
     * `page_token` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is
     * set to a non-empty value.  To see the additional results, use that value as
     * `page_token` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If there are more results than have been returned, then this field is
     * set to a non-empty value.  To see the additional results, use that value as
     * `page_token` in the next call to this method.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    private int totalSize_;
    /**
     *
     *
     * <pre>
     * The total number of elements matching this request.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     *
     * @return The totalSize.
     */
    @java.lang.Override
    public int getTotalSize() {
      return totalSize_;
    }
    /**
     *
     *
     * <pre>
     * The total number of elements matching this request.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     *
     * @param value The totalSize to set.
     * @return This builder for chaining.
     */
    public Builder setTotalSize(int value) {

      totalSize_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The total number of elements matching this request.
     * </pre>
     *
     * <code>int32 total_size = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTotalSize() {

      totalSize_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.monitoring.v3.ListGroupMembersResponse)
  }

  // @@protoc_insertion_point(class_scope:google.monitoring.v3.ListGroupMembersResponse)
  private static final com.google.monitoring.v3.ListGroupMembersResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.monitoring.v3.ListGroupMembersResponse();
  }

  public static com.google.monitoring.v3.ListGroupMembersResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListGroupMembersResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListGroupMembersResponse>() {
        @java.lang.Override
        public ListGroupMembersResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListGroupMembersResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListGroupMembersResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListGroupMembersResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.monitoring.v3.ListGroupMembersResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

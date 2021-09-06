// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msgTrans.proto

package com.ops.sc.rpc.dto;

/**
 * Protobuf type {@code RegTransMsgResponse}
 */
public  final class RegTransMsgResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:RegTransMsgResponse)
    RegTransMsgResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegTransMsgResponse.newBuilder() to construct.
  private RegTransMsgResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegTransMsgResponse() {
    branchId_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private RegTransMsgResponse(
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
          case 10: {
            com.ops.sc.rpc.dto.ParentResponse.Builder subBuilder = null;
            if (baseResponse_ != null) {
              subBuilder = baseResponse_.toBuilder();
            }
            baseResponse_ = input.readMessage(com.ops.sc.rpc.dto.ParentResponse.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(baseResponse_);
              baseResponse_ = subBuilder.buildPartial();
            }

            break;
          }
          case 18: {
            java.lang.String s = input.readStringRequireUtf8();

            branchId_ = s;
            break;
          }
          default: {
            if (!parseUnknownFieldProto3(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ops.sc.rpc.dto.MsgTrans.internal_static_RegTransMsgResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ops.sc.rpc.dto.MsgTrans.internal_static_RegTransMsgResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ops.sc.rpc.dto.RegTransMsgResponse.class, com.ops.sc.rpc.dto.RegTransMsgResponse.Builder.class);
  }

  public static final int BASERESPONSE_FIELD_NUMBER = 1;
  private com.ops.sc.rpc.dto.ParentResponse baseResponse_;
  /**
   * <code>.ParentResponse baseResponse = 1;</code>
   */
  public boolean hasBaseResponse() {
    return baseResponse_ != null;
  }
  /**
   * <code>.ParentResponse baseResponse = 1;</code>
   */
  public com.ops.sc.rpc.dto.ParentResponse getBaseResponse() {
    return baseResponse_ == null ? com.ops.sc.rpc.dto.ParentResponse.getDefaultInstance() : baseResponse_;
  }
  /**
   * <code>.ParentResponse baseResponse = 1;</code>
   */
  public com.ops.sc.rpc.dto.ParentResponseOrBuilder getBaseResponseOrBuilder() {
    return getBaseResponse();
  }

  public static final int BRANCHID_FIELD_NUMBER = 2;
  private volatile java.lang.Object branchId_;
  /**
   * <code>string branchId = 2;</code>
   */
  public java.lang.String getBranchId() {
    java.lang.Object ref = branchId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      branchId_ = s;
      return s;
    }
  }
  /**
   * <code>string branchId = 2;</code>
   */
  public com.google.protobuf.ByteString
      getBranchIdBytes() {
    java.lang.Object ref = branchId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      branchId_ = b;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (baseResponse_ != null) {
      output.writeMessage(1, getBaseResponse());
    }
    if (!getBranchIdBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, branchId_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (baseResponse_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBaseResponse());
    }
    if (!getBranchIdBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, branchId_);
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
    if (!(obj instanceof com.ops.sc.rpc.dto.RegTransMsgResponse)) {
      return super.equals(obj);
    }
    com.ops.sc.rpc.dto.RegTransMsgResponse other = (com.ops.sc.rpc.dto.RegTransMsgResponse) obj;

    boolean result = true;
    result = result && (hasBaseResponse() == other.hasBaseResponse());
    if (hasBaseResponse()) {
      result = result && getBaseResponse()
          .equals(other.getBaseResponse());
    }
    result = result && getBranchId()
        .equals(other.getBranchId());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasBaseResponse()) {
      hash = (37 * hash) + BASERESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getBaseResponse().hashCode();
    }
    hash = (37 * hash) + BRANCHID_FIELD_NUMBER;
    hash = (53 * hash) + getBranchId().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ops.sc.rpc.dto.RegTransMsgResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.ops.sc.rpc.dto.RegTransMsgResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code RegTransMsgResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:RegTransMsgResponse)
      com.ops.sc.rpc.dto.RegTransMsgResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ops.sc.rpc.dto.MsgTrans.internal_static_RegTransMsgResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ops.sc.rpc.dto.MsgTrans.internal_static_RegTransMsgResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ops.sc.rpc.dto.RegTransMsgResponse.class, com.ops.sc.rpc.dto.RegTransMsgResponse.Builder.class);
    }

    // Construct using com.ops.sc.rpc.dto.RegTransMsgResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (baseResponseBuilder_ == null) {
        baseResponse_ = null;
      } else {
        baseResponse_ = null;
        baseResponseBuilder_ = null;
      }
      branchId_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ops.sc.rpc.dto.MsgTrans.internal_static_RegTransMsgResponse_descriptor;
    }

    @java.lang.Override
    public com.ops.sc.rpc.dto.RegTransMsgResponse getDefaultInstanceForType() {
      return com.ops.sc.rpc.dto.RegTransMsgResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ops.sc.rpc.dto.RegTransMsgResponse build() {
      com.ops.sc.rpc.dto.RegTransMsgResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ops.sc.rpc.dto.RegTransMsgResponse buildPartial() {
      com.ops.sc.rpc.dto.RegTransMsgResponse result = new com.ops.sc.rpc.dto.RegTransMsgResponse(this);
      if (baseResponseBuilder_ == null) {
        result.baseResponse_ = baseResponse_;
      } else {
        result.baseResponse_ = baseResponseBuilder_.build();
      }
      result.branchId_ = branchId_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ops.sc.rpc.dto.RegTransMsgResponse) {
        return mergeFrom((com.ops.sc.rpc.dto.RegTransMsgResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ops.sc.rpc.dto.RegTransMsgResponse other) {
      if (other == com.ops.sc.rpc.dto.RegTransMsgResponse.getDefaultInstance()) return this;
      if (other.hasBaseResponse()) {
        mergeBaseResponse(other.getBaseResponse());
      }
      if (!other.getBranchId().isEmpty()) {
        branchId_ = other.branchId_;
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
      com.ops.sc.rpc.dto.RegTransMsgResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.ops.sc.rpc.dto.RegTransMsgResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.ops.sc.rpc.dto.ParentResponse baseResponse_ = null;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ops.sc.rpc.dto.ParentResponse, com.ops.sc.rpc.dto.ParentResponse.Builder, com.ops.sc.rpc.dto.ParentResponseOrBuilder> baseResponseBuilder_;
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public boolean hasBaseResponse() {
      return baseResponseBuilder_ != null || baseResponse_ != null;
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public com.ops.sc.rpc.dto.ParentResponse getBaseResponse() {
      if (baseResponseBuilder_ == null) {
        return baseResponse_ == null ? com.ops.sc.rpc.dto.ParentResponse.getDefaultInstance() : baseResponse_;
      } else {
        return baseResponseBuilder_.getMessage();
      }
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public Builder setBaseResponse(com.ops.sc.rpc.dto.ParentResponse value) {
      if (baseResponseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        baseResponse_ = value;
        onChanged();
      } else {
        baseResponseBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public Builder setBaseResponse(
        com.ops.sc.rpc.dto.ParentResponse.Builder builderForValue) {
      if (baseResponseBuilder_ == null) {
        baseResponse_ = builderForValue.build();
        onChanged();
      } else {
        baseResponseBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public Builder mergeBaseResponse(com.ops.sc.rpc.dto.ParentResponse value) {
      if (baseResponseBuilder_ == null) {
        if (baseResponse_ != null) {
          baseResponse_ =
            com.ops.sc.rpc.dto.ParentResponse.newBuilder(baseResponse_).mergeFrom(value).buildPartial();
        } else {
          baseResponse_ = value;
        }
        onChanged();
      } else {
        baseResponseBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public Builder clearBaseResponse() {
      if (baseResponseBuilder_ == null) {
        baseResponse_ = null;
        onChanged();
      } else {
        baseResponse_ = null;
        baseResponseBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public com.ops.sc.rpc.dto.ParentResponse.Builder getBaseResponseBuilder() {
      
      onChanged();
      return getBaseResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    public com.ops.sc.rpc.dto.ParentResponseOrBuilder getBaseResponseOrBuilder() {
      if (baseResponseBuilder_ != null) {
        return baseResponseBuilder_.getMessageOrBuilder();
      } else {
        return baseResponse_ == null ?
            com.ops.sc.rpc.dto.ParentResponse.getDefaultInstance() : baseResponse_;
      }
    }
    /**
     * <code>.ParentResponse baseResponse = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.ops.sc.rpc.dto.ParentResponse, com.ops.sc.rpc.dto.ParentResponse.Builder, com.ops.sc.rpc.dto.ParentResponseOrBuilder> 
        getBaseResponseFieldBuilder() {
      if (baseResponseBuilder_ == null) {
        baseResponseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.ops.sc.rpc.dto.ParentResponse, com.ops.sc.rpc.dto.ParentResponse.Builder, com.ops.sc.rpc.dto.ParentResponseOrBuilder>(
                getBaseResponse(),
                getParentForChildren(),
                isClean());
        baseResponse_ = null;
      }
      return baseResponseBuilder_;
    }

    private java.lang.Object branchId_ = "";
    /**
     * <code>string branchId = 2;</code>
     */
    public java.lang.String getBranchId() {
      java.lang.Object ref = branchId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        branchId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string branchId = 2;</code>
     */
    public com.google.protobuf.ByteString
        getBranchIdBytes() {
      java.lang.Object ref = branchId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        branchId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string branchId = 2;</code>
     */
    public Builder setBranchId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      branchId_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string branchId = 2;</code>
     */
    public Builder clearBranchId() {
      
      branchId_ = getDefaultInstance().getBranchId();
      onChanged();
      return this;
    }
    /**
     * <code>string branchId = 2;</code>
     */
    public Builder setBranchIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      branchId_ = value;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:RegTransMsgResponse)
  }

  // @@protoc_insertion_point(class_scope:RegTransMsgResponse)
  private static final com.ops.sc.rpc.dto.RegTransMsgResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ops.sc.rpc.dto.RegTransMsgResponse();
  }

  public static com.ops.sc.rpc.dto.RegTransMsgResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegTransMsgResponse>
      PARSER = new com.google.protobuf.AbstractParser<RegTransMsgResponse>() {
    @java.lang.Override
    public RegTransMsgResponse parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new RegTransMsgResponse(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<RegTransMsgResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegTransMsgResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ops.sc.rpc.dto.RegTransMsgResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}


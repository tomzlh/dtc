// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: branchRequest.proto

package com.ops.sc.rpc.dto;

public interface BranchTransResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:BranchTransResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.ParentResponse baseResponse = 1;</code>
   */
  boolean hasBaseResponse();
  /**
   * <code>.ParentResponse baseResponse = 1;</code>
   */
  com.ops.sc.rpc.dto.ParentResponse getBaseResponse();
  /**
   * <code>.ParentResponse baseResponse = 1;</code>
   */
  com.ops.sc.rpc.dto.ParentResponseOrBuilder getBaseResponseOrBuilder();

  /**
   * <code>string branchId = 2;</code>
   */
  java.lang.String getBranchId();
  /**
   * <code>string branchId = 2;</code>
   */
  com.google.protobuf.ByteString
      getBranchIdBytes();

  /**
   * <code>string businessId = 3;</code>
   */
  java.lang.String getBusinessId();
  /**
   * <code>string businessId = 3;</code>
   */
  com.google.protobuf.ByteString
      getBusinessIdBytes();
}
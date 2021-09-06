// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: globalRequest.proto

package com.ops.sc.rpc.dto;

public interface GlobalTransRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:GlobalTransRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string businessId = 1;</code>
   */
  java.lang.String getBusinessId();
  /**
   * <code>string businessId = 1;</code>
   */
  com.google.protobuf.ByteString
      getBusinessIdBytes();

  /**
   * <code>string transGroupId = 2;</code>
   */
  java.lang.String getTransGroupId();
  /**
   * <code>string transGroupId = 2;</code>
   */
  com.google.protobuf.ByteString
      getTransGroupIdBytes();

  /**
   * <pre>
   * 调用方ip
   * </pre>
   *
   * <code>string callerIp = 3;</code>
   */
  java.lang.String getCallerIp();
  /**
   * <pre>
   * 调用方ip
   * </pre>
   *
   * <code>string callerIp = 3;</code>
   */
  com.google.protobuf.ByteString
      getCallerIpBytes();

  /**
   * <pre>
   * 应用名称
   * </pre>
   *
   * <code>string appName = 4;</code>
   */
  java.lang.String getAppName();
  /**
   * <pre>
   * 应用名称
   * </pre>
   *
   * <code>string appName = 4;</code>
   */
  com.google.protobuf.ByteString
      getAppNameBytes();

  /**
   * <pre>
   * 全局事务超时时间,单位ms
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value timeout = 5;</code>
   */
  boolean hasTimeout();
  /**
   * <pre>
   * 全局事务超时时间,单位ms
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value timeout = 5;</code>
   */
  com.google.protobuf.UInt64Value getTimeout();
  /**
   * <pre>
   * 全局事务超时时间,单位ms
   * </pre>
   *
   * <code>.google.protobuf.UInt64Value timeout = 5;</code>
   */
  com.google.protobuf.UInt64ValueOrBuilder getTimeoutOrBuilder();

  /**
   * <code>.google.protobuf.UInt32Value callbackStrategy = 6;</code>
   */
  boolean hasCallbackStrategy();
  /**
   * <code>.google.protobuf.UInt32Value callbackStrategy = 6;</code>
   */
  com.google.protobuf.UInt32Value getCallbackStrategy();
  /**
   * <code>.google.protobuf.UInt32Value callbackStrategy = 6;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getCallbackStrategyOrBuilder();

  /**
   * <code>.google.protobuf.UInt32Value timeoutType = 7;</code>
   */
  boolean hasTimeoutType();
  /**
   * <code>.google.protobuf.UInt32Value timeoutType = 7;</code>
   */
  com.google.protobuf.UInt32Value getTimeoutType();
  /**
   * <code>.google.protobuf.UInt32Value timeoutType = 7;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getTimeoutTypeOrBuilder();

  /**
   * <pre>
   *事务模型
   * </pre>
   *
   * <code>string transMode = 8;</code>
   */
  java.lang.String getTransMode();
  /**
   * <pre>
   *事务模型
   * </pre>
   *
   * <code>string transMode = 8;</code>
   */
  com.google.protobuf.ByteString
      getTransModeBytes();

  /**
   * <pre>
   * fmt模式
   * </pre>
   *
   * <code>string dataSource = 9;</code>
   */
  java.lang.String getDataSource();
  /**
   * <pre>
   * fmt模式
   * </pre>
   *
   * <code>string dataSource = 9;</code>
   */
  com.google.protobuf.ByteString
      getDataSourceBytes();

  /**
   * <code>.google.protobuf.UInt32Value callInParallel = 10;</code>
   */
  boolean hasCallInParallel();
  /**
   * <code>.google.protobuf.UInt32Value callInParallel = 10;</code>
   */
  com.google.protobuf.UInt32Value getCallInParallel();
  /**
   * <code>.google.protobuf.UInt32Value callInParallel = 10;</code>
   */
  com.google.protobuf.UInt32ValueOrBuilder getCallInParallelOrBuilder();

  /**
   * <code>string rollbackInfo = 11;</code>
   */
  java.lang.String getRollbackInfo();
  /**
   * <code>string rollbackInfo = 11;</code>
   */
  com.google.protobuf.ByteString
      getRollbackInfoBytes();

  /**
   * <code>string transType = 12;</code>
   */
  java.lang.String getTransType();
  /**
   * <code>string transType = 12;</code>
   */
  com.google.protobuf.ByteString
      getTransTypeBytes();

  /**
   * <code>string callMode = 13;</code>
   */
  java.lang.String getCallMode();
  /**
   * <code>string callMode = 13;</code>
   */
  com.google.protobuf.ByteString
      getCallModeBytes();

  /**
   * <code>repeated .GlobalTransRequest.BranchTransDetail branchTransDetails = 14;</code>
   */
  java.util.List<com.ops.sc.rpc.dto.GlobalTransRequest.BranchTransDetail> 
      getBranchTransDetailsList();
  /**
   * <code>repeated .GlobalTransRequest.BranchTransDetail branchTransDetails = 14;</code>
   */
  com.ops.sc.rpc.dto.GlobalTransRequest.BranchTransDetail getBranchTransDetails(int index);
  /**
   * <code>repeated .GlobalTransRequest.BranchTransDetail branchTransDetails = 14;</code>
   */
  int getBranchTransDetailsCount();
  /**
   * <code>repeated .GlobalTransRequest.BranchTransDetail branchTransDetails = 14;</code>
   */
  java.util.List<? extends com.ops.sc.rpc.dto.GlobalTransRequest.BranchTransDetailOrBuilder> 
      getBranchTransDetailsOrBuilderList();
  /**
   * <code>repeated .GlobalTransRequest.BranchTransDetail branchTransDetails = 14;</code>
   */
  com.ops.sc.rpc.dto.GlobalTransRequest.BranchTransDetailOrBuilder getBranchTransDetailsOrBuilder(
      int index);
}

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msgTransmitBody.proto

package com.ops.sc.rpc.dto;

public interface TransMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TransMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string requestId = 1;</code>
   */
  java.lang.String getRequestId();
  /**
   * <code>string requestId = 1;</code>
   */
  com.google.protobuf.ByteString
      getRequestIdBytes();

  /**
   * <pre>
   * 全局事务ID
   * </pre>
   *
   * <code>string tid = 2;</code>
   */
  java.lang.String getTid();
  /**
   * <pre>
   * 全局事务ID
   * </pre>
   *
   * <code>string tid = 2;</code>
   */
  com.google.protobuf.ByteString
      getTidBytes();

  /**
   * <pre>
   *交易码
   * </pre>
   *
   * <code>string transCode = 3;</code>
   */
  java.lang.String getTransCode();
  /**
   * <pre>
   *交易码
   * </pre>
   *
   * <code>string transCode = 3;</code>
   */
  com.google.protobuf.ByteString
      getTransCodeBytes();

  /**
   * <pre>
   *交易名
   * </pre>
   *
   * <code>string transName = 4;</code>
   */
  java.lang.String getTransName();
  /**
   * <pre>
   *交易名
   * </pre>
   *
   * <code>string transName = 4;</code>
   */
  com.google.protobuf.ByteString
      getTransNameBytes();

  /**
   * <pre>
   *交易类型
   * </pre>
   *
   * <code>string transType = 5;</code>
   */
  java.lang.String getTransType();
  /**
   * <pre>
   *交易类型
   * </pre>
   *
   * <code>string transType = 5;</code>
   */
  com.google.protobuf.ByteString
      getTransTypeBytes();

  /**
   * <code>string msgTime = 6;</code>
   */
  java.lang.String getMsgTime();
  /**
   * <code>string msgTime = 6;</code>
   */
  com.google.protobuf.ByteString
      getMsgTimeBytes();

  /**
   * <pre>
   *多租户
   * </pre>
   *
   * <code>string multiTenancyId = 7;</code>
   */
  java.lang.String getMultiTenancyId();
  /**
   * <pre>
   *多租户
   * </pre>
   *
   * <code>string multiTenancyId = 7;</code>
   */
  com.google.protobuf.ByteString
      getMultiTenancyIdBytes();

  /**
   * <pre>
   * 调用方本机ip
   * </pre>
   *
   * <code>string callerIp = 8;</code>
   */
  java.lang.String getCallerIp();
  /**
   * <pre>
   * 调用方本机ip
   * </pre>
   *
   * <code>string callerIp = 8;</code>
   */
  com.google.protobuf.ByteString
      getCallerIpBytes();

  /**
   * <pre>
   * 事务消息体(json)
   * </pre>
   *
   * <code>string msgBody = 9;</code>
   */
  java.lang.String getMsgBody();
  /**
   * <pre>
   * 事务消息体(json)
   * </pre>
   *
   * <code>string msgBody = 9;</code>
   */
  com.google.protobuf.ByteString
      getMsgBodyBytes();

  /**
   * <pre>
   * 统一JSON格式如{"exchange":xxx,"bindKey":xxx}，每次发送时用户指定
   * </pre>
   *
   * <code>string extension = 10;</code>
   */
  java.lang.String getExtension();
  /**
   * <pre>
   * 统一JSON格式如{"exchange":xxx,"bindKey":xxx}，每次发送时用户指定
   * </pre>
   *
   * <code>string extension = 10;</code>
   */
  com.google.protobuf.ByteString
      getExtensionBytes();

  /**
   * <pre>
   * 应用名称
   * </pre>
   *
   * <code>string appName = 11;</code>
   */
  java.lang.String getAppName();
  /**
   * <pre>
   * 应用名称
   * </pre>
   *
   * <code>string appName = 11;</code>
   */
  com.google.protobuf.ByteString
      getAppNameBytes();
}

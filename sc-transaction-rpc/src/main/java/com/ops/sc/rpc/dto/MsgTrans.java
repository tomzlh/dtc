// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msgTrans.proto

package com.ops.sc.rpc.dto;

public final class MsgTrans {
  private MsgTrans() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegTransMsgRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegTransMsgRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RegTransMsgResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RegTransMsgResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MQProducerRegRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MQProducerRegRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MQProducerRegResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MQProducerRegResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016msgTrans.proto\032\024parentResponse.proto\032\036" +
      "google/protobuf/wrappers.proto\"\307\001\n\022RegTr" +
      "ansMsgRequest\022\021\n\trequestId\030\001 \001(\t\022\013\n\003tid\030" +
      "\002 \001(\t\022\020\n\010parentId\030\003 \001(\t\022\020\n\010callerIp\030\004 \001(" +
      "\t\022\017\n\007msgBody\030\005 \001(\t\022\025\n\rextensionData\030\006 \001(" +
      "\t\022\022\n\nproducerId\030\007 \001(\t\022\017\n\007appName\030\010 \001(\t\022 " +
      "\n\030supportNativeTransaction\030\t \001(\010\"N\n\023RegT" +
      "ransMsgResponse\022%\n\014baseResponse\030\001 \001(\0132\017." +
      "ParentResponse\022\020\n\010branchId\030\002 \001(\t\"e\n\024MQPr" +
      "oducerRegRequest\022\021\n\trequestId\030\001 \001(\t\022*\n\004t" +
      "ype\030\002 \001(\0132\034.google.protobuf.UInt32Value\022" +
      "\016\n\006config\030\003 \001(\t\"R\n\025MQProducerRegResponse" +
      "\022%\n\014baseResponse\030\001 \001(\0132\017.ParentResponse\022" +
      "\022\n\nproducerId\030\002 \001(\tB\035\n\022com.ops.sc.rpc.dt" +
      "oP\001\242\002\004HLWSb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.ops.sc.rpc.dto.ParentResponseOuterClass.getDescriptor(),
          com.google.protobuf.WrappersProto.getDescriptor(),
        }, assigner);
    internal_static_RegTransMsgRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RegTransMsgRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegTransMsgRequest_descriptor,
        new java.lang.String[] { "RequestId", "Tid", "ParentId", "CallerIp", "MsgBody", "ExtensionData", "ProducerId", "AppName", "SupportNativeTransaction", });
    internal_static_RegTransMsgResponse_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_RegTransMsgResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RegTransMsgResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "BranchId", });
    internal_static_MQProducerRegRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_MQProducerRegRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MQProducerRegRequest_descriptor,
        new java.lang.String[] { "RequestId", "Type", "Config", });
    internal_static_MQProducerRegResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_MQProducerRegResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MQProducerRegResponse_descriptor,
        new java.lang.String[] { "BaseResponse", "ProducerId", });
    com.ops.sc.rpc.dto.ParentResponseOuterClass.getDescriptor();
    com.google.protobuf.WrappersProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

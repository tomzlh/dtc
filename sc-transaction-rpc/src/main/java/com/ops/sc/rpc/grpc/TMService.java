// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: transLifeManager.proto

package com.ops.sc.rpc.grpc;

public final class TMService {
  private TMService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026transLifeManager.proto\032\023branchRequest." +
      "proto\032\023globalRequest.proto\032\016msgTrans.pro" +
      "to\032\022stateService.proto\032\027transQueryReques" +
      "t.proto\032\036transCompensationRequest.proto2" +
      "\302\005\n\022TransactionManager\022?\n\020startBranchTra" +
      "ns\022\023.BranchTransRequest\032\024.BranchTransRes" +
      "ponse\"\000\022?\n\020startGlobalTrans\022\023.GlobalTran" +
      "sRequest\032\024.GlobalTransResponse\"\000\022K\n\024star" +
      "tSagaGlobalTrans\022\027.GlobalSagaTransReques" +
      "t\032\030.GlobalSagaTransResponse\"\000\022R\n\023rollbac" +
      "kGlobalTrans\022\033.GlobalTransRollbackReques" +
      "t\032\034.GlobalTransRollbackResponse\"\000\022:\n\013reg" +
      "TransMsg\022\023.RegTransMsgRequest\032\024.RegTrans" +
      "MsgResponse\"\000\022C\n\020registerProducer\022\025.MQPr" +
      "oducerRegRequest\032\026.MQProducerRegResponse" +
      "\"\000\022;\n\nstateCheck\022\024.StateServiceRequest\032\025" +
      ".StateServiceResponse\"\000\022<\n\017findGlobalTra" +
      "ns\022\022.TransQueryRequest\032\023.TransQueryRespo" +
      "nse\"\000\022A\n\022executeBranchTrans\022\023.BranchTran" +
      "sRequest\032\024.BranchTransResponse\"\000\022J\n\017comp" +
      "ensateTrans\022\031.TransCompensationRequest\032\032" +
      ".TransCompensationResponse\"\000B,\n\023com.ops." +
      "sc.rpc.grpcB\tTMServiceP\001\210\001\001\242\002\004HLWSb\006prot" +
      "o3"
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
          com.ops.sc.rpc.dto.BranchRequest.getDescriptor(),
          com.ops.sc.rpc.dto.GlobalRequest.getDescriptor(),
          com.ops.sc.rpc.dto.MsgTrans.getDescriptor(),
          com.ops.sc.rpc.dto.StateService.getDescriptor(),
          com.ops.sc.rpc.dto.TransQueryRequestOuterClass.getDescriptor(),
          com.ops.sc.rpc.dto.TransCompensationRequestOuterClass.getDescriptor(),
        }, assigner);
    com.ops.sc.rpc.dto.BranchRequest.getDescriptor();
    com.ops.sc.rpc.dto.GlobalRequest.getDescriptor();
    com.ops.sc.rpc.dto.MsgTrans.getDescriptor();
    com.ops.sc.rpc.dto.StateService.getDescriptor();
    com.ops.sc.rpc.dto.TransQueryRequestOuterClass.getDescriptor();
    com.ops.sc.rpc.dto.TransCompensationRequestOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}

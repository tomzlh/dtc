// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: msgTransmitService.proto

package com.ops.sc.rpc.grpc;

public final class TransmitService {
  private TransmitService() {}
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
      "\n\030msgTransmitService.proto\032\025msgTransmitB" +
      "ody.proto\032\022stateService.proto2\210\001\n\024TransT" +
      "ransmitService\0223\n\020transmitTransMsg\022\r.Tra" +
      "nsMessage\032\016.TransResponse\"\000\022;\n\nstateChec" +
      "k\022\024.StateServiceRequest\032\025.StateServiceRe" +
      "sponse\"\000B2\n\023com.ops.sc.rpc.grpcB\017Transmi" +
      "tServiceP\001\210\001\001\242\002\004HLWSb\006proto3"
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
          com.ops.sc.rpc.dto.MsgTransmitBody.getDescriptor(),
          com.ops.sc.rpc.dto.StateService.getDescriptor(),
        }, assigner);
    com.ops.sc.rpc.dto.MsgTransmitBody.getDescriptor();
    com.ops.sc.rpc.dto.StateService.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/key_value_master.proto

package alluxio.grpc;

public interface CompleteStorePRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.keyvalue.CompleteStorePRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string path = 1;</code>
   */
  boolean hasPath();
  /**
   * <code>optional string path = 1;</code>
   */
  java.lang.String getPath();
  /**
   * <code>optional string path = 1;</code>
   */
  com.google.protobuf.ByteString
      getPathBytes();

  /**
   * <code>optional .alluxio.grpc.keyvalue.CompleteStorePOptions options = 2;</code>
   */
  boolean hasOptions();
  /**
   * <code>optional .alluxio.grpc.keyvalue.CompleteStorePOptions options = 2;</code>
   */
  alluxio.grpc.CompleteStorePOptions getOptions();
  /**
   * <code>optional .alluxio.grpc.keyvalue.CompleteStorePOptions options = 2;</code>
   */
  alluxio.grpc.CompleteStorePOptionsOrBuilder getOptionsOrBuilder();
}
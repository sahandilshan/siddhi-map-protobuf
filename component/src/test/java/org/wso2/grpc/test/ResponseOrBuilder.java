// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package org.wso2.grpc.test;

public interface ResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Response)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string StringValue = 1;</code>
   */
  String getStringValue();
  /**
   * <code>string StringValue = 1;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>int32 intValue = 2;</code>
   */
  int getIntValue();

  /**
   * <code>int64 LongValue = 3;</code>
   */
  long getLongValue();

  /**
   * <code>bool booleanValue = 4;</code>
   */
  boolean getBooleanValue();

  /**
   * <code>float floatValue = 5;</code>
   */
  float getFloatValue();

  /**
   * <code>double doubleValue = 6;</code>
   */
  double getDoubleValue();
}
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sample.proto

package io.siddhi.extension.map.protobuf.autogenerated;

public interface NestedMessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:NestedMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string stringValue = 1;</code>
   */
  String getStringValue();
  /**
   * <code>string stringValue = 1;</code>
   */
  com.google.protobuf.ByteString
      getStringValueBytes();

  /**
   * <code>int32 intValue = 2;</code>
   */
  int getIntValue();

  /**
   * <code>.NestedMessage.Inner innerObject = 3;</code>
   */
  boolean hasInnerObject();
  /**
   * <code>.NestedMessage.Inner innerObject = 3;</code>
   */
  io.siddhi.extension.map.protobuf.autogenerated.NestedMessage.Inner getInnerObject();
  /**
   * <code>.NestedMessage.Inner innerObject = 3;</code>
   */
  io.siddhi.extension.map.protobuf.autogenerated.NestedMessage.InnerOrBuilder getInnerObjectOrBuilder();

  /**
   * <code>repeated .NestedMessage.Inner innerList = 4;</code>
   */
  java.util.List<NestedMessage.Inner>
      getInnerListList();
  /**
   * <code>repeated .NestedMessage.Inner innerList = 4;</code>
   */
  io.siddhi.extension.map.protobuf.autogenerated.NestedMessage.Inner getInnerList(int index);
  /**
   * <code>repeated .NestedMessage.Inner innerList = 4;</code>
   */
  int getInnerListCount();
  /**
   * <code>repeated .NestedMessage.Inner innerList = 4;</code>
   */
  java.util.List<? extends NestedMessage.InnerOrBuilder>
      getInnerListOrBuilderList();
  /**
   * <code>repeated .NestedMessage.Inner innerList = 4;</code>
   */
  io.siddhi.extension.map.protobuf.autogenerated.NestedMessage.InnerOrBuilder getInnerListOrBuilder(
          int index);
}

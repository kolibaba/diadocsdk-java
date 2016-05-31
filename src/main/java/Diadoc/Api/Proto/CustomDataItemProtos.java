// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CustomDataItem.proto

package Diadoc.Api.Proto;

public final class CustomDataItemProtos {
  private CustomDataItemProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CustomDataItemOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // required string Key = 1;
    boolean hasKey();
    String getKey();
    
    // optional string Value = 2;
    boolean hasValue();
    String getValue();
  }
  public static final class CustomDataItem extends
      com.google.protobuf.GeneratedMessage
      implements CustomDataItemOrBuilder {
    // Use CustomDataItem.newBuilder() to construct.
    private CustomDataItem(Builder builder) {
      super(builder);
    }
    private CustomDataItem(boolean noInit) {}
    
    private static final CustomDataItem defaultInstance;
    public static CustomDataItem getDefaultInstance() {
      return defaultInstance;
    }
    
    public CustomDataItem getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.CustomDataItemProtos.internal_static_Diadoc_Api_Proto_CustomDataItem_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.CustomDataItemProtos.internal_static_Diadoc_Api_Proto_CustomDataItem_fieldAccessorTable;
    }
    
    private int bitField0_;
    // required string Key = 1;
    public static final int KEY_FIELD_NUMBER = 1;
    private java.lang.Object key_;
    public boolean hasKey() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getKey() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          key_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string Value = 2;
    public static final int VALUE_FIELD_NUMBER = 2;
    private java.lang.Object value_;
    public boolean hasValue() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getValue() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          value_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getValueBytes() {
      java.lang.Object ref = value_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        value_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    private void initFields() {
      key_ = "";
      value_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      if (!hasKey()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getValueBytes());
      }
      getUnknownFields().writeTo(output);
    }
    
    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;
    
      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(1, getKeyBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getValueBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }
    
    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }
    
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input, extensionRegistry)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }
    
    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder>
       implements Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItemOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.CustomDataItemProtos.internal_static_Diadoc_Api_Proto_CustomDataItem_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.CustomDataItemProtos.internal_static_Diadoc_Api_Proto_CustomDataItem_fieldAccessorTable;
      }
      
      // Construct using Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        key_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        value_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem.getDescriptor();
      }
      
      public Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem getDefaultInstanceForType() {
        return Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem.getDefaultInstance();
      }
      
      public Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem build() {
        Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem buildPartial() {
        Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem result = new Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.key_ = key_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.value_ = value_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem) {
          return mergeFrom((Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem other) {
        if (other == Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem.getDefaultInstance()) return this;
        if (other.hasKey()) {
          setKey(other.getKey());
        }
        if (other.hasValue()) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
        if (!hasKey()) {
          
          return false;
        }
        return true;
      }
      
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder(
            this.getUnknownFields());
        while (true) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              this.setUnknownFields(unknownFields.build());
              onChanged();
              return this;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                this.setUnknownFields(unknownFields.build());
                onChanged();
                return this;
              }
              break;
            }
            case 10: {
              bitField0_ |= 0x00000001;
              key_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              value_ = input.readBytes();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // required string Key = 1;
      private java.lang.Object key_ = "";
      public boolean hasKey() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getKey() {
        java.lang.Object ref = key_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          key_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setKey(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
        return this;
      }
      public Builder clearKey() {
        bitField0_ = (bitField0_ & ~0x00000001);
        key_ = getDefaultInstance().getKey();
        onChanged();
        return this;
      }
      void setKey(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        key_ = value;
        onChanged();
      }
      
      // optional string Value = 2;
      private java.lang.Object value_ = "";
      public boolean hasValue() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getValue() {
        java.lang.Object ref = value_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          value_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setValue(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
        return this;
      }
      public Builder clearValue() {
        bitField0_ = (bitField0_ & ~0x00000002);
        value_ = getDefaultInstance().getValue();
        onChanged();
        return this;
      }
      void setValue(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        value_ = value;
        onChanged();
      }
      
      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.CustomDataItem)
    }
    
    static {
      defaultInstance = new CustomDataItem(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.CustomDataItem)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_CustomDataItem_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_CustomDataItem_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024CustomDataItem.proto\022\020Diadoc.Api.Proto" +
      "\",\n\016CustomDataItem\022\013\n\003Key\030\001 \002(\t\022\r\n\005Value" +
      "\030\002 \001(\tB\026B\024CustomDataItemProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Diadoc_Api_Proto_CustomDataItem_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Diadoc_Api_Proto_CustomDataItem_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Diadoc_Api_Proto_CustomDataItem_descriptor,
              new java.lang.String[] { "Key", "Value", },
              Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem.class,
              Diadoc.Api.Proto.CustomDataItemProtos.CustomDataItem.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}

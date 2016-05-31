// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CertificateInfo.proto

package Diadoc.Api.Proto;

public final class CertificateInfoProtos {
  private CertificateInfoProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface CertificateInfoOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string Thumbprint = 1;
    boolean hasThumbprint();
    String getThumbprint();
    
    // optional sfixed64 ValidFrom = 2;
    boolean hasValidFrom();
    long getValidFrom();
    
    // optional sfixed64 ValidTo = 3;
    boolean hasValidTo();
    long getValidTo();
  }
  public static final class CertificateInfo extends
      com.google.protobuf.GeneratedMessage
      implements CertificateInfoOrBuilder {
    // Use CertificateInfo.newBuilder() to construct.
    private CertificateInfo(Builder builder) {
      super(builder);
    }
    private CertificateInfo(boolean noInit) {}
    
    private static final CertificateInfo defaultInstance;
    public static CertificateInfo getDefaultInstance() {
      return defaultInstance;
    }
    
    public CertificateInfo getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.CertificateInfoProtos.internal_static_Diadoc_Api_Proto_CertificateInfo_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.CertificateInfoProtos.internal_static_Diadoc_Api_Proto_CertificateInfo_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string Thumbprint = 1;
    public static final int THUMBPRINT_FIELD_NUMBER = 1;
    private java.lang.Object thumbprint_;
    public boolean hasThumbprint() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getThumbprint() {
      java.lang.Object ref = thumbprint_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          thumbprint_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getThumbprintBytes() {
      java.lang.Object ref = thumbprint_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        thumbprint_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional sfixed64 ValidFrom = 2;
    public static final int VALIDFROM_FIELD_NUMBER = 2;
    private long validFrom_;
    public boolean hasValidFrom() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public long getValidFrom() {
      return validFrom_;
    }
    
    // optional sfixed64 ValidTo = 3;
    public static final int VALIDTO_FIELD_NUMBER = 3;
    private long validTo_;
    public boolean hasValidTo() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public long getValidTo() {
      return validTo_;
    }
    
    private void initFields() {
      thumbprint_ = "";
      validFrom_ = 0L;
      validTo_ = 0L;
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized != -1) return isInitialized == 1;
      
      memoizedIsInitialized = 1;
      return true;
    }
    
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeBytes(1, getThumbprintBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeSFixed64(2, validFrom_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeSFixed64(3, validTo_);
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
          .computeBytesSize(1, getThumbprintBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed64Size(2, validFrom_);
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeSFixed64Size(3, validTo_);
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
    
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseDelimitedFrom(
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
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo prototype) {
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
       implements Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.CertificateInfoProtos.internal_static_Diadoc_Api_Proto_CertificateInfo_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.CertificateInfoProtos.internal_static_Diadoc_Api_Proto_CertificateInfo_fieldAccessorTable;
      }
      
      // Construct using Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.newBuilder()
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
        thumbprint_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        validFrom_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000002);
        validTo_ = 0L;
        bitField0_ = (bitField0_ & ~0x00000004);
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.getDescriptor();
      }
      
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo getDefaultInstanceForType() {
        return Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.getDefaultInstance();
      }
      
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo build() {
        Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo buildPartial() {
        Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo result = new Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.thumbprint_ = thumbprint_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.validFrom_ = validFrom_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.validTo_ = validTo_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo) {
          return mergeFrom((Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo other) {
        if (other == Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.getDefaultInstance()) return this;
        if (other.hasThumbprint()) {
          setThumbprint(other.getThumbprint());
        }
        if (other.hasValidFrom()) {
          setValidFrom(other.getValidFrom());
        }
        if (other.hasValidTo()) {
          setValidTo(other.getValidTo());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }
      
      public final boolean isInitialized() {
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
              thumbprint_ = input.readBytes();
              break;
            }
            case 17: {
              bitField0_ |= 0x00000002;
              validFrom_ = input.readSFixed64();
              break;
            }
            case 25: {
              bitField0_ |= 0x00000004;
              validTo_ = input.readSFixed64();
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string Thumbprint = 1;
      private java.lang.Object thumbprint_ = "";
      public boolean hasThumbprint() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getThumbprint() {
        java.lang.Object ref = thumbprint_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          thumbprint_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setThumbprint(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        thumbprint_ = value;
        onChanged();
        return this;
      }
      public Builder clearThumbprint() {
        bitField0_ = (bitField0_ & ~0x00000001);
        thumbprint_ = getDefaultInstance().getThumbprint();
        onChanged();
        return this;
      }
      void setThumbprint(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        thumbprint_ = value;
        onChanged();
      }
      
      // optional sfixed64 ValidFrom = 2;
      private long validFrom_ ;
      public boolean hasValidFrom() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public long getValidFrom() {
        return validFrom_;
      }
      public Builder setValidFrom(long value) {
        bitField0_ |= 0x00000002;
        validFrom_ = value;
        onChanged();
        return this;
      }
      public Builder clearValidFrom() {
        bitField0_ = (bitField0_ & ~0x00000002);
        validFrom_ = 0L;
        onChanged();
        return this;
      }
      
      // optional sfixed64 ValidTo = 3;
      private long validTo_ ;
      public boolean hasValidTo() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public long getValidTo() {
        return validTo_;
      }
      public Builder setValidTo(long value) {
        bitField0_ |= 0x00000004;
        validTo_ = value;
        onChanged();
        return this;
      }
      public Builder clearValidTo() {
        bitField0_ = (bitField0_ & ~0x00000004);
        validTo_ = 0L;
        onChanged();
        return this;
      }
      
      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.CertificateInfo)
    }
    
    static {
      defaultInstance = new CertificateInfo(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.CertificateInfo)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_CertificateInfo_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_CertificateInfo_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025CertificateInfo.proto\022\020Diadoc.Api.Prot" +
      "o\"I\n\017CertificateInfo\022\022\n\nThumbprint\030\001 \001(\t" +
      "\022\021\n\tValidFrom\030\002 \001(\020\022\017\n\007ValidTo\030\003 \001(\020B\027B\025" +
      "CertificateInfoProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Diadoc_Api_Proto_CertificateInfo_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Diadoc_Api_Proto_CertificateInfo_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Diadoc_Api_Proto_CertificateInfo_descriptor,
              new java.lang.String[] { "Thumbprint", "ValidFrom", "ValidTo", },
              Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.class,
              Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder.class);
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

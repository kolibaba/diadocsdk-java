// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: User.proto

package Diadoc.Api.Proto;

public final class UserProtos {
  private UserProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface UserOrBuilder
      extends com.google.protobuf.MessageOrBuilder {
    
    // optional string Id = 1;
    boolean hasId();
    String getId();
    
    // optional string LastName = 2;
    boolean hasLastName();
    String getLastName();
    
    // optional string FirstName = 3;
    boolean hasFirstName();
    String getFirstName();
    
    // optional string MiddleName = 4;
    boolean hasMiddleName();
    String getMiddleName();
    
    // repeated .Diadoc.Api.Proto.CertificateInfo CloudCertificates = 5;
    java.util.List<Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo> 
        getCloudCertificatesList();
    Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo getCloudCertificates(int index);
    int getCloudCertificatesCount();
    java.util.List<? extends Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder> 
        getCloudCertificatesOrBuilderList();
    Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder getCloudCertificatesOrBuilder(
        int index);
  }
  public static final class User extends
      com.google.protobuf.GeneratedMessage
      implements UserOrBuilder {
    // Use User.newBuilder() to construct.
    private User(Builder builder) {
      super(builder);
    }
    private User(boolean noInit) {}
    
    private static final User defaultInstance;
    public static User getDefaultInstance() {
      return defaultInstance;
    }
    
    public User getDefaultInstanceForType() {
      return defaultInstance;
    }
    
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return Diadoc.Api.Proto.UserProtos.internal_static_Diadoc_Api_Proto_User_descriptor;
    }
    
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return Diadoc.Api.Proto.UserProtos.internal_static_Diadoc_Api_Proto_User_fieldAccessorTable;
    }
    
    private int bitField0_;
    // optional string Id = 1;
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.Object id_;
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    public String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          id_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string LastName = 2;
    public static final int LASTNAME_FIELD_NUMBER = 2;
    private java.lang.Object lastName_;
    public boolean hasLastName() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    public String getLastName() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          lastName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getLastNameBytes() {
      java.lang.Object ref = lastName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        lastName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string FirstName = 3;
    public static final int FIRSTNAME_FIELD_NUMBER = 3;
    private java.lang.Object firstName_;
    public boolean hasFirstName() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    public String getFirstName() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          firstName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getFirstNameBytes() {
      java.lang.Object ref = firstName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        firstName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // optional string MiddleName = 4;
    public static final int MIDDLENAME_FIELD_NUMBER = 4;
    private java.lang.Object middleName_;
    public boolean hasMiddleName() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    public String getMiddleName() {
      java.lang.Object ref = middleName_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        if (com.google.protobuf.Internal.isValidUtf8(bs)) {
          middleName_ = s;
        }
        return s;
      }
    }
    private com.google.protobuf.ByteString getMiddleNameBytes() {
      java.lang.Object ref = middleName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8((String) ref);
        middleName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    
    // repeated .Diadoc.Api.Proto.CertificateInfo CloudCertificates = 5;
    public static final int CLOUDCERTIFICATES_FIELD_NUMBER = 5;
    private java.util.List<Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo> cloudCertificates_;
    public java.util.List<Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo> getCloudCertificatesList() {
      return cloudCertificates_;
    }
    public java.util.List<? extends Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder> 
        getCloudCertificatesOrBuilderList() {
      return cloudCertificates_;
    }
    public int getCloudCertificatesCount() {
      return cloudCertificates_.size();
    }
    public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo getCloudCertificates(int index) {
      return cloudCertificates_.get(index);
    }
    public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder getCloudCertificatesOrBuilder(
        int index) {
      return cloudCertificates_.get(index);
    }
    
    private void initFields() {
      id_ = "";
      lastName_ = "";
      firstName_ = "";
      middleName_ = "";
      cloudCertificates_ = java.util.Collections.emptyList();
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
        output.writeBytes(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getLastNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getMiddleNameBytes());
      }
      for (int i = 0; i < cloudCertificates_.size(); i++) {
        output.writeMessage(5, cloudCertificates_.get(i));
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
          .computeBytesSize(1, getIdBytes());
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getLastNameBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getFirstNameBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getMiddleNameBytes());
      }
      for (int i = 0; i < cloudCertificates_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, cloudCertificates_.get(i));
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
    
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data).buildParsed();
    }
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return newBuilder().mergeFrom(data, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    public static Diadoc.Api.Proto.UserProtos.User parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      Builder builder = newBuilder();
      if (builder.mergeDelimitedFrom(input)) {
        return builder.buildParsed();
      } else {
        return null;
      }
    }
    public static Diadoc.Api.Proto.UserProtos.User parseDelimitedFrom(
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
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input).buildParsed();
    }
    public static Diadoc.Api.Proto.UserProtos.User parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return newBuilder().mergeFrom(input, extensionRegistry)
               .buildParsed();
    }
    
    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(Diadoc.Api.Proto.UserProtos.User prototype) {
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
       implements Diadoc.Api.Proto.UserProtos.UserOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return Diadoc.Api.Proto.UserProtos.internal_static_Diadoc_Api_Proto_User_descriptor;
      }
      
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return Diadoc.Api.Proto.UserProtos.internal_static_Diadoc_Api_Proto_User_fieldAccessorTable;
      }
      
      // Construct using Diadoc.Api.Proto.UserProtos.User.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }
      
      private Builder(BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
          getCloudCertificatesFieldBuilder();
        }
      }
      private static Builder create() {
        return new Builder();
      }
      
      public Builder clear() {
        super.clear();
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        lastName_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        firstName_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        middleName_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        if (cloudCertificatesBuilder_ == null) {
          cloudCertificates_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
        } else {
          cloudCertificatesBuilder_.clear();
        }
        return this;
      }
      
      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }
      
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return Diadoc.Api.Proto.UserProtos.User.getDescriptor();
      }
      
      public Diadoc.Api.Proto.UserProtos.User getDefaultInstanceForType() {
        return Diadoc.Api.Proto.UserProtos.User.getDefaultInstance();
      }
      
      public Diadoc.Api.Proto.UserProtos.User build() {
        Diadoc.Api.Proto.UserProtos.User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }
      
      private Diadoc.Api.Proto.UserProtos.User buildParsed()
          throws com.google.protobuf.InvalidProtocolBufferException {
        Diadoc.Api.Proto.UserProtos.User result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(
            result).asInvalidProtocolBufferException();
        }
        return result;
      }
      
      public Diadoc.Api.Proto.UserProtos.User buildPartial() {
        Diadoc.Api.Proto.UserProtos.User result = new Diadoc.Api.Proto.UserProtos.User(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.lastName_ = lastName_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.firstName_ = firstName_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.middleName_ = middleName_;
        if (cloudCertificatesBuilder_ == null) {
          if (((bitField0_ & 0x00000010) == 0x00000010)) {
            cloudCertificates_ = java.util.Collections.unmodifiableList(cloudCertificates_);
            bitField0_ = (bitField0_ & ~0x00000010);
          }
          result.cloudCertificates_ = cloudCertificates_;
        } else {
          result.cloudCertificates_ = cloudCertificatesBuilder_.build();
        }
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }
      
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof Diadoc.Api.Proto.UserProtos.User) {
          return mergeFrom((Diadoc.Api.Proto.UserProtos.User)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }
      
      public Builder mergeFrom(Diadoc.Api.Proto.UserProtos.User other) {
        if (other == Diadoc.Api.Proto.UserProtos.User.getDefaultInstance()) return this;
        if (other.hasId()) {
          setId(other.getId());
        }
        if (other.hasLastName()) {
          setLastName(other.getLastName());
        }
        if (other.hasFirstName()) {
          setFirstName(other.getFirstName());
        }
        if (other.hasMiddleName()) {
          setMiddleName(other.getMiddleName());
        }
        if (cloudCertificatesBuilder_ == null) {
          if (!other.cloudCertificates_.isEmpty()) {
            if (cloudCertificates_.isEmpty()) {
              cloudCertificates_ = other.cloudCertificates_;
              bitField0_ = (bitField0_ & ~0x00000010);
            } else {
              ensureCloudCertificatesIsMutable();
              cloudCertificates_.addAll(other.cloudCertificates_);
            }
            onChanged();
          }
        } else {
          if (!other.cloudCertificates_.isEmpty()) {
            if (cloudCertificatesBuilder_.isEmpty()) {
              cloudCertificatesBuilder_.dispose();
              cloudCertificatesBuilder_ = null;
              cloudCertificates_ = other.cloudCertificates_;
              bitField0_ = (bitField0_ & ~0x00000010);
              cloudCertificatesBuilder_ = 
                com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                   getCloudCertificatesFieldBuilder() : null;
            } else {
              cloudCertificatesBuilder_.addAllMessages(other.cloudCertificates_);
            }
          }
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
              id_ = input.readBytes();
              break;
            }
            case 18: {
              bitField0_ |= 0x00000002;
              lastName_ = input.readBytes();
              break;
            }
            case 26: {
              bitField0_ |= 0x00000004;
              firstName_ = input.readBytes();
              break;
            }
            case 34: {
              bitField0_ |= 0x00000008;
              middleName_ = input.readBytes();
              break;
            }
            case 42: {
              Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder subBuilder = Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.newBuilder();
              input.readMessage(subBuilder, extensionRegistry);
              addCloudCertificates(subBuilder.buildPartial());
              break;
            }
          }
        }
      }
      
      private int bitField0_;
      
      // optional string Id = 1;
      private java.lang.Object id_ = "";
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      public String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          id_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setId(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      void setId(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
      }
      
      // optional string LastName = 2;
      private java.lang.Object lastName_ = "";
      public boolean hasLastName() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      public String getLastName() {
        java.lang.Object ref = lastName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          lastName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setLastName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        lastName_ = value;
        onChanged();
        return this;
      }
      public Builder clearLastName() {
        bitField0_ = (bitField0_ & ~0x00000002);
        lastName_ = getDefaultInstance().getLastName();
        onChanged();
        return this;
      }
      void setLastName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000002;
        lastName_ = value;
        onChanged();
      }
      
      // optional string FirstName = 3;
      private java.lang.Object firstName_ = "";
      public boolean hasFirstName() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      public String getFirstName() {
        java.lang.Object ref = firstName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          firstName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setFirstName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        firstName_ = value;
        onChanged();
        return this;
      }
      public Builder clearFirstName() {
        bitField0_ = (bitField0_ & ~0x00000004);
        firstName_ = getDefaultInstance().getFirstName();
        onChanged();
        return this;
      }
      void setFirstName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000004;
        firstName_ = value;
        onChanged();
      }
      
      // optional string MiddleName = 4;
      private java.lang.Object middleName_ = "";
      public boolean hasMiddleName() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      public String getMiddleName() {
        java.lang.Object ref = middleName_;
        if (!(ref instanceof String)) {
          String s = ((com.google.protobuf.ByteString) ref).toStringUtf8();
          middleName_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      public Builder setMiddleName(String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        middleName_ = value;
        onChanged();
        return this;
      }
      public Builder clearMiddleName() {
        bitField0_ = (bitField0_ & ~0x00000008);
        middleName_ = getDefaultInstance().getMiddleName();
        onChanged();
        return this;
      }
      void setMiddleName(com.google.protobuf.ByteString value) {
        bitField0_ |= 0x00000008;
        middleName_ = value;
        onChanged();
      }
      
      // repeated .Diadoc.Api.Proto.CertificateInfo CloudCertificates = 5;
      private java.util.List<Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo> cloudCertificates_ =
        java.util.Collections.emptyList();
      private void ensureCloudCertificatesIsMutable() {
        if (!((bitField0_ & 0x00000010) == 0x00000010)) {
          cloudCertificates_ = new java.util.ArrayList<Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo>(cloudCertificates_);
          bitField0_ |= 0x00000010;
         }
      }
      
      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder> cloudCertificatesBuilder_;
      
      public java.util.List<Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo> getCloudCertificatesList() {
        if (cloudCertificatesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(cloudCertificates_);
        } else {
          return cloudCertificatesBuilder_.getMessageList();
        }
      }
      public int getCloudCertificatesCount() {
        if (cloudCertificatesBuilder_ == null) {
          return cloudCertificates_.size();
        } else {
          return cloudCertificatesBuilder_.getCount();
        }
      }
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo getCloudCertificates(int index) {
        if (cloudCertificatesBuilder_ == null) {
          return cloudCertificates_.get(index);
        } else {
          return cloudCertificatesBuilder_.getMessage(index);
        }
      }
      public Builder setCloudCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo value) {
        if (cloudCertificatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCloudCertificatesIsMutable();
          cloudCertificates_.set(index, value);
          onChanged();
        } else {
          cloudCertificatesBuilder_.setMessage(index, value);
        }
        return this;
      }
      public Builder setCloudCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder builderForValue) {
        if (cloudCertificatesBuilder_ == null) {
          ensureCloudCertificatesIsMutable();
          cloudCertificates_.set(index, builderForValue.build());
          onChanged();
        } else {
          cloudCertificatesBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addCloudCertificates(Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo value) {
        if (cloudCertificatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCloudCertificatesIsMutable();
          cloudCertificates_.add(value);
          onChanged();
        } else {
          cloudCertificatesBuilder_.addMessage(value);
        }
        return this;
      }
      public Builder addCloudCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo value) {
        if (cloudCertificatesBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureCloudCertificatesIsMutable();
          cloudCertificates_.add(index, value);
          onChanged();
        } else {
          cloudCertificatesBuilder_.addMessage(index, value);
        }
        return this;
      }
      public Builder addCloudCertificates(
          Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder builderForValue) {
        if (cloudCertificatesBuilder_ == null) {
          ensureCloudCertificatesIsMutable();
          cloudCertificates_.add(builderForValue.build());
          onChanged();
        } else {
          cloudCertificatesBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      public Builder addCloudCertificates(
          int index, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder builderForValue) {
        if (cloudCertificatesBuilder_ == null) {
          ensureCloudCertificatesIsMutable();
          cloudCertificates_.add(index, builderForValue.build());
          onChanged();
        } else {
          cloudCertificatesBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      public Builder addAllCloudCertificates(
          java.lang.Iterable<? extends Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo> values) {
        if (cloudCertificatesBuilder_ == null) {
          ensureCloudCertificatesIsMutable();
          super.addAll(values, cloudCertificates_);
          onChanged();
        } else {
          cloudCertificatesBuilder_.addAllMessages(values);
        }
        return this;
      }
      public Builder clearCloudCertificates() {
        if (cloudCertificatesBuilder_ == null) {
          cloudCertificates_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000010);
          onChanged();
        } else {
          cloudCertificatesBuilder_.clear();
        }
        return this;
      }
      public Builder removeCloudCertificates(int index) {
        if (cloudCertificatesBuilder_ == null) {
          ensureCloudCertificatesIsMutable();
          cloudCertificates_.remove(index);
          onChanged();
        } else {
          cloudCertificatesBuilder_.remove(index);
        }
        return this;
      }
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder getCloudCertificatesBuilder(
          int index) {
        return getCloudCertificatesFieldBuilder().getBuilder(index);
      }
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder getCloudCertificatesOrBuilder(
          int index) {
        if (cloudCertificatesBuilder_ == null) {
          return cloudCertificates_.get(index);  } else {
          return cloudCertificatesBuilder_.getMessageOrBuilder(index);
        }
      }
      public java.util.List<? extends Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder> 
           getCloudCertificatesOrBuilderList() {
        if (cloudCertificatesBuilder_ != null) {
          return cloudCertificatesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(cloudCertificates_);
        }
      }
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder addCloudCertificatesBuilder() {
        return getCloudCertificatesFieldBuilder().addBuilder(
            Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.getDefaultInstance());
      }
      public Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder addCloudCertificatesBuilder(
          int index) {
        return getCloudCertificatesFieldBuilder().addBuilder(
            index, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.getDefaultInstance());
      }
      public java.util.List<Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder> 
           getCloudCertificatesBuilderList() {
        return getCloudCertificatesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilder<
          Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder> 
          getCloudCertificatesFieldBuilder() {
        if (cloudCertificatesBuilder_ == null) {
          cloudCertificatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
              Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfo.Builder, Diadoc.Api.Proto.CertificateInfoProtos.CertificateInfoOrBuilder>(
                  cloudCertificates_,
                  ((bitField0_ & 0x00000010) == 0x00000010),
                  getParentForChildren(),
                  isClean());
          cloudCertificates_ = null;
        }
        return cloudCertificatesBuilder_;
      }
      
      // @@protoc_insertion_point(builder_scope:Diadoc.Api.Proto.User)
    }
    
    static {
      defaultInstance = new User(true);
      defaultInstance.initFields();
    }
    
    // @@protoc_insertion_point(class_scope:Diadoc.Api.Proto.User)
  }
  
  private static com.google.protobuf.Descriptors.Descriptor
    internal_static_Diadoc_Api_Proto_User_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Diadoc_Api_Proto_User_fieldAccessorTable;
  
  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\nUser.proto\022\020Diadoc.Api.Proto\032\025Certific" +
      "ateInfo.proto\"\211\001\n\004User\022\n\n\002Id\030\001 \001(\t\022\020\n\010La" +
      "stName\030\002 \001(\t\022\021\n\tFirstName\030\003 \001(\t\022\022\n\nMiddl" +
      "eName\030\004 \001(\t\022<\n\021CloudCertificates\030\005 \003(\0132!" +
      ".Diadoc.Api.Proto.CertificateInfoB\014B\nUse" +
      "rProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
      new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
        public com.google.protobuf.ExtensionRegistry assignDescriptors(
            com.google.protobuf.Descriptors.FileDescriptor root) {
          descriptor = root;
          internal_static_Diadoc_Api_Proto_User_descriptor =
            getDescriptor().getMessageTypes().get(0);
          internal_static_Diadoc_Api_Proto_User_fieldAccessorTable = new
            com.google.protobuf.GeneratedMessage.FieldAccessorTable(
              internal_static_Diadoc_Api_Proto_User_descriptor,
              new java.lang.String[] { "Id", "LastName", "FirstName", "MiddleName", "CloudCertificates", },
              Diadoc.Api.Proto.UserProtos.User.class,
              Diadoc.Api.Proto.UserProtos.User.Builder.class);
          return null;
        }
      };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          Diadoc.Api.Proto.CertificateInfoProtos.getDescriptor(),
        }, assigner);
  }
  
  // @@protoc_insertion_point(outer_class_scope)
}

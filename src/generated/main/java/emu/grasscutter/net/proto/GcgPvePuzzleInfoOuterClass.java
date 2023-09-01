// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GcgPvePuzzleInfo.proto

package emu.grasscutter.net.proto;

public final class GcgPvePuzzleInfoOuterClass {
  private GcgPvePuzzleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GcgPvePuzzleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GcgPvePuzzleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool HOGJFCLMMPC = 9;</code>
     * @return The hOGJFCLMMPC.
     */
    boolean getHOGJFCLMMPC();

    /**
     * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
     * @return A list containing the cPJEMFGLLKE.
     */
    java.util.List<java.lang.Integer> getCPJEMFGLLKEList();
    /**
     * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
     * @return The count of cPJEMFGLLKE.
     */
    int getCPJEMFGLLKECount();
    /**
     * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
     * @param index The index of the element to return.
     * @return The cPJEMFGLLKE at the given index.
     */
    int getCPJEMFGLLKE(int index);
  }
  /**
   * <pre>
   * Obf: NNBINJFKNAD
   * </pre>
   *
   * Protobuf type {@code GcgPvePuzzleInfo}
   */
  public static final class GcgPvePuzzleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GcgPvePuzzleInfo)
      GcgPvePuzzleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GcgPvePuzzleInfo.newBuilder() to construct.
    private GcgPvePuzzleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GcgPvePuzzleInfo() {
      cPJEMFGLLKE_ = emptyIntList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GcgPvePuzzleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GcgPvePuzzleInfo(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 72: {

              hOGJFCLMMPC_ = input.readBool();
              break;
            }
            case 88: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                cPJEMFGLLKE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              cPJEMFGLLKE_.addInt(input.readUInt32());
              break;
            }
            case 90: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              if (!((mutable_bitField0_ & 0x00000001) != 0) && input.getBytesUntilLimit() > 0) {
                cPJEMFGLLKE_ = newIntList();
                mutable_bitField0_ |= 0x00000001;
              }
              while (input.getBytesUntilLimit() > 0) {
                cPJEMFGLLKE_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          cPJEMFGLLKE_.makeImmutable(); // C
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.internal_static_GcgPvePuzzleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.internal_static_GcgPvePuzzleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo.class, emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo.Builder.class);
    }

    public static final int HOGJFCLMMPC_FIELD_NUMBER = 9;
    private boolean hOGJFCLMMPC_;
    /**
     * <code>bool HOGJFCLMMPC = 9;</code>
     * @return The hOGJFCLMMPC.
     */
    @java.lang.Override
    public boolean getHOGJFCLMMPC() {
      return hOGJFCLMMPC_;
    }

    public static final int CPJEMFGLLKE_FIELD_NUMBER = 11;
    private com.google.protobuf.Internal.IntList cPJEMFGLLKE_;
    /**
     * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
     * @return A list containing the cPJEMFGLLKE.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getCPJEMFGLLKEList() {
      return cPJEMFGLLKE_;
    }
    /**
     * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
     * @return The count of cPJEMFGLLKE.
     */
    public int getCPJEMFGLLKECount() {
      return cPJEMFGLLKE_.size();
    }
    /**
     * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
     * @param index The index of the element to return.
     * @return The cPJEMFGLLKE at the given index.
     */
    public int getCPJEMFGLLKE(int index) {
      return cPJEMFGLLKE_.getInt(index);
    }
    private int cPJEMFGLLKEMemoizedSerializedSize = -1;

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (hOGJFCLMMPC_ != false) {
        output.writeBool(9, hOGJFCLMMPC_);
      }
      if (getCPJEMFGLLKEList().size() > 0) {
        output.writeUInt32NoTag(90);
        output.writeUInt32NoTag(cPJEMFGLLKEMemoizedSerializedSize);
      }
      for (int i = 0; i < cPJEMFGLLKE_.size(); i++) {
        output.writeUInt32NoTag(cPJEMFGLLKE_.getInt(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (hOGJFCLMMPC_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(9, hOGJFCLMMPC_);
      }
      {
        int dataSize = 0;
        for (int i = 0; i < cPJEMFGLLKE_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeUInt32SizeNoTag(cPJEMFGLLKE_.getInt(i));
        }
        size += dataSize;
        if (!getCPJEMFGLLKEList().isEmpty()) {
          size += 1;
          size += com.google.protobuf.CodedOutputStream
              .computeInt32SizeNoTag(dataSize);
        }
        cPJEMFGLLKEMemoizedSerializedSize = dataSize;
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo other = (emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo) obj;

      if (getHOGJFCLMMPC()
          != other.getHOGJFCLMMPC()) return false;
      if (!getCPJEMFGLLKEList()
          .equals(other.getCPJEMFGLLKEList())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + HOGJFCLMMPC_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getHOGJFCLMMPC());
      if (getCPJEMFGLLKECount() > 0) {
        hash = (37 * hash) + CPJEMFGLLKE_FIELD_NUMBER;
        hash = (53 * hash) + getCPJEMFGLLKEList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Obf: NNBINJFKNAD
     * </pre>
     *
     * Protobuf type {@code GcgPvePuzzleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GcgPvePuzzleInfo)
        emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.internal_static_GcgPvePuzzleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.internal_static_GcgPvePuzzleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo.class, emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        hOGJFCLMMPC_ = false;

        cPJEMFGLLKE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.internal_static_GcgPvePuzzleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo build() {
        emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo buildPartial() {
        emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo result = new emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo(this);
        int from_bitField0_ = bitField0_;
        result.hOGJFCLMMPC_ = hOGJFCLMMPC_;
        if (((bitField0_ & 0x00000001) != 0)) {
          cPJEMFGLLKE_.makeImmutable();
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cPJEMFGLLKE_ = cPJEMFGLLKE_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo other) {
        if (other == emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo.getDefaultInstance()) return this;
        if (other.getHOGJFCLMMPC() != false) {
          setHOGJFCLMMPC(other.getHOGJFCLMMPC());
        }
        if (!other.cPJEMFGLLKE_.isEmpty()) {
          if (cPJEMFGLLKE_.isEmpty()) {
            cPJEMFGLLKE_ = other.cPJEMFGLLKE_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCPJEMFGLLKEIsMutable();
            cPJEMFGLLKE_.addAll(other.cPJEMFGLLKE_);
          }
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private boolean hOGJFCLMMPC_ ;
      /**
       * <code>bool HOGJFCLMMPC = 9;</code>
       * @return The hOGJFCLMMPC.
       */
      @java.lang.Override
      public boolean getHOGJFCLMMPC() {
        return hOGJFCLMMPC_;
      }
      /**
       * <code>bool HOGJFCLMMPC = 9;</code>
       * @param value The hOGJFCLMMPC to set.
       * @return This builder for chaining.
       */
      public Builder setHOGJFCLMMPC(boolean value) {
        
        hOGJFCLMMPC_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool HOGJFCLMMPC = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearHOGJFCLMMPC() {
        
        hOGJFCLMMPC_ = false;
        onChanged();
        return this;
      }

      private com.google.protobuf.Internal.IntList cPJEMFGLLKE_ = emptyIntList();
      private void ensureCPJEMFGLLKEIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          cPJEMFGLLKE_ = mutableCopy(cPJEMFGLLKE_);
          bitField0_ |= 0x00000001;
         }
      }
      /**
       * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
       * @return A list containing the cPJEMFGLLKE.
       */
      public java.util.List<java.lang.Integer>
          getCPJEMFGLLKEList() {
        return ((bitField0_ & 0x00000001) != 0) ?
                 java.util.Collections.unmodifiableList(cPJEMFGLLKE_) : cPJEMFGLLKE_;
      }
      /**
       * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
       * @return The count of cPJEMFGLLKE.
       */
      public int getCPJEMFGLLKECount() {
        return cPJEMFGLLKE_.size();
      }
      /**
       * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
       * @param index The index of the element to return.
       * @return The cPJEMFGLLKE at the given index.
       */
      public int getCPJEMFGLLKE(int index) {
        return cPJEMFGLLKE_.getInt(index);
      }
      /**
       * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
       * @param index The index to set the value at.
       * @param value The cPJEMFGLLKE to set.
       * @return This builder for chaining.
       */
      public Builder setCPJEMFGLLKE(
          int index, int value) {
        ensureCPJEMFGLLKEIsMutable();
        cPJEMFGLLKE_.setInt(index, value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
       * @param value The cPJEMFGLLKE to add.
       * @return This builder for chaining.
       */
      public Builder addCPJEMFGLLKE(int value) {
        ensureCPJEMFGLLKEIsMutable();
        cPJEMFGLLKE_.addInt(value);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
       * @param values The cPJEMFGLLKE to add.
       * @return This builder for chaining.
       */
      public Builder addAllCPJEMFGLLKE(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensureCPJEMFGLLKEIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cPJEMFGLLKE_);
        onChanged();
        return this;
      }
      /**
       * <code>repeated uint32 CPJEMFGLLKE = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearCPJEMFGLLKE() {
        cPJEMFGLLKE_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GcgPvePuzzleInfo)
    }

    // @@protoc_insertion_point(class_scope:GcgPvePuzzleInfo)
    private static final emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo();
    }

    public static emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GcgPvePuzzleInfo>
        PARSER = new com.google.protobuf.AbstractParser<GcgPvePuzzleInfo>() {
      @java.lang.Override
      public GcgPvePuzzleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GcgPvePuzzleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GcgPvePuzzleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GcgPvePuzzleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GcgPvePuzzleInfoOuterClass.GcgPvePuzzleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GcgPvePuzzleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GcgPvePuzzleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\026GcgPvePuzzleInfo.proto\"<\n\020GcgPvePuzzle" +
      "Info\022\023\n\013HOGJFCLMMPC\030\t \001(\010\022\023\n\013CPJEMFGLLKE" +
      "\030\013 \003(\rB\033\n\031emu.grasscutter.net.protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GcgPvePuzzleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GcgPvePuzzleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GcgPvePuzzleInfo_descriptor,
        new java.lang.String[] { "HOGJFCLMMPC", "CPJEMFGLLKE", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
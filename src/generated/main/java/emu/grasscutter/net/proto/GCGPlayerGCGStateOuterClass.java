// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GCGPlayerGCGState.proto

package emu.grasscutter.net.proto;

public final class GCGPlayerGCGStateOuterClass {
  private GCGPlayerGCGStateOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GCGPlayerGCGStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GCGPlayerGCGState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>bool LAKOPLONGKL = 13;</code>
     * @return The lAKOPLONGKL.
     */
    boolean getLAKOPLONGKL();

    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    int getUid();

    /**
     * <code>bool MLIOBMAMIAI = 1;</code>
     * @return The mLIOBMAMIAI.
     */
    boolean getMLIOBMAMIAI();
  }
  /**
   * <pre>
   * Obf: BENCNDAAMML
   * </pre>
   *
   * Protobuf type {@code GCGPlayerGCGState}
   */
  public static final class GCGPlayerGCGState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GCGPlayerGCGState)
      GCGPlayerGCGStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GCGPlayerGCGState.newBuilder() to construct.
    private GCGPlayerGCGState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GCGPlayerGCGState() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GCGPlayerGCGState();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private GCGPlayerGCGState(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 8: {

              mLIOBMAMIAI_ = input.readBool();
              break;
            }
            case 104: {

              lAKOPLONGKL_ = input.readBool();
              break;
            }
            case 112: {

              uid_ = input.readUInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.class, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder.class);
    }

    public static final int LAKOPLONGKL_FIELD_NUMBER = 13;
    private boolean lAKOPLONGKL_;
    /**
     * <code>bool LAKOPLONGKL = 13;</code>
     * @return The lAKOPLONGKL.
     */
    @java.lang.Override
    public boolean getLAKOPLONGKL() {
      return lAKOPLONGKL_;
    }

    public static final int UID_FIELD_NUMBER = 14;
    private int uid_;
    /**
     * <code>uint32 uid = 14;</code>
     * @return The uid.
     */
    @java.lang.Override
    public int getUid() {
      return uid_;
    }

    public static final int MLIOBMAMIAI_FIELD_NUMBER = 1;
    private boolean mLIOBMAMIAI_;
    /**
     * <code>bool MLIOBMAMIAI = 1;</code>
     * @return The mLIOBMAMIAI.
     */
    @java.lang.Override
    public boolean getMLIOBMAMIAI() {
      return mLIOBMAMIAI_;
    }

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
      if (mLIOBMAMIAI_ != false) {
        output.writeBool(1, mLIOBMAMIAI_);
      }
      if (lAKOPLONGKL_ != false) {
        output.writeBool(13, lAKOPLONGKL_);
      }
      if (uid_ != 0) {
        output.writeUInt32(14, uid_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (mLIOBMAMIAI_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, mLIOBMAMIAI_);
      }
      if (lAKOPLONGKL_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(13, lAKOPLONGKL_);
      }
      if (uid_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(14, uid_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState other = (emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState) obj;

      if (getLAKOPLONGKL()
          != other.getLAKOPLONGKL()) return false;
      if (getUid()
          != other.getUid()) return false;
      if (getMLIOBMAMIAI()
          != other.getMLIOBMAMIAI()) return false;
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
      hash = (37 * hash) + LAKOPLONGKL_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getLAKOPLONGKL());
      hash = (37 * hash) + UID_FIELD_NUMBER;
      hash = (53 * hash) + getUid();
      hash = (37 * hash) + MLIOBMAMIAI_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getMLIOBMAMIAI());
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState prototype) {
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
     * Obf: BENCNDAAMML
     * </pre>
     *
     * Protobuf type {@code GCGPlayerGCGState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GCGPlayerGCGState)
        emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.class, emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.newBuilder()
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
        lAKOPLONGKL_ = false;

        uid_ = 0;

        mLIOBMAMIAI_ = false;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.internal_static_GCGPlayerGCGState_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState build() {
        emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState buildPartial() {
        emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState result = new emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState(this);
        result.lAKOPLONGKL_ = lAKOPLONGKL_;
        result.uid_ = uid_;
        result.mLIOBMAMIAI_ = mLIOBMAMIAI_;
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
        if (other instanceof emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState) {
          return mergeFrom((emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState other) {
        if (other == emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState.getDefaultInstance()) return this;
        if (other.getLAKOPLONGKL() != false) {
          setLAKOPLONGKL(other.getLAKOPLONGKL());
        }
        if (other.getUid() != 0) {
          setUid(other.getUid());
        }
        if (other.getMLIOBMAMIAI() != false) {
          setMLIOBMAMIAI(other.getMLIOBMAMIAI());
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
        emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private boolean lAKOPLONGKL_ ;
      /**
       * <code>bool LAKOPLONGKL = 13;</code>
       * @return The lAKOPLONGKL.
       */
      @java.lang.Override
      public boolean getLAKOPLONGKL() {
        return lAKOPLONGKL_;
      }
      /**
       * <code>bool LAKOPLONGKL = 13;</code>
       * @param value The lAKOPLONGKL to set.
       * @return This builder for chaining.
       */
      public Builder setLAKOPLONGKL(boolean value) {
        
        lAKOPLONGKL_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool LAKOPLONGKL = 13;</code>
       * @return This builder for chaining.
       */
      public Builder clearLAKOPLONGKL() {
        
        lAKOPLONGKL_ = false;
        onChanged();
        return this;
      }

      private int uid_ ;
      /**
       * <code>uint32 uid = 14;</code>
       * @return The uid.
       */
      @java.lang.Override
      public int getUid() {
        return uid_;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @param value The uid to set.
       * @return This builder for chaining.
       */
      public Builder setUid(int value) {
        
        uid_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 uid = 14;</code>
       * @return This builder for chaining.
       */
      public Builder clearUid() {
        
        uid_ = 0;
        onChanged();
        return this;
      }

      private boolean mLIOBMAMIAI_ ;
      /**
       * <code>bool MLIOBMAMIAI = 1;</code>
       * @return The mLIOBMAMIAI.
       */
      @java.lang.Override
      public boolean getMLIOBMAMIAI() {
        return mLIOBMAMIAI_;
      }
      /**
       * <code>bool MLIOBMAMIAI = 1;</code>
       * @param value The mLIOBMAMIAI to set.
       * @return This builder for chaining.
       */
      public Builder setMLIOBMAMIAI(boolean value) {
        
        mLIOBMAMIAI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool MLIOBMAMIAI = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearMLIOBMAMIAI() {
        
        mLIOBMAMIAI_ = false;
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


      // @@protoc_insertion_point(builder_scope:GCGPlayerGCGState)
    }

    // @@protoc_insertion_point(class_scope:GCGPlayerGCGState)
    private static final emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState();
    }

    public static emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GCGPlayerGCGState>
        PARSER = new com.google.protobuf.AbstractParser<GCGPlayerGCGState>() {
      @java.lang.Override
      public GCGPlayerGCGState parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new GCGPlayerGCGState(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<GCGPlayerGCGState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GCGPlayerGCGState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.GCGPlayerGCGStateOuterClass.GCGPlayerGCGState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GCGPlayerGCGState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GCGPlayerGCGState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027GCGPlayerGCGState.proto\"J\n\021GCGPlayerGC" +
      "GState\022\023\n\013LAKOPLONGKL\030\r \001(\010\022\013\n\003uid\030\016 \001(\r" +
      "\022\023\n\013MLIOBMAMIAI\030\001 \001(\010B\033\n\031emu.grasscutter" +
      ".net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_GCGPlayerGCGState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GCGPlayerGCGState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GCGPlayerGCGState_descriptor,
        new java.lang.String[] { "LAKOPLONGKL", "Uid", "MLIOBMAMIAI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
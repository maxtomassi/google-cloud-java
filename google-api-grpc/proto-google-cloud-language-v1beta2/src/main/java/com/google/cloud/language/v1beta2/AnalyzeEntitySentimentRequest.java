// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/language/v1beta2/language_service.proto

package com.google.cloud.language.v1beta2;

/**
 *
 *
 * <pre>
 * The entity-level sentiment analysis request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest}
 */
public final class AnalyzeEntitySentimentRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest)
    AnalyzeEntitySentimentRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AnalyzeEntitySentimentRequest.newBuilder() to construct.
  private AnalyzeEntitySentimentRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AnalyzeEntitySentimentRequest() {
    encodingType_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private AnalyzeEntitySentimentRequest(
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
          case 10:
            {
              com.google.cloud.language.v1beta2.Document.Builder subBuilder = null;
              if (document_ != null) {
                subBuilder = document_.toBuilder();
              }
              document_ =
                  input.readMessage(
                      com.google.cloud.language.v1beta2.Document.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(document_);
                document_ = subBuilder.buildPartial();
              }

              break;
            }
          case 16:
            {
              int rawValue = input.readEnum();

              encodingType_ = rawValue;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto
        .internal_static_google_cloud_language_v1beta2_AnalyzeEntitySentimentRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.language.v1beta2.LanguageServiceProto
        .internal_static_google_cloud_language_v1beta2_AnalyzeEntitySentimentRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest.class,
            com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest.Builder.class);
  }

  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private com.google.cloud.language.v1beta2.Document document_;
  /**
   *
   *
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
   */
  public boolean hasDocument() {
    return document_ != null;
  }
  /**
   *
   *
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
   */
  public com.google.cloud.language.v1beta2.Document getDocument() {
    return document_ == null
        ? com.google.cloud.language.v1beta2.Document.getDefaultInstance()
        : document_;
  }
  /**
   *
   *
   * <pre>
   * Input document.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
   */
  public com.google.cloud.language.v1beta2.DocumentOrBuilder getDocumentOrBuilder() {
    return getDocument();
  }

  public static final int ENCODING_TYPE_FIELD_NUMBER = 2;
  private int encodingType_;
  /**
   *
   *
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
   */
  public int getEncodingTypeValue() {
    return encodingType_;
  }
  /**
   *
   *
   * <pre>
   * The encoding type used by the API to calculate offsets.
   * </pre>
   *
   * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
   */
  public com.google.cloud.language.v1beta2.EncodingType getEncodingType() {
    @SuppressWarnings("deprecation")
    com.google.cloud.language.v1beta2.EncodingType result =
        com.google.cloud.language.v1beta2.EncodingType.valueOf(encodingType_);
    return result == null ? com.google.cloud.language.v1beta2.EncodingType.UNRECOGNIZED : result;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (document_ != null) {
      output.writeMessage(1, getDocument());
    }
    if (encodingType_ != com.google.cloud.language.v1beta2.EncodingType.NONE.getNumber()) {
      output.writeEnum(2, encodingType_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (document_ != null) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDocument());
    }
    if (encodingType_ != com.google.cloud.language.v1beta2.EncodingType.NONE.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, encodingType_);
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
    if (!(obj instanceof com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest other =
        (com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest) obj;

    if (hasDocument() != other.hasDocument()) return false;
    if (hasDocument()) {
      if (!getDocument().equals(other.getDocument())) return false;
    }
    if (encodingType_ != other.encodingType_) return false;
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
    if (hasDocument()) {
      hash = (37 * hash) + DOCUMENT_FIELD_NUMBER;
      hash = (53 * hash) + getDocument().hashCode();
    }
    hash = (37 * hash) + ENCODING_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + encodingType_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The entity-level sentiment analysis request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest)
      com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_AnalyzeEntitySentimentRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_AnalyzeEntitySentimentRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest.class,
              com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest.Builder.class);
    }

    // Construct using com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (documentBuilder_ == null) {
        document_ = null;
      } else {
        document_ = null;
        documentBuilder_ = null;
      }
      encodingType_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.language.v1beta2.LanguageServiceProto
          .internal_static_google_cloud_language_v1beta2_AnalyzeEntitySentimentRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest
        getDefaultInstanceForType() {
      return com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest build() {
      com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest buildPartial() {
      com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest result =
          new com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest(this);
      if (documentBuilder_ == null) {
        result.document_ = document_;
      } else {
        result.document_ = documentBuilder_.build();
      }
      result.encodingType_ = encodingType_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest) {
        return mergeFrom((com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest other) {
      if (other
          == com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest.getDefaultInstance())
        return this;
      if (other.hasDocument()) {
        mergeDocument(other.getDocument());
      }
      if (other.encodingType_ != 0) {
        setEncodingTypeValue(other.getEncodingTypeValue());
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
      com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest)
                e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private com.google.cloud.language.v1beta2.Document document_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.Document,
            com.google.cloud.language.v1beta2.Document.Builder,
            com.google.cloud.language.v1beta2.DocumentOrBuilder>
        documentBuilder_;
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public boolean hasDocument() {
      return documentBuilder_ != null || document_ != null;
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public com.google.cloud.language.v1beta2.Document getDocument() {
      if (documentBuilder_ == null) {
        return document_ == null
            ? com.google.cloud.language.v1beta2.Document.getDefaultInstance()
            : document_;
      } else {
        return documentBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public Builder setDocument(com.google.cloud.language.v1beta2.Document value) {
      if (documentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        document_ = value;
        onChanged();
      } else {
        documentBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public Builder setDocument(com.google.cloud.language.v1beta2.Document.Builder builderForValue) {
      if (documentBuilder_ == null) {
        document_ = builderForValue.build();
        onChanged();
      } else {
        documentBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public Builder mergeDocument(com.google.cloud.language.v1beta2.Document value) {
      if (documentBuilder_ == null) {
        if (document_ != null) {
          document_ =
              com.google.cloud.language.v1beta2.Document.newBuilder(document_)
                  .mergeFrom(value)
                  .buildPartial();
        } else {
          document_ = value;
        }
        onChanged();
      } else {
        documentBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public Builder clearDocument() {
      if (documentBuilder_ == null) {
        document_ = null;
        onChanged();
      } else {
        document_ = null;
        documentBuilder_ = null;
      }

      return this;
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public com.google.cloud.language.v1beta2.Document.Builder getDocumentBuilder() {

      onChanged();
      return getDocumentFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    public com.google.cloud.language.v1beta2.DocumentOrBuilder getDocumentOrBuilder() {
      if (documentBuilder_ != null) {
        return documentBuilder_.getMessageOrBuilder();
      } else {
        return document_ == null
            ? com.google.cloud.language.v1beta2.Document.getDefaultInstance()
            : document_;
      }
    }
    /**
     *
     *
     * <pre>
     * Input document.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.Document document = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.language.v1beta2.Document,
            com.google.cloud.language.v1beta2.Document.Builder,
            com.google.cloud.language.v1beta2.DocumentOrBuilder>
        getDocumentFieldBuilder() {
      if (documentBuilder_ == null) {
        documentBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.language.v1beta2.Document,
                com.google.cloud.language.v1beta2.Document.Builder,
                com.google.cloud.language.v1beta2.DocumentOrBuilder>(
                getDocument(), getParentForChildren(), isClean());
        document_ = null;
      }
      return documentBuilder_;
    }

    private int encodingType_ = 0;
    /**
     *
     *
     * <pre>
     * The encoding type used by the API to calculate offsets.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
     */
    public int getEncodingTypeValue() {
      return encodingType_;
    }
    /**
     *
     *
     * <pre>
     * The encoding type used by the API to calculate offsets.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
     */
    public Builder setEncodingTypeValue(int value) {
      encodingType_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encoding type used by the API to calculate offsets.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
     */
    public com.google.cloud.language.v1beta2.EncodingType getEncodingType() {
      @SuppressWarnings("deprecation")
      com.google.cloud.language.v1beta2.EncodingType result =
          com.google.cloud.language.v1beta2.EncodingType.valueOf(encodingType_);
      return result == null ? com.google.cloud.language.v1beta2.EncodingType.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The encoding type used by the API to calculate offsets.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
     */
    public Builder setEncodingType(com.google.cloud.language.v1beta2.EncodingType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      encodingType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The encoding type used by the API to calculate offsets.
     * </pre>
     *
     * <code>.google.cloud.language.v1beta2.EncodingType encoding_type = 2;</code>
     */
    public Builder clearEncodingType() {

      encodingType_ = 0;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest)
  private static final com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest();
  }

  public static com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnalyzeEntitySentimentRequest> PARSER =
      new com.google.protobuf.AbstractParser<AnalyzeEntitySentimentRequest>() {
        @java.lang.Override
        public AnalyzeEntitySentimentRequest parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new AnalyzeEntitySentimentRequest(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<AnalyzeEntitySentimentRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnalyzeEntitySentimentRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.language.v1beta2.AnalyzeEntitySentimentRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}

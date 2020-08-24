// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: blog/blog.proto

package kz.mircella.grpc.blog;

/**
 * Protobuf type {@code blog.UpdateBlogRequest}
 */
public final class UpdateBlogRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:blog.UpdateBlogRequest)
    UpdateBlogRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UpdateBlogRequest.newBuilder() to construct.
  private UpdateBlogRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UpdateBlogRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UpdateBlogRequest();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UpdateBlogRequest(
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
          case 10: {
            kz.mircella.grpc.blog.Blog.Builder subBuilder = null;
            if (blog_ != null) {
              subBuilder = blog_.toBuilder();
            }
            blog_ = input.readMessage(kz.mircella.grpc.blog.Blog.parser(), extensionRegistry);
            if (subBuilder != null) {
              subBuilder.mergeFrom(blog_);
              blog_ = subBuilder.buildPartial();
            }

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
    return kz.mircella.grpc.blog.BlogOuterClass.internal_static_blog_UpdateBlogRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return kz.mircella.grpc.blog.BlogOuterClass.internal_static_blog_UpdateBlogRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            kz.mircella.grpc.blog.UpdateBlogRequest.class, kz.mircella.grpc.blog.UpdateBlogRequest.Builder.class);
  }

  public static final int BLOG_FIELD_NUMBER = 1;
  private kz.mircella.grpc.blog.Blog blog_;
  /**
   * <code>.blog.Blog blog = 1;</code>
   * @return Whether the blog field is set.
   */
  @java.lang.Override
  public boolean hasBlog() {
    return blog_ != null;
  }
  /**
   * <code>.blog.Blog blog = 1;</code>
   * @return The blog.
   */
  @java.lang.Override
  public kz.mircella.grpc.blog.Blog getBlog() {
    return blog_ == null ? kz.mircella.grpc.blog.Blog.getDefaultInstance() : blog_;
  }
  /**
   * <code>.blog.Blog blog = 1;</code>
   */
  @java.lang.Override
  public kz.mircella.grpc.blog.BlogOrBuilder getBlogOrBuilder() {
    return getBlog();
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
    if (blog_ != null) {
      output.writeMessage(1, getBlog());
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blog_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBlog());
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
    if (!(obj instanceof kz.mircella.grpc.blog.UpdateBlogRequest)) {
      return super.equals(obj);
    }
    kz.mircella.grpc.blog.UpdateBlogRequest other = (kz.mircella.grpc.blog.UpdateBlogRequest) obj;

    if (hasBlog() != other.hasBlog()) return false;
    if (hasBlog()) {
      if (!getBlog()
          .equals(other.getBlog())) return false;
    }
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
    if (hasBlog()) {
      hash = (37 * hash) + BLOG_FIELD_NUMBER;
      hash = (53 * hash) + getBlog().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static kz.mircella.grpc.blog.UpdateBlogRequest parseFrom(
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
  public static Builder newBuilder(kz.mircella.grpc.blog.UpdateBlogRequest prototype) {
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
   * Protobuf type {@code blog.UpdateBlogRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:blog.UpdateBlogRequest)
      kz.mircella.grpc.blog.UpdateBlogRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return kz.mircella.grpc.blog.BlogOuterClass.internal_static_blog_UpdateBlogRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return kz.mircella.grpc.blog.BlogOuterClass.internal_static_blog_UpdateBlogRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              kz.mircella.grpc.blog.UpdateBlogRequest.class, kz.mircella.grpc.blog.UpdateBlogRequest.Builder.class);
    }

    // Construct using kz.mircella.grpc.blog.UpdateBlogRequest.newBuilder()
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
      if (blogBuilder_ == null) {
        blog_ = null;
      } else {
        blog_ = null;
        blogBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return kz.mircella.grpc.blog.BlogOuterClass.internal_static_blog_UpdateBlogRequest_descriptor;
    }

    @java.lang.Override
    public kz.mircella.grpc.blog.UpdateBlogRequest getDefaultInstanceForType() {
      return kz.mircella.grpc.blog.UpdateBlogRequest.getDefaultInstance();
    }

    @java.lang.Override
    public kz.mircella.grpc.blog.UpdateBlogRequest build() {
      kz.mircella.grpc.blog.UpdateBlogRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public kz.mircella.grpc.blog.UpdateBlogRequest buildPartial() {
      kz.mircella.grpc.blog.UpdateBlogRequest result = new kz.mircella.grpc.blog.UpdateBlogRequest(this);
      if (blogBuilder_ == null) {
        result.blog_ = blog_;
      } else {
        result.blog_ = blogBuilder_.build();
      }
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
      if (other instanceof kz.mircella.grpc.blog.UpdateBlogRequest) {
        return mergeFrom((kz.mircella.grpc.blog.UpdateBlogRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(kz.mircella.grpc.blog.UpdateBlogRequest other) {
      if (other == kz.mircella.grpc.blog.UpdateBlogRequest.getDefaultInstance()) return this;
      if (other.hasBlog()) {
        mergeBlog(other.getBlog());
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
      kz.mircella.grpc.blog.UpdateBlogRequest parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (kz.mircella.grpc.blog.UpdateBlogRequest) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private kz.mircella.grpc.blog.Blog blog_;
    private com.google.protobuf.SingleFieldBuilderV3<
        kz.mircella.grpc.blog.Blog, kz.mircella.grpc.blog.Blog.Builder, kz.mircella.grpc.blog.BlogOrBuilder> blogBuilder_;
    /**
     * <code>.blog.Blog blog = 1;</code>
     * @return Whether the blog field is set.
     */
    public boolean hasBlog() {
      return blogBuilder_ != null || blog_ != null;
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     * @return The blog.
     */
    public kz.mircella.grpc.blog.Blog getBlog() {
      if (blogBuilder_ == null) {
        return blog_ == null ? kz.mircella.grpc.blog.Blog.getDefaultInstance() : blog_;
      } else {
        return blogBuilder_.getMessage();
      }
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder setBlog(kz.mircella.grpc.blog.Blog value) {
      if (blogBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        blog_ = value;
        onChanged();
      } else {
        blogBuilder_.setMessage(value);
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder setBlog(
        kz.mircella.grpc.blog.Blog.Builder builderForValue) {
      if (blogBuilder_ == null) {
        blog_ = builderForValue.build();
        onChanged();
      } else {
        blogBuilder_.setMessage(builderForValue.build());
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder mergeBlog(kz.mircella.grpc.blog.Blog value) {
      if (blogBuilder_ == null) {
        if (blog_ != null) {
          blog_ =
            kz.mircella.grpc.blog.Blog.newBuilder(blog_).mergeFrom(value).buildPartial();
        } else {
          blog_ = value;
        }
        onChanged();
      } else {
        blogBuilder_.mergeFrom(value);
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     */
    public Builder clearBlog() {
      if (blogBuilder_ == null) {
        blog_ = null;
        onChanged();
      } else {
        blog_ = null;
        blogBuilder_ = null;
      }

      return this;
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     */
    public kz.mircella.grpc.blog.Blog.Builder getBlogBuilder() {
      
      onChanged();
      return getBlogFieldBuilder().getBuilder();
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     */
    public kz.mircella.grpc.blog.BlogOrBuilder getBlogOrBuilder() {
      if (blogBuilder_ != null) {
        return blogBuilder_.getMessageOrBuilder();
      } else {
        return blog_ == null ?
            kz.mircella.grpc.blog.Blog.getDefaultInstance() : blog_;
      }
    }
    /**
     * <code>.blog.Blog blog = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        kz.mircella.grpc.blog.Blog, kz.mircella.grpc.blog.Blog.Builder, kz.mircella.grpc.blog.BlogOrBuilder> 
        getBlogFieldBuilder() {
      if (blogBuilder_ == null) {
        blogBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            kz.mircella.grpc.blog.Blog, kz.mircella.grpc.blog.Blog.Builder, kz.mircella.grpc.blog.BlogOrBuilder>(
                getBlog(),
                getParentForChildren(),
                isClean());
        blog_ = null;
      }
      return blogBuilder_;
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


    // @@protoc_insertion_point(builder_scope:blog.UpdateBlogRequest)
  }

  // @@protoc_insertion_point(class_scope:blog.UpdateBlogRequest)
  private static final kz.mircella.grpc.blog.UpdateBlogRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new kz.mircella.grpc.blog.UpdateBlogRequest();
  }

  public static kz.mircella.grpc.blog.UpdateBlogRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateBlogRequest>
      PARSER = new com.google.protobuf.AbstractParser<UpdateBlogRequest>() {
    @java.lang.Override
    public UpdateBlogRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UpdateBlogRequest(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UpdateBlogRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateBlogRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public kz.mircella.grpc.blog.UpdateBlogRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

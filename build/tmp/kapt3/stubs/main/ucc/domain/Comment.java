package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B-\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\nH\u00c6\u0003J7\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lucc/domain/Comment;", "", "content", "", "(Ljava/lang/String;)V", "id", "Ljava/util/UUID;", "createdAt", "Ljava/time/LocalDateTime;", "post", "Lucc/domain/Post;", "(Ljava/util/UUID;Ljava/lang/String;Ljava/time/LocalDateTime;Lucc/domain/Post;)V", "getContent", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "setCreatedAt", "(Ljava/time/LocalDateTime;)V", "getId", "()Ljava/util/UUID;", "getPost", "()Lucc/domain/Post;", "setPost", "(Lucc/domain/Post;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "ucc"})
@io.micronaut.data.annotation.MappedEntity(value = "comments", namingStrategy = io.micronaut.data.model.naming.NamingStrategies.UnderScoreSeparatedLowerCase.class)
@io.micronaut.core.annotation.Introspected
public final class Comment {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.AutoPopulated
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String content = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateCreated
    private java.time.LocalDateTime createdAt;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Join(value = "post")
    @com.fasterxml.jackson.annotation.JsonIgnore
    @jakarta.persistence.JoinColumn(name = "post_id")
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private ucc.domain.Post post;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Comment copy(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.Nullable
    ucc.domain.Post post) {
        return null;
    }
    
    public Comment(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    java.lang.String content, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.Nullable
    ucc.domain.Post post) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getContent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    public final void setCreatedAt(@org.jetbrains.annotations.Nullable
    java.time.LocalDateTime p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Post component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Post getPost() {
        return null;
    }
    
    public final void setPost(@org.jetbrains.annotations.Nullable
    ucc.domain.Post p0) {
    }
    
    public Comment(@org.jetbrains.annotations.NotNull
    java.lang.String content) {
        super();
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
}
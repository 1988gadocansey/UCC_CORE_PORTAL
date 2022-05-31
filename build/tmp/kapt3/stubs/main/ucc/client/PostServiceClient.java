package ucc.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u00032\u000f\b\u0001\u0010\u0005\u001a\t\u0018\u00010\u0006\u00a2\u0006\u0002\b\u0007H\'JF\u0010\b\u001a\u0014\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t\u0018\u00010\u00032\n\b\u0001\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u000fH\'J\u001e\u0010\u0011\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0018\u00010\u00032\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\'\u00a8\u0006\u0015"}, d2 = {"Lucc/client/PostServiceClient;", "", "create", "Lio/micronaut/http/HttpResponse;", "Ljava/lang/Void;", "dto", "Lucc/commands/CreatePostCommand;", "Ljavax/validation/Valid;", "getAll", "Lucc/dto/PageDto;", "Lucc/dto/PostSummaryDto;", "q", "", "status", "page", "", "size", "getById", "Lio/micronaut/http/annotation/Post;", "id", "Ljava/util/UUID;", "ucc"})
@io.micronaut.http.annotation.Header(name = "Accept", value = "application/json")
@io.micronaut.http.annotation.Header(name = "Content-Type", value = "application/json")
@io.micronaut.http.client.annotation.Client(value = "http://localhost:8080/posts")
public abstract interface PostServiceClient {
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(uri = "/", produces = {"application/json"})
    public abstract io.micronaut.http.HttpResponse<ucc.dto.PageDto<ucc.dto.PostSummaryDto>> getAll(@org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.QueryValue(defaultValue = "")
    java.lang.String q, @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.QueryValue(defaultValue = "")
    java.lang.String status, @io.micronaut.http.annotation.QueryValue(defaultValue = "0")
    int page, @io.micronaut.http.annotation.QueryValue(defaultValue = "10")
    int size);
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Post(uri = "/", consumes = {"application/json"})
    public abstract io.micronaut.http.HttpResponse<java.lang.Void> create(@org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Body
    ucc.commands.CreatePostCommand dto);
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(uri = "/{id}", produces = {"application/json"})
    public abstract io.micronaut.http.HttpResponse<io.micronaut.http.annotation.Post> getById(@org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.PathVariable
    java.util.UUID id);
}
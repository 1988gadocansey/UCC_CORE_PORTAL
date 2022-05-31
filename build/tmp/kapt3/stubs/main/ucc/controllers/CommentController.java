package ucc.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\bH\u0007J!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\u0011\u001a\u00020\nH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lucc/controllers/CommentController;", "", "comments", "Lucc/repositories/CommentRepository;", "posts", "Lucc/repositories/PostRepository;", "(Lucc/repositories/CommentRepository;Lucc/repositories/PostRepository;)V", "all", "Lio/micronaut/http/MutableHttpResponse;", "Lkotlinx/coroutines/flow/Flow;", "Lucc/domain/Comment;", "byId", "Lio/micronaut/http/HttpResponse;", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "body", "(Lucc/domain/Comment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ucc"})
@io.micronaut.http.annotation.Controller(value = "/comments")
public final class CommentController {
    private final ucc.repositories.CommentRepository comments = null;
    private final ucc.repositories.PostRepository posts = null;
    
    public CommentController(@org.jetbrains.annotations.NotNull
    ucc.repositories.CommentRepository comments, @org.jetbrains.annotations.NotNull
    ucc.repositories.PostRepository posts) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(uri = "/", produces = {"application/json"})
    public final io.micronaut.http.MutableHttpResponse<kotlinx.coroutines.flow.Flow<ucc.domain.Comment>> all() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(uri = "/{id}", produces = {"application/json"})
    public final java.lang.Object byId(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.micronaut.http.HttpResponse<java.lang.Object>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Post(consumes = {"application/json"})
    public final java.lang.Object create(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Body
    ucc.domain.Comment body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.micronaut.http.HttpResponse<java.lang.Object>> continuation) {
        return null;
    }
}
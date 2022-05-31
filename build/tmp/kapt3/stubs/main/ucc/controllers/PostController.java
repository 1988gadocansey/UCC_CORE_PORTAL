package ucc.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00062\b\b\u0001\u0010\u000e\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0010"}, d2 = {"Lucc/controllers/PostController;", "", "posts", "Lucc/repositories/PostRepository;", "(Lucc/repositories/PostRepository;)V", "all", "Lio/micronaut/http/HttpResponse;", "Lkotlinx/coroutines/flow/Flow;", "Lucc/domain/Post;", "byId", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "body", "(Lucc/domain/Post;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ucc"})
@io.micronaut.http.annotation.Controller(value = "/posts")
public final class PostController {
    private final ucc.repositories.PostRepository posts = null;
    
    public PostController(@org.jetbrains.annotations.NotNull
    ucc.repositories.PostRepository posts) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(uri = "/", produces = {"application/json"})
    public final io.micronaut.http.HttpResponse<kotlinx.coroutines.flow.Flow<ucc.domain.Post>> all() {
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
    ucc.domain.Post body, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.micronaut.http.HttpResponse<java.lang.Object>> continuation) {
        return null;
    }
}
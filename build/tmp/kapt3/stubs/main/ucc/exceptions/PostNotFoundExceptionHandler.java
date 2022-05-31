package ucc.exceptions;

import java.lang.System;

@lombok.RequiredArgsConstructor
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001B\u0005\u00a2\u0006\u0002\u0010\u0004J\"\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00032\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lucc/exceptions/PostNotFoundExceptionHandler;", "Lio/micronaut/http/server/exceptions/ExceptionHandler;", "Lucc/exceptions/PostNotFoundException;", "Lio/micronaut/http/HttpResponse;", "()V", "errorResponseProcessor", "Lio/micronaut/http/server/exceptions/response/ErrorResponseProcessor;", "handle", "request", "Lio/micronaut/http/HttpRequest;", "exception", "ucc"})
@io.micronaut.context.annotation.Requires(classes = {ucc.exceptions.PostNotFoundException.class})
@jakarta.inject.Singleton
@io.micronaut.http.annotation.Produces
public final class PostNotFoundExceptionHandler implements io.micronaut.http.server.exceptions.ExceptionHandler<ucc.exceptions.PostNotFoundException, io.micronaut.http.HttpResponse<?>> {
    private final io.micronaut.http.server.exceptions.response.ErrorResponseProcessor<?> errorResponseProcessor = null;
    
    public PostNotFoundExceptionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.micronaut.http.HttpResponse<?> handle(@org.jetbrains.annotations.Nullable
    io.micronaut.http.HttpRequest<?> request, @org.jetbrains.annotations.NotNull
    ucc.exceptions.PostNotFoundException exception) {
        return null;
    }
}
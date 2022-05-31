package ucc.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lucc/controllers/BookController;", "", "repository", "Lucc/repositories/BookRepository;", "(Lucc/repositories/BookRepository;)V", "all", "Lreactor/core/publisher/Flux;", "Lucc/domain/Book;", "get", "Lreactor/core/publisher/Mono;", "id", "", "ucc"})
@io.micronaut.http.annotation.Controller(value = "/books")
public final class BookController {
    private final ucc.repositories.BookRepository repository = null;
    
    public BookController(@org.jetbrains.annotations.NotNull
    ucc.repositories.BookRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Produces(value = {"application/json"})
    @io.micronaut.http.annotation.Get
    public final reactor.core.publisher.Flux<ucc.domain.Book> all() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/id")
    public final reactor.core.publisher.Mono<ucc.domain.Book> get(long id) {
        return null;
    }
}
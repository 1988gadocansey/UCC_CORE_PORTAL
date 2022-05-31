package ucc.services;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lucc/services/AuthorService;", "", "authorRepository", "Lucc/repositories/AuthorRepository;", "bookRepository", "Lucc/repositories/BookRepository;", "(Lucc/repositories/AuthorRepository;Lucc/repositories/BookRepository;)V", "setupData", "Lreactor/core/publisher/Mono;", "Ljava/lang/Void;", "ucc"})
@jakarta.inject.Singleton
public class AuthorService {
    private final ucc.repositories.AuthorRepository authorRepository = null;
    private final ucc.repositories.BookRepository bookRepository = null;
    
    public AuthorService(@org.jetbrains.annotations.NotNull
    ucc.repositories.AuthorRepository authorRepository, @org.jetbrains.annotations.NotNull
    ucc.repositories.BookRepository bookRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.transaction.Transactional
    public reactor.core.publisher.Mono<java.lang.Void> setupData() {
        return null;
    }
}
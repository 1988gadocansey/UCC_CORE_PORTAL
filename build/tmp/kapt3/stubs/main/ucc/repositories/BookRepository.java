package ucc.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\bg\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\'J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000b\u0010\b\u001a\u00070\u0003\u00a2\u0006\u0002\b\tH\'J1\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u00022\u0010\u0010\r\u001a\fH\f\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0002\b\tH\'\u00a2\u0006\u0002\u0010\u000fJ2\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\f0\u000b\"\n\b\u0000\u0010\f*\u0004\u0018\u00010\u00022\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u0002H\f0\u0012\u00a2\u0006\u0002\b\u000e\u00a2\u0006\u0002\b\tH\'\u00a8\u0006\u0013"}, d2 = {"Lucc/repositories/BookRepository;", "Lio/micronaut/data/repository/reactive/ReactiveStreamsCrudRepository;", "Lucc/domain/Book;", "", "findAll", "Lreactor/core/publisher/Flux;", "findById", "Lreactor/core/publisher/Mono;", "id", "Ljavax/validation/constraints/NotNull;", "save", "Lorg/reactivestreams/Publisher;", "S", "entity", "Ljavax/validation/Valid;", "(Lucc/domain/Book;)Lorg/reactivestreams/Publisher;", "saveAll", "entities", "", "ucc"})
@io.micronaut.data.r2dbc.annotation.R2dbcRepository(dialect = io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES)
public abstract interface BookRepository extends io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository<ucc.domain.Book, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @io.micronaut.data.annotation.Join(value = "author")
    public abstract reactor.core.publisher.Mono<ucc.domain.Book> findById(long id);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @io.micronaut.data.annotation.Join(value = "author")
    public abstract reactor.core.publisher.Flux<ucc.domain.Book> findAll();
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @javax.transaction.Transactional(value = javax.transaction.Transactional.TxType.MANDATORY)
    public abstract <S extends ucc.domain.Book>org.reactivestreams.Publisher<S> save(S entity);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    @javax.transaction.Transactional(value = javax.transaction.Transactional.TxType.MANDATORY)
    public abstract <S extends ucc.domain.Book>org.reactivestreams.Publisher<S> saveAll(@org.jetbrains.annotations.NotNull
    java.lang.Iterable<? extends S> entities);
}
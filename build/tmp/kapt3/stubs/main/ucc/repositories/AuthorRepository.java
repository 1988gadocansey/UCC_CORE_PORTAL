package ucc.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H&J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u000b\u0010\b\u001a\u00070\u0003\u00a2\u0006\u0002\b\tH&\u00a8\u0006\n"}, d2 = {"Lucc/repositories/AuthorRepository;", "Lio/micronaut/data/repository/reactive/ReactiveStreamsCrudRepository;", "Lucc/domain/Author;", "", "findAll", "Lreactor/core/publisher/Flux;", "findById", "Lreactor/core/publisher/Mono;", "id", "Ljavax/validation/constraints/NotNull;", "ucc"})
@io.micronaut.data.r2dbc.annotation.R2dbcRepository(dialect = io.micronaut.data.model.query.builder.sql.Dialect.POSTGRES)
public abstract interface AuthorRepository extends io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository<ucc.domain.Author, java.lang.Long> {
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public abstract reactor.core.publisher.Mono<ucc.domain.Author> findById(long id);
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public abstract reactor.core.publisher.Flux<ucc.domain.Author> findAll();
}
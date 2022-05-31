package ucc.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001\u00a8\u0006\u0004"}, d2 = {"Lucc/repositories/SomeEntityRepository;", "Lio/micronaut/data/repository/reactive/ReactiveStreamsCrudRepository;", "Lucc/domain/SomeEntity;", "", "ucc"})
@io.micronaut.data.r2dbc.annotation.R2dbcRepository(dialect = io.micronaut.data.model.query.builder.sql.Dialect.MYSQL)
public abstract interface SomeEntityRepository extends io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository<ucc.domain.SomeEntity, java.lang.Long> {
}
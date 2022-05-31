package ucc.repositories

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.r2dbc.repository.ReactorCrudRepository
import io.micronaut.data.repository.reactive.ReactiveStreamsCrudRepository
import ucc.domain.SomeEntity

@R2dbcRepository(dialect = Dialect.MYSQL)
interface SomeEntityRepository : ReactiveStreamsCrudRepository<SomeEntity, Long>
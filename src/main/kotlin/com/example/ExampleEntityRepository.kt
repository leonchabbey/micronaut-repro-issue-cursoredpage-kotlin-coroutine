package com.example

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.CursoredPage
import io.micronaut.data.model.CursoredPageable
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.CrudRepository
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import io.micronaut.data.repository.kotlin.CoroutinePageableCrudRepository
import java.util.UUID


@JdbcRepository(dialect = Dialect.POSTGRES)
abstract class ExampleEntityRepository : CoroutinePageableCrudRepository<ExampleEntity, UUID> {
    abstract suspend fun find(pageable: CursoredPageable): CursoredPage<ExampleEntity>
}
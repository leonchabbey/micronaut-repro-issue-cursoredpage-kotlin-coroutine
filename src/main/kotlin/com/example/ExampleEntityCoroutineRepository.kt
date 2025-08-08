package com.example

import io.micronaut.data.jdbc.annotation.JdbcRepository
import io.micronaut.data.model.CursoredPage
import io.micronaut.data.model.CursoredPageable
import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.repository.PageableRepository
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import java.util.*


@JdbcRepository(dialect = Dialect.POSTGRES)
abstract class ExampleEntityCoroutineRepository : CoroutineCrudRepository<ExampleEntity, UUID> {
    abstract suspend fun find(pageable: CursoredPageable): CursoredPage<ExampleEntity>
}
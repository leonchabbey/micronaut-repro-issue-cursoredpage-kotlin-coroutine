package com.example

import io.micronaut.data.model.CursoredPage
import io.micronaut.data.model.CursoredPageable
import io.micronaut.data.model.Sort
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class ExampleController(private val exampleEntityRepository: ExampleEntityRepository) {
    @Get("/")
    suspend fun find(): CursoredPage<ExampleEntity> {
        return exampleEntityRepository.find(CursoredPageable.from(5, Sort.of(Sort.Order.asc("id"))))
    }
}
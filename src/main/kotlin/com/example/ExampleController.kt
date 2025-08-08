package com.example

import io.micronaut.data.model.CursoredPage
import io.micronaut.data.model.CursoredPageable
import io.micronaut.data.model.Sort
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get

@Controller
class ExampleController(
    private val exampleEntityRepository: ExampleEntityRepository,
    private val exampleEntityCoroutineRepository: ExampleEntityCoroutineRepository
) {
    @Get("/")
    suspend fun find(): CursoredPage<ExampleEntity> {
        val useCoroutineRepository = true // toggle this to switch between repositories

        val pageable = CursoredPageable.from(2, Sort.of(Sort.Order.asc("id")))
        val result = if (useCoroutineRepository) {
            exampleEntityCoroutineRepository.find(pageable) // suspend function
        } else {
            exampleEntityRepository.find(pageable) // non-suspend function
        }

        return result
    }
}
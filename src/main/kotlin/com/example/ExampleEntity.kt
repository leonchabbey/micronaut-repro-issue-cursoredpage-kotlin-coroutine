package com.example

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.*


@MappedEntity
data class ExampleEntity(
    @field:Id val id: UUID,
    val name: String,
)
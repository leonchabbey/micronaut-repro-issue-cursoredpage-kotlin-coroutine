package com.example

import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.serde.annotation.Serdeable
import java.util.*


@Serdeable.Serializable
@MappedEntity
data class ExampleEntity(
    @field:Id val id: UUID,
    val name: String,
)
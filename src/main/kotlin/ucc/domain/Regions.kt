package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.*
@Introspected
@MappedEntity
data class Regions (
    @field:Id
    val id: UUID?,
    val name: String,
)
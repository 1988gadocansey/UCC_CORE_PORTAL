package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
import java.util.*
@Introspected
@MappedEntity
data class District(
    @field:Id
    val id: UUID?,
    val name: String,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val regions: Regions?
)

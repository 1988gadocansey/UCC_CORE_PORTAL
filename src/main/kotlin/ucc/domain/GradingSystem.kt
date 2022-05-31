package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
import java.util.*
@Introspected
@MappedEntity
data class GradingSystem(
    @AutoPopulated
    @field:Id
    val id: UUID?,

    val grade: String?,
    val lower: String?,
    val upper: String?,
    val value: Int?,
    val type: String,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val affiliation: Affiliation
)

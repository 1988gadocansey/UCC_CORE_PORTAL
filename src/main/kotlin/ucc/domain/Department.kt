package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import java.time.LocalDateTime
import java.util.*
@Introspected
@MappedEntity
data class Department(
    @AutoPopulated @field:Id val id: UUID?,
    val name: String?,
    val code: String?,

    @Relation(Relation.Kind.MANY_TO_ONE)
    val faculty:  Faculty?,

    @field:Relation(
        value = Relation.Kind.ONE_TO_MANY,
        mappedBy = "department",
        cascade = [Relation.Cascade.ALL]
    )
    val programmes: List<Programme>,

    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()
)

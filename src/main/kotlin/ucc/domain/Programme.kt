package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import java.time.LocalDateTime
import java.util.*
@Introspected
@MappedEntity
data class Programme(
    @AutoPopulated @field:Id val id: UUID?,
    val name: String?,
    val code: String?,

    @Relation(Relation.Kind.MANY_TO_ONE)
    val department: Department?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val affiliation: Affiliation?,
    @field:Relation(
        value = Relation.Kind.ONE_TO_MANY,
        mappedBy = "programme",
        cascade = [Relation.Cascade.ALL]
    )
    val student: List<Student>,

    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()
)

package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import java.time.LocalDateTime
import java.util.*

@Introspected
@MappedEntity
data class StudentConstraints(
    @AutoPopulated @field:Id val id: UUID?,
    @Relation(Relation.Kind.ONE_TO_ONE)
    val student: Student?,
    val credit: Int,
    val creditDone: Int,
    val creditLeft: Int,
    val biodataUpdated: Int,
    val qualityAssurance: Boolean?,
    val liaison: Boolean?,
    val qualityAssuranceToAssessed: Int,
    val allowedRegister: Boolean?,
    val allowedToSeeResult: Boolean?,

    @field:DateCreated
val createdAt: LocalDateTime? = LocalDateTime.now(),
@field:DateUpdated
val updatedAt: LocalDateTime? = LocalDateTime.now()
)

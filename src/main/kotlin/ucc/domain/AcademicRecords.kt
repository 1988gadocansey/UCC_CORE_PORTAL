package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import java.time.LocalDateTime
import java.util.*
@Introspected
@MappedEntity
data class AcademicRecords (
    @AutoPopulated
    @field:Id
    val id: UUID?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val student: Student?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val course: Course?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val grade: GradingSystem,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val calender: Calender?,
    val status: ResultStatus=ResultStatus.Pending,
    val sync: Boolean?,
    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()
)
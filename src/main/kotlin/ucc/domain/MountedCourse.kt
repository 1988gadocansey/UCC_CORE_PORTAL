package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import java.time.LocalDateTime
import java.util.*

@Introspected
@MappedEntity
data class MountedCourse(
    @AutoPopulated @field:Id val id: UUID?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val programme: Programme?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val course: Course?,

    @Relation(Relation.Kind.MANY_TO_ONE)
    val calender: Calender?,

    @Relation(Relation.Kind.MANY_TO_ONE)
    val lecturer: User?,
    val synced: Boolean?,
    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()

)

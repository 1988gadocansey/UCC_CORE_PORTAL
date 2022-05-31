package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
import io.micronaut.data.model.naming.NamingStrategies
import java.time.LocalDate
import java.time.LocalDateTime


@Introspected
@MappedEntity
data class Student(
    @field:Id @GeneratedValue
    val id: Long?,
    val name: String,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val programme: Programme?,

    @Relation(Relation.Kind.MANY_TO_ONE)
    val level: Level?,

    @Relation(Relation.Kind.MANY_TO_MANY)
    val address: List<Address>?,

    val firstname: String,
    val lastname: String,
    val middlename: String,
    val othernames: String,

    val title: String,
    val dob: LocalDate,

    )
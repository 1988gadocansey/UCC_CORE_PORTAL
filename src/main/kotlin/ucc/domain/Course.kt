package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation

@Introspected
@MappedEntity
data class Course(
    @field:Id @GeneratedValue
    val id: Long?,
    val name: String,
    val code: String,
    val type: CourseType=CourseType.Elective,
    val credit: Int,
    val semester: Int?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val programme: Programme?,
    /*@Relation(value = Relation.Kind.MANY_TO_MANY, cascade = [Relation.Cascade.PERSIST])
    val courses: List<Course>,
    @Relation(value = Relation.Kind.ONE_TO_MANY, mappedBy = "student")
    val ratings: List<CourseRating>*/
)
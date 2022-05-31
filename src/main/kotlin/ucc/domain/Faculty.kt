package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import java.time.LocalDateTime
import java.util.*
@Introspected
@MappedEntity
data class Faculty(
    @AutoPopulated//generated value UUID does not work here.
    @field:Id val id: UUID?,

    val name: String?,
    val code: String?,

    @field:Relation(
        value = Relation.Kind.ONE_TO_MANY,
        mappedBy = "departments",
        cascade = [Relation.Cascade.ALL]
    )
    val departmentId: List<Department>?,
    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()
){
    constructor(name: String?, code: String? ) : this(null,name,code, emptyList(),null)
}

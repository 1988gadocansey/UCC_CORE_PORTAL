package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
import lombok.AllArgsConstructor
import lombok.Builder
import lombok.Data
import lombok.NoArgsConstructor
import java.util.*

@Introspected
@MappedEntity
data class Address(
    @AutoPopulated//generated value UUID does not work here.
    @field:Id val id: UUID?,
    val street: String? = null,
    val city: String? = null,
    val gpost: String? = null,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val student:  Student?,
    )
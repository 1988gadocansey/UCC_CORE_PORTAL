package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.GeneratedValue
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import io.micronaut.data.annotation.Relation
@Introspected
@MappedEntity
data class Book(
    val title: String,
    val pages: Int,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val author: Author) {
    @Id
    @GeneratedValue
    var id: Long? = null
}
package ucc.domain

import io.micronaut.core.annotation.Creator
import io.micronaut.data.annotation.*
import java.time.LocalDateTime
import java.util.*
@Embeddable
data class Base(
    @Id
    @GeneratedValue
    @field:Id val uuid: UUID?,

    @field:DateCreated
    val createdAt:LocalDateTime? = LocalDateTime.now(),

    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now(),



)

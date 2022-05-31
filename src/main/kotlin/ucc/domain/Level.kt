package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.util.*
@Introspected
@MappedEntity
data class Level(@AutoPopulated @field:Id val id: UUID?, val name: String)

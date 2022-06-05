package ucc.domain

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.DateCreated
import io.micronaut.data.annotation.DateUpdated
import io.micronaut.data.annotation.MappedEntity
import java.time.LocalDateTime
@MappedEntity
@Introspected
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy::class)
class GmailAuth {

    var login: String? = null
    var name: String? = null
    var email: String? = null
    var profilePicture: String?=null
    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now()
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()
}

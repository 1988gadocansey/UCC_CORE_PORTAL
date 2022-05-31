package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import io.micronaut.data.annotation.event.PrePersist
import java.nio.charset.StandardCharsets
import java.time.LocalDateTime
import java.util.*


@Introspected
@MappedEntity
data class User(
    @AutoPopulated @field:Id val id: UUID?,
    val username: String,
    var password: String,
    val email: String?,
    val profilePic: String?,
    val lastLogin: LocalDateTime,
    val role: Role=Role.Student,
    val status: UserStatus=UserStatus.Active,
    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()
    )
{

    @PrePersist
    fun encodePassword() {
        password = Base64.getEncoder()
            .encodeToString(password.toByteArray(StandardCharsets.UTF_8))
    }
}

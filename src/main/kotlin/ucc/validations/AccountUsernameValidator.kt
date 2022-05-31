package ucc.validations

import io.micronaut.data.annotation.event.PrePersist
import jakarta.inject.Singleton
import ucc.domain.User

@Singleton
class AccountUsernameValidator {
    @PrePersist
    fun validateUsername(account: User) {
        val username: String = account.username
        require(username.matches("[a-z0-9]+".toRegex())) { "Invalid username" }
    }
}
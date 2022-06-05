package ucc.controllers

import io.micronaut.core.annotation.Nullable
import io.micronaut.core.util.CollectionUtils
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.security.annotation.Secured
import io.micronaut.security.authentication.Authentication
import io.micronaut.security.rules.SecurityRule
import io.micronaut.views.View
import java.security.Principal
import java.util.*


//@Controller // <1>
@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/")
class HomeController {
    /*@Secured(SecurityRule.IS_ANONYMOUS) // <2>
    @View("home") // <3>
    @Get ("/")// <4>
    fun index(): Map<String, Any> {
        return HashMap()
    }*/
    @Get("/")
    @View("home")
    fun index(principal: Principal?): Map<String, Any> {
        val data = mutableMapOf<String, Any>("loggedIn" to (principal != null))
        if (principal != null) {
            data["username"] = principal.name
        }
        return data

    }

    @Secured("isAnonymous()")
    @Get("/myinfo")
    fun myinfo(@Nullable authentication: Authentication?): Map<*, *>? {
        return if (authentication == null) {
            Collections.singletonMap("isLoggedIn", false)
        } else CollectionUtils.mapOf(
            "isLoggedIn", true,
            "username", authentication.getName(),
            "roles", authentication.getRoles()
        )
    }
}
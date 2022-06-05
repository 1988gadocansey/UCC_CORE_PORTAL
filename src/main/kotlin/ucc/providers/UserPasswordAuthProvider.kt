package ucc.providers

import io.micronaut.http.HttpRequest
import io.micronaut.security.authentication.*;
 import io.micronaut.security.authentication.AuthenticationFailed
 import io.micronaut.security.authentication.AuthenticationProvider
 import io.micronaut.security.authentication.AuthenticationRequest
 import io.micronaut.security.authentication.AuthenticationResponse
import jakarta.inject.Inject
import jakarta.inject.Singleton
import org.reactivestreams.Publisher
import reactor.core.publisher.Flux
import reactor.core.publisher.FluxSink
import ucc.domain.UsersStore


@Singleton
class UserPasswordAuthProvider : AuthenticationProvider {
    @Inject
    var store: UsersStore? = null


    override fun authenticate(
        httpRequest: HttpRequest<*>?,
        req: AuthenticationRequest<*, *>?
    ): Publisher<AuthenticationResponse> {
        val username = req?.identity.toString()
        val password = req?.secret.toString()
        return Flux.create({ emitter: FluxSink<AuthenticationResponse> ->
            if (req?.identity === store!!.getUserPassword(username) && req?.secret == store!!.getUserPassword(password)) {
                emitter.next(AuthenticationResponse.success(req?.identity as String))
                emitter.complete()
            } else {
                emitter.error(AuthenticationResponse.exception())
            }
        }, FluxSink.OverflowStrategy.ERROR)
    }


}
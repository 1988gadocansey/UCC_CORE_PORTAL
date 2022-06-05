package ucc.domain

import io.micronaut.security.authentication.AuthenticationResponse
import ucc.client.GmailApiClient
import io.micronaut.security.oauth2.endpoint.authorization.state.State
import io.micronaut.security.oauth2.endpoint.token.response.OauthAuthenticationMapper
import io.micronaut.security.oauth2.endpoint.token.response.TokenResponse
import jakarta.inject.Named
import jakarta.inject.Singleton
import org.reactivestreams.Publisher
import reactor.core.publisher.Flux

//@Named("google") //
@Singleton
internal class GmailAuthMapper(private val apiClient: GmailApiClient) //
    : OauthAuthenticationMapper {

    override fun createAuthenticationResponse(
        tokenResponse: TokenResponse,
        state: State?
    ): Publisher<AuthenticationResponse> { //
        return Flux.from(apiClient.getUser("token " + tokenResponse.accessToken))
            .map { user ->
                AuthenticationResponse.success(user.login) //
            }
    }
}
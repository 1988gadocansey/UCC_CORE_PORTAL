package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lucc/domain/GmailAuthMapper;", "Lio/micronaut/security/oauth2/endpoint/token/response/OauthAuthenticationMapper;", "apiClient", "Lucc/client/GmailApiClient;", "(Lucc/client/GmailApiClient;)V", "createAuthenticationResponse", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/security/authentication/AuthenticationResponse;", "tokenResponse", "Lio/micronaut/security/oauth2/endpoint/token/response/TokenResponse;", "state", "Lio/micronaut/security/oauth2/endpoint/authorization/state/State;", "ucc"})
@jakarta.inject.Singleton
public final class GmailAuthMapper implements io.micronaut.security.oauth2.endpoint.token.response.OauthAuthenticationMapper {
    private final ucc.client.GmailApiClient apiClient = null;
    
    public GmailAuthMapper(@org.jetbrains.annotations.NotNull
    ucc.client.GmailApiClient apiClient) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.reactivestreams.Publisher<io.micronaut.security.authentication.AuthenticationResponse> createAuthenticationResponse(@org.jetbrains.annotations.NotNull
    io.micronaut.security.oauth2.endpoint.token.response.TokenResponse tokenResponse, @org.jetbrains.annotations.Nullable
    io.micronaut.security.oauth2.endpoint.authorization.state.State state) {
        return null;
    }
}
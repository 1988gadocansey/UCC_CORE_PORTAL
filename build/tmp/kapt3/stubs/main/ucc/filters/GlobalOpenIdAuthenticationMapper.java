package ucc.filters;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016\u00a8\u0006\r"}, d2 = {"Lucc/filters/GlobalOpenIdAuthenticationMapper;", "Lio/micronaut/security/oauth2/endpoint/token/response/OpenIdAuthenticationMapper;", "()V", "createAuthenticationResponse", "Lio/micronaut/security/authentication/AuthenticationResponse;", "providerName", "", "tokenResponse", "Lio/micronaut/security/oauth2/endpoint/token/response/OpenIdTokenResponse;", "openIdClaims", "Lio/micronaut/security/oauth2/endpoint/token/response/OpenIdClaims;", "state", "Lio/micronaut/security/oauth2/endpoint/authorization/state/State;", "ucc"})
@io.micronaut.context.annotation.Replaces(value = io.micronaut.security.oauth2.endpoint.token.response.DefaultOpenIdAuthenticationMapper.class)
@jakarta.inject.Singleton
public final class GlobalOpenIdAuthenticationMapper implements io.micronaut.security.oauth2.endpoint.token.response.OpenIdAuthenticationMapper {
    
    public GlobalOpenIdAuthenticationMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public io.micronaut.security.authentication.AuthenticationResponse createAuthenticationResponse(@org.jetbrains.annotations.NotNull
    java.lang.String providerName, @org.jetbrains.annotations.NotNull
    io.micronaut.security.oauth2.endpoint.token.response.OpenIdTokenResponse tokenResponse, @org.jetbrains.annotations.NotNull
    io.micronaut.security.oauth2.endpoint.token.response.OpenIdClaims openIdClaims, @org.jetbrains.annotations.Nullable
    io.micronaut.security.oauth2.endpoint.authorization.state.State state) {
        return null;
    }
}
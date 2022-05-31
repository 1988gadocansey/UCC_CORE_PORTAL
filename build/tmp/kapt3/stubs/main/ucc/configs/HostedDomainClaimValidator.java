package ucc.configs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lucc/configs/HostedDomainClaimValidator;", "Lio/micronaut/security/oauth2/endpoint/token/response/validation/OpenIdClaimsValidator;", "applicationConfiguration", "Lucc/configs/ApplicationConfiguration;", "(Lucc/configs/ApplicationConfiguration;)V", "hostedDomain", "", "validate", "", "claims", "Lio/micronaut/security/oauth2/endpoint/token/response/OpenIdClaims;", "clientConfiguration", "Lio/micronaut/security/oauth2/configuration/OauthClientConfiguration;", "providerMetadata", "Lio/micronaut/security/oauth2/client/OpenIdProviderMetadata;", "Companion", "ucc"})
@io.micronaut.context.annotation.Requires(beans = {ucc.configs.ApplicationConfiguration.class})
@jakarta.inject.Singleton
@io.micronaut.context.annotation.Requires(beans = {ucc.configs.ApplicationConfiguration.class})
public final class HostedDomainClaimValidator implements io.micronaut.security.oauth2.endpoint.token.response.validation.OpenIdClaimsValidator {
    private final java.lang.String hostedDomain = null;
    @org.jetbrains.annotations.NotNull
    public static final ucc.configs.HostedDomainClaimValidator.Companion Companion = null;
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String HOSTED_DOMAIN_CLAIM = "hd";
    
    public HostedDomainClaimValidator(@org.jetbrains.annotations.NotNull
    ucc.configs.ApplicationConfiguration applicationConfiguration) {
        super();
    }
    
    @java.lang.Override
    public boolean validate(@org.jetbrains.annotations.NotNull
    io.micronaut.security.oauth2.endpoint.token.response.OpenIdClaims claims, @org.jetbrains.annotations.NotNull
    io.micronaut.security.oauth2.configuration.OauthClientConfiguration clientConfiguration, @org.jetbrains.annotations.NotNull
    io.micronaut.security.oauth2.client.OpenIdProviderMetadata providerMetadata) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lucc/configs/HostedDomainClaimValidator$Companion;", "", "()V", "HOSTED_DOMAIN_CLAIM", "", "ucc"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}
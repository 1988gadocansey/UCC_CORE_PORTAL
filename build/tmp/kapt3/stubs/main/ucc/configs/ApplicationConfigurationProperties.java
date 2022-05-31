package ucc.configs;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0096.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lucc/configs/ApplicationConfigurationProperties;", "Lucc/configs/ApplicationConfiguration;", "()V", "hostedDomain", "", "getHostedDomain", "()Ljava/lang/String;", "setHostedDomain", "(Ljava/lang/String;)V", "ucc"})
@io.micronaut.context.annotation.ConfigurationProperties(value = "app")
@io.micronaut.context.annotation.Requires(property = "app.hosted-domain")
public final class ApplicationConfigurationProperties implements ucc.configs.ApplicationConfiguration {
    public java.lang.String hostedDomain;
    
    public ApplicationConfigurationProperties() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String getHostedDomain() {
        return null;
    }
    
    public void setHostedDomain(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
}
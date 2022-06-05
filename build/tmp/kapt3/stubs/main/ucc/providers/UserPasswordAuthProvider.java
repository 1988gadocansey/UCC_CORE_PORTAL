package ucc.providers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J.\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\r2\u0010\u0010\u000e\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u000fH\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lucc/providers/UserPasswordAuthProvider;", "Lio/micronaut/security/authentication/AuthenticationProvider;", "()V", "store", "Lucc/domain/UsersStore;", "getStore", "()Lucc/domain/UsersStore;", "setStore", "(Lucc/domain/UsersStore;)V", "authenticate", "Lorg/reactivestreams/Publisher;", "Lio/micronaut/security/authentication/AuthenticationResponse;", "httpRequest", "Lio/micronaut/http/HttpRequest;", "req", "Lio/micronaut/security/authentication/AuthenticationRequest;", "ucc"})
@jakarta.inject.Singleton
public final class UserPasswordAuthProvider implements io.micronaut.security.authentication.AuthenticationProvider {
    @org.jetbrains.annotations.Nullable
    @jakarta.inject.Inject
    private ucc.domain.UsersStore store;
    
    public UserPasswordAuthProvider() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.UsersStore getStore() {
        return null;
    }
    
    public final void setStore(@org.jetbrains.annotations.Nullable
    ucc.domain.UsersStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public org.reactivestreams.Publisher<io.micronaut.security.authentication.AuthenticationResponse> authenticate(@org.jetbrains.annotations.Nullable
    io.micronaut.http.HttpRequest<?> httpRequest, @org.jetbrains.annotations.Nullable
    io.micronaut.security.authentication.AuthenticationRequest<?, ?> req) {
        return null;
    }
}
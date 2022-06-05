package ucc.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0007J\u0014\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0004H\u0007\u00a8\u0006\u0007"}, d2 = {"Lucc/controllers/LoginAuthController;", "", "()V", "auth", "", "", "authFailed", "ucc"})
@io.micronaut.http.annotation.Controller(value = "/login")
@io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
public final class LoginAuthController {
    
    public LoginAuthController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.views.View(value = "auth")
    @io.micronaut.http.annotation.Get(value = "/auth")
    public final java.util.Map<java.lang.String, java.lang.Object> auth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.views.View(value = "auth")
    @io.micronaut.http.annotation.Get(value = "/authFailed")
    public final java.util.Map<java.lang.String, java.lang.Object> authFailed() {
        return null;
    }
}
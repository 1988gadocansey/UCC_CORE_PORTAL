package ucc.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u001e\u0010\b\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lucc/controllers/HomeController;", "", "()V", "index", "", "", "principal", "Ljava/security/Principal;", "myinfo", "authentication", "Lio/micronaut/security/authentication/Authentication;", "ucc"})
@io.micronaut.http.annotation.Controller(value = "/")
@io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
public final class HomeController {
    
    public HomeController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.views.View(value = "home")
    @io.micronaut.http.annotation.Get(value = "/")
    public final java.util.Map<java.lang.String, java.lang.Object> index(@org.jetbrains.annotations.Nullable
    java.security.Principal principal) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(value = "/myinfo")
    @io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
    public final java.util.Map<?, ?> myinfo(@org.jetbrains.annotations.Nullable
    @io.micronaut.core.annotation.Nullable
    io.micronaut.security.authentication.Authentication authentication) {
        return null;
    }
}
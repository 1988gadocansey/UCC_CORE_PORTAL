package ucc.client;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bg\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\u0007"}, d2 = {"Lucc/client/GmailApiClient;", "", "getUser", "Lorg/reactivestreams/Publisher;", "Lucc/domain/GmailAuth;", "authorization", "", "ucc"})
@io.micronaut.http.client.annotation.Client(value = "https://accounts.google.com")
@io.micronaut.http.annotation.Header(name = "User-Agent", value = "Micronaut")
public abstract interface GmailApiClient {
    
    @org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Get(value = "/user")
    public abstract org.reactivestreams.Publisher<ucc.domain.GmailAuth> getUser(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.Header(value = "Authorization")
    java.lang.String authorization);
}
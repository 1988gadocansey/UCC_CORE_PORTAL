package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u0005R,\u0010\u0003\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR,\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\t\u00a8\u0006\u0010"}, d2 = {"Lucc/domain/UsersStore;", "", "()V", "roles", "", "", "getRoles", "()Ljava/util/Map;", "setRoles", "(Ljava/util/Map;)V", "users", "getUsers", "setUsers", "getUserPassword", "username", "getUserRole", "ucc"})
@io.micronaut.context.annotation.ConfigurationProperties(value = "credentials")
public final class UsersStore {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.core.convert.format.MapFormat
    private java.util.Map<java.lang.String, java.lang.String> users;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.core.convert.format.MapFormat
    private java.util.Map<java.lang.String, java.lang.String> roles;
    
    public UsersStore() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Map<java.lang.String, java.lang.String> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.Map<java.lang.String, java.lang.String> getRoles() {
        return null;
    }
    
    public final void setRoles(@org.jetbrains.annotations.Nullable
    java.util.Map<java.lang.String, java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserPassword(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getUserRole(@org.jetbrains.annotations.NotNull
    java.lang.String username) {
        return null;
    }
}
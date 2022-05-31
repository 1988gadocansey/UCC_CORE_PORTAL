package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\t\u0010%\u001a\u00020\u0005H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\nH\u00c6\u0003J\t\u0010*\u001a\u00020\fH\u00c6\u0003J\t\u0010+\u001a\u00020\u000eH\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nH\u00c6\u0003Jw\u0010-\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\nH\u00c6\u0001J\b\u0010.\u001a\u00020/H\u0007J\u0013\u00100\u001a\u0002012\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u001bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0015\u00a8\u00066"}, d2 = {"Lucc/domain/User;", "", "id", "Ljava/util/UUID;", "username", "", "password", "email", "profilePic", "lastLogin", "Ljava/time/LocalDateTime;", "role", "Lucc/domain/Role;", "status", "Lucc/domain/UserStatus;", "createdAt", "updatedAt", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDateTime;Lucc/domain/Role;Lucc/domain/UserStatus;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getEmail", "()Ljava/lang/String;", "getId", "()Ljava/util/UUID;", "getLastLogin", "getPassword", "setPassword", "(Ljava/lang/String;)V", "getProfilePic", "getRole", "()Lucc/domain/Role;", "getStatus", "()Lucc/domain/UserStatus;", "getUpdatedAt", "getUsername", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "encodePassword", "", "equals", "", "other", "hashCode", "", "toString", "ucc"})
@io.micronaut.data.annotation.MappedEntity
@io.micronaut.core.annotation.Introspected
public final class User {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.AutoPopulated
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String username = null;
    @org.jetbrains.annotations.NotNull
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String profilePic = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDateTime lastLogin = null;
    @org.jetbrains.annotations.NotNull
    private final ucc.domain.Role role = null;
    @org.jetbrains.annotations.NotNull
    private final ucc.domain.UserStatus status = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateCreated
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateUpdated
    private final java.time.LocalDateTime updatedAt = null;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.User copy(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String profilePic, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime lastLogin, @org.jetbrains.annotations.NotNull
    ucc.domain.Role role, @org.jetbrains.annotations.NotNull
    ucc.domain.UserStatus status, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime updatedAt) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public User(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    java.lang.String username, @org.jetbrains.annotations.NotNull
    java.lang.String password, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    java.lang.String profilePic, @org.jetbrains.annotations.NotNull
    java.time.LocalDateTime lastLogin, @org.jetbrains.annotations.NotNull
    ucc.domain.Role role, @org.jetbrains.annotations.NotNull
    ucc.domain.UserStatus status, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime createdAt, @org.jetbrains.annotations.Nullable
    java.time.LocalDateTime updatedAt) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getUsername() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getProfilePic() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDateTime getLastLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Role component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Role getRole() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.UserStatus component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.UserStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
    
    @io.micronaut.data.annotation.event.PrePersist
    public final void encodePassword() {
    }
}
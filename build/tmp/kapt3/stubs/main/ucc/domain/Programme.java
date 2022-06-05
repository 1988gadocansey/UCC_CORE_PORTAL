package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b/\b\u0087\b\u0018\u00002\u00020\u0001B\u0095\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0002\u0010\u001aJ\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\u0010\u00105\u001a\u0004\u0018\u00010\u0014H\u00c6\u0003\u00a2\u0006\u0002\u0010,J\t\u00106\u001a\u00020\u000bH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0018H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\bH\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\u000bH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\rH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003J\u000f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u00c6\u0003J\u00b6\u0001\u0010A\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u00c6\u0001\u00a2\u0006\u0002\u0010BJ\u0013\u0010C\u001a\u00020\u00142\b\u0010D\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010E\u001a\u00020\u000bH\u00d6\u0001J\t\u0010F\u001a\u00020\u0005H\u00d6\u0001R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010 R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010 R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b+\u0010,R\u0011\u0010\u0016\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010)R\u0015\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\b/\u0010,R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\"\u00a8\u0006G"}, d2 = {"Lucc/domain/Programme;", "", "id", "Ljava/util/UUID;", "name", "", "code", "certificates", "Lucc/domain/Certificates;", "duration", "minCredit", "", "department", "Lucc/domain/Department;", "affiliation", "Lucc/domain/Affiliation;", "student", "", "Lucc/domain/Student;", "running", "", "showOnPortal", "semester", "createdAt", "Ljava/time/LocalDateTime;", "updatedAt", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lucc/domain/Certificates;Ljava/lang/String;ILucc/domain/Department;Lucc/domain/Affiliation;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getAffiliation", "()Lucc/domain/Affiliation;", "getCertificates", "()Lucc/domain/Certificates;", "getCode", "()Ljava/lang/String;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getDepartment", "()Lucc/domain/Department;", "getDuration", "getId", "()Ljava/util/UUID;", "getMinCredit", "()I", "getName", "getRunning", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSemester", "getShowOnPortal", "getStudent", "()Ljava/util/List;", "getUpdatedAt", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lucc/domain/Certificates;Ljava/lang/String;ILucc/domain/Department;Lucc/domain/Affiliation;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;ILjava/time/LocalDateTime;Ljava/time/LocalDateTime;)Lucc/domain/Programme;", "equals", "other", "hashCode", "toString", "ucc"})
@io.micronaut.data.annotation.MappedEntity
@io.micronaut.core.annotation.Introspected
public final class Programme {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.AutoPopulated
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String code = null;
    @org.jetbrains.annotations.Nullable
    private final ucc.domain.Certificates certificates = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String duration = null;
    private final int minCredit = 0;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Department department = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Affiliation affiliation = null;
    @org.jetbrains.annotations.NotNull
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.ONE_TO_MANY, mappedBy = "programme", cascade = {io.micronaut.data.annotation.Relation.Cascade.ALL})
    private final java.util.List<ucc.domain.Student> student = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean running = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean showOnPortal = null;
    private final int semester = 0;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateCreated
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateUpdated
    private final java.time.LocalDateTime updatedAt = null;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Programme copy(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String code, @org.jetbrains.annotations.Nullable
    ucc.domain.Certificates certificates, @org.jetbrains.annotations.Nullable
    java.lang.String duration, int minCredit, @org.jetbrains.annotations.Nullable
    ucc.domain.Department department, @org.jetbrains.annotations.Nullable
    ucc.domain.Affiliation affiliation, @org.jetbrains.annotations.NotNull
    java.util.List<ucc.domain.Student> student, @org.jetbrains.annotations.Nullable
    java.lang.Boolean running, @org.jetbrains.annotations.Nullable
    java.lang.Boolean showOnPortal, int semester, @org.jetbrains.annotations.Nullable
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
    
    public Programme(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.Nullable
    java.lang.String name, @org.jetbrains.annotations.Nullable
    java.lang.String code, @org.jetbrains.annotations.Nullable
    ucc.domain.Certificates certificates, @org.jetbrains.annotations.Nullable
    java.lang.String duration, int minCredit, @org.jetbrains.annotations.Nullable
    ucc.domain.Department department, @org.jetbrains.annotations.Nullable
    ucc.domain.Affiliation affiliation, @org.jetbrains.annotations.NotNull
    java.util.List<ucc.domain.Student> student, @org.jetbrains.annotations.Nullable
    java.lang.Boolean running, @org.jetbrains.annotations.Nullable
    java.lang.Boolean showOnPortal, int semester, @org.jetbrains.annotations.Nullable
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
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Certificates component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Certificates getCertificates() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDuration() {
        return null;
    }
    
    public final int component6() {
        return 0;
    }
    
    public final int getMinCredit() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Department component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Department getDepartment() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Affiliation component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Affiliation getAffiliation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ucc.domain.Student> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<ucc.domain.Student> getStudent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getRunning() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getShowOnPortal() {
        return null;
    }
    
    public final int component12() {
        return 0;
    }
    
    public final int getSemester() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
}
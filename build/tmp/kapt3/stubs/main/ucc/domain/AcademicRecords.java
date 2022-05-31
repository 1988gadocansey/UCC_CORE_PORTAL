package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\'\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\t\u0010)\u001a\u00020\tH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\t\u0010+\u001a\u00020\rH\u00c6\u0003J\u0010\u0010,\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010#J\u000b\u0010-\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003Jv\u0010/\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u00c6\u0001\u00a2\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u000f2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u000206H\u00d6\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010$\u001a\u0004\b\"\u0010#R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019\u00a8\u00067"}, d2 = {"Lucc/domain/AcademicRecords;", "", "id", "Ljava/util/UUID;", "student", "Lucc/domain/Student;", "course", "Lucc/domain/Course;", "grade", "Lucc/domain/GradingSystem;", "calender", "Lucc/domain/Calender;", "status", "Lucc/domain/ResultStatus;", "sync", "", "createdAt", "Ljava/time/LocalDateTime;", "updatedAt", "(Ljava/util/UUID;Lucc/domain/Student;Lucc/domain/Course;Lucc/domain/GradingSystem;Lucc/domain/Calender;Lucc/domain/ResultStatus;Ljava/lang/Boolean;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)V", "getCalender", "()Lucc/domain/Calender;", "getCourse", "()Lucc/domain/Course;", "getCreatedAt", "()Ljava/time/LocalDateTime;", "getGrade", "()Lucc/domain/GradingSystem;", "getId", "()Ljava/util/UUID;", "getStatus", "()Lucc/domain/ResultStatus;", "getStudent", "()Lucc/domain/Student;", "getSync", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUpdatedAt", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Lucc/domain/Student;Lucc/domain/Course;Lucc/domain/GradingSystem;Lucc/domain/Calender;Lucc/domain/ResultStatus;Ljava/lang/Boolean;Ljava/time/LocalDateTime;Ljava/time/LocalDateTime;)Lucc/domain/AcademicRecords;", "equals", "other", "hashCode", "", "toString", "", "ucc"})
@io.micronaut.data.annotation.MappedEntity
@io.micronaut.core.annotation.Introspected
public final class AcademicRecords {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.AutoPopulated
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Student student = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Course course = null;
    @org.jetbrains.annotations.NotNull
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.GradingSystem grade = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Calender calender = null;
    @org.jetbrains.annotations.NotNull
    private final ucc.domain.ResultStatus status = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean sync = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateCreated
    private final java.time.LocalDateTime createdAt = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.DateUpdated
    private final java.time.LocalDateTime updatedAt = null;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.AcademicRecords copy(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.Nullable
    ucc.domain.Student student, @org.jetbrains.annotations.Nullable
    ucc.domain.Course course, @org.jetbrains.annotations.NotNull
    ucc.domain.GradingSystem grade, @org.jetbrains.annotations.Nullable
    ucc.domain.Calender calender, @org.jetbrains.annotations.NotNull
    ucc.domain.ResultStatus status, @org.jetbrains.annotations.Nullable
    java.lang.Boolean sync, @org.jetbrains.annotations.Nullable
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
    
    public AcademicRecords(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.Nullable
    ucc.domain.Student student, @org.jetbrains.annotations.Nullable
    ucc.domain.Course course, @org.jetbrains.annotations.NotNull
    ucc.domain.GradingSystem grade, @org.jetbrains.annotations.Nullable
    ucc.domain.Calender calender, @org.jetbrains.annotations.NotNull
    ucc.domain.ResultStatus status, @org.jetbrains.annotations.Nullable
    java.lang.Boolean sync, @org.jetbrains.annotations.Nullable
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
    public final ucc.domain.Student component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Student getStudent() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Course component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Course getCourse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.GradingSystem component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.GradingSystem getGrade() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Calender component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Calender getCalender() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.ResultStatus component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.ResultStatus getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getSync() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getCreatedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDateTime getUpdatedAt() {
        return null;
    }
}
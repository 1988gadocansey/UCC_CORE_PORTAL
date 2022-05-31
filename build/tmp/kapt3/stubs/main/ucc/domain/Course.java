package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\bH\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\u0010\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001aJ\u000b\u0010$\u001a\u0004\u0018\u00010\rH\u00c6\u0003JZ\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010&J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010*\u001a\u00020\nH\u00d6\u0001J\t\u0010+\u001a\u00020\u0005H\u00d6\u0001R\u0011\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d\u00a8\u0006,"}, d2 = {"Lucc/domain/Course;", "", "id", "", "name", "", "code", "type", "Lucc/domain/CourseType;", "credit", "", "semester", "programme", "Lucc/domain/Programme;", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lucc/domain/CourseType;ILjava/lang/Integer;Lucc/domain/Programme;)V", "getCode", "()Ljava/lang/String;", "getCredit", "()I", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getName", "getProgramme", "()Lucc/domain/Programme;", "getSemester", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getType", "()Lucc/domain/CourseType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Lucc/domain/CourseType;ILjava/lang/Integer;Lucc/domain/Programme;)Lucc/domain/Course;", "equals", "", "other", "hashCode", "toString", "ucc"})
@io.micronaut.data.annotation.MappedEntity
@io.micronaut.core.annotation.Introspected
public final class Course {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.GeneratedValue
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String code = null;
    @org.jetbrains.annotations.NotNull
    private final ucc.domain.CourseType type = null;
    private final int credit = 0;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer semester = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Programme programme = null;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Course copy(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String code, @org.jetbrains.annotations.NotNull
    ucc.domain.CourseType type, int credit, @org.jetbrains.annotations.Nullable
    java.lang.Integer semester, @org.jetbrains.annotations.Nullable
    ucc.domain.Programme programme) {
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
    
    public Course(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.NotNull
    java.lang.String code, @org.jetbrains.annotations.NotNull
    ucc.domain.CourseType type, int credit, @org.jetbrains.annotations.Nullable
    java.lang.Integer semester, @org.jetbrains.annotations.Nullable
    ucc.domain.Programme programme) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.CourseType component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.CourseType getType() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    public final int getCredit() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSemester() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Programme component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Programme getProgramme() {
        return null;
    }
}
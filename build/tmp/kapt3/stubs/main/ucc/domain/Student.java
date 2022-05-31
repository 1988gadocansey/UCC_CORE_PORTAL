package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0011\u001a\u00020\u0005\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010\'\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001cJ\t\u0010(\u001a\u00020\u0005H\u00c6\u0003J\t\u0010)\u001a\u00020\u0013H\u00c6\u0003J\t\u0010*\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0011\u0010-\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0005H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\u008a\u0001\u00102\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u00c6\u0001\u00a2\u0006\u0002\u00103J\u0013\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00107\u001a\u000208H\u00d6\u0001J\t\u00109\u001a\u00020\u0005H\u00d6\u0001R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\r\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u001d\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0011\u0010\u000f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0011\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0011\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001a\u00a8\u0006:"}, d2 = {"Lucc/domain/Student;", "", "id", "", "name", "", "programme", "Lucc/domain/Programme;", "level", "Lucc/domain/Level;", "address", "", "Lucc/domain/Address;", "firstname", "lastname", "middlename", "othernames", "title", "dob", "Ljava/time/LocalDate;", "(Ljava/lang/Long;Ljava/lang/String;Lucc/domain/Programme;Lucc/domain/Level;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;)V", "getAddress", "()Ljava/util/List;", "getDob", "()Ljava/time/LocalDate;", "getFirstname", "()Ljava/lang/String;", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getLastname", "getLevel", "()Lucc/domain/Level;", "getMiddlename", "getName", "getOthernames", "getProgramme", "()Lucc/domain/Programme;", "getTitle", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Long;Ljava/lang/String;Lucc/domain/Programme;Lucc/domain/Level;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/time/LocalDate;)Lucc/domain/Student;", "equals", "", "other", "hashCode", "", "toString", "ucc"})
@io.micronaut.data.annotation.MappedEntity
@io.micronaut.core.annotation.Introspected
public final class Student {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.GeneratedValue
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Programme programme = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_ONE)
    private final ucc.domain.Level level = null;
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Relation(value = io.micronaut.data.annotation.Relation.Kind.MANY_TO_MANY)
    private final java.util.List<ucc.domain.Address> address = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String firstname = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String lastname = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String middlename = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String othernames = null;
    @org.jetbrains.annotations.NotNull
    private final java.lang.String title = null;
    @org.jetbrains.annotations.NotNull
    private final java.time.LocalDate dob = null;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Student copy(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    ucc.domain.Programme programme, @org.jetbrains.annotations.Nullable
    ucc.domain.Level level, @org.jetbrains.annotations.Nullable
    java.util.List<ucc.domain.Address> address, @org.jetbrains.annotations.NotNull
    java.lang.String firstname, @org.jetbrains.annotations.NotNull
    java.lang.String lastname, @org.jetbrains.annotations.NotNull
    java.lang.String middlename, @org.jetbrains.annotations.NotNull
    java.lang.String othernames, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.time.LocalDate dob) {
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
    
    public Student(@org.jetbrains.annotations.Nullable
    java.lang.Long id, @org.jetbrains.annotations.NotNull
    java.lang.String name, @org.jetbrains.annotations.Nullable
    ucc.domain.Programme programme, @org.jetbrains.annotations.Nullable
    ucc.domain.Level level, @org.jetbrains.annotations.Nullable
    java.util.List<ucc.domain.Address> address, @org.jetbrains.annotations.NotNull
    java.lang.String firstname, @org.jetbrains.annotations.NotNull
    java.lang.String lastname, @org.jetbrains.annotations.NotNull
    java.lang.String middlename, @org.jetbrains.annotations.NotNull
    java.lang.String othernames, @org.jetbrains.annotations.NotNull
    java.lang.String title, @org.jetbrains.annotations.NotNull
    java.time.LocalDate dob) {
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
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Programme component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Programme getProgramme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Level component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final ucc.domain.Level getLevel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<ucc.domain.Address> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.util.List<ucc.domain.Address> getAddress() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getFirstname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLastname() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getMiddlename() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getOthernames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.time.LocalDate getDob() {
        return null;
    }
}
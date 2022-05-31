package ucc.domain;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b:\b\u0087\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00103\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u000b\u00106\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010;\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0002\u0010+J\u000b\u0010<\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\tH\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u0010\u0010A\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001dJ\u00da\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\u0007H\u00d6\u0001J\t\u0010G\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\f\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b%\u0010\u001dR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b&\u0010\u001dR\u0015\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\'\u0010\u001dR\u0013\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\t\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\n\n\u0002\u0010,\u001a\u0004\b*\u0010+R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010.R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010.\u00a8\u0006H"}, d2 = {"Lucc/domain/Calender;", "", "id", "Ljava/util/UUID;", "year", "", "semester", "", "registrationFrom", "Ljava/time/LocalDate;", "registrationTo", "admissionFrom", "admissionTo", "openResult", "", "openAdmission", "openQA", "enterMarksFrom", "enterMarksTo", "enterMarks", "feePaymentFrom", "feePaymentTo", "specialRegistrationProgramme", "specialRegistrationLevel", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/Boolean;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "getAdmissionFrom", "()Ljava/time/LocalDate;", "getAdmissionTo", "getEnterMarks", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getEnterMarksFrom", "getEnterMarksTo", "getFeePaymentFrom", "getFeePaymentTo", "getId", "()Ljava/util/UUID;", "getOpenAdmission", "getOpenQA", "getOpenResult", "getRegistrationFrom", "getRegistrationTo", "getSemester", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getSpecialRegistrationLevel", "()Ljava/lang/String;", "getSpecialRegistrationProgramme", "getYear", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/Integer;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/Boolean;Ljava/time/LocalDate;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)Lucc/domain/Calender;", "equals", "other", "hashCode", "toString", "ucc"})
@io.micronaut.data.annotation.MappedEntity
@io.micronaut.core.annotation.Introspected
public final class Calender {
    @org.jetbrains.annotations.Nullable
    @io.micronaut.data.annotation.Id
    @io.micronaut.data.annotation.AutoPopulated
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String year = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer semester = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate registrationFrom = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate registrationTo = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate admissionFrom = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate admissionTo = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean openResult = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean openAdmission = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean openQA = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate enterMarksFrom = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate enterMarksTo = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Boolean enterMarks = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate feePaymentFrom = null;
    @org.jetbrains.annotations.Nullable
    private final java.time.LocalDate feePaymentTo = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String specialRegistrationProgramme = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String specialRegistrationLevel = null;
    
    @org.jetbrains.annotations.NotNull
    public final ucc.domain.Calender copy(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.Nullable
    java.lang.String year, @org.jetbrains.annotations.Nullable
    java.lang.Integer semester, @org.jetbrains.annotations.Nullable
    java.time.LocalDate registrationFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate registrationTo, @org.jetbrains.annotations.Nullable
    java.time.LocalDate admissionFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate admissionTo, @org.jetbrains.annotations.Nullable
    java.lang.Boolean openResult, @org.jetbrains.annotations.Nullable
    java.lang.Boolean openAdmission, @org.jetbrains.annotations.Nullable
    java.lang.Boolean openQA, @org.jetbrains.annotations.Nullable
    java.time.LocalDate enterMarksFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate enterMarksTo, @org.jetbrains.annotations.Nullable
    java.lang.Boolean enterMarks, @org.jetbrains.annotations.Nullable
    java.time.LocalDate feePaymentFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate feePaymentTo, @org.jetbrains.annotations.Nullable
    java.lang.String specialRegistrationProgramme, @org.jetbrains.annotations.Nullable
    java.lang.String specialRegistrationLevel) {
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
    
    public Calender(@org.jetbrains.annotations.Nullable
    java.util.UUID id, @org.jetbrains.annotations.Nullable
    java.lang.String year, @org.jetbrains.annotations.Nullable
    java.lang.Integer semester, @org.jetbrains.annotations.Nullable
    java.time.LocalDate registrationFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate registrationTo, @org.jetbrains.annotations.Nullable
    java.time.LocalDate admissionFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate admissionTo, @org.jetbrains.annotations.Nullable
    java.lang.Boolean openResult, @org.jetbrains.annotations.Nullable
    java.lang.Boolean openAdmission, @org.jetbrains.annotations.Nullable
    java.lang.Boolean openQA, @org.jetbrains.annotations.Nullable
    java.time.LocalDate enterMarksFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate enterMarksTo, @org.jetbrains.annotations.Nullable
    java.lang.Boolean enterMarks, @org.jetbrains.annotations.Nullable
    java.time.LocalDate feePaymentFrom, @org.jetbrains.annotations.Nullable
    java.time.LocalDate feePaymentTo, @org.jetbrains.annotations.Nullable
    java.lang.String specialRegistrationProgramme, @org.jetbrains.annotations.Nullable
    java.lang.String specialRegistrationLevel) {
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
    public final java.lang.String getYear() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getSemester() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getRegistrationFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getRegistrationTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getAdmissionFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getAdmissionTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getOpenResult() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getOpenAdmission() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getOpenQA() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getEnterMarksFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getEnterMarksTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Boolean getEnterMarks() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getFeePaymentFrom() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.time.LocalDate getFeePaymentTo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSpecialRegistrationProgramme() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSpecialRegistrationLevel() {
        return null;
    }
}
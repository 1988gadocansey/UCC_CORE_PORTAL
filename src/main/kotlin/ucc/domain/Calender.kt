package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.AutoPopulated
import io.micronaut.data.annotation.Id
import io.micronaut.data.annotation.MappedEntity
import java.time.LocalDate
import java.util.*
@Introspected
@MappedEntity
data class Calender(
    @AutoPopulated @field:Id val id: UUID?,
    val year: String?,
    val semester: Int?,
    val registrationFrom: LocalDate?,
    val registrationTo: LocalDate?,
    val admissionFrom: LocalDate?,
    val admissionTo: LocalDate?,
    val openResult: Boolean?,
    val openAdmission: Boolean?,
    val openQA: Boolean?,
    val enterMarksFrom: LocalDate?,
    val enterMarksTo: LocalDate?,
    val enterMarks: Boolean?,
    val feePaymentFrom: LocalDate?,
    val feePaymentTo: LocalDate?,
    val specialRegistrationProgramme: String?,
    val specialRegistrationLevel: String?

)

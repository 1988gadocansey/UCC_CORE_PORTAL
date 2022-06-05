package ucc.domain

import io.micronaut.core.annotation.Introspected
import io.micronaut.data.annotation.*
import io.micronaut.data.annotation.event.PrePersist
import ucc.converters.PhoneNumberFormater
import java.math.BigDecimal
import java.nio.charset.StandardCharsets
import java.time.LocalDate
import java.time.LocalDateTime
import java.util.*
import javax.validation.constraints.Digits
import javax.validation.constraints.Email
import javax.validation.constraints.Past
import javax.validation.constraints.Pattern


@Introspected
@MappedEntity
data class Student(
    @AutoPopulated
    @field:Id
    val id: UUID?,
    val firstName: String,
    val lastName: String,
    val middleName: String,
    val otherNames: String,
    val previousName: String,
    val title: Title?,
    val gender:Gender?,
    val maritalStatus: MaritalStatus=MaritalStatus.Single,
    @Past
    val dob: LocalDate,
    val studentNumber: Int?,
    val indexNumber: String?,
    val otherNumber: String,

    @Pattern(regexp="\\(\\d{3}\\)\\d{3}-\\d{4}")
    val phoneNumber: String,
    @Pattern(regexp="\\(\\d{3}\\)\\d{3}-\\d{4}")
    val altPhoneNumber: String,
    @Email
    val email: String?,
    @Relation(Relation.Kind.MANY_TO_MANY)
    val address: List<Address>?,
    val postGprs: String?,
    val nhis: String?,
    val ghanaCard: String?,
    val homeTown:String?,
    val district: District?,
    val country: Countries?,
    val disabled: Boolean?,
    val guildianName:String?,
    val guildianAddress: String?,
    val guildianOccupation: String?,
    val guildianPhone: String?,
    @Email
    val guildianEmail:String?,
    val guildianRelationship: String?,
    val disabilities: Disabilities=Disabilities.Normal,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val programme: Programme?,
    @Relation(Relation.Kind.MANY_TO_ONE)
    val level: Level?,
    val levelAdmitted: Level?,
    @Past
    val dateAdmitted: LocalDate?,
    val studentType: StudentType=StudentType.Regular,
    @Digits(integer=6, fraction=2)
    val bills: BigDecimal?,
    @Digits(integer=6, fraction=2)
    val paid: BigDecimal?,
    @Digits(integer=6, fraction=2)
    val outstanding: BigDecimal?,
    @Digits(integer=6, fraction=2)
    val cgpa: BigDecimal?,
    val classObtained: String?,
    @Relation(Relation.Kind.ONE_TO_ONE)
    val studentConstraints: StudentConstraints?,
    val halls: Halls?,
    val hostel: String?,
    val roomNumber: String?,
    val matriculated: Boolean?,
    @field:DateCreated
    val createdAt: LocalDateTime? = LocalDateTime.now(),
    @field:DateUpdated
    val updatedAt: LocalDateTime? = LocalDateTime.now()


    ) {

}
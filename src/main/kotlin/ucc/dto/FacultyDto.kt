package ucc.dto

import io.micronaut.data.annotation.Id
import java.util.*

data class FacultyDto(
    @field:Id val id: UUID?,

    val name: String?,
    val code: String?,
)

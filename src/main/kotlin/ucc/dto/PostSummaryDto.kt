package ucc.dto

import java.time.LocalDateTime
import java.util.*

data class PostSummaryDto(val id: UUID, val  title:String, val createdAt: LocalDateTime) {
}
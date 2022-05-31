package ucc.dto

import ucc.domain.Status
import java.time.LocalDateTime
import java.util.*

data class PostDetailsDto(val id: UUID, val title: String, val content: String, val status: Status, val createdAt: LocalDateTime)

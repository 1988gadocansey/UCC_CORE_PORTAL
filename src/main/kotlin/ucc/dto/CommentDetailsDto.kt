package ucc.dto

import java.time.LocalDateTime
import java.util.UUID


data class CommentDetailsDto(val id:UUID, val content: String, val createdAt: LocalDateTime){

}

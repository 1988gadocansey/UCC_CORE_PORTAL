package ucc.dto

import javax.validation.constraints.NotBlank

data class UpdatePostCommand(@NotBlank val title:String, @NotBlank val  content: String) {
}
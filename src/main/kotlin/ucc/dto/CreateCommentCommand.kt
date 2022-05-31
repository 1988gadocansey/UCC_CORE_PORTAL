package ucc.dto

import io.micronaut.core.annotation.Introspected
import javax.validation.constraints.NotBlank
import javax.validation.constraints.Size


@Introspected
data class CreateCommentCommand(@NotBlank @Size(min = 5, max = 200) val content: String)  {

}
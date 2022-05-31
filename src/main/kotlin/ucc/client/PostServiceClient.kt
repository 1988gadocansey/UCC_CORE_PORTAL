package ucc.client

import ucc.dto.PostSummaryDto;
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.client.annotation.Client
import ucc.commands.CreatePostCommand
import ucc.dto.PageDto
import java.util.*
import javax.validation.Valid



@Client(value = "http://localhost:8080/posts")
@Header(name = "Content-Type", value = "application/json")
@Header(name = "Accept", value = "application/json")
interface PostServiceClient {
    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun getAll(
        @QueryValue(defaultValue = "") q: String?,
        @QueryValue(defaultValue = "") status: String?,
        @QueryValue(defaultValue = "0") page: Int,
        @QueryValue(defaultValue = "10") size: Int
    ): HttpResponse<PageDto<PostSummaryDto?>?>?

    @Post(uri = "/", consumes = [MediaType.APPLICATION_JSON])
    fun create(@Body dto: @Valid CreatePostCommand?): HttpResponse<Void?>?

    @Get(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    fun getById(@PathVariable id: UUID?): HttpResponse<Post?>?
}
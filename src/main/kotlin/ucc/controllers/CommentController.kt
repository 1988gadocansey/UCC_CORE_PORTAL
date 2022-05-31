package ucc.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import kotlinx.coroutines.flow.Flow
import ucc.domain.Comment
import ucc.repositories.CommentRepository
import ucc.repositories.PostRepository
import java.net.URI
import java.util.*

@Controller("/comments")
class CommentController(private val comments: CommentRepository, private val posts: PostRepository) {
    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    //fun all(): MutableHttpResponse<Flow<Comment>>? = HttpResponse.ok(comments.findAll())
    fun all(): MutableHttpResponse<Flow<Comment>>? = HttpResponse.ok(comments.findAll())

    @Get(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    suspend fun byId(@PathVariable id: UUID): HttpResponse<Any> {
        val comment = comments.findById(id) ?: return HttpResponse.notFound()
        return HttpResponse.ok(comment)
    }

    @io.micronaut.http.annotation.Post(consumes = [MediaType.APPLICATION_JSON])
    suspend fun create(@Body body: Comment): HttpResponse<Any> {
        val saved = comments.save(body)
        return HttpResponse.created(URI.create("/comments/" + saved.id))
    }
}
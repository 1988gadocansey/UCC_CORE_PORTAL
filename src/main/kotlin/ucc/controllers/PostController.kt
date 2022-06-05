package ucc.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.*
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Body
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.PathVariable
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import kotlinx.coroutines.flow.Flow
import ucc.domain.Post
import ucc.exceptions.PostNotFoundException
import ucc.repositories.PostRepository
import java.net.URI
import java.util.*

@Secured(SecurityRule.IS_ANONYMOUS)
@Controller("/posts")
class PostController(private val posts: PostRepository) {
    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    fun all(): HttpResponse<Flow<Post>> = ok(posts.findAll())

    @Get(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    suspend fun byId(@PathVariable id: UUID): HttpResponse<Any> {
       // val post = posts.findById(id) ?: return notFound()
        val post = posts.findById(id) ?: PostNotFoundException(id);
        return ok(post)
    }

    @io.micronaut.http.annotation.Post(consumes = [MediaType.APPLICATION_JSON])
    suspend fun create(@Body body: Post): HttpResponse<Any> {
        val saved = posts.save(body)
        return created(URI.create("/posts/" + saved.id))
    }

    /*@Get(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    fun getById(@PathVariable id: UUID?): HttpResponse<*>? {
        return posts.findById(id!!)
            .map { p -> ok(PostDetailsDto(p.getId(), p.getTitle(), p.getContent(), p.getStatus(), p.getCreatedAt())) }
            .orElseThrow { PostNotFoundException(id) }
    }*/
}
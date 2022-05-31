/*
package ucc.controllers

import io.micronaut.core.util.StringUtils
import io.micronaut.data.model.Page
import io.micronaut.data.model.Pageable
import io.micronaut.data.model.Sort
import io.micronaut.http.HttpResponse
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.validation.Validated
import jakarta.inject.Inject
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import lombok.RequiredArgsConstructor
import ucc.domain.Comment
import ucc.domain.Post
import ucc.domain.Status
import ucc.dto.*
import ucc.exceptions.PostNotFoundException
import ucc.repositories.*
import ucc.specifications.PostSpecifications
import java.net.URI
import java.util.*
import javax.transaction.Transactional
import javax.validation.Valid


@Controller("/blog")
//@RequiredArgsConstructor(onConstructor_ = [Inject])
@Validated
class BlogController(private val posts: BlogPostRepository?,private val comments: BlogCommentRepository) {
    //private val posts: BlogPostRepository? = null
    //private val comments: BlogCommentRepository? = null

    //    @Get(uri = "/", produces = MediaType.APPLICATION_JSON)
    //    public HttpResponse<List<PostSummaryDto>> getAll() {
    //        var body = posts.findAll()
    //                .stream()
    //                .map(p -> new PostSummaryDto(p.getId(), p.getTitle(), p.getCreatedAt()))
    //                .toList();
    //        return ok(body);
    //    }
    @Get(uri = "/", produces = [MediaType.APPLICATION_JSON])
    @Transactional
    fun getAll(
        @QueryValue(defaultValue = "") q: String?,
        @QueryValue(defaultValue = "") status: String?,
        @QueryValue(defaultValue = "0") page: Int,
        @QueryValue(defaultValue = "10") size: Int
    ): MutableHttpResponse<Page<PostSummaryDto>>? {
        val pageable = Pageable.from(page, size, Sort.of(Sort.Order.desc("createdAt")))
        val postStatus: Status = (if (StringUtils.hasText(status)) status?.let { ucc.domain.Status.valueOf(it) } else null)!!
        val data: Flow<Post> = posts.findAll(BlogPostSpecifications.filterByKeywordAndStatus(q, postStatus), pageable)
        val body: Flow<PostSummaryDto> = data.map { p -> PostSummaryDto(p.getId(), p.getTitle(), p.getCreatedAt()) }
        return HttpResponse.ok(body)
    }

    @io.micronaut.http.annotation.Post(uri = "/", consumes = [MediaType.APPLICATION_JSON])
    @Transactional
    suspend fun create(@Body dto: @Valid CreatePostCommand?): HttpResponse<Void> {
        val data: Unit =
            io.micronaut.http.annotation.Post.builder().title(dto!!.title).content(dto!!.content).build()
        val saved: Any = posts!!.save<Post>(data)
        return HttpResponse.created(URI.create("/posts/" + saved.getId()))
    }

    @Get(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    fun getById(@PathVariable id: UUID): HttpResponse<*> {
        return posts!!.findById(id)
            .map { p ->
                HttpResponse.ok(
                    PostDetailsDto(
                        p.getId(),
                        p.getTitle(),
                        p.getContent(),
                        p.getStatus(),
                        p.getCreatedAt()
                    )
                )
            }
            .orElseThrow { PostNotFoundException(id) }
        //.orElseGet(HttpResponse::notFound);
    }

    @Put(uri = "/{id}", consumes = [MediaType.APPLICATION_JSON])
    @Transactional
    fun update(@PathVariable id: UUID, @Body dto: @Valid UpdatePostCommand?): HttpResponse<*> {
        return posts!!.findById(id)
            .map { p ->
                p.setTitle(dto!!.title())
                p.setContent(dto!!.content())
                posts.save(p)
                HttpResponse.noContent()
            }
            .orElseThrow { PostNotFoundException(id) }
        //.orElseGet(HttpResponse::notFound);
    }

    @Delete(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    @Transactional
    fun deleteById(@PathVariable id: UUID): HttpResponse<*> {
        return posts!!.findById(id)
            .map { p ->
                posts.delete(p)
                HttpResponse.noContent()
            }
            .orElseThrow { PostNotFoundException(id) }
        //.orElseGet(HttpResponse::notFound);
    }

    // nested comments endpoints
    @Get(uri = "/{id}/comments", produces = [MediaType.APPLICATION_JSON])
    fun getCommentsByPostId(@PathVariable id: UUID): HttpResponse<*> {
        return posts!!.findById(id)
            .map { post ->
                val comments: Unit = comments.findByPost(post)
                HttpResponse.ok(comments.stream().map { c ->
                    CommentDetailsDto(
                        c.getId(),
                        c.getContent(),
                        c.getCreatedAt()
                    )
                })
            }
            .orElseThrow { PostNotFoundException(id) }
        //.orElseGet(HttpResponse::notFound);
    }

    @io.micronaut.http.annotation.Post(uri = "/{id}/comments", consumes = [MediaType.APPLICATION_JSON])
    @Transactional
    fun createComment(@PathVariable id: UUID, @Body dto: @Valid CreateCommentCommand?): HttpResponse<*> {
        return posts!!.findById(id)
            .map { post ->
                val data: Unit = Comment.builder().content(dto!!.content()).post(post).build()
                post.getComments().add(data)
                val saved: Any = comments!!.save<Comment>(data)
                HttpResponse.created(URI.create("/comments/" + saved.getId()))
            }
            .orElseThrow { PostNotFoundException(id) }
        // .orElseGet(HttpResponse::notFound);
    }
}*/

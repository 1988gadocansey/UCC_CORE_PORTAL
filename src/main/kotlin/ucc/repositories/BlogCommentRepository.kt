package ucc.repositories

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.jpa.kotlin.CoroutineJpaSpecificationExecutor
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import ucc.domain.Comment
import ucc.domain.Post
import java.util.*


@Repository
    interface  BlogCommentRepository : CoroutineCrudRepository<Comment, UUID>, CoroutineJpaSpecificationExecutor<Comment>  {
        fun findByPost(post: Post?): List<Comment?>?
    }

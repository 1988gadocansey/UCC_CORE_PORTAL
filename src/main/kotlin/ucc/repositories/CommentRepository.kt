package ucc.repositories

import io.micronaut.data.model.query.builder.sql.Dialect
import io.micronaut.data.r2dbc.annotation.R2dbcRepository
import io.micronaut.data.repository.jpa.kotlin.CoroutineJpaSpecificationExecutor
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import kotlinx.coroutines.flow.Flow
import ucc.domain.Comment
import ucc.domain.Post
import java.util.*

@R2dbcRepository(dialect = Dialect.POSTGRES)
interface CommentRepository : CoroutineCrudRepository<Comment, UUID>, CoroutineJpaSpecificationExecutor<Comment> {
    //fun findByPost(post: Post): Flow<Comment>
    //fun fetchAll(): Flow<Comment>

}
package ucc.repositories

import io.micronaut.data.annotation.Repository
import io.micronaut.data.repository.jpa.kotlin.CoroutineJpaSpecificationExecutor
import io.micronaut.data.repository.kotlin.CoroutineCrudRepository
import jakarta.persistence.EntityManager
import lombok.RequiredArgsConstructor
import ucc.domain.Post
import java.util.*


@Repository
//@RequiredArgsConstructor
interface BlogPostRepository : CoroutineCrudRepository<Post, UUID>, CoroutineJpaSpecificationExecutor<Post> {
     /*val entityManager: EntityManager?
    fun findAllByTitleContains(title: String): List<Post> {
        return entityManager!!.createQuery("FROM Post AS p WHERE p.title like :title", Post::class.java)
            .setParameter("title", "%$title%")
            .getResultList()
    }*/
}
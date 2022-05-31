/*
package ucc.repositories


import io.micronaut.core.util.StringUtils
import jakarta.persistence.criteria.CriteriaBuilder
import jakarta.persistence.criteria.CriteriaQuery
import jakarta.persistence.criteria.Predicate
import jakarta.persistence.criteria.Root
import ucc.domain.Post
import ucc.domain.Status
//import io.micronaut.data.jpa.repository.criteria.Specification;
import io.micronaut.data.repository.jpa.criteria.QuerySpecification


object BlogPostSpecifications {
    fun filterByKeywordAndStatus(
        keyword: String,
        status: Status?
    ): QuerySpecification<Post> {
        return QuerySpecification<Post> { root: Root<Post?>, query: CriteriaQuery<*>?, cb: CriteriaBuilder ->
            val predicates: MutableList<Predicate> = ArrayList<Predicate>()
            if (StringUtils.hasText(keyword)) {
                predicates.add(
                    cb.or(
                        cb.like(root.get("title"), "%$keyword%"),
                        cb.like(root.get("content"), "%$keyword%")
                    )
                )
            }
            if (status != null) {
                predicates.add(cb.equal(root.get<Status>("status"), status))
            }
            cb.and(predicates.toArray(arrayOfNulls<Predicate>(0)))

        }
    }
}*/

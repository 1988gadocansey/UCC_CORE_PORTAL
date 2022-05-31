package ucc.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lucc/repositories/BlogPostRepository;", "Lio/micronaut/data/repository/kotlin/CoroutineCrudRepository;", "Lucc/domain/Post;", "Ljava/util/UUID;", "Lio/micronaut/data/repository/jpa/kotlin/CoroutineJpaSpecificationExecutor;", "ucc"})
@io.micronaut.data.annotation.Repository
public abstract interface BlogPostRepository extends io.micronaut.data.repository.kotlin.CoroutineCrudRepository<ucc.domain.Post, java.util.UUID>, io.micronaut.data.repository.jpa.kotlin.CoroutineJpaSpecificationExecutor<ucc.domain.Post> {
}
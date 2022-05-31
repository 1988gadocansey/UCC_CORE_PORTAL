package ucc.repositories;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00020\u0004J\u001c\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&\u00a8\u0006\t"}, d2 = {"Lucc/repositories/BlogCommentRepository;", "Lio/micronaut/data/repository/kotlin/CoroutineCrudRepository;", "Lucc/domain/Comment;", "Ljava/util/UUID;", "Lio/micronaut/data/repository/jpa/kotlin/CoroutineJpaSpecificationExecutor;", "findByPost", "", "post", "Lucc/domain/Post;", "ucc"})
@io.micronaut.data.annotation.Repository
public abstract interface BlogCommentRepository extends io.micronaut.data.repository.kotlin.CoroutineCrudRepository<ucc.domain.Comment, java.util.UUID>, io.micronaut.data.repository.jpa.kotlin.CoroutineJpaSpecificationExecutor<ucc.domain.Comment> {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.util.List<ucc.domain.Comment> findByPost(@org.jetbrains.annotations.Nullable
    ucc.domain.Post post);
}
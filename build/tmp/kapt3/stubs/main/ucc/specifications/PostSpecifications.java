package ucc.specifications;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u0007J\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\tJ\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bJ\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u0006\u0010\u000e\u001a\u00020\u0007\u00a8\u0006\u000f"}, d2 = {"Lucc/specifications/PostSpecifications;", "", "()V", "byKeyword", "Lio/micronaut/data/repository/jpa/criteria/QuerySpecification;", "Lucc/domain/Post;", "q", "", "rejectAllPendingModerated", "Lio/micronaut/data/repository/jpa/criteria/UpdateSpecification;", "removeAllRejected", "Lio/micronaut/data/repository/jpa/criteria/DeleteSpecification;", "titleLike", "Lio/micronaut/data/repository/jpa/criteria/PredicateSpecification;", "title", "ucc"})
public final class PostSpecifications {
    @org.jetbrains.annotations.NotNull
    public static final ucc.specifications.PostSpecifications INSTANCE = null;
    
    private PostSpecifications() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.data.repository.jpa.criteria.PredicateSpecification<ucc.domain.Post> titleLike(@org.jetbrains.annotations.NotNull
    java.lang.String title) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.data.repository.jpa.criteria.QuerySpecification<ucc.domain.Post> byKeyword(@org.jetbrains.annotations.NotNull
    java.lang.String q) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.data.repository.jpa.criteria.UpdateSpecification<ucc.domain.Post> rejectAllPendingModerated() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final io.micronaut.data.repository.jpa.criteria.DeleteSpecification<ucc.domain.Post> removeAllRejected() {
        return null;
    }
}
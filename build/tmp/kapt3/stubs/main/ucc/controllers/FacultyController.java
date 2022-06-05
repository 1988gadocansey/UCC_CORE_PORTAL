package ucc.controllers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J%\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u001f\u0010\u000f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0010\u0018\u00010\u0006H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\f2\b\b\u0001\u0010\r\u001a\u00020\u0007H\u0097@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0092\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0013"}, d2 = {"Lucc/controllers/FacultyController;", "", "facultyRepository", "Lucc/repositories/FacultyRepository;", "(Lucc/repositories/FacultyRepository;)V", "byId", "Lio/micronaut/http/MutableHttpResponse;", "Lucc/domain/Faculty;", "id", "Ljava/util/UUID;", "(Ljava/util/UUID;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "create", "Lio/micronaut/http/HttpResponse;", "faculty", "(Lucc/domain/Faculty;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "index", "Lkotlinx/coroutines/flow/Flow;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "update", "ucc"})
@io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
@io.micronaut.http.annotation.Controller(value = "/faculties")
@io.micronaut.validation.Validated
public class FacultyController {
    private final ucc.repositories.FacultyRepository facultyRepository = null;
    
    public FacultyController(@org.jetbrains.annotations.NotNull
    ucc.repositories.FacultyRepository facultyRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(uri = "/index", produces = {"application/json"})
    @javax.annotation.security.PermitAll
    @io.micronaut.security.annotation.Secured(value = {"isAnonymous()"})
    public java.lang.Object index(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.micronaut.http.MutableHttpResponse<kotlinx.coroutines.flow.Flow<ucc.domain.Faculty>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Post(consumes = {"application/json"})
    @javax.transaction.Transactional
    public java.lang.Object create(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @io.micronaut.http.annotation.Body
    ucc.domain.Faculty faculty, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.micronaut.http.HttpResponse<java.lang.Object>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Get(uri = "/{id}", produces = {"application/json"})
    public java.lang.Object byId(@org.jetbrains.annotations.NotNull
    @io.micronaut.http.annotation.PathVariable
    java.util.UUID id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.micronaut.http.MutableHttpResponse<ucc.domain.Faculty>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    @io.micronaut.http.annotation.Put(consumes = {"application/json"})
    @javax.transaction.Transactional
    public java.lang.Object update(@org.jetbrains.annotations.NotNull
    @javax.validation.Valid
    @io.micronaut.http.annotation.Body
    ucc.domain.Faculty faculty, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super io.micronaut.http.HttpResponse<java.lang.Object>> continuation) {
        return null;
    }
}
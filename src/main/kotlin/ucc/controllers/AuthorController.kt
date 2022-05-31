package ucc.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import ucc.domain.Author
import ucc.repositories.AuthorRepository

@Controller("/authors")
class AuthorController(private val repository: AuthorRepository) {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun all(): Flux<Author> { // <1>
        return repository.findAll()
    }

    @Get("/id")
    fun get(id: Long): Mono<Author> { // <2>
        return repository.findById(id)
    }
}
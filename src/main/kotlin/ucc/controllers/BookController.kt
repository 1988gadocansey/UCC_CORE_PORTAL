package ucc.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import io.micronaut.security.annotation.Secured
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import ucc.domain.Book
import ucc.repositories.BookRepository
@Secured
@Controller("/books")
class BookController(private val repository: BookRepository) {
    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun all(): Flux<Book> { // <1>
        return repository.findAll()
    }

    @Get("/id")
    fun get(id: Long): Mono<Book> { // <2>
        return repository.findById(id)
    }
}
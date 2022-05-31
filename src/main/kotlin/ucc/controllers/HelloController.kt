package ucc.controllers

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import reactor.core.scheduler.Schedulers
import java.util.concurrent.Callable


@Controller("/hello")
class HelloController {

    @Get
    @Produces(MediaType.APPLICATION_JSON)
    fun index(): String {
        return "Hello Micronaut"
    }

   /* // Repository reads data from database
    // using JDBC and uses simple return types.
    private val repository: LanguagesRepository? = null

    fun LanguagesController(repository: LanguagesRepository?) {
        this.repository = repository
    }

    @Get("/{name}")
    fun findByName(name: String?): Mono<Language?>? {
        return blockingGet(Callable<T> { repository.findByName(name) })
    }

    @Get("/")
    fun findAll(): Flux<Language?>? {
        return blockingGet(Callable<T> { repository.findAll() }).flatMapMany { it: Iterable<T?>? ->
            Flux.fromIterable(
                it
            )
        }
    }

    // Run callable code on other thread pool than Netty event loop,
    // so blocking call will not block the event loop.
    private fun <T> blockingGet(callable: Callable<T>): Mono<T>? {
        return Mono.fromCallable(callable)
            .subscribeOn(Schedulers.elastic())
    }*/
}
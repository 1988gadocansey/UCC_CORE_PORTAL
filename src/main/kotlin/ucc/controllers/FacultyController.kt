package ucc.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpResponse.notFound
import io.micronaut.http.HttpResponse.ok
import io.micronaut.http.MediaType
import io.micronaut.http.MutableHttpResponse
import io.micronaut.http.annotation.*
import io.micronaut.security.annotation.Secured
import io.micronaut.security.rules.SecurityRule
import io.micronaut.validation.Validated
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import reactor.core.publisher.Mono
import ucc.domain.Faculty
import ucc.dto.FacultyDto
import ucc.exceptions.PostNotFoundException
import ucc.repositories.FacultyRepository
import java.net.URI
import java.util.*
import javax.annotation.security.PermitAll
import javax.annotation.security.RolesAllowed
import javax.transaction.Transactional
import javax.validation.Valid
@Validated
@Controller("/faculties")
@Secured(SecurityRule.IS_ANONYMOUS) // <2>
//@Secured(SecurityRule.IS_AUTHENTICATED)
class FacultyController(private val facultyRepository: FacultyRepository) {
    @Secured(SecurityRule.IS_ANONYMOUS)
    @PermitAll
    @Get(uri = "/index", produces = [MediaType.APPLICATION_JSON])
    suspend fun index(): MutableHttpResponse<Flow<Faculty>>? {
       /* String accessToken = rsp.body().accessToken
        List<Book> books = gatewayClient.toBlocking().retrieve(HttpRequest.GET("/api/gateway")
            .bearerAuth(accessToken), Argument.listOf(Book))*/
        return ok(facultyRepository.findAll())
    }
    @Transactional
    @Post(consumes = [MediaType.APPLICATION_JSON])
    suspend fun create(@Body  @Valid faculty: Faculty): HttpResponse<Any> {
        val saved = facultyRepository.save(faculty);
        return HttpResponse.created(URI.create("/faculties/" + saved.id))

    }

    @Get(uri = "/{id}", produces = [MediaType.APPLICATION_JSON])
    suspend fun byId(@PathVariable id: UUID): MutableHttpResponse<Faculty?>? {

        val faculty = facultyRepository.findById(id) ?: return notFound();
        return ok(faculty)


    }
    @Transactional
    @Put(consumes = [MediaType.APPLICATION_JSON])
    suspend fun update(@Body @Valid faculty: Faculty): HttpResponse<Any> {
        val saved = facultyRepository.update(faculty);
        return HttpResponse.created(URI.create("/faculties/" + saved.id))

    }

}
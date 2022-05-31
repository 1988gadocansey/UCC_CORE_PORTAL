package ucc.exceptions

import io.micronaut.context.annotation.Requires;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.server.exceptions.ExceptionHandler;
import io.micronaut.http.server.exceptions.response.ErrorContext;
import io.micronaut.http.server.exceptions.response.ErrorResponseProcessor;
import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;

@Produces
@Singleton
@Requires(classes = [PostNotFoundException::class])
@RequiredArgsConstructor
class PostNotFoundExceptionHandler :
    ExceptionHandler<PostNotFoundException, HttpResponse<*>> {
    private val errorResponseProcessor: ErrorResponseProcessor<*>? = null
    override fun handle(request: HttpRequest<*>?, exception: PostNotFoundException): HttpResponse<*> {
        return errorResponseProcessor!!.processResponse(
            ErrorContext.builder(request)
                .cause(exception)
                .errorMessage(exception.message)
                .build(),
            HttpResponse.notFound<Any>()
        )
    }
}
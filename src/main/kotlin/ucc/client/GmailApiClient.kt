package ucc.client

import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Header
import io.micronaut.http.client.annotation.Client
import org.reactivestreams.Publisher
import ucc.domain.GmailAuth

@Header(name = "User-Agent", value = "Micronaut")
@Client("https://accounts.google.com")
interface GmailApiClient {

    @Get("/user")
    fun getUser(@Header("Authorization") authorization: String): Publisher<GmailAuth>
}
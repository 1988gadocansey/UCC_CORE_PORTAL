package ucc.serializers

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.JsonSerializer
import com.fasterxml.jackson.databind.SerializerProvider
import io.micronaut.data.model.Page
import jakarta.inject.Singleton
import java.io.IOException


@Singleton
class PageJsonSerializer :
    JsonSerializer<Page<*>>() {
    @Throws(IOException::class)
    override fun serialize(value: Page<*>, gen: JsonGenerator, serializers: SerializerProvider) {
        gen.writeStartObject()
        gen.writeNumberField("pageNumber", value.pageNumber)
        if (value.numberOfElements != value.size) {
            //only display it in the last page when number of elements is not equal to page size.
            gen.writeNumberField("numberOfElements", value.numberOfElements)
        }
        gen.writeNumberField("size", value.size)
        gen.writeNumberField("totalPages", value.totalPages)
        gen.writeNumberField("totalSize", value.totalSize)
        gen.writeObjectField("content", value.content)
        gen.writeEndObject()
    }
}

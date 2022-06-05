package ucc.converters

import io.micronaut.data.annotation.event.PrePersist

 class PhoneNumberFormater {
    @PrePersist
    fun stringToPhone(input: String): String{
        //val input = "1234567890"

        return input.replaceFirst("(\\d{3})(\\d{3})(\\d+)".toRegex(), "($1) $2-$3")
        //(123) 456-7890

    }
}
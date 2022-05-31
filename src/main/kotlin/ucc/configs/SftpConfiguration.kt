package ucc.configs

import io.micronaut.context.annotation.Configuration
import io.micronaut.context.annotation.ConfigurationProperties

@ConfigurationProperties("sftp")
class SftpConfiguration(val username: String, val password: String, val port: Int) {
}
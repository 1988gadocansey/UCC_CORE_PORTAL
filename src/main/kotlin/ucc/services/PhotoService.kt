package ucc.services

import jakarta.inject.Inject
import jakarta.inject.Named
import jakarta.inject.Singleton
import ucc.configs.SftpConfiguration
@Singleton
class PhotoService @Inject constructor (@Named("sftp") private val  sftp: SftpConfiguration)  {

    // same as the @inject constructor.. the below is java style
   /* private val  sftp: SftpConfiguration;
    constructor(sftp: SftpConfiguration) {
        this.sftp = sftp
    }*/

    fun hello() {
       // val m=sftp.password;
        println("The password is ${sftp.password}")
    }
}
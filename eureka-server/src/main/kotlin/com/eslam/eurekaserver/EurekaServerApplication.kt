package com.eslam.eurekaserver

import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class EurekaServerApplication : CommandLineRunner {
    override fun run(vararg args: String?) {
        println("Hello from Eaureka Sever")
    }

}

fun main(args: Array<String>) {
    runApplication<EurekaServerApplication>(*args)
}

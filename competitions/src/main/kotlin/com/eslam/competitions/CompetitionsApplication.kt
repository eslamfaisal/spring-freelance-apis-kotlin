package com.eslam.competitions

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.data.jpa.repository.config.EnableJpaAuditing

@SpringBootApplication
@EnableEurekaClient
@EnableJpaAuditing
class CompetitionsApplication

fun main(args: Array<String>) {
    runApplication<CompetitionsApplication>(*args)
}

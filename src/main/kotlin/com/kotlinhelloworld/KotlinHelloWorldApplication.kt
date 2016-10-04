package com.kotlinhelloworld

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class KotlinHelloWorldApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinHelloWorldApplication::class.java, *args)
}

package com.example.GradleKotlin

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GradleKotlinApplication

fun main(args: Array<String>) {
	runApplication<GradleKotlinApplication>(*args)
}

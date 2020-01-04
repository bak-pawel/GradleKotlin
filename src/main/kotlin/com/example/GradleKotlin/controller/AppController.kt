package com.example.GradleKotlin.controller

import com.example.GradleKotlin.service.AppService
import org.springframework.stereotype.Service
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    lateinit var service: Service
    @GetMapping("/")
    fun home(model: Model): String {
        model["title"] = "home"
        return "Hej hej hej sokoły"


    }
}
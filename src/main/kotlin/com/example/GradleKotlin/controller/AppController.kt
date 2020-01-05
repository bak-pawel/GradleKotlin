package com.example.GradleKotlin.controller

import com.example.GradleKotlin.model.Doctor
import com.example.GradleKotlin.model.DoctorRepository
import com.example.GradleKotlin.service.AppService
import org.springframework.stereotype.Repository
import org.springframework.stereotype.Service
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Controller {
    lateinit var service: AppService


    @GetMapping("/go")
    fun home(): MutableList<Doctor> {
        return service.getDoctor()
    }
}
package com.example.GradleKotlin.controller

import com.example.GradleKotlin.model.Doctor
import com.example.GradleKotlin.service.AppService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/")
abstract class Controller(private    val appService: AppService) {


    @GetMapping("createDoctor")
     fun createDoctor(
            @RequestParam(value = "name", defaultValue = "")name: String,
            @RequestParam(value = "specialist",defaultValue = "")specialist: String) {
appService.createDoctor(name,specialist)
    }


}

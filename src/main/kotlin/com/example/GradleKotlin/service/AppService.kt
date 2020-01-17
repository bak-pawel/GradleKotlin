package com.example.GradleKotlin.service

import com.example.GradleKotlin.model.Doctor
import com.example.GradleKotlin.model.DoctorRepository
import org.springframework.stereotype.Service
import java.util.*

@Service

abstract class AppService(private val doctorRepository: DoctorRepository) {
    fun createDoctor(name: String, specialist: String) {
       doctorRepository.save(Doctor(UUID.randomUUID(),name,specialist))
    }

}
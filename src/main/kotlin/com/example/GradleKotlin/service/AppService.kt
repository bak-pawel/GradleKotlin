package com.example.GradleKotlin.service

import com.example.GradleKotlin.model.Doctor
import com.example.GradleKotlin.model.DoctorRepository
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class AppService {
    lateinit var repository: DoctorRepository
    fun getDoctor(): MutableList<Doctor> {
        return repository.findAll()
    }
}
package com.example.GradleKotlin.service

import com.example.GradleKotlin.model.Doctor
import com.example.GradleKotlin.model.DoctorRepository
import org.hibernate.service.spi.InjectService
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class AppService {

    lateinit var repository: DoctorRepository

    fun getAllDoctor(): MutableList<Doctor> {
        return repository.findAll()
    }
}
package com.example.GradleKotlin.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DoctorRepository: JpaRepository<Doctor, Int>
@Repository
    interface PatientRepository: JpaRepository<Patient, Int>
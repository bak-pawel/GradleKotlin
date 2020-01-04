package com.example.GradleKotlin.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface DoctorRepository: JpaRepository<Doctor, String> {
}
@Repository
    interface PatientRepository: JpaRepository<Patient, String> {
}
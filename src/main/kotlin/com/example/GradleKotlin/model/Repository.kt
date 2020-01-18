package com.example.GradleKotlin.model

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface DoctorRepository: JpaRepository<Doctor, Int>

@Repository
    interface PatientRepository: JpaRepository<Patient, Int>

@Repository
interface VisitRepository: JpaRepository<Visit, Int> {
    fun deleteById(id: UUID)
    fun findAllById(idPatient: UUID)
}
package com.example.GradleKotlin.model

import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Doctor(
        @Id
        val id: UUID,
        var name: String,
        var specialist: String)

@Entity
data class Patient(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: UUID,
        var name: String,
        var adress: String)
fun generateDoctorUUID(): UUID? {
               return UUID.randomUUID()
}
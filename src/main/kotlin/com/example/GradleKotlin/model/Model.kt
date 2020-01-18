package com.example.GradleKotlin.model

import java.sql.Time
import java.util.*
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Doctor(
        @Id
        val idDoctor: UUID,
        var name: String,
        var specialist: String)

@Entity
data class Patient(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val idPatient: UUID,
        var name: String,
        var adress: String)

@Entity
data class Visit(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        val id: UUID,
        var data: Date,
        var time: Time,
        var place: String,
        var idDoctor: UUID,
        var idPatient: UUID
)
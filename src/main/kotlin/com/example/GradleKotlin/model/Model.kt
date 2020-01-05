package com.example.GradleKotlin.model

import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Doctor(
        @Id
        var id: Int = 0,
        private var name: String ="" ,
        private var specialist: String = "")

@Entity
data class Patient(
        @Id
        var id: Int = 0,
        var name: String = "",
        var adress: String = ""
)
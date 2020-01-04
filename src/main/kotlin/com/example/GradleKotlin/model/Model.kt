package com.example.GradleKotlin.model

import javax.persistence.*
@Entity
@TableGenerator(name = "gen", allocationSize = 1, initialValue = 0)
data class Doctor(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO,generator = "gen")
        var id: Int = 0,
        private var name: String ="" ,
        private var specialist: String = "") {

}

@Entity
@TableGenerator(name = "gen", allocationSize = 1, initialValue = 0)
data class Patient(
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO,generator = "gen")
        var id: Int = 0,
        var name: String = "",
        var adress: String = ""
)

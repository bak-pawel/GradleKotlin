package com.example.GradleKotlin.service

import com.example.GradleKotlin.model.*
import org.springframework.stereotype.Service
import java.sql.Date
import java.sql.Time
import java.util.*

@Service

abstract class AppService(private val doctorRepository: DoctorRepository,
private val patientRepository: PatientRepository,
private val visitRepository: VisitRepository) {
    fun createDoctor(name: String, specialist: String) {
       doctorRepository.save(Doctor(UUID.randomUUID(),name,specialist))
    }

    fun createPatient(name: String, adress: String) {
        patientRepository.save(Patient(UUID.randomUUID(),name, adress))
    }

    fun cerateVisit(data: Date, time: Time, place: String, doctorID: UUID, patientID: UUID){
        visitRepository.save(Visit(UUID.randomUUID(),data, time, place, doctorID,patientID))
    }

    fun deleteVisit(id: UUID) {
        visitRepository.deleteById(id)
    }

    fun changeTimeVisit(id: UUID, time: Time) {
        var one =visitRepository.getOne(id.clockSequence())
        setOf(one.time)
        visitRepository.save(one)
    }

    fun getAllPatients(){
        patientRepository.findAll()
    }

    fun findByIDPatient(idPatient: UUID) {
        if(idPatient.equals("") or idPatient.equals(null)){
visitRepository.findAll()
        }else{
            visitRepository.findAllById(idPatient)
        }
    }
}
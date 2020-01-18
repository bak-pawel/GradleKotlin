package com.example.GradleKotlin.controller

import com.example.GradleKotlin.model.Doctor
import com.example.GradleKotlin.model.Patient
import com.example.GradleKotlin.service.AppService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*
import java.sql.Date
import java.sql.Time
import java.util.*

@RestController
@RequestMapping("/")
abstract class Controller(private    val appService: AppService) {


    @GetMapping("createDoctor")
     fun createDoctor(
            @RequestParam(value = "name", defaultValue = "")name: String,
            @RequestParam(value = "specialist",defaultValue = "")specialist: String) {
appService.createDoctor(name,specialist)
    }

    @GetMapping("createPatient")
    fun createPatieent(
            @RequestParam(value = "name", defaultValue = "")name: String,
            @RequestParam(value = "adress",defaultValue = "")adress: String) {
        appService.createPatient(name, adress)
    }

    @GetMapping("createVisit")
    fun createVisit(
            @RequestParam(value = "doctorID", defaultValue = "")doctorID:UUID,
            @RequestParam(value = "patientID", defaultValue = "")patientID:UUID,
            @RequestParam(value = "data", defaultValue = "")data:Date,
            @RequestParam(value = "time", defaultValue = "")time:Time,
            @RequestParam(value = "place", defaultValue = "os. Rusa 3")place:String)
    {
        appService.cerateVisit(data,time,place,doctorID,patientID)
    }

    @GetMapping("deleteVisit/{id}")
    fun deleteVisit(@PathVariable("id")id:UUID){
        appService.deleteVisit(id)
    }

    @GetMapping("changeTimeVisit/{id}/{time}")
    fun changeTimeVisit(@PathVariable("id")id:UUID,@PathVariable("time")time: Time){
        appService.changeTimeVisit(id, time)
    }

    @GetMapping("getAllPAtients")
    fun getAllPatients(){
        appService.getAllPatients()
    }

    @GetMapping("getVisit/{idPatient}")
    fun getVisitById(@PathVariable(value = "idPatient")idPatient: UUID){
        appService.findByIDPatient(idPatient)
    }
}
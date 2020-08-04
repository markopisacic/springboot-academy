package com.ag04smarts.sha.controllers;

import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.services.PatientService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(PatientController.BASE_URL)
public class PatientController {

    public static final String BASE_URL = "/api/patient";

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping
    public List<Patient> getAllPatients() {
        return patientService.findAllPatients();
    }

    @GetMapping("/{id}")
    public Patient getPatientById(@PathVariable Long id) {
        return patientService.findPatientById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Patient savePatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @PutMapping("/{id}")
    public Patient putPatient(@RequestBody Patient patient, @PathVariable Long id) {
        return patientService.updatePatient(patient, id);
    }

    @DeleteMapping("/{id}")
    public void deletePatientById(@PathVariable Long id) {
        patientService.deletePatientById(id);
    }
}

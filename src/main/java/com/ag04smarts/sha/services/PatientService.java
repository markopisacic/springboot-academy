package com.ag04smarts.sha.services;

import com.ag04smarts.sha.domain.Patient;

import java.util.List;

public interface PatientService {

    Patient findPatientById(Long id);

    List<Patient> findAllPatients();

    Patient savePatient(Patient patient);

    Patient updatePatient(Patient patient, Long id);

    void deletePatientById(Long id);
}

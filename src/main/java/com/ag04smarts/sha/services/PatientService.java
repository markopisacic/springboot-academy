package com.ag04smarts.sha.services;

import com.ag04smarts.sha.domain.Patient;

import java.util.List;

public interface PatientService {

    Patient findPatientById(Long id);
    List<Patient> findAllPatients();
}

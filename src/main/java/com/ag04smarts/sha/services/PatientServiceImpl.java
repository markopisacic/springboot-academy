package com.ag04smarts.sha.services;

import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.repositories.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientServiceImpl implements PatientService {

    private final PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    @Override
    public Patient findPatientById(Long id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }
}

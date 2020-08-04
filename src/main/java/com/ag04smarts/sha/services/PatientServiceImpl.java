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

    @Override
    public Patient savePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Patient updatePatient(Patient patient, Long id) {

        if(patientRepository.existsById(id)) {
            patient.setId(id);
//            Patient old = patientRepository.findById(patient.getId()).get();
//            old.setName(patient.getName());
//            old.setSurname(patient.getSurname());
//            old.setAge(patient.getAge());
//            old.setAddress(patient.getAddress());
//            old.setSex(patient.getSex());
//            old.setOccupation(patient.getOccupation());
//            patientRepository.save(old);
        }

        return patientRepository.save(patient);
    }

    @Override
    public void deletePatientById(Long id) {
        patientRepository.deleteById(id);
    }
}

package com.ag04smarts.sha.repositories;

import com.ag04smarts.sha.domain.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}

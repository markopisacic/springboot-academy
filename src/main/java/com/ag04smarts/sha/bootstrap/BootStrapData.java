package com.ag04smarts.sha.bootstrap;

import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.repositories.PatientRepository;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData {

    private final PatientRepository patientRepository;

    public BootStrapData(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void initData() {
        Patient p1 = new Patient();
        p1.setName("Harry");
        p1.setSurname("Potter");
        p1.setAddress("Privet drive 4, Little Whining");
        p1.setAge(14);
        p1.setOccupation("Student at Hogwarts");
        p1.setSex("Male");

        patientRepository.save(p1);

        Patient p2 = new Patient();
        p2.setName("Hermione");
        p2.setSurname("Granger");
        p2.setAddress("Maple street 8, West London");
        p2.setAge(15);
        p2.setOccupation("Student");
        p2.setSex("Female");

        patientRepository.save(p2);

        System.out.println("Patients loaded: " + patientRepository.count());
    }
}

package com.ag04smarts.sha;

import com.ag04smarts.sha.bootstrap.BootStrapData;
import com.ag04smarts.sha.domain.Patient;
import com.ag04smarts.sha.repositories.PatientRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class SHAApplication {

    private final BootStrapData bootStrapData;

    public SHAApplication(BootStrapData bootStrapData) {
        this.bootStrapData = bootStrapData;
    }

    @PostConstruct
    public void postConstruct() {
        bootStrapData.initData();
    }

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SHAApplication.class, args);

        PatientRepository patientRepository = (PatientRepository) ctx.getBean("patientRepository");

        System.out.println(patientRepository.findAll().toString());


        System.out.println("Done");
    }
}

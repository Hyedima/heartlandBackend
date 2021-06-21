package com.heartland.hartlandhms.repository;

import com.heartland.hartlandhms.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
//import org.springframework.stereotype.Repository;

public interface PatientRepository extends JpaRepository<Patient, Long>{
    void deletePatientById(Long id);

    Optional<Patient> findPatientById(Long id);
}


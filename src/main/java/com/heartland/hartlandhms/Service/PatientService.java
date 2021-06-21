package com.heartland.hartlandhms.Service;

import com.heartland.hartlandhms.exception.UserNotFoundException;
import com.heartland.hartlandhms.model.Patient;
import com.heartland.hartlandhms.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;
@Service
@Transactional
public class PatientService {
    private final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public Patient addEPatient(Patient patient) {
        patient.setHospitalID(UUID.randomUUID().toString());
        return patientRepository.save(patient);
    }

    public List<Patient> findAllPatients() {
        return patientRepository.findAll();
    }

    public Patient updatePatient(Patient patient) {
        return patientRepository.save(patient);
    }

    public Patient findPatientById(Long id) {
        return patientRepository.findPatientById(id)
                .orElseThrow(() -> {
                    return new UserNotFoundException("Patient by id " + id + " was not found");
                });
    }

    public void deletePatient(Long id){
        patientRepository.deletePatientById(id);
    }
}
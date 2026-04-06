package com.Patient_Management.patient_service.service;
import com.Patient_Management.patient_service.dto.PatientResponseDTO;
import com.Patient_Management.patient_service.mapper.PatientMapper;
import com.Patient_Management.patient_service.model.Patient;
import com.Patient_Management.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    public List<PatientResponseDTO> getPatients(){
        List<Patient> patients = patientRepository.findAll();
        List<PatientResponseDTO> patientResponseDTO = patients.stream()
                .map(PatientMapper::toDTO).toList();
        return patientResponseDTO;
    }
}

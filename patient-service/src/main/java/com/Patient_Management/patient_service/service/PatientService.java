package com.Patient_Management.patient_service.service;
import com.Patient_Management.patient_service.dto.PatientRequestDTO;
import com.Patient_Management.patient_service.dto.PatientResponseDTO;
import com.Patient_Management.patient_service.mapper.PatientMapper;
import com.Patient_Management.patient_service.model.Patient;
import com.Patient_Management.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PatientService {
    private final PatientRepository patientRepository;

    // Return All the List of Patient
    public List<PatientResponseDTO> getPatients(){
        List<Patient> patients = patientRepository.findAll();
        List<PatientResponseDTO> patientResponseDTO = patients.stream()
                .map(PatientMapper::toDTO).toList();
        return patientResponseDTO;
    }

    // Find Patient By ID
    public PatientResponseDTO getPatientById (UUID id){
      Optional<Patient> patients = patientRepository.findById(id);
      PatientResponseDTO patientResponseDTO = PatientMapper.toDTO(patients.orElseThrow(()-> new RuntimeException("Patient not found!")));
      return patientResponseDTO;
    }

    // Create Patient Request
    public PatientResponseDTO createPatient(PatientRequestDTO requestDTO){
        Patient savedPatient = patientRepository.save(PatientMapper.toEntity(requestDTO));
        return PatientMapper.toDTO(savedPatient);
    }

}

package com.Patient_Management.patient_service.service;
import com.Patient_Management.patient_service.dto.PatientRequestDTO;
import com.Patient_Management.patient_service.dto.PatientResponseDTO;
import com.Patient_Management.patient_service.exception.EmailAlreadyExitsException;
import com.Patient_Management.patient_service.exception.PatientNotFoundException;
import com.Patient_Management.patient_service.mapper.PatientMapper;
import com.Patient_Management.patient_service.model.Patient;
import com.Patient_Management.patient_service.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
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

    // Find Patient By ID Function
    public PatientResponseDTO getPatientById (UUID id){
      Optional<Patient> patients = patientRepository.findById(id);
      PatientResponseDTO patientResponseDTO = PatientMapper.toDTO(patients.orElseThrow(()-> new RuntimeException("Patient not found!")));
      return patientResponseDTO;
    }

    // Create Patient Request Function
    public PatientResponseDTO createPatient(PatientRequestDTO requestDTO){

        if(patientRepository.existsByEmail(requestDTO.getEmail())){
            throw new EmailAlreadyExitsException("A patient with this email already exists" + requestDTO.getEmail());
        }
        Patient savedPatient = patientRepository.save(PatientMapper.toEntity(requestDTO));
        return PatientMapper.toDTO(savedPatient);
    }

    // Update Patient Request Function
    public PatientResponseDTO updatePatient(UUID id, PatientRequestDTO requestDTO){
        Patient patient =  patientRepository.findById(id).orElseThrow(()-> new PatientNotFoundException("Patient not found with this Id: " + id));

        if (patientRepository.existsByEmailAndIdNot(requestDTO.getEmail(), id)) {
            throw new EmailAlreadyExitsException(
                    "A patient with this email " + "already exists: "
                            + requestDTO.getEmail());
        }
        patient.setName(requestDTO.getName());
        patient.setAddress(requestDTO.getAddress());
        patient.setEmail(requestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(requestDTO.getDateOfBirth()));

        Patient updatedPatient  = patientRepository.save(patient);
        return PatientMapper.toDTO(updatedPatient);
    }

    // Delete Patient Request Function
    public void deletePatient(UUID id) {
        patientRepository.deleteById(id);
    }

}

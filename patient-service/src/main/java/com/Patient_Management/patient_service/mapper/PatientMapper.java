package com.Patient_Management.patient_service.mapper;

import com.Patient_Management.patient_service.dto.PatientRequestDTO;
import com.Patient_Management.patient_service.dto.PatientResponseDTO;
import com.Patient_Management.patient_service.model.Patient;

import java.time.LocalDate;

public class PatientMapper {

    // Convert Patient to PatientResponseDTO
    public static PatientResponseDTO toDTO(Patient patient){
        PatientResponseDTO patientResponseDTO = new PatientResponseDTO();
        patientResponseDTO.setId(patient.getId().toString());
        patientResponseDTO.setName(patient.getName());
        patientResponseDTO.setEmail(patient.getEmail());
        patientResponseDTO.setAddress(patient.getAddress());
        patientResponseDTO.setDateOfBirth(patient.getDateOfBirth().toString());
        return  patientResponseDTO;
    }


    // Convert PatientRequest DTO to
    public static Patient toEntity(PatientRequestDTO requestDTO){
        Patient patient = new Patient();
        patient.setName(requestDTO.getName());
        patient.setAddress(requestDTO.getAddress());
        patient.setEmail(requestDTO.getEmail());
        patient.setDateOfBirth(LocalDate.parse(requestDTO.getDateOfBirth()));
        patient.setRegisteredDate(LocalDate.parse(requestDTO.getRegisteredDate()));
        return patient;
    }
}

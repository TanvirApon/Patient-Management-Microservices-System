package com.Patient_Management.patient_service.controller;

import com.Patient_Management.patient_service.dto.PatientRequestDTO;
import com.Patient_Management.patient_service.dto.PatientResponseDTO;
import com.Patient_Management.patient_service.dto.validator.CreatePatientValidationGroup;
import com.Patient_Management.patient_service.service.PatientService;
import jakarta.validation.Valid;
import jakarta.validation.groups.Default;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/patient")
public class PatientController {

    public final PatientService patientService;

    @GetMapping
    public ResponseEntity<List<PatientResponseDTO>> getPatientList(){
        List<PatientResponseDTO> patientResponseDTOList = patientService.getPatients();
        return ResponseEntity.ok().body(patientResponseDTOList);
    }

    @PostMapping
   public ResponseEntity<PatientResponseDTO> createPatient( @Validated({Default.class, CreatePatientValidationGroup.class}) @RequestBody PatientRequestDTO requestDTO){
        PatientResponseDTO patientResponseDTO = patientService.createPatient(requestDTO);
        return ResponseEntity.ok().body(patientResponseDTO);
   }

   @PutMapping("/{id}")
    public ResponseEntity<PatientResponseDTO> updatePatient(@PathVariable UUID id, @Valid @RequestBody PatientRequestDTO requestDTO){
        PatientResponseDTO patientResponseDTO = patientService.updatePatient(id,requestDTO);
        return ResponseEntity.ok().body(patientResponseDTO);
   }

   @DeleteMapping("/{id}")
   public ResponseEntity<Void> deletePatient(@PathVariable UUID id) {
           patientService.deletePatient(id);
           return ResponseEntity.noContent().build();
    }


}

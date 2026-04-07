package com.Patient_Management.patient_service.controller;

import com.Patient_Management.patient_service.dto.PatientRequestDTO;
import com.Patient_Management.patient_service.dto.PatientResponseDTO;
import com.Patient_Management.patient_service.service.PatientService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
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
   public ResponseEntity<PatientResponseDTO> createPatient(@Valid @RequestBody PatientRequestDTO requestDTO){
        PatientResponseDTO patientResponseDTO = patientService.createPatient(requestDTO);
        return ResponseEntity.ok().body(patientResponseDTO);
   }

}

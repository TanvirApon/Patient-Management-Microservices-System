package com.Patient_Management.patient_service.controller;

import com.Patient_Management.patient_service.dto.PatientResponseDTO;
import com.Patient_Management.patient_service.service.PatientService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

}

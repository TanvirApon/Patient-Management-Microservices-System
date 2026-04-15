package com.Patient_Management.patient_service.kafka;

import com.Patient_Management.patient_service.model.Patient;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import patient.events.PatientEvent;

@Service
public class KafkaProducer {

    private final KafkaTemplate<String,byte[]> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, byte[]> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(Patient patient){
        patient.events.PatientEvent patientEvent = PatientEvent.newBuilder()
                .setPatientId(patient.getId().toString())
                .setName(patient.getName())
                .setEmail(patient.getEmail())
                .setEventType("PATIENT CREATED")
                .build();
        try{
            kafkaTemplate.send("patient",patientEvent.toByteArray());
        }catch( Exception ex){
            ex.printStackTrace();
        }
    }

}

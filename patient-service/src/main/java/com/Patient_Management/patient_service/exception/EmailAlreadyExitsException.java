package com.Patient_Management.patient_service.exception;

public class EmailAlreadyExitsException extends RuntimeException {
    public EmailAlreadyExitsException(String message) {
        super(message);
    }
}

package com.hospital.management.hospitalmanagementapi.dto.patient;

import com.hospital.management.hospitalmanagementapi.model.Patient;

/**
 * Data transfer object used to format and display only the public data allowed for patient entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record PatientPublicDataDto(String name, String email, String cpf) {

    public PatientPublicDataDto (Patient patient) {
        this(patient.getName(), patient.getEmail(), patient.getCpf());
    }

}

package com.hospital.management.hospitalmanagementapi.dto.doctor;

import com.hospital.management.hospitalmanagementapi.enums.Speciality;
import com.hospital.management.hospitalmanagementapi.model.Doctor;

public record DoctorPublicDataDto(String name, String email, String crm, Speciality speciality) {

    public DoctorPublicDataDto (Doctor doctor) {
        this(doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpeciality());
    }

}

package com.hospital.management.hospitalmanagementapi.dto.consultation;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.hospital.management.hospitalmanagementapi.enums.Speciality;
import com.hospital.management.hospitalmanagementapi.validators.constraints.ConsultationDateBusinessHours;
import com.hospital.management.hospitalmanagementapi.validators.constraints.ConsultationDateScheduledInAdvance;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

/**
 * Data transfer object used to transfer data that will be saved in consultation entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record ConsultationDto(

        Long doctorId,
        @NotNull(message = "patient id cannot be null")
        Long patientId,
        @NotNull(message = "consultation date cannot be null")
        @Future
        @JsonFormat(pattern = "DD/MM/YYYY HH:mm")
        @ConsultationDateBusinessHours
        @ConsultationDateScheduledInAdvance
        LocalDateTime consultationDate,
        Speciality speciality) {}

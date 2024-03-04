package com.hospital.management.hospitalmanagementapi.dto.doctor;

import com.hospital.management.hospitalmanagementapi.dto.AddressDto;
import com.hospital.management.hospitalmanagementapi.enums.Speciality;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

/**
 * Data transfer object required to transfer data that will be saved in doctor entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record DoctorDto(

        @NotBlank(message = "name cannot be empty")
        String name,
        @NotBlank(message = "email cannot be empty")
        @Email(message = "invalid format for email")
        String email,
        @NotBlank(message = "crm cannot be empty")
        @Pattern(regexp = "\\d{11}", message = "invalid format for crm")
        String crm,
        @NotBlank(message = "telephone cannot be empty")
        String telephone,
        @NotNull(message = "speciality cannot be null")
        @Valid
        Speciality speciality,
        @NotNull(message = "address cannot be null")
        @Valid
        AddressDto address) {
}

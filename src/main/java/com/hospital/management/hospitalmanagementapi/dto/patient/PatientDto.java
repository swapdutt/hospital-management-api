package com.hospital.management.hospitalmanagementapi.dto.patient;

import com.hospital.management.hospitalmanagementapi.dto.AddressDto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.Valid;

/**
 * Data transfer object required to transfer data that will be saved in patient entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record PatientDto(

        @NotBlank(message = "name cannot be empty")
        String name,
        @NotBlank(message = "email cannot be empty")
        @Email(message = "invalid cannot be empty")
        String email,
        @NotBlank(message = "cpf cannot be blank")
        @Pattern(regexp = "\\d{11}", message = "invalid format for cpf")
        String cpf,
        @NotBlank(message = "telephone cannot be empty")
        String telephone,
        @NotNull(message = "address cannot be empty")
        @Valid
        AddressDto address) {}

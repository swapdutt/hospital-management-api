package com.hospital.management.hospitalmanagementapi.dto.patient;

import com.hospital.management.hospitalmanagementapi.dto.AddressDto;
import jakarta.validation.constraints.NotBlank;

/**
 * Data transfer object used to update allowed data in Patient entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record PatientUpdatedDataDto(
        @NotBlank(message = "id cannot be empty")
        Long id,
        String name,
        String telephone,
        AddressDto address) {}

package com.hospital.management.hospitalmanagementapi.dto.doctor;

import com.hospital.management.hospitalmanagementapi.dto.AddressDto;
import jakarta.validation.constraints.NotNull;

/**
 * Data transfer object used to update allowed data in doctor entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record DoctorUpdatedDataDto(
        @NotNull(message = "id cannot be null")
        Long id,
        String name,
        String telephone,
        AddressDto address) {}

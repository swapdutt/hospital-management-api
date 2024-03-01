package com.hospital.management.hospitalmanagementapi.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

/**
 * Data transfer object required to transfer data that will be saved in address entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record AddressDto(
        @NotBlank(message = "street cannot be empty")
        String street,
        @NotBlank(message = "neighbourhood cannot be empty")
        String neighbourhood,
        @NotBlank(message = "zipcode cannot be empty")
        @Pattern(regexp = "\\d{8}", message = "invalid format for zipcode")
        String zipCode,
        @NotBlank(message = "city cannot be empty")
        String city,
        @NotBlank(message = "state cannot be empty")
        String state,
        String additionalDetails,
        String houseNumber) {}

package com.hospital.management.hospitalmanagementapi.dto.auth;

import jakarta.validation.constraints.NotBlank;

/**
 * Data transfer object used to store the user information requested to perform authentication operations
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record UserDto(

        @NotBlank(message = "login cannot be blank")
        String login,
        @NotBlank(message = "password cannot be blank")
        String password) {}

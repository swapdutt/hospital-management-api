package com.hospital.management.hospitalmanagementapi.dto.consultation;

import com.hospital.management.hospitalmanagementapi.enums.ReasonCancellation;
import jakarta.validation.constraints.NotNull;

/**
 * Data transfer object used to transfer data about cancellation that will be updated in consultation entity
 *
 * @author Swapnadeep Dutta
 * @version 1.0
 */

public record ConsultationCancelledDto(
        @NotNull
        Long consultationId,
        @NotNull
        ReasonCancellation reasonCancellation) {}

package com.hospital.management.hospitalmanagementapi.validators;

import com.hospital.management.hospitalmanagementapi.validators.constraints.ConsultationDateScheduledInAdvance;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.Duration;
import java.time.LocalDateTime;

public class ConsultationDateScheduledInAdvanceValidator implements ConstraintValidator<ConsultationDateScheduledInAdvance, LocalDateTime> {
    @Override
    public boolean isValid(LocalDateTime value, ConstraintValidatorContext context) {

        LocalDateTime now = LocalDateTime.now();
        long diff = Duration.between(now,value).toMinutes();
        return diff >= 30L;

    }
}

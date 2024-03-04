package com.hospital.management.hospitalmanagementapi.validators;

import com.hospital.management.hospitalmanagementapi.validators.constraints.ConsultationDateBusinessHours;
import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

public class ConsultationDateBusinessHoursValidator implements ConstraintValidator<ConsultationDateBusinessHours, LocalDateTime> {

    private Long businessHourStart;
    private Long businessHourEnd;

    @Override
    public void initialize(ConsultationDateBusinessHours constraintAnnotation) {
        businessHourStart = 7L;
        businessHourEnd = 19L;
    }

    @Override
    public boolean isValid(LocalDateTime value, ConstraintValidatorContext context) {

        return !value.getDayOfWeek().equals(DayOfWeek.SUNDAY) && value.getHour() >= businessHourStart && value.getHour() <= businessHourEnd;

    }
}

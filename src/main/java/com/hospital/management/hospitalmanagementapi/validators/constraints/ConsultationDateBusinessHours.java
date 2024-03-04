package com.hospital.management.hospitalmanagementapi.validators.constraints;

import com.hospital.management.hospitalmanagementapi.validators.ConsultationDateBusinessHoursValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = ConsultationDateBusinessHoursValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConsultationDateBusinessHours {

    String message() default "Invalid consultation date. The business hours are Monday to Saturday, from 07:00 to 19:00";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

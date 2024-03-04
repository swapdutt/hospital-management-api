package com.hospital.management.hospitalmanagementapi.validators.constraints;

import com.hospital.management.hospitalmanagementapi.validators.ConsultationDateScheduledInAdvanceValidator;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.*;

@Constraint(validatedBy = ConsultationDateScheduledInAdvanceValidator.class)
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface ConsultationDateScheduledInAdvance {

    String message() default "This consultation must be scheduled at least 30 minutes in advance";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}

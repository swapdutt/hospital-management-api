package com.hospital.management.hospitalmanagementapi.enums;

/**
 * Reasons for the consultation was cancelled
 * @see #PATIENT_GAVE_UP
 * @see #DOCTOR_CANCELLED
 * @see #OTHER
 */

public enum ReasonCancellation {

    PATIENT_GAVE_UP, // Patient gave up to attend the consultation date
    DOCTOR_CANCELLED, // Doctor cancelled the consultation date and will reschedule later
    OTHER; // Any other reasons

}

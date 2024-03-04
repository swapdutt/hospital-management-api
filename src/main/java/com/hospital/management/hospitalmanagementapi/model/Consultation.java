package com.hospital.management.hospitalmanagementapi.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.hospital.management.hospitalmanagementapi.enums.ReasonCancellation;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * @author Swapnadeep Dutta
 * @version 1.0
 */

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "CONSULTATION")
public class Consultation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull(message = "consultation date cannot be null")
    private LocalDateTime consultationDate;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Patient patient;
    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Doctor doctor;
    private Boolean cancelled;
    @Enumerated(EnumType.STRING)
    private ReasonCancellation reasonCancellation;

    /**
     * Constructor for class Consultation
     * @param patient Patient who scheduled the consultation
     * @param doctor Doctor who will be at the consultation
     * @param consultationDate Scheduled date for the consultation
     */

    public Consultation (Patient patient, Doctor doctor, LocalDateTime consultationDate) {
        this.patient = patient;
        this.doctor = doctor;
        this.consultationDate = consultationDate;
        this.cancelled = false;
    }

}

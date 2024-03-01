package com.hospital.management.hospitalmanagementapi.model;

import com.hospital.management.hospitalmanagementapi.dto.patient.PatientDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Swapnadeep Dutta
 * @version 1.0
 */

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PATIENT")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name cannot be empty")
    private String name;
    @NotBlank(message = "email cannot be empty")
    private String email;
    @NotBlank(message = "cpf cannot be empty")
    @Pattern(regexp = "\\d{11}", message = "invalid format of cpf")
    private String cpf;
    @NotBlank(message = "telephone cannot be empty")
    private String telephone;
    @NotNull(message = "active cannot be null")
    private Boolean active;
    @NotNull(message = "address cannot be null")
    @Embedded
    private Address address;

    /**
     * Constructor for patient class
     * @param patientDto : Data transfer object containing patient entity information
     * @see PatientDto
     */

    public Patient(PatientDto patientDto) {
        this.active=true;
        this.name=patientDto.name();
        this.email=patientDto.email();
        this.cpf=patientDto.cpf();
        this.telephone=patientDto.telephone();
        this.address = new Address(patientDto.address());
    }

}

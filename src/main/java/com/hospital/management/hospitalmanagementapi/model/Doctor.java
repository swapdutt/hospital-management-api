package com.hospital.management.hospitalmanagementapi.model;

import com.hospital.management.hospitalmanagementapi.dto.doctor.DoctorDto;
import com.hospital.management.hospitalmanagementapi.enums.Speciality;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

/**
 * @author Swapnadeep Dutta
 * @version 1.0
 */

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "DOCTOR")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank(message = "name cannot be empty")
    private String name;
    @NotBlank(message = "email cannot be empty")
    private String email;
    @NotBlank(message = "crm cannot be empty")
    @Length(max = 6)
    private String crm;
    @NotBlank(message = "telephone cannot be empty")
    private String telephone;
    @NotNull(message = "speciality cannot be null")
    @Enumerated(EnumType.STRING)
    private Speciality speciality;
    @NotNull(message = "active cannot be null")
    private Boolean active;
    @NotNull(message = "address cannot be null")
    @Embedded
    private Address address;

    /**
     * Constructor for class Doctor
     * @param doctorDto : Data transfer object containing doctor entity information
     * @see DoctorDto
     */

    public Doctor (DoctorDto doctorDto) {
        this.active = true;
        this.name = doctorDto.name();
        this.email = doctorDto.email();
        this.crm = doctorDto.crm();
        this.telephone = doctorDto.telephone();
        this.speciality = doctorDto.speciality();
        this.address = new Address(doctorDto.address());
    }


}

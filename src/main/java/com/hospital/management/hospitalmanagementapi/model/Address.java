package com.hospital.management.hospitalmanagementapi.model;

import com.hospital.management.hospitalmanagementapi.dto.AddressDto;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
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
@Table(name = "ADDRESS")
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotBlank(message = "street cannot be empty")
    private String street;
    @NotBlank(message = "neighbourhood cannot be empty")
    private String neighbourhood;
    @NotBlank(message = "zipcode cannot be empty")
    @Pattern(regexp = "\\d{8}", message = "invalid format for zipcode")
    private String zipCode;
    @NotBlank(message = "city cannot be empty")
    private String city;
    @NotBlank(message = "state cannot be empty")
    private String state;
    private String additionalDetails;
    private String houseNumber;

    /**
     * Constructor for class Address
     * @param addressDto : Data transfer object containing address entity information
     * @see AddressDto
     */

    public Address (AddressDto addressDto) {
        this.street = addressDto.street();
        this.neighbourhood = addressDto.neighbourhood();
        this.zipCode = addressDto.zipCode();
        this.city = addressDto.city();
        this.state = addressDto.state();
        this.additionalDetails = addressDto.additionalDetails();
        this.houseNumber = addressDto.houseNumber();
    }

}

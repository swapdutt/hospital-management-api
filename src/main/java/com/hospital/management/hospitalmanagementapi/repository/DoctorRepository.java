package com.hospital.management.hospitalmanagementapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.hospitalmanagementapi.model.Doctor;

/**
 * Repository interface for retrieving and manipulating all user objects using
 * their unique long identifier.
 * 
 * @author Swapnadeep Dutta
 * @version 1.0
 */

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {

}
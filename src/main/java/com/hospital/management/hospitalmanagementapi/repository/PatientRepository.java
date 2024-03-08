package com.hospital.management.hospitalmanagementapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hospital.management.hospitalmanagementapi.model.Patient;

/**
 * Repository interface for retrieving and manipulating all user objects using
 * their unique long identifier.
 * 
 * @author Swapnadeep Dutta
 * @version 1.0
 */

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

	/**
	 * Find active patient list
	 * 
	 * @param pageable : Pagination information, such as page number and size
	 * @return : a paginated list with active stored patient if successful or null
	 *         if there is an error
	 */

	Page<Patient> findPatientsByActiveTrue(Pageable pageable);

}

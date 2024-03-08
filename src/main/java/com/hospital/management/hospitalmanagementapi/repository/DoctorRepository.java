package com.hospital.management.hospitalmanagementapi.repository;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.management.hospitalmanagementapi.enums.Speciality;
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

	/**
	 * Find active doctor list
	 * 
	 * @param pageable : Pagination information, such as page number and size
	 * @return : a paginated list with active stored doctor if successful or null if
	 *         there is an error
	 */

	Page<Doctor> findDoctorsByActiveTrue(Pageable pageable);

	@Query(value = "select d from Doctor d where d.active = true and specilaity = :speciality and d.id not in "
			+ "(select c from Consultation c where c.doctor.id = :patientId and c.consultationDate = :consultationDate and c.cancelled = false) order by rand() limit 1")
	Doctor findOneFreeDoctorBySpeciality(Speciality speciality, LocalDateTime consultationDate);

}

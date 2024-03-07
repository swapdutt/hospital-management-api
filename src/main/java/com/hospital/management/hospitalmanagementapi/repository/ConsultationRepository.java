package com.hospital.management.hospitalmanagementapi.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hospital.management.hospitalmanagementapi.model.Consultation;

/**
 * Repository interface for retrieving and manipulating all consultation objects
 * using their unique long identifier.
 * 
 * @author Swapnadeep Dutta
 * @version 1.0
 */

@Repository
public interface ConsultationRepository extends JpaRepository<Consultation, Long> {

	/**
	 * Find Consultation by patient id and consultation date
	 * 
	 * @param patientId        : the patient's id from the consultation
	 * @param consultationDate : the date of consultation
	 * @return : the corresponding consultation if successful or null if it's
	 *         non-existent
	 */

	@Query("select c from Consultation c where c.patient.id = :patientId and c.consultationDate = :consultationDate and c.cancelled = false")
	Consultation findConsultationByPatientAndDate(Long patientId, LocalDateTime consultationDate);

	/**
	 * Find Consultation by patient id and consultation date
	 * 
	 * @param doctorId         : the doctor's id from the consultation
	 * @param consultationDate : the date of consultation
	 * @return : the corresponding consultation if successful or null if it's
	 *         non-existent
	 */

	@Query("select c from Consultation c where c.doctor.id = :patientId and c.consultationDate = :consultationDate and c.cancelled = false")
	Consultation findConsultationByDoctorAndDate(Long doctorId, LocalDateTime consultationDate);

}

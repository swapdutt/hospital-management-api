package com.hospital.management.hospitalmanagementapi.repository.auth;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Repository;

import com.hospital.management.hospitalmanagementapi.model.auth.User;

/**
 * Repository interface for retrieving and manipulating all user objects using
 * their unique long identifier.
 * 
 * @author Swapnadeep Dutta
 * @version 1.0
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

	/**
	 * Find user by passing login parameters
	 * 
	 * @param login : A string representing the user's system login
	 * @return : The corresponding user information if successful or null if it's
	 *         non-existent
	 */

	UserDetails findUserByLogin(String login);

}

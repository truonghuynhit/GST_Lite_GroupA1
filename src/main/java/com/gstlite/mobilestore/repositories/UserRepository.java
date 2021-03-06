package com.gstlite.mobilestore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gstlite.mobilestore.entites.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
	/**
	 * Sign in
	 * @param username
	 * @param password
	 * @return User
	 */
	public User findByUsernameAndPassword(String username, String password);
}

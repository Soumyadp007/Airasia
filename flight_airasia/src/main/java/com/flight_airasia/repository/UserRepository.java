package com.flight_airasia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.flight_airasia.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String emailId);

}

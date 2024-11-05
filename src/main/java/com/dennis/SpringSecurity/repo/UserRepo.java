package com.dennis.SpringSecurity.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dennis.SpringSecurity.model.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {

	Users findByUsername(String username);
}

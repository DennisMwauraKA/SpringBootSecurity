package com.dennis.SpringSecurity.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dennis.SpringSecurity.model.Users;
import com.dennis.SpringSecurity.repo.UserPrincipal;
import com.dennis.SpringSecurity.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	private UserRepo repo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		Users user = repo.findByUsername(username);

		if (user == null) {
			System.out.println("User not found");
			throw new UsernameNotFoundException("User Not found");
		}
		return new UserPrincipal(user);
	}

}

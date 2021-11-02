package com.codingdojo.services;

import org.springframework.stereotype.Service;

import com.codingdojo.repositories.UserRepository;

@Service
public class UsersService {
	
	private final UserRepository userRepository;
	
	public UsersService( UserRepository userRepository ) {
		this.userRepository = userRepository;
	}
}

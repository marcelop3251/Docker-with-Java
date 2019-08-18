package com.invillia.dockerjava.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.invillia.dockerjava.entity.User;
import com.invillia.dockerjava.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> list() {
		return repository.findAll();
	}

	public User save(User user) {
		return repository.save(user);
	}

	public User findUserById(Long idUser) {
		return repository.findById(idUser).orElseThrow(() -> new RuntimeException("User Not Found"));
	}
	
}

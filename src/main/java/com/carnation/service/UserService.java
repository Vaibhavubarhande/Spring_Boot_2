package com.carnation.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carnation.Repository.UserRepository;
import com.carnation.model.User;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	public User saveUser(User user) {
		
		return userRepository.save(user);
		
	}
	
	public List<User> getUsers(){
		
		return userRepository.findAll();
	}
	
	public User getUserById(Long id) {
		
		return userRepository.findById(id).get();
	}

	public void deleteUser(long id) {
		
		userRepository.deleteById(id);
		
	}
}


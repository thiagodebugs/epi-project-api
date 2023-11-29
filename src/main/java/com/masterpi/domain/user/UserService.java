package com.masterpi.domain.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	public User save(User user) {
		return userRepository.save(user);
	}
	
	public List<User> findAll() {
		return userRepository.findAll();
	}
	
	public User findById(Integer id) {
		return userRepository.findById(id).get();
	}
	
	public void deleteById(Integer id) {
		userRepository.deleteById(id);
	}
	
}

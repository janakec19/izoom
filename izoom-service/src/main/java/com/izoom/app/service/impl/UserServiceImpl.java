package com.izoom.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.izoom.app.exception.ResourceNotFoundException;
import com.izoom.app.model.User;
import com.izoom.app.repository.UserRepository;
import com.izoom.app.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Override
	public User getUserById(Long userId) {
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User", "id", userId));
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User userDetails) {
		User user = userRepository.findById(userDetails.getId()).orElseThrow(
				() -> new ResourceNotFoundException("User", "id", userDetails.getId()));
		user.setIntroduction(userDetails.getIntroduction());
		User updated = userRepository.save(user);
		return updated;
	}

	@Override
	public void delete(Long userId) {
		User user = userRepository.findById(userId).orElseThrow(
				() -> new ResourceNotFoundException("User", "id", userId));

		userRepository.delete(user);

	}

}

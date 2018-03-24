package com.izoom.app.service;

import java.util.List;

import com.izoom.app.model.User;

public interface UserService {

	User getUserById(Long userId);

	List<User> getAllUsers();

	User updateUser(User userDetails);

	void delete(Long userId);

}

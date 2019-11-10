package com.example.service;

import java.util.List;

import com.example.model.User;



public interface LoginUserService {
	
	public List<User> getAllUsers();
	
	public boolean getUserById(long id);
	
	public boolean saveUser(User user);
	
	public boolean deleteUser(long id);
	
	public boolean editUser(long id,User user);
	
	public boolean search(String username);
}

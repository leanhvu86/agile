package com.example.service;

import java.util.List;

import com.example.model.Employee;
import com.example.model.LoginUser;

public interface LoginUserService {
	
	public List<LoginUser> getAllUsers();
	
	public LoginUser getUserById(long id);
	
	public boolean saveUser(LoginUser user);
}

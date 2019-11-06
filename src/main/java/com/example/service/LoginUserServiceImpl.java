package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.LoginUser;
import com.example.repository.LoginUserRepository;

@Service("loginUserService")
public class LoginUserServiceImpl implements LoginUserService {

	@Autowired
	LoginUserRepository loginUserRepository;
	
	@Override
	public List<LoginUser> getAllUsers() {
		// TODO Auto-generated method stub
		return loginUserRepository.findAll();
	}

	@Override
	public LoginUser getUserById(long id) {
		// TODO Auto-generated method stub
		return loginUserRepository.findOne(id);
	}

	@Override
	public boolean saveUser(LoginUser user) {
		// TODO Auto-generated method stub
		try {
			loginUserRepository.save(user);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return false;
	}

}

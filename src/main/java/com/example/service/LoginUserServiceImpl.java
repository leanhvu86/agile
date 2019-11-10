package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.repository.LoginUserRepository;

@Service("loginUserService")
public class LoginUserServiceImpl implements LoginUserService {
	@Autowired
	LoginUserRepository userRepository;

	@Override
	public List<User> getAllUsers() {
		List<User> list=  (List<User>) userRepository.findAll();
		if(list.isEmpty()) {
			System.out.println(list.size());
			return null;
		}
		return list;
	}

	@Override
	public boolean getUserById(long id) {
	User user1= userRepository.findOne(id);
	if(user1==null) {
		System.out.println("Khong ton tai user trong he thong");
		return false;
	}
		return true;
	}

	@Override
	public boolean saveUser(User user) {
	
		if(userRepository.getUserByName(user.getName())!=null) {
			return false;
		}
		userRepository.save(user);
		return true;
	}

	@Override
	public boolean deleteUser(long id) {
		User user= userRepository.findOne(id);
		if(user!=null) {
			userRepository.delete(user);
			return true;
		}
		return false;
	}

	@Override
	public boolean editUser(long id, User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean search(String username) {
		// TODO Auto-generated method stub
		return false;
	}

}

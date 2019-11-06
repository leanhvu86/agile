package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.Employee;
import com.example.model.LoginUser;

@Repository("loginUserRepository")
public interface LoginUserRepository extends JpaRepository<LoginUser, Long>{

}

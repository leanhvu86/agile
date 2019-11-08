package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.model.User;

@Repository("loginUserRepository")
public interface LoginUserRepository extends JpaRepository<User, Long>{

}

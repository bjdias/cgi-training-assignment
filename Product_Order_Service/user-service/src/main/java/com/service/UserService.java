package com.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bean.UserBean;
import com.repo.UserRepo;

@Service
public class UserService {
	
	@Autowired
	public UserRepo userRepo;

	public String createUser(UserBean userbean) {
		// TODO Auto-generated method stub
		userRepo.save(userbean);
		return "User created";
	}

	public String finduserbyid(int id) {
		// TODO Auto-generated method stub
		
		try {
			return userRepo.findNameById(id);
		}catch(Exception e) {
			return null;
		}
	}

	public List<UserBean> findAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

}

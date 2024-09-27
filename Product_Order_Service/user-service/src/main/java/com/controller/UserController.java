package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bean.UserBean;
import com.service.UserService;

@RestController
@RequestMapping("userservice")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping(value = "create",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String createAccount(@RequestBody UserBean userbean) {
		return userService.createUser(userbean);
	}	
	
	@GetMapping(value = "finduserbyid/{id}")
	public String finduserbyid(@PathVariable("id") int id) {
		return  userService.finduserbyid(id);
	}
	
	@GetMapping(value = "findAllUsers")
	public List<UserBean> findAllUsers() {
		return userService.findAllUsers();
	}

}

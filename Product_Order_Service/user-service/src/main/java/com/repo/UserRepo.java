package com.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public interface UserRepo extends JpaRepository<UserBean, Integer>{

	@Query("select user.username from UserBean user where user.id = :id")
	String findNameById(int id);
	

}

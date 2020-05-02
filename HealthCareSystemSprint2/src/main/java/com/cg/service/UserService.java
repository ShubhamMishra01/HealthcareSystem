package com.cg.service;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Users;
import com.cg.dao.UserRepository;

public interface UserService {

	void setUdao(UserRepository udao);

	Users viewUser(int userid);

	List<Users> viewUser();

	Users addUser(Users user);

	Users updateUser(Users user);

	void deleteUser(int userid);

}
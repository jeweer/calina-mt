package com.springmvc.services.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.springmvc.services.dao.UserDao;
import com.springmvc.services.model.User;
import com.springmvc.services.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	
	
	@Override
	public List<User> select() {
		List<User> list =  userDao.selectUser();
		return list;
	}

}

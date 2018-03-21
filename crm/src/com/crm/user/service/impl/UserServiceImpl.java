package com.crm.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crm.common.beans.User;
import com.crm.user.dao.IUserDao;
import com.crm.user.service.IUserService;

@Service
public class UserServiceImpl implements IUserService {

	@Autowired
	private IUserDao userDao;
	@Override
	public User findUser(String usercode, String password) {
		User user = userDao.selectUser(usercode,password);
		return user;
	}

}

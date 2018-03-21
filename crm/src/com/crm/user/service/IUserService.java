package com.crm.user.service;

import com.crm.common.beans.User;

public interface IUserService {

	User findUser(String usercode, String password);

}

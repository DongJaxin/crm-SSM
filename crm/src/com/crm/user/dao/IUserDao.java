package com.crm.user.dao;

import org.apache.ibatis.annotations.Param;

import com.crm.common.beans.User;

public interface IUserDao {

	User selectUser(@Param("usercode") String usercode, @Param("password") String password);

}

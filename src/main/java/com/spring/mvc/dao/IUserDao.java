package com.spring.mvc.dao;

import java.util.List;

import com.spring.mvc.entity.User;

public interface IUserDao extends IAbstractDao<User> {
	
	public List<User>findAll();
}

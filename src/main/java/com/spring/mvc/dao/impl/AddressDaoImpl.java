package com.spring.mvc.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

import com.spring.mvc.dao.IAddressDao;
import com.spring.mvc.entity.Address;
import com.spring.mvc.entity.User;

public class AddressDaoImpl extends AbstractDaoImpl<Address> implements IAddressDao{

	
	protected AddressDaoImpl(){
		super(Address.class);
	}

}

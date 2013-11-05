package com.spring.mvc.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.dao.IUserDao;
import com.spring.mvc.entity.Address;
import com.spring.mvc.entity.User;

@Repository
public class UserDaoImpl extends AbstractDaoImpl<User> implements IUserDao {
		
	protected UserDaoImpl(){
		super(User.class);
	}
	
	@Transactional
	public List<User>findAll(){
		List<User>retVal=new ArrayList<User>();
		
		//Query query=super.getCurrentSession().createQuery("from User");
		//Criteria criteria=super.getCurrentSession().createCriteria(User.class);
		//criteria.addOrder(Order.asc("fname"));
		//criteria.addOrder(Order.asc("lname"));
		//retVal=criteria.list();
		
		Query query=super.getCurrentSession().createQuery("from User u order by u.fname, u.lname");
		retVal=query.list();
		System.out.println("!!!!!!!!!!!addresses START:");
		for(User aUser:retVal){
			Set<Address> anAddress=aUser.getAddresses();
			System.out.println("aUser.getFname()="+aUser.getFname());
			System.out.print("{");
			for(Iterator<Address>iter=anAddress.iterator();iter.hasNext();){
				Address add=iter.next();
				System.out.println(add.getStrnum()+" "+add.getStrname()+" "+add.getCity()+", ");
			}
			System.out.println("}");
		}
		System.out.println("!!!!!!!!!!!addresses END");
		return retVal;
	}
	
	
}

package com.spring.mvc.dao;

import java.io.Serializable;

import org.hibernate.Session;

public interface IAbstractDao<E> {
	
	public Session getCurrentSession();
	
	public void save(E entity);
	
	public void update(E entity);
	
	public void delete(E entity);
	
	public E findById(String id);
	
	public E findById(Serializable id);
}
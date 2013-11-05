package com.spring.mvc.dao.impl;

import java.io.Serializable;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.spring.mvc.dao.IAbstractDao;


@SuppressWarnings("unchecked")
public abstract class AbstractDaoImpl<E> implements IAbstractDao<E> {
	
	private Class<E> entityClass;
	
	@Autowired
	private SessionFactory mySessionFactory;
	
	protected AbstractDaoImpl(Class<E> entityClass) {
		this.entityClass = entityClass;
	}
	
	public Session getCurrentSession() {
		return mySessionFactory.getCurrentSession();
	}
	
	public Criteria getCriteria() {		
		return getCurrentSession().createCriteria(entityClass);
	}
	
	public void save(E entity) {
		getCurrentSession().save(entity);
	}
	
	public void update(E entity) {
		getCurrentSession().update(entity);
	}
	
	public void delete(E entity) {
		getCurrentSession().delete(entity);
	}	
	
	@Transactional(readOnly = true)
	public E findById(String id) {
		return (E) getCurrentSession().get(entityClass, id);
	}
	
	@Transactional(readOnly = true)
	public E findById(Serializable id) {
		return (E) getCurrentSession().get(entityClass, id);
	}
}

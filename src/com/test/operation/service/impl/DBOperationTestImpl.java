package com.test.operation.service.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.test.model.Employee;
import com.test.operation.service.DBOperation;

public class DBOperationTestImpl implements DBOperation{

	private Configuration cfg;
	private SessionFactory sesfac;
	private Session s;
	private Transaction tx;
	
	public void startConnection() {
		 cfg = new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		sesfac = cfg.buildSessionFactory();
		 s = sesfac.openSession();
		 
		
	}
	@Override
	public void insertDBOperation(Employee emp) {
		tx = s.beginTransaction();
		s.save(emp);
		
	}

	@Override
	public List<Employee> searchOperation(int id) {
		 tx = s.beginTransaction();
		 /*ID SEARCH */
		 Employee em =(Employee) s.load(Employee.class,id);
		 System.out.println(em.getId());
		 System.out.println(em.getFirstName());
		 System.out.println(em.getLastName());
		 System.out.println(em.getMobile());
		 /*ID SEARCH */
		return null;
	}

	@Override
	public int updateDBOperation(Employee e) {
		 tx = s.beginTransaction();
		 Employee em =(Employee) s.load(Employee.class,e.getId());
		 em.setFirstName(e.getFirstName());
		 s.update(em);
		 return 0;
		 
	}

	@Override
	public int deleteDBOperation(Employee e) {
		 tx = s.beginTransaction();
		 Employee em =(Employee) s.load(Employee.class,e.getId());
		 s.delete(em);
		 return 0;
	}
	
	@Override
	public void closeConnection() {
		s.flush();
		s.close();		
		tx.commit();
	}

}

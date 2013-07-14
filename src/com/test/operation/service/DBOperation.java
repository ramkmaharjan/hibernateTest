package com.test.operation.service;

import java.util.List;

import com.test.model.Employee;

public interface DBOperation {
	
	void startConnection();
	
	void insertDBOperation(Employee  e);
	
	List<Employee> searchOperation(int id);
	
	int updateDBOperation(Employee e);
	
	int deleteDBOperation(Employee e);
	
	void closeConnection();

}

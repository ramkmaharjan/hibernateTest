package com.test.executor;

import com.test.model.Employee;
import com.test.operation.service.DBOperation;
import com.test.operation.service.impl.DBOperationTestImpl;

public class DBExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBOperation c = new DBOperationTestImpl();
//		c.startConnection();
//		
//		/*Insert operation */
//		Employee emp =new Employee();
//		emp.setId(2);
//		emp.setFirstName("Shyam");
//		emp.setLastName("Maharjan");
//		emp.setMobile("123567");
//		emp.setEmailAdd("shyam@hotmail.com");
//		c.insertDBOperation(emp);
//		
//		c.closeConnection();
		
//		c.startConnection();
//		
//		c.searchOperation(1);
//		c.closeConnection();
		
		
		c.startConnection();
		Employee emp =new Employee();
		emp.setId(2);
//		emp.setFirstName("Sayami");
		c.deleteDBOperation(emp);
		c.closeConnection();
	}

}

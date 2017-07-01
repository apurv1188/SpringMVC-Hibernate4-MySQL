package com.springmvchibernate.service;

import java.util.List;

import com.springmvchibernate.model.Employee;

public interface EmployeeService {

	public List<Employee> listAllEmp();
	
	public void insert(Employee employee);
	public void delete(int emp_id);
	public Employee findByempId(int emp_id);
	
	
	 
	
}

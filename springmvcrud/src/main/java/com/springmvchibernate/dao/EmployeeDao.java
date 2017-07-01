package com.springmvchibernate.dao;

import java.util.List;

import com.springmvchibernate.model.Employee;

public interface EmployeeDao {

	
	public List<Employee> listAll();
	public void save(Employee employee);
	public Employee update(int emp_id);
	public Employee findByEmpId(int emp_id);
	public void delete(int emp_id); 
}

package com.springmvchibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmvchibernate.dao.EmployeeDao;
import com.springmvchibernate.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeDao employeedao;

	public List<Employee> listAllEmp() {
		// TODO Auto-generated method stub
		return employeedao.listAll();
	}

	public void insert(Employee employee) {
		// TODO Auto-generated method stub

		employeedao.save(employee);
	}

	public void delete(int emp_id) {
		// TODO Auto-generated method stub
		employeedao.delete(emp_id);
	}

	public Employee findByempId(int emp_id) {
		// TODO Auto-generated method stub
		return employeedao.findByEmpId(emp_id);
	}

}

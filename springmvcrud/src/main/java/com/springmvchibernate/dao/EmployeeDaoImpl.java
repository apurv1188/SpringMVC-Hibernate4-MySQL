package com.springmvchibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.springmvchibernate.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession()
	{  
		return sessionFactory.getCurrentSession();
	}
	public List<Employee> listAll() {
		// TODO Auto-generated method stub
		 Criteria criteria = getSession().createCriteria(Employee.class);
		return (List<Employee>) criteria.list();
			}

	public void save(Employee employee) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(employee);
	}

	public Employee update(int emp_id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Employee findByEmpId(int emp_id) {
		// TODO Auto-generated method stub
		Employee employee = (Employee) getSession().get(Employee.class,emp_id);
			return employee;
	}

	public void delete(int emp_id) {
		// TODO Auto-generated method stub
		Employee employee = (Employee) getSession().get(Employee.class,emp_id);
		getSession().delete(employee);
		
	}

	
}

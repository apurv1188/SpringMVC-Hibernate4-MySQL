package com.springmvchibernate.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int emp_id;
	@Column(name ="emp_name")
	private String emp_name;
	@Column(name ="emp_email")
	private String emp_email;
	@Column(name ="emp_numb")
	private String emp_numb;
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getEmp_name() {
		return emp_name;
	}
	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}
	public String getEmp_email() {
		return emp_email;
	}
	public void setEmp_email(String emp_email) {
		this.emp_email = emp_email;
	}
	public String getEmp_numb() {
		return emp_numb;
	}
	public void setEmp_numb(String emp_numb) {
		this.emp_numb = emp_numb;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", emp_name=" + emp_name + ", emp_email=" + emp_email + ", emp_numb="
				+ emp_numb + "]";
	}
	
	public Employee(){}
	
	
	
	
	
	
	
	

}

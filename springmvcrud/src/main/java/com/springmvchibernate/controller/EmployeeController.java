package com.springmvchibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvchibernate.model.Employee;
import com.springmvchibernate.service.EmployeeService;

@Controller
@RequestMapping(value = "employee")
public class EmployeeController {

	@Autowired
	EmployeeService employeeService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView list() {

		ModelAndView model = new ModelAndView("employee/list");
		List<Employee> list = employeeService.listAllEmp();
		model.addObject("list", list);
		return model;
	}

	@RequestMapping(value = "/update/{emp_id}", method = RequestMethod.PUT)
	public ModelAndView update(@PathVariable("emp_id") int emp_id) {

		ModelAndView model = new ModelAndView("employee/form");
		Employee employee = employeeService.findByempId(emp_id);
		model.addObject("employeeForm", employee);
		return model;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ModelAndView add() {

		ModelAndView model = new ModelAndView("employee/form");
		Employee employee = new Employee();
		model.addObject("employeeForm", employee);
		return model;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employeeForm") Employee employee) {

		employeeService.insert(employee);
		return new ModelAndView("redirect:/employee/list");
	}

}

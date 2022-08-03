package com.example.demo.service;

import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;

public interface EmployeeService {
	
	ModelAndView addDetails(Employee emp);
	
	ModelAndView removeData(Long id);
	
	ModelAndView updateDetails(Long id, Employee emp);
	
	ModelAndView getEmployees();
}

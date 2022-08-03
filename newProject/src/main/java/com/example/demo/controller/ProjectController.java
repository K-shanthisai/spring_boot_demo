package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeServiceImpl;

@RestController
public class ProjectController {
	
	private EmployeeServiceImpl implObj;
	
	public ProjectController(EmployeeServiceImpl implObj) {
		super();
		this.implObj = implObj;
	}

	@GetMapping("/home")
	public ModelAndView HomePage() {
		return implObj.getEmployees();
	}
	
	@PostMapping("/addEmployee")
	public ModelAndView addEmployee(Long id, String name, String tech) {
		Employee emp = new Employee(id,name,tech);
		return implObj.addDetails(emp);
	}
	
	@PostMapping("/updateEmployee")
	public ModelAndView updateEmployee(Long id1, Long id, String name, String tech) {
		Employee emp = new Employee(id,name,tech);
		return implObj.updateDetails(id1,emp);
	}
	
	@PostMapping("/removeEmployee")
	public ModelAndView removeEmployee(Long id) {
		return implObj.removeData(id);
	}
}

package com.example.MicroServices.controller;

//import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.MicroServices.model.Department;
import com.example.MicroServices.service.DepartmentService;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/departments")
@Slf4j
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	
	@PostMapping("/")
	public Department saveDepartment(@RequestBody Department department) {
//		Logger.info("Inside Save Department Method of Department Controller");
		return departmentService.saveDepartment(department);
	}
	
	@GetMapping("/{departmentId}")
	public Department getDepartment(@PathVariable("departmentId") Long departmentId) {
		
		return departmentService.getDepartment(departmentId);
	}
}

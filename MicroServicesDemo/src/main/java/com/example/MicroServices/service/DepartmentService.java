package com.example.MicroServices.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.MicroServices.model.Department;
import com.example.MicroServices.repository.DepartmentRepository;

@Service
public class DepartmentService {
	
	@Autowired
	private DepartmentRepository departmentRepository;

	public Department saveDepartment(Department department) {
		// TODO Auto-generated method stub
		return departmentRepository.save(department);
	}

	public Department getDepartment(Long departmentId) {
		// TODO Auto-generated method stub
		return departmentRepository.findById(departmentId).orElseThrow();
	}
	
	
}

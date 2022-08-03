package com.example.demo.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepo repo;

	public EmployeeServiceImpl(EmployeeRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public ModelAndView addDetails(Employee emp) {
		// TODO Auto-generated method stub
		repo.save(emp);		
		return getEmployees();
	}

	@Override
	public ModelAndView removeData(Long id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return getEmployees();
	}

	@Override
	public ModelAndView updateDetails(Long id, Employee emp) {
		// TODO Auto-generated method stub
		
		Employee emp1 = repo.findById(id).orElseThrow();
		emp1.setId(emp.getId());
		emp1.setName(emp.getName());
		emp1.setTechnology(emp.getTechnology());
		repo.save(emp1);
		
		return getEmployees();
	}

	@Override
	public ModelAndView getEmployees() {
		// TODO Auto-generated method stub
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("employees",repo.findAll());
		return mv;
	}
}

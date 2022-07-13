package com.example.demo;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;

@Controller
public class employeeController {
	
	@Autowired
	EmployeeRepo repo;
	
	@GetMapping("/home")
	public String home() {
		return "home.jsp";
	}
	@GetMapping("/addEmployee")
	public String addEmployee(Employee employee) {
		repo.save(employee);
		return "home.jsp";
	}
	@GetMapping("/getEmployee")
	public ModelAndView getEmployee(@RequestParam int eid) {
		ModelAndView mv = new ModelAndView("showemp.jsp");
		Employee employee = repo.findById(eid).orElse(new Employee());
		mv.addObject(employee);
		return mv;
	}
}

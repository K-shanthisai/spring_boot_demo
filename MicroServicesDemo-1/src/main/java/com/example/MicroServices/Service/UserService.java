package com.example.MicroServices.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.MicroServices.Model.User;
import com.example.MicroServices.Repository.UserRepository;
import com.example.MicroServices.VO.Department;
import com.example.MicroServices.VO.RestTemplateVO;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepo;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public User saveUser(User user) {
		return userRepo.save(user);
	}
	
	public User getUser(Long userId) {
		return userRepo.findById(userId).orElseThrow();
	}

	public RestTemplateVO getUserwithDepartment(Long id) {
		// TODO Auto-generated method stub
		RestTemplateVO vo = new RestTemplateVO();
		User user = userRepo.findById(id).orElseThrow();
		Department department = restTemplate.getForObject("http://localhost:8081/departments/"+user.getDepartmentId(), Department.class);
		
		vo.setUser(user);
		vo.setDepartmet(department);
		return vo;
	}
}

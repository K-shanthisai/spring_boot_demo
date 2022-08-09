package com.example.MicroServices.VO;

import com.example.MicroServices.Model.User;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVO {
	
	private User user;
	private Department departmet;
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Department getDepartmet() {
		return departmet;
	}
	public void setDepartmet(Department departmet) {
		this.departmet = departmet;
	}
	
	
}

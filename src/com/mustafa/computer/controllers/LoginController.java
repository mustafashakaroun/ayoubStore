package com.mustafa.computer.controllers;
import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class LoginController implements Serializable {
	private User currentUser;

	public User getCurrentUser() {
		return currentUser;
	}

	public void setCurrentUser(User currentUser) {
		this.currentUser = currentUser;
	}
	
	@PostConstruct
	public void bla(){
		currentUser = new User();
	}


	public String logIn(){
	
		if ("123456".equals(currentUser.getPassword()) && "ali".equals(currentUser.getName()))
			return "page1.xhtml";
		return null;
		
	}
}
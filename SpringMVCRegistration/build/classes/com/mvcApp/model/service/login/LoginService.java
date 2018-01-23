package com.mvcApp.model.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mvcApp.dto.login.LoginDTO;
import com.mvcApp.dto.register.RegisterDTO;
import com.mvcApp.model.dao.login.LoginDAO;

@Service
public class LoginService {

	@Autowired
	private LoginDAO dao;
	
	public LoginService() {
		System.out.println(this.getClass().getSimpleName()+" created..");
	}
	public RegisterDTO userLoginService(LoginDTO dto){
		System.out.println("Login Service Steated..");
		
		RegisterDTO dtoFromDB= dao.fetch(dto);
		
		System.out.println("Login Service Ended..");
		return dtoFromDB;
	}
}

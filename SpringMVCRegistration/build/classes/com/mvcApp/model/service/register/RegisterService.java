package com.mvcApp.model.service.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvcApp.dto.register.RegisterDTO;
import com.mvcApp.model.dao.register.RegisterDAO;

@Component
public class RegisterService {
@Autowired
private RegisterDAO dao;
	
public RegisterService() {

	System.out.println(this.getClass().getSimpleName()+" ccrated...");
	}
public void registerUserService(RegisterDTO dto){
	System.out.println("user service started.."); 
	dao.saveUser(dto);

	System.out.println("Registeruser Service is stoped...");
	}
}

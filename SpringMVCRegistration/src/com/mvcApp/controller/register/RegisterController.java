package com.mvcApp.controller.register;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvcApp.dto.register.RegisterDTO;
import com.mvcApp.model.service.register.RegisterService;

@Component
@RequestMapping("/")
public class RegisterController 
{
	@Autowired
	private RegisterService service;
	
	public RegisterController() {
		System.out.println(this.getClass().getSimpleName()+"Created...");
	}
	
	@RequestMapping(value=".do" , method=RequestMethod.POST)
	public ModelAndView registerUserController(RegisterDTO dto){
		System.out.println("user register Controller createed");
		
		service.registerUserService(dto);
		
		System.out.println("user register controller ended..");
		
		return new ModelAndView("/Success.jsp","nm",dto.getUname());
	}
	
}

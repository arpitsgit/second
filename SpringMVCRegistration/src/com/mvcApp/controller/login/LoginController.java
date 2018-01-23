package com.mvcApp.controller.login;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.mvcApp.dto.login.LoginDTO;
import com.mvcApp.dto.register.RegisterDTO;
import com.mvcApp.model.service.login.LoginService;
@Controller
@RequestMapping("/")
public class LoginController {
	
	@Autowired
	private LoginService service;
	
	public LoginController() {
		System.out.println(this.getClass().getSimpleName()+" created..");
	}
	@RequestMapping(value="/login.do", method=RequestMethod.POST)
	public ModelAndView userLoginController(LoginDTO dto,HttpServletRequest req){
		System.out.println("login controller started..");
		System.out.println(dto);
		
		RegisterDTO dtoFromDB=service.userLoginService(dto);
		
		if(dtoFromDB!=null)
		{
			HttpSession session=req.getSession();
			session.setAttribute("dto",dtoFromDB);
			
			System.out.println("Login Success...");
			System.out.println("login controller ended..");
			return new ModelAndView("Home.jsp" ,"nmg" ,dtoFromDB.getUname());
		}
		else
		{
		System.out.println("login controller ended..");
		return new ModelAndView("Login.jsp" ,"msg" ,"Invalid credentials..");
		}
	}
}

package com.mvcApp.dto.login;

import java.io.Serializable;

public class LoginDTO implements Serializable {
	private String emailid;
	private String pass;
	 
	public LoginDTO() {
		System.out.println(this.getClass().getSimpleName()+" created..");	
		}
	
	public String getEmailid() {
		return emailid;
	}

	public String getPass() {
		return pass;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	
	@Override
	public String toString() {
		return "LoginController [emailid=" + emailid + ", pass=" + pass + "]";
	}
	
}

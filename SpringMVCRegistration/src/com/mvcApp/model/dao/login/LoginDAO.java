package com.mvcApp.model.dao.login;


import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mvcApp.dto.login.LoginDTO;
import com.mvcApp.dto.register.RegisterDTO;

@Repository
public class LoginDAO {

	@Autowired
	private SessionFactory factory;

	public LoginDAO() {
		System.out.println(this.getClass().getSimpleName() + " created..");
	}

	public RegisterDTO fetch(LoginDTO dto){
		System.out.println("Login DAO Started..");
	
		String hql="From RegisterDTO R where R.emailid=:em and R.pass=:pwd";
		Session session= factory.openSession();
		Query qry=  session.createQuery(hql);
		qry.setParameter("em", dto.getEmailid());
		qry.setParameter("pwd", dto.getPass());
		RegisterDTO dtoFromBD =(RegisterDTO)qry.uniqueResult();
		
		System.out.println("Login DAO ended..");
		return dtoFromBD;
	}
}

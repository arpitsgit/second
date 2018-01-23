package com.mvcApp.model.dao.register;


import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mvcApp.dto.register.RegisterDTO;

@Component
public class RegisterDAO 
{
	@Autowired
private SessionFactory factory;
	
	public RegisterDAO() {
		 System.out.println(this.getClass().getSimpleName()+"Crated...");
		 }

	public void saveUser(RegisterDTO dto){
		System.out.println("dao Started..!!");
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		try{
			session.save(dto);
			tx.commit();
		}catch(HibernateException he){
			he.printStackTrace();
			tx.rollback();
		}
		finally{
			session.close();
		}
		System.out.println("Dao ended..");
	}
}
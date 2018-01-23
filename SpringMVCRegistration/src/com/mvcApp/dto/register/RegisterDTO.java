package com.mvcApp.dto.register;

import java.io.Serializable;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="user_table")
public class RegisterDTO implements Serializable
{
	
	
	@Id
	@GenericGenerator(name="myId",strategy="increment")
	@GeneratedValue(generator="myId")
	@Column(name="r_id")
	private int id;
	@Column(name="r_name")
	private String uname;
	@Column(name="r_email")
	private String emailid;
	@Column(name="r_phone")
	private long  phoneno;
	@Column(name="r_password")
	private String pass;
	@Column(name="r_confrmpass")
	private String cpass;
	@Column(name="r_coutry")
	private String country;
	
	
	public RegisterDTO() {
	
	System.out.println(this.getClass().getSimpleName()+" created...");
	}

	public int getId() {
		return id;
	}

	public String getUname() {
		return uname;
	}

	public String getEmailid() {
		return emailid;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public String getPass() {
		return pass;
	}

	public String getCpass() {
		return cpass;
	}

	public String getCountry() {
		return country;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public void setCpass(String cpass) {
		this.cpass = cpass;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "RegisterDTO [id=" + id + ", uname=" + uname + ", emailid=" + emailid + ", phoneno=" + phoneno
				+ ", pass=" + pass + ", cpass=" + cpass + ", country=" + country + "]";
	}
	
	
	
}

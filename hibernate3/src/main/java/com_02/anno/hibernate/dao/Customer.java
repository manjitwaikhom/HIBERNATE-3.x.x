package com_02.anno.hibernate.dao;

import java.util.*;

import javax.persistence.*;

import org.hibernate.annotations.Proxy;


@Entity
@Table(name="Customers_table")
@Proxy(lazy=false)
public class Customer {

	
	
	@Id
	@GeneratedValue
	@Column(name="cid_column")
	private int cid;
	
	@Column(name="cname_column")
	private String cname;
	
	@Column(name="email_column")
	private String email;
	
	@Column(name="phone_column")
	private long phone;
	
	@Column(name="city_column")
	private String city;
	
	@Column(name="status_column")
	private String status;
	
	
	
	public Customer() {}






	public Customer(String cname, String email, long phone, String city,
			String status) {
		super();
		this.cname = cname;
		this.email = email;
		this.phone = phone;
		this.city = city;
		this.status = status;
	}

	public int getCid() {
		return cid;
	}



	public void setCid(int cid) {
		this.cid = cid;
	}



	public String getCname() {
		return cname;
	}



	public void setCname(String cname) {
		this.cname = cname;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public long getPhone() {
		return phone;
	}



	public void setPhone(long phone) {
		this.phone = phone;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public String getStatus() {
		return status;
	}



	public void setStatus(String status) {
		this.status = status;
	}



	

}

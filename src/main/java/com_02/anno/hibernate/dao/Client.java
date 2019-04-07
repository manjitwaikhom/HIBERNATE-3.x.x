package com_02.anno.hibernate.dao;



public class Client{

	
	public static void main(String[] args) {
	CustomerDAO cdao=DAOFactory.getCustomerDAO();
	
		//1. add customer
	
CustomerTO cto=new CustomerTO("Montu","montu@jlc.com",990039550,"chapara","Enabled");
cdao.addCustomer(cto);

//2. get customer

//CustomerTO c1=cdao.getCustomerByCid(15);
//System.out.println(c1.getCid()+"\t"+c1.getCname()+"\t"+c1.getEmail()+"\t"+c1.getPhone()+"\t"+c1.getCity()+"\t"+c1.getStatus());

//3. delete customer

//	cdao.deleteCustomer(13);



//4.update customer
//CustomerTO c2=cdao.getCustomerByCid(12);
//c2.setCname("Sangmesh");
//c2.setEmail("Sangmesh@rec.com");
//c2.setPhone(9999);
//cdao.updateCustomer(c2);
	}

}

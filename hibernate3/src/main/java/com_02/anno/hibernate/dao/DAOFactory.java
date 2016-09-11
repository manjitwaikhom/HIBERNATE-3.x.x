package com_02.anno.hibernate.dao;

public class DAOFactory {
	static CustomerDAO customerDAO;
	static{
		customerDAO=new HibernateCustomerDAO();
		
	}
	public static CustomerDAO getCustomerDAO(){
		return customerDAO;
	}

}

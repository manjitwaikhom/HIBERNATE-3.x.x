package com_02.anno.hibernate.dao;

public  class HibernateCustomerDAO implements CustomerDAO{
	
	public int addCustomer(CustomerTO cto){
		Customer cust=new Customer(cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
		Integer it=(Integer)HibernateTemplate.saveObject(cust);
		return it.intValue();
	}	
	public void updateCustomer(CustomerTO cto){
		Customer cust=new Customer(cto.getCname(),cto.getEmail(),cto.getPhone(),cto.getCity(),cto.getStatus());
		HibernateTemplate.updateObject(cust);
	}
	public void deleteCustomer(int cid){
		HibernateTemplate.deleteObject(Customer.class,cid);
	}
	public CustomerTO getCustomerByCid(int cid){
		Customer cust=(Customer)HibernateTemplate.loadObject(Customer.class,cid);
		CustomerTO cto=new CustomerTO(cust.getCname(),cust.getEmail(),cust.getPhone(),cust.getCity(),cust.getStatus());
		return cto;
	}
}

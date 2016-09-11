package com_02.anno.hibernate.dao;


public interface CustomerDAO{
	public int addCustomer(CustomerTO cust);
	public void updateCustomer(CustomerTO cust);
	public void deleteCustomer(int cid);
	public CustomerTO getCustomerByCid(int cid);

}

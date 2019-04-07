package com_04.anno.hibernate.inheritancemapping;

import java.util.*;



public class Client {

	public static void main(String as[]){
	List<String> emails=new ArrayList<String>();
	emails.add("manjit@jlc.com");
	emails.add("waikhom@jlc.com");
	emails.add("singh@jlc.com");
	
	Set<Long> phones=new HashSet<Long>();
	phones.add(new Long(999331));
	phones.add(new Long(999332));
	phones.add(new Long(999333));	
	
	
	//1. adding the student
	
	Student stu=new Student("sri","Blore","enabled",15000.0,emails,phones);
	
	Integer it0=(Integer)HibernateTemplate.saveObject(stu);
	System.out.println(it0.intValue());
	
	//2.adding the current student
	CurrentStudent cstu=new CurrentStudent(2,"sri","Blore","enabled",15000.0,emails,phones,10000.0, "09:00am", "Mathikhere");
	Integer it1=(Integer)HibernateTemplate.saveObject(cstu);
	System.out.println(it1.intValue());
	
	//3.adding the old student
	OldStudent ostu=new OldStudent(3,"sri","Blore","enabled",15000.0,emails,phones,"SDSoft","manjit@jlc.com",30000.00);
	Integer it2=(Integer)HibernateTemplate.saveObject(ostu);
	System.out.println(it2.intValue());
	
	//4.adding the RegularStudent
	RegularStudent rstu=new RegularStudent(4,"sri", "blore", "enabled", 15000.0, emails, phones, 10000.0, "6.30 pm", "Mathikhere", "Btech", "82.3", 3);
	Integer it3=(Integer)HibernateTemplate.saveObject(rstu);
	System.out.println(it3.intValue());
	
	//5.adding the WeekendStudent
	WeekendStudent wstu=new WeekendStudent(5,"sri","Blore","enabled",15000.0,emails,phones,2000.0, "09:00am", "Mathikhere","SDSoft","waikhom@jlc.com",9.0);
	Integer it4=(Integer)HibernateTemplate.saveObject(wstu);
	System.out.println(it4.intValue());
}
}
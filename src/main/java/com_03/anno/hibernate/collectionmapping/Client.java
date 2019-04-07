package com_03.anno.hibernate.collectionmapping;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.*;

public class Client{

	
	public static void main(String[] args) {
		//1.adding the student
		List<String> emails=new ArrayList<String>();
		emails.add("a@mjt.com");
		
		List<Integer> marks=new ArrayList<Integer>();
		marks.add(10);
		
		String[] courses={"java","JSP","JDBC","EJB"};
		
		Set<Long> phones=new HashSet<Long>();
		phones.add(new Long(1111));
		
		Map<String,Long> refs=new HashMap<String,Long>();
		refs.put("AA", new Long(11));
		
		
		    Student stu=new Student("manjit","waikhom","blore","Enabled",emails,marks,courses,phones,refs);
			Integer it=(Integer)HibernateTemplate.saveObject(stu);
			System.out.println(it.intValue());
			
			//2.loading the student
		
			stu=(Student)HibernateTemplate.loadObject(Student.class,1);
			System.out.println(stu.getSid()+"\t"+stu.getFname()+"\t"+stu.getLname()+"\t"+stu.getCity()+"\t"+stu.getStatus());
			System.out.println(stu.getEmails());
			System.out.println(stu.getMarks());
			String[] cour=stu.getCourses();
			for(int i=0;i<=3;i++){
				
				System.out.println(cour[i]);
				System.out.print("\t");
			}
			System.out.println(stu.getPhones());
			System.out.println(stu.getRefs());
		  

	}

}

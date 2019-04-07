package com_01.pilot.anno.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;


public class Client {

	
	public static void main(String[] args) {
		try{
			
			Customer cust=new Customer("Montu","montu@jlc.com",990039550,"Chapra","Enabled");
			AnnotationConfiguration cfg=new AnnotationConfiguration();
			cfg=(AnnotationConfiguration)cfg.configure("com_01/pilot/anno/hibernate/hibernate.cfg.xml");
			SessionFactory sf=cfg.buildSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			Integer it=(Integer)session.save(cust);
			System.out.println(it.intValue());
			tx.commit();
			session.close();
			
		}catch(Exception e){
			e.printStackTrace();
					}

	}

}

package com_04.anno.hibernate.inheritancemapping;

import java.io.*;
import org.hibernate.*;
import org.hibernate.cfg.*;


public class HibernateTemplate {
	public static Object saveObject(Object obj){
	Object id=null;
	try{
	SessionFactory sf=HibernateUtil.getSessionFactory();
	Session session=sf.openSession();
	Transaction tx=session.beginTransaction();
	id=session.save(obj);
	tx.commit();
	session.close();
		
	}catch(Exception e){
		e.printStackTrace();
	}
	return id;
	}

	
	public static void updateObject(Object obj){
		
		
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
			session.update(obj);
			tx.commit();
			session.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
		}
	public static void deleteObject(Class cls,Serializable s){
	try{
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Object o=session.load(cls, s);
		session.delete(o);
		tx.commit();
		session.close();	
		
		
	}catch(Exception e){
		e.printStackTrace();
	}
	}
	

	
	public static Object loadObject(Class cls,Serializable s){
		Object o=null;
		try{
			SessionFactory sf=HibernateUtil.getSessionFactory();
			Session session=sf.openSession();
			Transaction tx=session.beginTransaction();
		     o=session.load(cls, s);
			tx.commit();
			session.close();	
			
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return o;
		}
	
	
}

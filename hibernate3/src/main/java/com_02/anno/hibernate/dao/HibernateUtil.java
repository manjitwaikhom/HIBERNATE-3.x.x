package com_02.anno.hibernate.dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

	static SessionFactory sessionFactory=null;
	static{
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg=(AnnotationConfiguration)cfg.configure("com_02/anno/hibernate/dao/hibernate.cfg.xml");
		sessionFactory=cfg.buildSessionFactory();
	}
public static SessionFactory getSessionFactory(){
	return sessionFactory;
}
}


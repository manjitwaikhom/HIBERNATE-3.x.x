package com_04.anno.hibernate.inheritancemapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {

	static SessionFactory sessionFactory=null;
	static{
		AnnotationConfiguration cfg=new AnnotationConfiguration();
		cfg=(AnnotationConfiguration)cfg.configure("com_04/anno/hibernate/inheritancemapping/hibernate.cfg.xml");
		sessionFactory=cfg.buildSessionFactory();
	}
public static SessionFactory getSessionFactory(){
	return sessionFactory;
}
}


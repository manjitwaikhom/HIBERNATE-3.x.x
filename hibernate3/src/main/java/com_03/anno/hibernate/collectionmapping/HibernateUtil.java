package com_03.anno.hibernate.collectionmapping;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;




public class HibernateUtil {

	static SessionFactory sessionFactory=null;
	static{
		AnnotationConfiguration cfg=new AnnotationConfiguration();//step1.prepare configuration object
		cfg=(AnnotationConfiguration)cfg.configure("com_03/anno/hibernate/collectionmapping/hibernate.cfg.xml");
		sessionFactory=cfg.buildSessionFactory();
	}
public static SessionFactory getSessionFactory(){
	return sessionFactory;
}
}


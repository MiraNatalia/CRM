package com.example.fw;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HelperBase {

	protected ApplicationManager myManager;
	public SessionFactory factory = HibernateUtil.getSessionFactory();
	

	public HelperBase(ApplicationManager pMyManager) {

		this.myManager = pMyManager;
	}

}

package com.example.fw;

import java.util.Properties;

public class ApplicationManager {

	// hires helpers

	private HibernateEmailHelper hibenateHelper;

	public ApplicationManager() {

	}

	public HibernateEmailHelper getHibernateHelper() {
		if (hibenateHelper == null) {
			hibenateHelper = new HibernateEmailHelper(this);
		}

		return hibenateHelper;
	}

}

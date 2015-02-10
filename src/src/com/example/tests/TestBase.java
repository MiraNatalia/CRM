package com.example.tests;

import com.example.fw.ApplicationManager;

public class TestBase {

	public TestBase() {

		app = new ApplicationManager();

	}

	// TestBase hires Application Manager; protected as all TestBase descendants
	// should be able to use it
	protected static ApplicationManager app;

}

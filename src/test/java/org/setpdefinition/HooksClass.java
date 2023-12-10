package org.setpdefinition;

import org.Base.BaseClase;

import io.cucumber.java.After;
import io.cucumber.java.Before;



public class HooksClass extends BaseClase{
	@Before
	private void precondition() throws Exception {
		launchBrowser("edge");
		windowMax();

	}
	

//	@After
//	private void postcondition() {
//		closeEntireBrowser();
//
//	}
}

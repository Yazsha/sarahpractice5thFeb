package org.stepdefinition;

import io.cucumber.java.Before;

public class Hooks extends UtilityClass {
	
	@Before
	public void beforeScenario() {
		loadBrowser();
		lanchUrl("https://adactinhotelapp.com/");
		
		}

}

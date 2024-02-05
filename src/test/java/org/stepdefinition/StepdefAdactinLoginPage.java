package org.stepdefinition;

import java.util.List;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepdefAdactinLoginPage extends UtilityClass {
	
	public PojoClass p;
	
	@Given("User launch  Adactin webpage")
	public void user_launch_adactin_webpage() {
		

		
		loadBrowser();
		lanchUrl("https://adactinhotelapp.com/");
		
	   
	}
	@When("User enter username and password")
	public void user_enter_username_and_password(DataTable d) {
		p=new PojoClass();
		
		List<List<String>> li = d.asLists();
		
		enterText(p.getUname(), li.get(0).get(0));
		enterText(p.getPasswd(), li.get(0).get(1));
		
	    
	}
	@When("Userclick loginbutton")
	public void userclick_loginbutton() {
		clickElement(p.getLoginbtn());
	   
	}
	@Then("User see error message for the invalid login")
	public void user_see_error_message_for_the_invalid_login() {
	    
	}



	
	}



	
	
		




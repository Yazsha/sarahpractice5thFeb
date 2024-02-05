package org.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepdefFB extends UtilityClass {
	
	FbLoginPojo fbloginpage;
	
	@Given("User is on Facebook Login Page")
	public void user_is_on_Facebook_Login_Page() {
		loadBrowser();
		lanchUrl("https://www.facebook.com/");
		 
		fbloginpage= new FbLoginPojo();
	   
	}

	@When("User enters the Username and Password")
	public void user_enters_the_Username_and_Password() {
		
		enterText(fbloginpage.getUserName(), "fgsfdghg");
		enterText(fbloginpage.getPassWord(), "gfg651236");
	  
	}

	@When("Login Button")
	public void login_Button() {
		clickElement(fbloginpage.getLoginButton());
	  
	}

	@Then("Take Screenshot")
	public void take_Screenshot() {
	    
	}

	}
	
	
		

	



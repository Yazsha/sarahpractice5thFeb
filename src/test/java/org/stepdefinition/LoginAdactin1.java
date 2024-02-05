package org.stepdefinition;
import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginAdactin1 extends UtilityClass {
	
	public static PojoClass p;
@Given("User launch Adactin application")

public void User_launch_Adactin_application() {
	
    loadBrowser();
	lanchUrl("https://adactinhotelapp.com/");
	System.out.println("Chrome browser launched successfully");

}
@When("user enter username and password")
public void user_enter_username_and_password() {
	p = new PojoClass();
	enterText(p.getUname(),"vaithy2410");
	enterText(p.getPasswd(),"vaithy@2410");
}

@When("User click login button")
public void User_click_login_button() {
	p = new PojoClass();
	
	clickElement(p.getLoginbtn());

}

@Then("User see message for the valid login")
public void user_see_message_for_the_valid_login() {
	driver.findElement(By.xpath("//td[contains(text(),'Welcome to Adactin Group of Hotels')]")).isDisplayed();
}



}



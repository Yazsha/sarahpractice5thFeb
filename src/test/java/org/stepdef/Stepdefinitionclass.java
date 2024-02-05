package org.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.webdriver.WebDriverBrowser;

public class Stepdefinitionclass {
	public WebDriver driver;
	

@Given("User open the chrome brower and Goodnessme Application")
public void user_open_the_chrome_brower_and_Goodnessme_Application() {
	
	WebDriverManager.chromedriver().setup();
	 driver= new ChromeDriver();
	driver.get("https://goodnessme.ca/");
}





@When("User enter the username and password")
public void user_enter_the_username_and_password() {
	WebElement email = driver.findElement(By.id("customer_email"));
	email.clear();
		
	//WebElement email = driver.findElement(by.id("customer_email"));
    
}

@When("User have to click login button")
public void user_have_to_click_login_button() {
    
}

@Then("User close the browser.")
public void user_close_the_browser() {
    
}


}

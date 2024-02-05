package org.stepAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CssSelectDemo {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//#value represents id
		WebElement username = driver.findElement(By.cssSelector("#email"));
		username.sendKeys("Smartskill@gmail.com");
		
		//tagname#value
		WebElement pw = driver.findElement(By.cssSelector("input#pass"));
		pw.sendKeys("Smart123");
		
		//tagName[attributeName=attributeValue]
		WebElement loginbutton = driver.findElement(By.cssSelector("button[name=login]"));
		loginbutton.click();		

	}

}

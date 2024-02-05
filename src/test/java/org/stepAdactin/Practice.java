package org.stepAdactin;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice {

	public static void main(String[] args) throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.greenstechnologys.com/index.html");
		
		//Mousehover action-------->move to Element-->m
		
		Actions a= new Actions(driver);
		
		
		WebElement course = driver.findElement(By.xpath("//a[text()='COURSES']"));
		a.moveToElement(course).perform();
		
		WebElement p = driver.findElement(By.xpath("//span[text()='Oracle Training']"));
		a.moveToElement(p).perform();
		
	WebElement s= driver.findElement(By.xpath("//span[text()='Oracle SQL and PLSQL Placement Training']"));
		a.moveToElement(s).click().perform();	
	}

}

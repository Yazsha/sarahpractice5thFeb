package org.stepAdactin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Jscriptexecutor {

	public static void main(String[] args) throws AWTException {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--incognito");
		
		WebDriver driver= new ChromeDriver(options);
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		Robot r= new Robot();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
		WebElement username = driver.findElement(By.name("email"));
		js.executeScript("arguments[0].setAttribute('value','sarah')", username);
		 
		 WebElement password = driver.findElement(By.id("pass"));
		 js.executeScript("arguments[0].setAttribute('value','jdgj123')", password);
		 
		 WebElement loginbtn = driver.findElement(By.name("login"));
		 //js.executeScript("arguments[0].click()", loginbtn);
		 
		// r.keyPress(KeyEvent.VK_ENTER);
		// r.keyRelease(KeyEvent.VK_ENTER);
		 
		 
		 
		 
		 
		
		
		
		

	}

}

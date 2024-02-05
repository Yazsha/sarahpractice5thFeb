package org.stepAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCssSel {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement loginbtn = driver.findElement(By.name("login"));
		String a = loginbtn.getCssValue("font-weight");
		System.out.println(a);
		
		
		System.out.println(loginbtn.getCssValue("color"));
		System.out.println(loginbtn.getCssValue("font-size"));
		System.out.println(loginbtn.getCssValue("background-color"));
		System.out.println(loginbtn.getCssValue("text-align"));
		System.out.println(loginbtn.getCssValue("font"));
		

	}

}

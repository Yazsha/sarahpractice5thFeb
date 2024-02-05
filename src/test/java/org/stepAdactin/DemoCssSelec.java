package org.stepAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCssSelec {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			
			WebElement create = driver.findElement(By.cssSelector("a[data-testid=open-registration-form-button]"));
			String a = create.getCssValue("font-weight");
			System.out.println(a);
			
			
			System.out.println(create.getCssValue("color"));
			System.out.println(create.getCssValue("font-size"));
			System.out.println(create.getCssValue("background-color"));
			System.out.println(create.getCssValue("text-align"));
			System.out.println(create.getCssValue("font"));
			


	}

}

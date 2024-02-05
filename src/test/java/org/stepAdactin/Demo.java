package org.stepAdactin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo {
	public static Select s;
	public static void main(String[]args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement a = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		a.click();
		
		Thread.sleep(3000);
		WebElement b = driver.findElement(By.name("firstname"));
		b.sendKeys(("LMN"));

		Thread.sleep(3000);
		WebElement c = driver.findElement(By.name("lastname"));
		c.sendKeys(("XYZ"));
		
		
		Thread.sleep(3000);
		WebElement d = driver.findElement(By.xpath("(//input[@type='text'])[4]"));
		d.sendKeys(("jfjdglfkl@gmail.com"));
		
		WebElement e = driver.findElement(By.id("password_step_input"));
		e.sendKeys(("kfdjlkj99"));
		
		WebElement dy = driver.findElement(By.id("day"));
		 s= new Select(dy);
		s.selectByIndex(20);
		
		WebElement month = driver.findElement(By.name("birthday_month"));
		
		s= new Select(month);
		s.selectByVisibleText("Apr");
		
		WebElement y = driver.findElement(By.id("year"));
		s= new Select(y);
		s.selectByValue("2010");
		
		WebElement f = driver.findElement(By.xpath("//input[@value='1']"));
		f.click();
		
		boolean fe = f.isSelected();
		
		System.out.println("Is female button is selected:"+fe);
		
		WebElement sigin=driver.findElement(By.xpath("(//button[text()='Sign Up'])[1]"));
		sigin.click();
		
	}

}

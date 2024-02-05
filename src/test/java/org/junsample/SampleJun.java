package org.junsample;

public class SampleJun {
	
	package org.adactinjunitnew;

	import java.util.Date;

	import org.junit.After;
	import org.junit.AfterClass;
	import org.junit.Before;
	import org.junit.BeforeClass;
	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class Jdemo {
		public static WebDriver driver;
	@BeforeClass
	public static void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	System.out.println("BeforeClass");
	}

	/*@AfterClass
	public static void browerClose() {
		driver.close();
		
		System.out.println("AfterClass");	
	}*/

	@Before
	public void startTime()
	{
		Date d= new Date();
		System.out.println(d);
		
		System.out.println("Start time");
	}
	@After
	public void closeTime()

	{
		Date d= new Date();
		System.out.println(d);	
		System.out.println("close time");	
	}
	//
	@Test
	public void tc1() {
		
		WebElement username=driver.findElement(By.id("email"));
		username.sendKeys("sarah");
		
		WebElement password= driver.findElement(By.name("pass"));
		password.sendKeys("sarah@123");
		
		WebElement lgbtn= driver.findElement(By.name("login"));
		lgbtn.click();	
		
		System.out.println("Test1");

	}

	@Test
	public void tc2() {
		System.out.println("Test2");

	}

	@Test
	public void tc3() {
		System.out.println("Test3");

	}
		
	}


}


package org.stepdefinition;

import java.awt.Robot;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UtilityClass {

	public static WebDriver driver;
	public static Select s;
	
	public static void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	public static void lanchUrl(String url) {
		driver.get(url);

	}
	
	public static void closeBrowser() {
	driver.close();
	}
	
	public static void enterText(WebElement element1, String value) {
	    element1.sendKeys(value);
		}
	
		public static void clickElement(WebElement element) {
		
			element.click();
	}

		

		public static void clearEle(WebElement element) {
						
		element.clear();

		}
		

		public static void selByIndex( WebElement element, int num) {
			 s= new Select(element);
			s.selectByIndex(num);
		}
		//Dropdown----------> select by Value
		public static void selByVal(WebElement element,String val){
			 s= new Select(element);
			s.selectByValue(val);
		}
		//Dropdown----------> select by text
		public static void selByTxt(WebElement element,String txt) {
			 s=new Select(element);
			s.selectByVisibleText(txt);
			
		}
}

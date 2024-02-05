package org.stepAdactin;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class BrokenlinkImgLearning {
		public static void main(String[] args) throws IOException {
		
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			driver.manage().window().maximize();
			List<WebElement> links = driver.findElements(By.tagName("img"));
			int size = links.size();
			System.out.println("Total link present in my hopepage:"+size);
			for (WebElement eachlink : links) {
				String linkUrl = eachlink.getAttribute("src");
				
			if(linkUrl!=null) {
			//1.LinkUrl(string)----> convert into Url
					URL url= new URL(linkUrl);
			
					
			//2. Establish Connection ----URLConnection
					URLConnection o = url.openConnection();
			
			//3.convert the URL into Http connection
			// NewDataType ref =(newDataType)StoredValue
					HttpURLConnection h= (HttpURLConnection)o;
					int responseCode = h.getResponseCode();
					
					if(responseCode!=200) {
						System.out.println("Broken links:"+linkUrl);
					}
						else {							
								System.out.println("Working links:"+linkUrl);	
														
						}
					}
				}
		
			}


	}



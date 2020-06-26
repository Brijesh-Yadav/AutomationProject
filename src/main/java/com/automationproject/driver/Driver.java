package com.automationproject.driver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {
	
	public static WebDriver driver;
	
	public WebDriver initializeDriver(){
		try{
			System.out.println("initializing driver..");
			System.setProperty("webdriver.chrome.driver", Constants.projectdir+"/src/main/resources/driver/chromedriver.83.0.4103.39.exe");
			ChromeOptions options = new ChromeOptions();
			// Initialize browser
			driver=new ChromeDriver(options);
			// Maximize browser
			driver.manage().window().maximize();
			System.out.println("driver initialized!!");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}catch(Exception e){
			System.out.println("initializeDriver error : "+e.getMessage());
		}
		return driver;
	}
	
	public WebDriver getDriverInstance(){
		if(driver==null){
			return driver;
		}
		return driver;
	}
}

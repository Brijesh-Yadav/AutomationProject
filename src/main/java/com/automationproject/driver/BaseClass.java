package com.automationproject.driver;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass extends Driver{
	
	@Parameters({"url"})
	@BeforeClass
	public void launchBrowser(String url){
		initializeDriver();
		System.out.println("launching "+url);
		driver.get(url);
	}
	
	@AfterClass
	public void closeBrowser(){
		driver.close();
	}

}

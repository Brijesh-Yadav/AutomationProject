package com.automationproject.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.automationproject.driver.BaseClass;
import com.automationproject.pageobjects.JqueryHomePage;

public class Jquery extends BaseClass{
	
	String stylevl;
	
	@Test(priority =1)
	public void colorVerfication(){
		JqueryHomePage hm = new JqueryHomePage();
		hm.swithToIframe();
		hm.clickToggle();
		stylevl = hm.storeAttiframeAfterToggerClick();
		System.out.println("stylevl "+stylevl);
		if(stylevl.contains("background-color: rgb(170, 0, 0); color: rgb(255, 255, 255);")){
			System.out.println("color has changed with rgb(170, 0, 0) ");
		}else{
			Assert.fail("color has not changed");
		}
	}
	
	@Test(priority =2)
	public void toggleSizeVerificatiom(){

		if(stylevl.contains("width: 500px;")){
			System.out.println("width has changed to 500px ");
		}else{
			Assert.fail("width has not changed");
		}
	
	}
}

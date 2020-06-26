package com.automationproject.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.automationproject.driver.BaseClass;
import com.automationprojects.modular.Modular;

public class JqueryHomePage extends BaseClass{
	
	//Page Object Property
	By toggle = By.xpath("//button[@id='button' and text()='Toggle Effect']");
	By iframe = By.tagName("iframe");
	By style = By.xpath("//div[@id='effect']");
	
	//Modular Actions
	Modular md = new Modular();
	
	//click toggle button
	public void clickToggle(){
		WebElement ele = driver.findElement(toggle);
		ele.click();
		System.out.println("clicked on Toggle button");
	}
	
	//switch to iframe for demo area
	public void swithToIframe(){
		driver.switchTo().frame(driver.findElement(iframe));
		System.out.println("switched to iframe");
	}
	
	//store style attribute to compare dimension and size
	public String storeAttiframeAfterToggerClick(){
		md.waitTimeInSec(10);
		String att = driver.findElement(style).getAttribute("style");
		return att;
	}
	
}

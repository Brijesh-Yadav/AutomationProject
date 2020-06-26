package com.automationprojects.modular;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import com.automationproject.driver.Driver;

public class Modular extends Driver{
	
	//Highlight webElement
	public void highLightElement(By by){
		WebElement ele = driver.findElement(by);
		JavascriptExecutor js = (JavascriptExecutor) driver;
        //use executeScript() method and pass the arguments 
        //Here i pass values based on css style. Yellow background color with solid red color border. 
		js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 2px solid red;');", ele);
	}
	
	public void waitTimeInSec(int sec){
		try{
			Thread.sleep(sec*1000);
			System.out.println("waited for "+sec+" sec");
		}catch(Exception e){
			e.getMessage();
		}
	}
	
}

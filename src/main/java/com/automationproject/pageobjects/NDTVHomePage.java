package com.automationproject.pageobjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import com.automationproject.driver.BaseClass;

public class NDTVHomePage extends BaseClass{
	
	//parent menu
	By topLinkMenu = By.xpath("//div[@class='nglobalnav_wrap']/div[@class='nglobalnav']"); 
	By bottomLinkMenu = By.xpath("//div[@class='footer_group']/ul");
	
	//print all links of top menu
	public void printAllTopLinkMenuOptions(){
		List<WebElement> list = allToplinkMenulist();
		for(int i=0; i<list.size(); i++){
			String href = list.get(i).getAttribute("href");
			System.out.println("Href "+href);
		}
	}
	
	//return all top link list
	public List<WebElement> allToplinkMenulist(){
		WebElement parenttoplinkElement = driver.findElement(topLinkMenu);
		List<WebElement> list = parenttoplinkElement.findElements(By.tagName("a"));
		return list;
	}

	//return all bottom link list
	public List<WebElement> allBottomlinkMenulist(){
		WebElement parenttoplinkElement = driver.findElement(bottomLinkMenu);
		List<WebElement> list = parenttoplinkElement.findElements(By.tagName("a"));
		return list;
	}

	//print all links of bottom menu
	public void printAllBottomLinkMenuOptions(){
		List<WebElement> list = allBottomlinkMenulist();
		for(int i=0; i<list.size(); i++){
			String href = list.get(i).getAttribute("href");
			System.out.println("Href "+href);
		}
	}
	
	//compare business link in bottom link
	public void comparetoplinkInBottomMenu(){
		List<WebElement> toplnkObj = allToplinkMenulist();
		List<WebElement> bottomlnkObj = allBottomlinkMenulist();
		for(int i=0; i<toplnkObj.size(); i++){
			WebElement href = toplnkObj.get(i);
			String lnkurl = href.getAttribute("href");
			String linktext = href.getText();
			if(linktext.equals("Business")){
				WebElement hrefbottom = bottomlnkObj.get(i);
				String lnkurlbottom = hrefbottom.getAttribute("href");
				System.out.println("toplinkurl "+lnkurl);
				System.out.println("bottomlinkurl "+lnkurlbottom);
				if(lnkurl.equalsIgnoreCase(lnkurlbottom)){
					System.out.println("Top business link is present in bottom linklist");
					break;
				}else{
					System.out.println("Top business link is not present in bottom linklist");
					Assert.fail("Top business link is not present in bottom linklist");
				}
			}
		}
	}
	
	
}

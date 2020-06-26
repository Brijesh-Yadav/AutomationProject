package com.automationproject.testscript;

import org.testng.annotations.Test;

import com.automationproject.driver.BaseClass;
import com.automationproject.pageobjects.NDTVHomePage;

public class NDTVBusiness extends BaseClass{
	
	NDTVHomePage hp = new NDTVHomePage();
	
	@Test(priority =1)
	public void printAllTopMenusLinks(){
		hp.printAllTopLinkMenuOptions();
	}
	
	@Test(priority =2, enabled =true)
	public void printAllBottomMenusLinks(){
		hp.printAllBottomLinkMenuOptions();
	}
	
	@Test(priority =3,enabled =true)
	public void CheckBusinessLinkInFooter(){
		hp.comparetoplinkInBottomMenu();
	}

}

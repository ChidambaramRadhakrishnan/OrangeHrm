package com.pageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.HomePageObjects;

public class PageObjectManager {
public static HomePageObjects obj=null;
	 
	public static WebDriver driver =null;
	
	public PageObjectManager(WebDriver driver) {
		PageObjectManager.driver=driver;
	}
	
	public static HomePageObjects objHomepage()
	{
		
		if (obj == null) {
			obj =new HomePageObjects(driver);
		}
		
	
	return obj;
	}

}

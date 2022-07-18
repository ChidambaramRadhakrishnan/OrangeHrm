package com.pageObjectManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.HomePageObjects;
import com.pom.LogInPageObjetcs;

public class PageObjectManager {
public static LogInPageObjetcs obj=null;
	 
	public static WebDriver driver =null;
	public static HomePageObjects objHome=null;
	
	public PageObjectManager(WebDriver driver) {
		PageObjectManager.driver=driver;
	}
	
	public static LogInPageObjetcs logInPAgeObj()
	{
		
		if (obj == null) {
			obj =new LogInPageObjetcs(driver);
		}
		return obj;
		
	}
	public static HomePageObjects homePageObj()
	{
		if (objHome == null) {
			objHome =new HomePageObjects(driver);
		}	
	return objHome;
	}
	
}

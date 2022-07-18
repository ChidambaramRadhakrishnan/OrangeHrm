package com.runner;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.base.CommonUtilities;
import com.pageObjectManager.PageObjectManager;

import com.pom.LogInPageObjetcs;

public class RunnerClass extends CommonUtilities{



	LogInPageObjetcs obj;
	SoftAssert sa=new SoftAssert();


	@BeforeClass
	public static void aunch() {
		browserlaunch("chrome");
	}
	@BeforeMethod
	void launchurl()
	{
		launchUrl("https://opensource-demo.orangehrmlive.com/");
		PageObjectManager page=new PageObjectManager(driver);
	}
	@Test
	void login()
	{

		PageObjectManager.logInPAgeObj() .getUsername().sendKeys("Admin");
		PageObjectManager.logInPAgeObj() .getPassword().sendKeys("admin123");
		PageObjectManager.logInPAgeObj() .getLogin().click();
		sa.assertEquals("Admin",PageObjectManager.homePageObj().getAdminButton().getText());
	
		


	}
	@AfterMethod
	void quit()
	{
		driver.close();
	}

}

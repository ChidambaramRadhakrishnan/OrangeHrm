package com.runner;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.base.CommonUtilities;
import com.pageObjectManager.PageObjectManager;
import com.pom.HomePageObjects;

public class RunnerClass extends CommonUtilities{

	

HomePageObjects obj;

	
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
	
	PageObjectManager.objHomepage() .getUsername().sendKeys("Admin");
	PageObjectManager.objHomepage() .getPassword().sendKeys("admin123");
	PageObjectManager.objHomepage() .getLogin().click();


}
void quit()
{
	driver.close();
}

}

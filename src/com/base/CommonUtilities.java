package com.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.pageObjectManager.PageObjectManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonUtilities {
	
	public static WebDriver driver;
	
	public static WebDriver browserlaunch(String browser) {
	
		switch(browser.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver= new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			driver.manage().window().maximize();
			break;
		
		}
		return driver;
		

	}
	public static void launchUrl(String url)
	{
		driver.get(url);
	}
	public void click(WebElement ele)
	{
		ele.click();
	}

}

package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageObjects {
	public WebDriver driver=null;
	
	public HomePageObjects(WebDriver driver) {
		this.driver= driver;
		PageFactory.initElements(driver, this);

		
	}

	

	@FindBy (id="txtUsername")
	private WebElement username;
	
	

	public  WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

	@FindBy (id="txtPassword")
	private WebElement password;
	
	@FindBy (id="btnLogin")
	private WebElement login;

	

	
	
}

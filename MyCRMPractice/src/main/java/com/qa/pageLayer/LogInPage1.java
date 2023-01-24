package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LogInPage1 extends TestBase{
	
	@FindBy(xpath="//span[text()='Log In']")
	WebElement Login1;
	
	
	
	
	
	
	public LogInPage1()
	{
		PageFactory.initElements(driver, LogInPage1.class);
	}
	
	public void click_on_button() {
		Login1.click();
	}

}

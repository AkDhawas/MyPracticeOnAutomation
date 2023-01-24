package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class LoginPage extends TestBase {
	  /*
	   : log in page is child class of test base class so properties of 
	   :test base parent class
	   
	   */
	//object repositary
	
	/*
	 :what ever the elemnt we have to handle  we have to find it and then use @FindBy anntation to 
	 by xpath
	 :then we have to define variable like WebElement variable name
	 */
	@FindBy(name="username")  
	WebElement username;    
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement loginbtn;
	
	@FindBy(xpath="//button[contains(text(),'Sign Up')]")
	WebElement signUpBtn;
	
	@FindBy(xpath="//img[contains(@class,'img-responsive')]")
	WebElement crmLogo;
	
	
	/*
	 :To Initilise the object repository or intilise element we will create constructor and inside 
	 these constructor one method we use initElemnt method which is static
	 :driver coming from base class
	 :this represent the currunt class object insted of this we can write the (driver, LoginPage.class);
	 */
	public LoginPage()    // here we used constructor for 
	{
		PageFactory.initElements(driver, this); 
		
	}
	
	// Actions that want to perform
	public String validateLoginPageTitle()
	{
		 return driver.getTitle();
	}
	
	public boolean validCRMImage()
	{
		return crmLogo.isDisplayed();
	}
	
	public  HomePage login(String un ,String pwd)
	{
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginbtn.click();
		
		return new HomePage();
		
		
		/*
		 :After clicking on log in its land on homepage so it should resturn homepage class object
		 : so we write return new homepage
		 */
	}
}
	
	

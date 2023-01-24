package com.qa.testLayer;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.HomePage;
import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	LoginPage log;
	HomePage home;
	
	public LoginPageTest() {
		super ();
		
		/*
		 : creating cunstructor also with super keyword 
		 :so super key word come in super class and call super class cunstructor that is test base 
		 class cunstructur
		
		 */
	}
	@BeforeMethod
	public void setup() {
		initilisation();
		log= new LoginPage();  // creating object of login page class to acces all the property of loginpage
	
		home =new HomePage();
		
		/*
		 :first come in set up method then it call super class cunstructor(where our all the property 
		  are define one the property intilise ) then it initilise the initilisation method
		 :call initilisation method from parent class
		 : create object of log in page class 
		 */
	}
	
	@Test(priority=1)
	public void LoginPageTitleTest()
	{
	String tital = log.validateLoginPageTitle();
	Assert.assertEquals(tital,"#1 Free CRM for Any Business: Online Customer Relationship Software" );
	}
	
	@Test(priority=2)
	public void ValidateCRMlogo()
	{
		boolean im = log.validCRMImage();
		Assert.assertTrue(im);
	}
	
	
	@Test(priority=3)
	public void logintest()
	{
		home=log.login(prop.getProperty("username"),prop.getProperty("passward"));
	}
@AfterMethod
public void down()
{
	driver.quit();
}
	
	
}
 

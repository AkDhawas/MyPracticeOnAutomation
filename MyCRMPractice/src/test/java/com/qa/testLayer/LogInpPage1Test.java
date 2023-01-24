package com.qa.testLayer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageLayer.LogInPage1;
import com.qa.testBase.TestBase;

public class LogInpPage1Test extends TestBase {
	
	 LogInPage1 log1 ;

	public LogInpPage1Test ()
	{
		super();
	}
	
	@BeforeMethod
	public void setup()
	{
		initilisation();
		
		log1 =new LogInPage1 ();
		
		
	}
	@Test
	
	public void button()
	{
		log1.click_on_button();
		
		System.out.println("is code running");
	}
	
	@AfterMethod
	public void tear_down()
	
	{
		driver.close();
	}
	
}

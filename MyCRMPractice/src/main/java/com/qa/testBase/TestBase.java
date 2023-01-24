package com.qa.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

import com.qa.utility.UtilClass;

public class TestBase {
	
	public static Properties prop; // intilise globaly so we can use anywhere in project
	public static WebDriver driver; 
	//public static Homepage home;
	/*
	  here we write basic initilisation such as browser lounch , implicit wait, maximise ,minimise 
	  delet all cookies all this thing we write here
	 */
	
	public TestBase() {
		//creating constractur of class 
		try
		{
			prop=new Properties(); //properties in build class to read properties
			
			FileInputStream fis=new FileInputStream("C:\\Users\\asus\\eclipse-workspace\\CRM\\src\\main\\java\\com\\qa\\config\\config.properties");
			prop.load(fis); // to load file
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		
	
	}
	 public static void initilisation()
	 {
	String bname = prop.getProperty("browser"); // to read prop from config prop
	 
		 if(bname.equals("chrome"));
		 {
			 System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver_wi32NEW\\chromedriver.exe");
			 driver=new ChromeDriver();
		 }
		  
		 driver.get(prop.getProperty("url"));
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().implicitlyWait(UtilClass.implicit_time,TimeUnit.SECONDS);
		 driver.manage().timeouts().pageLoadTimeout(UtilClass.Page_load_Time,TimeUnit.SECONDS);
		 
		
		 /*
		  : in implicit and and page load time we use the value which declred in util class
		  so we can use any time any where so our project not geted hard coded
		  classname.method name use
		  :
		  */
	 }
	 
	
	
	
	

}
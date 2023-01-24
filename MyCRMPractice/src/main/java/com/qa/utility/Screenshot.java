package com.qa.utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.qa.testBase.TestBase;

import net.bytebuddy.utility.RandomString;

public class Screenshot extends TestBase {
	public static void take() {
//	TakesScreenshot tc= (TakesScreenshot)driver;
	//File src = tc.getScreenshotAs(OutputType.FILE);
	 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	try {
	File fis = new File("C:\\Users\\asus\\eclipse-workspace\\CRM\\Screenshot"+"akshay"+".png");
	FileHandler.copy(src, fis);
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}

}
}
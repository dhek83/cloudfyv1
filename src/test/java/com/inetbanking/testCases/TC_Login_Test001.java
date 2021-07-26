package com.inetbanking.testCases;



import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_Login_Test001 extends Baseclass
{
	@Test
	public void logintest()
	{
		
		LoginPage lp=new LoginPage(driver);
		
        lp.setuname(username);
		
		Logger.info("User Name Entered");
		getScreenshot(driver);
		
		lp.Setpassword(password);
		
		Logger.info("Password Entered");
		getScreenshot(driver);
		lp.clicksubmit();
		
		if (driver.getTitle().equals("My Account V4 | v3dev1"))
		{
		Assert.assertTrue(true);
		Logger.info("Test Case Passed");
		}
		else
		{   getScreenshot(driver);
		  Logger.info("Test Case Failed"); 
			Assert.assertTrue(false);
			
			
		
		   
		
	}
			
	
}
}
	


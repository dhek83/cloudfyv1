
package com.inetbanking.testCases;

import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.RegisterPage;

public class TC_Register_Test003 extends Baseclass
{

	@Test
	
	public void register() throws InterruptedException
	
	{
		RegisterPage cf=new RegisterPage(driver);
		cf.clickreg();
		cf.setCompanyName("WIlliams");
		cf.setcomreg("123123");
		cf.setvat("VAT123");
		cf.setadd1("Address 1");
		cf.setadd2("Address 2");
		cf.setadd3("address 3");
		cf.setpostc("wcl123");
		cf.setcity("Delhi");
		cf.setcounty("Uttar");		
		cf.setfname("suresh");
		cf.setlname("joshi");
		cf.setlphone("8755666636");
		String email=randomsrtring()+"@gmail.com";
		cf.setemail(email);
		cf.setcemail(email);
		Logger.info("Email Entered");
		cf.setpwd("123456");
		cf.setcpwd("123456");
		Logger.info("Password Entered");
		cf.newssubc();
		cf.tc();
		//cf.setcountry("UK");
		cf.btnclick();
		Logger.info("Submitted");
		if(driver.getPageSource().startsWith("Thank you for registering."))
		{
			Assert.assertTrue(true);
		Logger.info("Registered successfully");
		}
		else
		{   getScreenshot(driver);
		  Logger.info("Reg Failed"); 
			Assert.assertTrue(false);
			
		}

	}
	
	public String randomsrtring()
	{
		String generatedstring=RandomStringUtils.randomAlphabetic(8);
		return generatedstring;
		
	}
}

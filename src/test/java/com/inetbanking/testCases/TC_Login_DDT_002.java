package com.inetbanking.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;
import com.inetbanking.utilities.XLUtils;

public class TC_Login_DDT_002 extends Baseclass
{
	
	@Test(dataProvider="LoginData")
	public void loginDDT(String username, String Password) throws InterruptedException
	{
			
		LoginPage lp=new LoginPage(driver);
		
		WebElement txtEmail=driver.findElement(By.id("UserName"));
		txtEmail.clear();
		lp.setuname(username);
		Logger.info("User Name Entered");
		Thread.sleep(1000);
		
		WebElement txtpwd=driver.findElement(By.id("Password"));
		txtpwd.clear();
		lp.Setpassword(Password);
		Logger.info("Password Entered");
		Thread.sleep(1000);
		
		lp.clicksubmit();
		Logger.info("Login submitted");
		
		
		//This code only work for header layout 12
		
		if (driver.getTitle().equals("My Account V4 | v3dev1"))
		{
			Assert.assertTrue(true);
		Logger.info("Test Case Passed");
		Thread.sleep(1000);
		lp.clicklink();
		Thread.sleep(1000);
		lp.Logout();
		Logger.info("Logged Out");
		lp.login();
		Logger.info("Login Page");
		
		Thread.sleep(2000);
			
	
		
		}
		else
		{ 
			
			getScreenshot(driver);
			Logger.info("Test Case Failed"); 
			
			Thread.sleep(2000);
					    
			Assert.assertTrue(false);	
				
			
		}
		
		
	} 
		@DataProvider(name="LoginData")
		String [][] getdata() throws IOException
		{
	     	 String path=System.getProperty("user.dir")+"/src/test/java/com/inetbanking/testData/LoginData.xlsx";	
		     
	     	 int rownum=XLUtils.getRowCount(path,"sheet1");
	     	 int cellcount=XLUtils.getCellCount(path,"sheet1", 1);
	     	 
	     	 String loginData[][]= new String[rownum][cellcount];
	     	 
	     	 for(int i=1; i<=rownum; i++)
	     	 {
	     		 for(int j=0; j<cellcount; j++ )
	     		 {
	     			 loginData[i-1][j]=XLUtils.getCellData(path,"sheet1", i, j);
	     		 }
	     		 
	     	 }
	     	 
	     	 return loginData;
	     	 
	     	 
	     	 
				 
		}
	}


package com.inetbanking.testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.LoginPage;

public class TC_Categ_Test004 extends Baseclass
{
 
	
	
		@Test
		public void Catclick()
		{
			
			LoginPage lp1=new LoginPage(driver);
			
	        lp1.setuname(username);
			
			Logger.info("User Name Entered");
			getScreenshot(driver);
			
			lp1.Setpassword(password);
			
			Logger.info("Password Entered");
			getScreenshot(driver);
			lp1.clicksubmit();
			
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
			List <WebElement> categ=driver.findElements(By.xpath(("//li[@class='noChild'] | //a[@class='catclass'] | //a[@class='catclass2']  ")));
		
		int total_nodes=categ.size();
		
		for(int i=0; i<total_nodes; i++)
		{
			String cat=categ.get(i).getText();
			System.out.println("Category List  "  +cat);
			if (cat.equals("Special Offers"))
				
			{
				categ.get(i).click();
				System.out.println("Selected Category= "+cat);
				
				break;
				
			}
		
		
	}
		
	}
		}
		

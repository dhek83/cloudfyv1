package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
WebDriver ldriver;
	
	public RegisterPage(WebDriver rdriver)

	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//div[@class='search']/following::a[1]")
	@CacheLookup
    WebElement registerclick;
	
	@FindBy(id="CompanyRegNo")
	@CacheLookup
    WebElement txtCompanyRegNo;
	
	
	
	@FindBy(id="CompanyName")
	@CacheLookup
    WebElement txtCompanyName;
	
	
	@FindBy(id="CompanyVatNo")
	@CacheLookup
    WebElement txtCompanyVatNo;
	
	
	@FindBy(id="Address1")
	@CacheLookup
    WebElement txtAddress1;
	
	
	@FindBy(id="Address2")
	@CacheLookup
    WebElement txtAddress2;
	
	@FindBy(id="Address3")
	@CacheLookup
    WebElement txtAddress3;
	
	@FindBy(id="PostCode")
	@CacheLookup
    WebElement txtPostCode;
	
	@FindBy(id="City")
	@CacheLookup
    WebElement txtCity;
	
	@FindBy(id="County")
	@CacheLookup
    WebElement txtCounty;
	
	@FindBy(id="Country")
	@CacheLookup
    WebElement txtCountry;
	
	@FindBy(id="FirstName")
	@CacheLookup
    WebElement txtFirstName;
	
	
	@FindBy(id="PhoneNumber")
	@CacheLookup
    WebElement txtPhoneNumber;
	
	@FindBy(id="LastName")
	@CacheLookup
    WebElement txtLastName;
	
	@FindBy(id="Email")
	@CacheLookup
    WebElement txtEmail;
	
	@FindBy(id="ConfirmEmail")
	@CacheLookup
    WebElement txtConfirmEmail;
	
	@FindBy(id="Password")
	@CacheLookup
    WebElement txtPassword;
	
	@FindBy(id="ConfirmPassword")
	@CacheLookup
    WebElement txtConfirmPassword;
	
	@FindBy(id="TermsAndCondition")
	@CacheLookup
    WebElement txtTermsAndCondition;
	
	@FindBy(id="btnsubmit")
	@CacheLookup
    WebElement btnsubmit;
	
	@FindBy(xpath="//input[@id='r1']")
	@CacheLookup
    WebElement newssubc;
	
	@FindBy(xpath="//input[@id='r21']")
	@CacheLookup
    WebElement nonewsnsubc;
	
	@FindBy(xpath="//input[@id='TermsAndCondition']")
	@CacheLookup
    WebElement tc;
	
	

      public void clickreg()
{
    registerclick.click();
}
      public void setcomreg(String company)
  	{
  		txtCompanyRegNo.sendKeys(company);
  	}
      
      public void setCompanyName(String cname)
  	{
    	  txtCompanyName.sendKeys(cname);
  	}
      
      public void setvat(String vatno)
  	{
    	  txtCompanyVatNo.sendKeys(vatno);
  	}
      
      public void setadd1(String addres1)
  	{
    	  txtAddress1.sendKeys(addres1);
  	}
      
      public void setadd2(String address2)
  	{
    	  txtAddress2.sendKeys(address2);
  	}
      
      public void setadd3(String addres3)
  	{
    	  txtAddress3.sendKeys(addres3);
  	}
     
      
      public void setpostc(String pcode)
  	{
    	  txtPostCode.sendKeys(pcode);
  	}
      
      public void setcity(String city)
  	{
    	  txtCity.sendKeys(city);
  	}
      
      public void setcounty(String count)
  	{
    	  txtCounty.sendKeys(count);
  	}
      public void setcountry(String country)
  	{
    	  txtCountry.sendKeys(country);
  	}
      public void setfname(String fname)
  	{
    	  txtFirstName.sendKeys(fname);
  	}
      public void setlname(String lname)
  	{
    	  txtLastName.sendKeys(lname);
  	}
      public void setlphone(String phonenum)
    	{
      	  txtPhoneNumber.sendKeys(phonenum);
    	}
      
      public void setemail(String email)
  	{
    	  txtEmail.sendKeys(email);
  	}
      public void setcemail(String cemail)
  	{
    	  txtConfirmEmail.sendKeys(cemail);
  	}
      public void setpwd(String pass)
  	{
    	  txtPassword.sendKeys(pass);
  	}
      public void setcpwd(String cpass)
  	{
    	  txtConfirmPassword.sendKeys(cpass);
  	}
      public void clicktermscond(String term)
  	{
    	  txtTermsAndCondition.sendKeys(term);
  	}
      public void btnclick()
  	{
    	  btnsubmit.click();
  	}
      
      public void newssubc()
      {
    	  newssubc.click();
      }
      
      public void nonewsnsubc()
      {
    	  nonewsnsubc.click();
      }
    
      public void tc()
      {
    	  tc.click();
      }
      
      
}

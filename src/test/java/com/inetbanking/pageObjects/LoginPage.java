package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)

	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(id="UserName")
	@CacheLookup
    WebElement txtUserName;
	
	@FindBy(id="Password")
	@CacheLookup
	WebElement txtPassword;
	
	@FindBy(id="dupbtn")
	@CacheLookup
	WebElement dupbtn;
	
	@FindBy(xpath="//div[@class=\"search\"]/following::a[2]")
	@CacheLookup
	WebElement loginlink;
	
	@FindBy(xpath="//div[@class=\"search\"]/following::a[6]")
	@CacheLookup
	WebElement logout;
	
	@FindBy(xpath="//a[@class=\"loginLinkRet\"]")
	@CacheLookup
	WebElement login;
	
	public void setuname(String uname)
	{
		txtUserName.sendKeys(uname);
	}
	
	public void Setpassword(String pwd)
	{
		txtPassword.sendKeys(pwd);
	}
	
	public void clicksubmit()
	{
		dupbtn.click();
	}
	
	 public void clicklink()
	 {
		 loginlink.click();
	 }
	 
	 public void Logout()
	 
	 {
		 logout.click();
	 }
	 
	 
	 public void login()
	 {
		 login.click();
		 
	 }
	 
	 }


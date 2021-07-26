package com.inetbanking.testCases;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.inetbanking.utilities.ReadConfig;


public class Baseclass {
	
ReadConfig readconfig= new ReadConfig();

public String baseURL=readconfig.getApplicationURL();
public static WebDriver driver;
public static Logger Logger;   
public String username= readconfig.getUsername();
public String password= readconfig.getPassword();


@Parameters("browser")
@BeforeClass
public void setup(String br)

{
	Logger = org.apache.log4j.Logger.getLogger("Cloudfy");
	PropertyConfigurator.configure("Log4j.properties");
	
	if (br.equals("chrome"))
	{
    System.setProperty("webdriver.chrome.driver", readconfig.getChrompath());
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	}
	
	else if (br.equals("firefox"))
	{
		System.setProperty("webdriver.gecko.driver", readconfig.firefoxpath());
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
	}
	
	else if (br.equals("IE"))
	{
		System.setProperty("webdriver.ie.driver", readconfig.getIEpath());
		driver = new InternetExplorerDriver();
		driver.manage().window().maximize();
	}
	
	driver.get(baseURL);
}

@AfterClass
public void teardown()
{
	driver.quit();
}
public static String getScreenshot(WebDriver driver)
{
	TakesScreenshot ts=(TakesScreenshot) driver;
	
	File src=ts.getScreenshotAs(OutputType.FILE);
	
	String path=System.getProperty("user.dir")+"/Screenshot/"+System.currentTimeMillis()+".png";
	
	File destination=new File(path);
	
	try 
	{
		FileUtils.copyFile(src, destination);
	} catch (IOException e) 
	{
		System.out.println("Capture Failed "+e.getMessage());
	}
	
	return path;
}
}

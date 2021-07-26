package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{
		File src=new File ("./Configurations/config.properties");
		
		try {
			FileInputStream fis= new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
					
		}
		catch (Exception e)
		{
			System.out.println("Exception is "+e.getMessage());
		}
	}
	
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
		
	}
	
	public String getUsername()
	{
		String url=pro.getProperty("username");
		return url;
		
	}
	
	public String getPassword()
	{
		String url=pro.getProperty("password");
		return url;
		
	}
	
	
     public String getChrompath()
    {
	String chropath=pro.getProperty("chromepath");
	return chropath;
}
    public String getIEpath()
     {
 	String iepath=pro.getProperty("ieppath");
 	return iepath;
 } 
     public String firefoxpath()
     {
 	String fpath=pro.getProperty("firefoxpath");
 	return fpath;
 }
}

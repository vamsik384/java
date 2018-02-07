package com.chiselon.sel.webdrivers;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class Vamsi 
{
	public static void main(String[]args)
	{
		System.out.println("open browser");
		System.setProperty("webdriver.ie.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Drivers\\driv\\IEDriverServer.exe");
		InternetExplorerDriver ie = new InternetExplorerDriver();
		ie.get("http://WWW.YouTube.com");
		String s1 = "http://WWW.YouTube.com";
		
		String s2 = "https://www.youtube.com/";
		if(s2.equals(s1))
		{
			System.out.println(s1 + " equal to " + s2);
		}
		else if(s2.contains("Tube"))
		{
			System.out.println(s1 + " contains " + s2);
		}
		else if(s2.equalsIgnoreCase(s1))
		{
			System.out.println(s1 + " ignored " + s2);
		}
		else
		{
			System.out.println(s1 +" not equal to " + s2);
		}
		//ie.close();
	}
	

}

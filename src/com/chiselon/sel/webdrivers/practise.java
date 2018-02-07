package com.chiselon.sel.webdrivers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;

public class practise 
{
	public static void main(String [] arg) throws Exception
	{
		FileInputStream file=new FileInputStream("C:\\Users\\INDIA\\eclipse-workspace\\Drivers\\src\\com\\chiselon\\properties\\objectrepositry.properties");
		Properties p=new Properties();
		p.load(file);
		System.out.println("open browser");
		System.out.println(p.getProperty("url"));
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Drivers\\driv\\chromedriver.exe");
		ChromeDriver cd=new ChromeDriver();
		System.out.println("browser opened");
		cd.manage().window().maximize();
		cd.get(p.getProperty("url"));
		
		String title = cd.getTitle();
		System.out.println(title);
		
		cd.findElementByXPath("//input[@id='email']").sendKeys("vamsik384@gmail.com");
		cd.findElementByXPath("(//input[@type='password'])[1]").sendKeys("123456789");
		cd.findElementByXPath("//input[@value='Log In']").click();
		
	}

}

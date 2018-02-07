package com.chiselon.sel.webdrivers;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Manasa 
{
	public static void main(String[] args )
	{
		System.out.println("open browser");
		//System.setProperty("webdriver.gecko.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Drivers\\driv\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.bookmyshow.com");
		String manu = "http://www.bookmyshow.com";
		System.out.println("Navigate to specified page");
		String manu1 = "https://in.bookmyshow.com/";
		/*if(manu1.contains("show.com"))
		{
			System.out.println( manu + " equal to " + manu1);
		}
		else
		{
			System.out.println(manu + " doesn't equal to " + manu1);
		}
		if(manu1.equals(manu))
		{
			System.out.println( manu + " equal to " + manu1);
		}
		else
		{
			System.out.println(manu + " doesn't equal to " + manu1);
		}
		if(manu1.equalsIgnoreCase(manu))
		{
			System.out.println( manu + " equal to " + manu1);
		}
		else
		{
			System.out.println(manu + " doesn't equal to " + manu1);
	
	}*/
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath(".signup-now-button")).click();
	}
}

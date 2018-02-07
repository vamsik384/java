package com.chiselon.sel.webdrivers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jaswanth 
{
	public static void main(String[] args) throws Exception 
	{
		System.out.println("open browser");
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\INDIA\\eclipse-workspace\\Automation\\driv\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		System.out.println("Chrome browser opened");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("http://www.RedBus.com");
		String name = "http://www.RedBus.com";
		
		driver.manage().window().maximize();
		
		System.out.println("navigated to redbus page");
		String name1 = "http://www.redbus.com/";
		/*
		if(name.contains(".com"))
		{
			System.out.println(name + " contains " + name1);
		}
		else if(name.equals(name1))
		{
			System.out.println(name + " equal to " + name1);
		}
		else if(name.equalsIgnoreCase(name1))
		{
			System.out.println(name + " ignored to " + name1);
		}
		else
		{
			System.out.println(name + " not ignored " + name1);
			
			
		driver.close();
		}	*/
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("(//img[@title='redBus India'])[2]")).click();
		driver.findElementById("i-icon-profile").click();		
		driver.findElement(By.xpath("(//div[@id='hc'])[1]")).click();
		//driver.switchTo().alert().dismiss();
		driver.switchTo().frame(driver.findElement(By.xpath("(//div[@class='modalContent']/iframe)")));
		
		driver.findElement(By.xpath("//*[text()='Sign in with Google']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.linkText("Sign in with Google")).click();	
		driver.findElement(By.xpath("(//input[@placeholder='email address'])[2]")).sendKeys("jaswanth");
		driver.close();
	}
}
package com.AutomationDemo.demoProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	public void launchDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
				
	}
	
	
	@Test
	public void TestCase1()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 1 title is: " + driver.getTitle());
	}
	
	
	@Test
	public void TestCase2()
	{
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 2 title is: " + driver.getTitle());
	}
	
	
	
	@Test
	public void TestCase3()
	{
		
		driver.navigate().to("https://automationtalks.com/");
		System.out.println("Test 3 title is: " + driver.getTitle());
	}
	
	
	@AfterMethod
	public void quit()
	{
		driver.quit();
	}
	

}

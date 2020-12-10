package com.AutomationDemo.demoProject;


import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass1 {
	
	public static WebDriver driver;	
	
	public static final String USERNAME = "ginameyer1";
	public static final String AUTOMATE_KEY = "ixXCGGiJy1KpgXsHVq4s";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";	  
		  
	
	
	@BeforeMethod
	public void launchDriver() throws MalformedURLException
	{
		
		//Manually set the desired capability to run the test on Selenium Grid
  	/*DesiredCapabilities dc = null;
		dc = DesiredCapabilities.chrome();
		dc.setBrowserName("chrome");
		dc.setPlatform(Platform.WIN10); 
	*/
		
	
		//use BrowserStack to set the Desired Capabilities
 		
	    DesiredCapabilities caps = new DesiredCapabilities();    
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "10");
	    caps.setCapability("browser", "Chrome");
	    caps.setCapability("browser_version", "87.0");    
	   // caps.setCapability("name", "ginameyer1's First Test");    
	 
	    
	    
		/* DesiredCapabilities caps = new DesiredCapabilities();   
	    caps.setCapability("os", "Windows");
	    caps.setCapability("os_version", "7");
	    caps.setCapability("browser", "Firefox");
	    caps.setCapability("browser_version", "66.0");
	    caps.setCapability("project", "AutomationTalksProject");
	    caps.setCapability("build", "MyBuild1.0");
	    caps.setCapability("name", "MyTestCaseName");
	    
	   */ 
	   
	   driver = new RemoteWebDriver(new URL(URL), caps);
		
	    
	    
		
				
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver", "C:\\geckodriver.exe");
		
		//driver = new ChromeDriver();  //invoke Chrome webdriver on my local machine
		
	//	driver = new RemoteWebDriver(new URL("http://10.14.3.43:4444/wd/hub"), dc);   //invoke Chrome webdriver Remotely on Selenium Hub
		
		
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

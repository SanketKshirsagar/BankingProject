package com.visionit.BankingProject.testBase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	public WebDriver driver=null;
	   @BeforeMethod
        public void setUp() {
        	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		   driver = new ChromeDriver();
		   driver.get("http://demo.guru99.com/v4/");
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   }
	   @AfterMethod
	   public void tearDown()
	   {
		   driver.quit();
	   }
}

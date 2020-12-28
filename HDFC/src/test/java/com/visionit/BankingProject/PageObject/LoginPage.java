package com.visionit.BankingProject.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	@FindBy(name="uid")
	WebElement username;
	@FindBy(name="password")
	WebElement userpass;
	@FindBy(name="btnLogin")
	WebElement loginbtn;
	@FindBy(name="btnReset")
	WebElement resetbtn;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void loginGuru99Bank() throws InterruptedException
	{
		Thread.sleep(6000);
		username.sendKeys("mngr301183");
		Thread.sleep(6000);
		userpass.sendKeys("unageta");
		Thread.sleep(6000);
		loginbtn.click();
	}

}

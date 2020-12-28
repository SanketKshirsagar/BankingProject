package com.visionit.BankingProject.testCases;

import org.testng.annotations.Test;

import com.visionit.BankingProject.PageObject.LoginPage;
import com.visionit.BankingProject.testBase.TestBase;

public class Login_TestCase_01 extends TestBase {
    @Test
	public void loginGuru99BankTest() throws InterruptedException
	{
	LoginPage login =	new LoginPage(driver);
	login.loginGuru99Bank();
	}

}

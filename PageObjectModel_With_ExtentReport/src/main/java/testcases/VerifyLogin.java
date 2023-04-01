package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		testName = "VerifyLogin";
		testDescription = "Login with positive data";
		testCategory = "smoke";
		testAuthor = "Balaji";
	}
	
	@Test
	public void runVerifyLogin() throws InterruptedException, IOException {
		System.out.println(driver); //6aaaaef32432423yetr
		//first step is enterUsername -> it is available in LoginPage
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage();		
	}

}

package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class VerifyLogin extends ProjectSpecificMethods{
	
	@Test
	public void runVerifyLogin() throws InterruptedException {
		System.out.println(driver); //6aaaaef32432423yetr
		//first step is enterUsername -> it is available in LoginPage
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyHomePage();		
	}

}

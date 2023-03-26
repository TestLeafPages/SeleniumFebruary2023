package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class LoginAndLogout extends ProjectSpecificMethods {
	
	@Test
	public void runLoginAndLogout() throws InterruptedException {
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutbutton();
		
		
		
		
		
		
		

	}

}

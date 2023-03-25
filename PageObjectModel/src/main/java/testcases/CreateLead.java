package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@Test
	public void verifyCreateLead() throws InterruptedException {
		System.out.println(driver);
		//first step is enterUsername -> it is available in LoginPage
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.clickCreateLeadButton()
		.verifyFirstName();
	}

}

package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelfilename="TC001";
	}
	
	@Test(dataProvider = "sendData")
	public void verifyCreateLead(String cName, String fName, String lName) throws InterruptedException {
		System.out.println(driver);
		//first step is enterUsername -> it is available in LoginPage
		LoginPage lp = new LoginPage(driver);
		
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsLink()
		.clickCreateLeadLink()
		.enterCompanyName(cName)
		.enterFirstName(fName)
		.enterLastName(lName)
		.clickCreateLeadButton()
		.verifyFirstName();
	}

}

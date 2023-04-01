package testcases;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.LoginPage;

public class CreateLead extends ProjectSpecificMethods{
	
	@BeforeTest
	public void setData() {
		excelfilename="TC001";
		testName = "CreateLead";
		testDescription = "Create lead with mandatory info";
		testCategory = "functional";
		testAuthor = "Hari";
	}
	
	@Test(dataProvider = "sendData")
	public void verifyCreateLead(String cName, String fName, String lName) throws InterruptedException, IOException {
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

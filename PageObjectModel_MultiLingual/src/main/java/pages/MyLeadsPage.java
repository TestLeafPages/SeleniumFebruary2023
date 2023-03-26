package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyLeadsPage extends ProjectSpecificMethods {
	
	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLeadLink() {
		driver.
		findElement(By.xpath(prop.getProperty("MyLeadsPage.CreateLead.Xpath"))).click();
		return new CreateLeadPage(driver);
	}

}

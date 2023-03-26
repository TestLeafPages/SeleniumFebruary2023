package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ViewLeadPage extends ProjectSpecificMethods {
	
	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}	
	
	
	public ViewLeadPage verifyFirstName() {
		String text = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(text.equals("Hari")) {
			System.out.println("Firstname is verified");
		}else {
			System.out.println("Firstname is not verified");
		}
		return this;
	}

}

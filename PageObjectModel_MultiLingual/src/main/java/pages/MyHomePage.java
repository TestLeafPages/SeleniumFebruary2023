package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class MyHomePage extends ProjectSpecificMethods {
	
	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}	
	public MyLeadsPage clickLeadsLink() {
		driver.
		findElement(By.linkText(prop.getProperty("MyHomePage.Leads.LinkText"))).click();
		return new MyLeadsPage(driver);
	}

}

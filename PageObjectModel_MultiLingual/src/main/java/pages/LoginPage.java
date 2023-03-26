package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	//enter username => enter+username => enterUsername
	public LoginPage enterUsername() throws InterruptedException {
		System.out.println(driver);
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		Thread.sleep(2000);
		
		return this; // this keyword represents the object of the same page(same class)
	}
	
	
	//enter password
	public LoginPage enterPassword() {
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		
		return this;
	}
	
	//click login button
	
	public HomePage clickLoginButton() {
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		// we have to return object of HomePage
		return new HomePage(driver);
	}
	
	
	
	
	
	
	
	
	
	

}

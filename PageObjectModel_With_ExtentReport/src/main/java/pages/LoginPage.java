package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class LoginPage extends ProjectSpecificMethods {
	
	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	//enter username => enter+username => enterUsername
	public LoginPage enterUsername() throws InterruptedException, IOException {
		
		try {
			driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
			reportStep("Username is entered successfully","pass");
		} catch (Exception e) {
			reportStep("Username is not entered successfully..."+e,"fail");
		}
			
		return this; // this keyword represents the object of the same page(same class)
	}
	
	
	//enter password
	public LoginPage enterPassword() throws IOException {
		try {
			driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
			reportStep("password is entered successfully","pass");
		} catch (Exception e) {
			reportStep("password is not entered successfully..."+e,"fail");
		}
		
		return this;
	}
	
	//click login button
	
	public HomePage clickLoginButton() throws IOException {
		try {
			driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
			reportStep("Login button is clicked","pass");
		} catch (Exception e) {
			reportStep("Login button is not clicked..."+e,"fail");
		}
		
		// we have to return object of HomePage
		return new HomePage(driver);
	}
	
	
	
	
	
	
	
	
	
	

}

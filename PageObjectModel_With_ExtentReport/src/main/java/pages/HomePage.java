package pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {

	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}

	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();

		return new MyHomePage(driver);
	}

	public void verifyHomePage() throws IOException {
		try {
			boolean displayed = driver.findElement(By.linkText("CRM/SFA")).isDisplayed();
			if (displayed)
				System.out.println("Home page is displayed");
			else
				System.out.println("Home page is not displayed");
			
			reportStep("Homepage is verified", "pass");
		} catch (Exception e) {
			reportStep("Homepage is not verified", "fail");
		}

	}

	public LoginPage clickLogoutbutton() {
		driver.findElement(By.className("decorativeSubmit")).click();

		return new LoginPage(driver);

	}

}

package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TestSteps {
	public ChromeDriver driver;
@Given("Open the browser and launch leaftaps application using {string}")
public void launchApp(String url) {
	driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
	driver.get(url);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}
@And("Enter username as {string}")
public void enterUsername(String username) {
	driver.findElement(By.id("username")).sendKeys(username);
}
@And("Enter password as {string}")
public void enterPassword(String password) {
	driver.findElement(By.id("password")).sendKeys(password);
}
@When("Click on Submit button")
public void clickSubmitButton() {
	driver.findElement(By.className("decorativeSubmit")).click();
}
@Then("Verify the success message in the home page")
public void verifySuccessMessage() {
	if(driver.findElement(By.tagName("h2")).getText().contains("Welcome")) {
		System.out.println("Welcome Message is displayed");
	}else {
		System.out.println("Welcome Message is not displayed");
	}
}
@But("Verify the error message in the login page")
public void passwordError() {
	String text = driver.findElement(By.id("errorDiv")).getText();
	if(text.contains("password was empty reenter")||text.contains("username was empty reenter")){
		System.out.println("Error message verified");
	}else {
		System.out.println("Error message not verified");
	}
}
}

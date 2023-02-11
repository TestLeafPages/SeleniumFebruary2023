package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		//to launch the browser
		ChromeDriver driver = new ChromeDriver();
		//to load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//to maximize the window
		driver.manage().window().maximize();
		//to locate an element
//		WebElement eleUsername = driver.findElement(By.id("username"));
//		eleUsername.sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		//to verify the title
		String title = driver.getTitle();
		System.out.println(title);
		
		
//		driver.findElement(By.linkText("CRM/SFA")).click();
		
		
		
		
	}

}

package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
	driver.findElement(By.xpath("//span[text()='Window']/..")).click();
	
	driver.findElement(By.xpath("//span[text()='Open with delay']/..")).click();
	
	// Webdriver Wait
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.numberOfWindowsToBe(3));
	
	Set<String> windowHandles = driver.getWindowHandles();
	System.out.println(windowHandles.size());
	
	
}
}

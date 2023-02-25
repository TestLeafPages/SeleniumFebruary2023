package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlerts {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
	driver.findElement(By.xpath("//span[text()='Alert']/..")).click();
	driver.findElement(By.xpath("//h5[text()=' Alert (Prompt Dialog)']/following-sibling::button")).click();
	
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	System.out.println(text);
	alert.sendKeys("Swathi");
	alert.accept();
	
	
	
	
	
	
	
	
}
}

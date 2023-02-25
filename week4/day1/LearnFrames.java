package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrames {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
	driver.findElement(By.xpath("//span[text()='Frame']/..")).click();
	
	driver.switchTo().frame(10);
	driver.switchTo().frame("demo-frame");
	WebElement frameElement = driver.findElement(By.className("demo-frame"));
	driver.switchTo().frame(frameElement);
	driver.findElement(By.id("Click")).click();
	driver.switchTo().defaultContent();
	
	
	
	
	
	
}
}

package week4.day2;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindows {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//ul[@class='layout-menu']/li[200]")).click();
	driver.findElement(By.xpath("//span[text()='Window']/..")).click();
	
	driver.findElement(By.xpath("//span[text()='Open Multiple']/..")).click();
	
	Set<String> set = driver.getWindowHandles();
	for (String eachHandle : set) {
		driver.switchTo().window(eachHandle);
		if(driver.getCurrentUrl().equals("https://leafground.com/dashboard.xhtml")) {
			break;
		}
	}
	
	System.out.println(driver.getTitle());
	
	
}
}

package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindow {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://leafground.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.findElement(By.xpath("//ul[@class='layout-menu']/li[2]")).click();
	driver.findElement(By.xpath("//span[text()='Window']/..")).click();
	
	String currentWindowRef = driver.getWindowHandle();
	System.out.println(currentWindowRef);
	// CDwindow-A3BDAAED456F92E3FF0C277CA66FC84C
	// CDwindow-1FE138AA824E28AE221F03127D7797BC

	driver.findElement(By.xpath("//span[text()='Open']/..")).click();
	
	Set<String> set = driver.getWindowHandles();
	System.out.println(set);
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	List<String> list = new ArrayList<>(set);
//	list.addAll(set);
	String windowHandle = list.get(1);
	
	driver.switchTo().window(windowHandle);
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(currentWindowRef);
	
	System.out.println(driver.getCurrentUrl());
	System.out.println(driver.getTitle());
	
	
	
	
	
	
	
	
}
}

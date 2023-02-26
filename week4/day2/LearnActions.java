package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.switchTo().frame(0);
	WebElement draggableElement = driver.findElement(By.id("draggable"));
	WebElement destination = driver.findElement(By.id("droppable"));
	
	Actions builder = new Actions(driver);
	builder.dragAndDrop(draggableElement, destination).perform();
	
	
	
	
}
}

package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsLocations {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/draggable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.switchTo().frame(0);
	WebElement draggableElement = driver.findElement(By.id("draggable"));
	Point location = draggableElement.getLocation();
	int x = location.getX();
	int y = location.getY();
	
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(draggableElement, x+100, y+100).perform();
	
	
	
	
}
}

package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsSelectable {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	driver.switchTo().frame(0);
	WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
	WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
	WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
	WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
	
	Actions builder = new Actions(driver);
	builder.keyDown(Keys.CONTROL)
	.click(item1)
	.click(item2)
	.click(item3)
	.click(item4)
	.keyUp(Keys.CONTROL).perform();
	
	
	
}
}

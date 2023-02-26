package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnTables {
public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://erail.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	WebElement from = driver.findElement(By.id("txtStationFrom"));
	from.clear();
	from.sendKeys("MAS", Keys.TAB);
	
	WebElement to = driver.findElement(By.id("txtStationTo"));
	to.clear();
	to.sendKeys("SBC", Keys.TAB);
	
	driver.findElement(By.id("chkSelectDateOnly")).click();
	
	WebElement elementTable = driver.findElement(
			By.xpath("//div[@id='divTrainsList']/table[1]"));
	List<WebElement> rows = elementTable.findElements(By.tagName("tr"));
		/*
		 * for (int i = 1; i < rows.size(); i++) { List<WebElement> cols =
		 * rows.get(i).findElements(By.tagName("td")); for (WebElement eachTD : cols) {
		 * System.out.print(eachTD.getText()+"       "); } System.out.println(); }
		 */
	List<String> list = new ArrayList<String>();
	for (int i = 1; i < rows.size(); i++) {
		List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
		String trainName = cols.get(1).getText();
		list.add(cols.get(1).getText());
		System.out.println(trainName);
	}
	
	
	
	
	
	
	
	
	
	
}
}

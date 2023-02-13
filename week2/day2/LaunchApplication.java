package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
	
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

		driver.findElement(By.xpath("//input[contains(@class,'Submit')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'_companyName')]")).sendKeys("TestLeaf");
		
		driver.findElement(By.xpath("//input[contains(@id,'_firstName')]")).sendKeys("Subraja");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
		
		//ctrl+2,press l-shortcut to assign the variable
		WebElement stateDD = driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		
		Select dd = new Select(stateDD);
		
		dd.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		
		
		
		
		
		
	}

}

package week9.day1;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFinally {

	public static void main(String[] args) throws IOException  {
		ChromeDriver driver = new ChromeDriver();
		try {
			
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps");
			driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
			driver.findElement(By.id("password")).sendKeys("crmsfa");
			driver.findElement(By.className("decorativeSubmit")).click();
			
		} 
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("I'm inside finally block");
			Runtime.getRuntime().exec("taskkill /f /im chromedriver.exe");
		}
				

	}

}

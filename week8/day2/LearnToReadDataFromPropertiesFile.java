package week8.day2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnToReadDataFromPropertiesFile {

	public static void main(String[] args) throws IOException {
		//setup path of the properties file
		FileInputStream fis = new FileInputStream("src/main/resources/configuration.properties");
		
		//create object for properties class
		Properties prop = new Properties();
		
		//load the properties file using prop object
		prop.load(fis);
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("password")).sendKeys(prop.getProperty("password"));
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Qeagle");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Radhakrishnan");
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		
		String id = text.replaceAll("[^0-9]", ""); 
		
		System.out.println(id);
		
		//steps to write data in properties file
		FileOutputStream fos = new FileOutputStream("src/main/resources/config.properties");
		
		//set the key and value 
		prop.setProperty("LeadID", id);
		
		//to save the file
		prop.store(fos, "lead id is added");
		
		
		
		
		
		
		
		
		//to read a data from properties file
		/*
		 * String property = prop.getProperty("username"); System.out.println(property);
		 * 
		 * System.out.println(prop.getProperty("password"));
		 */
		
		
		
		
		
		
		

	}

}

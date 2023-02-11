package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {

		// to launch the browser
		ChromeDriver driver = new ChromeDriver();
		// to load the url
		driver.get("http://leaftaps.com/opentaps/control/main");

		// to maximize the window
		driver.manage().window().maximize();
		// to locate an element
//		WebElement eleUsername = driver.findElement(By.id("username"));
//		eleUsername.sendKeys("Demosalesmanager");

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		driver.findElement(By.id("password")).sendKeys("crmsfa");

		driver.findElement(By.className("decorativeSubmit")).click();
		// to verify the title
		String title = driver.getTitle();
		System.out.println(title);

		driver.findElement(By.linkText("CRM/SFA")).click();

		driver.findElement(By.linkText("Leads")).click();

		driver.findElement(By.linkText("Create Lead")).click();
		// find the dropdown element and locate it

		WebElement sourceDropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
		// Create an object for Select class and pass the dd webelement

		Select dd = new Select(sourceDropdown);
		// select using visible text
        //	dd.selectByVisibleText("Direct Mail");
		
		// select by using selectByValue()
		dd.selectByValue("LEAD_COLDCALL");

		WebElement industryDropDown = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select dd2 = new Select(industryDropDown);
		// selectbyIndex--->Index starts with 0
		dd2.selectByIndex(5);

	}

}

package week7.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LearnScreenshot {
	@Test
	public void takeSnap() {
		
		// Paste it in paint/JIRA
		// Save it
		ChromeDriver driver = new ChromeDriver(new ChromeOptions().addArguments("--remote-allow-origins=*"));
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		// Press print screen
		File snap1 = driver.getScreenshotAs(OutputType.FILE);
		File snap2 = driver.findElement(By.tagName("img")).getScreenshotAs(OutputType.FILE);
		// Creating an Empty PNG file to store the taken snap shot
		File dest = new File("./snaps/Img002.png");
		// Merge the snap with dest
		try {
			FileUtils.copyFile(snap2, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}

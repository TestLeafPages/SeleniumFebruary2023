package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import utils.ReadExcel;



public class ProjectSpecificMethods {
	
	public ChromeDriver driver; // Null
	public static Properties prop;
	public String excelfilename;
	
	@DataProvider
	public String[][] sendData() throws IOException {
		String[][] data = ReadExcel.getData(excelfilename);
		return data;

	}

	@BeforeMethod
	public void preCondition() throws IOException {
		//code to load the properties
		FileInputStream fis = new FileInputStream("src/main/resources/config_french.properties");
		prop = new Properties();
		prop.load(fis);
			
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		driver = new ChromeDriver(options); //sessionId
		System.out.println(driver);
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}

	@AfterMethod
	public void postCondition() {
		driver.close();
	}

}

package challenges;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class RunInCloud {

	public static void main(String[] args) throws MalformedURLException {

		ChromeOptions browserOptions = new ChromeOptions();
		browserOptions.setPlatformName("Windows 10");
		browserOptions.setBrowserVersion("111.0");
		HashMap<String, Object> ltOptions = new HashMap<String, Object>();
		ltOptions.put("project", "Untitled");
		ltOptions.put("selenium_version", "4.0.0");
		ltOptions.put("w3c", true);
		browserOptions.setCapability("LT:Options", ltOptions);

		URL url = new URL("https://earthtestleaf:gfoO71KjXvxNmNtdHXqGV4trP9l1cllYImWNIdQmHcCTsAFC1Y@hub.lambdatest.com/wd/hub");
		RemoteWebDriver driver = new RemoteWebDriver(url, browserOptions);
		
		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();

		driver.close();

		

	}

}

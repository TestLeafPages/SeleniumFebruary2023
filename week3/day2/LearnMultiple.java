package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnMultiple {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		// find the total number of links
		List<WebElement> links = driver.findElements(By.tagName("a"));
		driver.findElement(By.className("")).sendKeys("mobiles",Keys.ENTER);
		// to find the size
		int size = links.size();
		System.out.println("The number of links in this page is :" + size);

		WebElement ele = links.get(2);
		// System.out.println(ele);
		String text = ele.getText();
		System.out.println(text);

//		for (int i = 0; i < links.size(); i++) {
//			String allLinks = links.get(i).getText();
//			System.out.println(allLinks);
//		}

		List<String> allLinks = new ArrayList<>();

		for (WebElement each : links) {
			String text2 = each.getText();
			allLinks.add(text2);
		}
		Collections.sort(allLinks);
		System.out.println(allLinks);
		

	}

}

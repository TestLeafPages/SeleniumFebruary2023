package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		//to find the searhbox
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles",Keys.ENTER);
		//the prices 
		List<WebElement> prices = driver.findElements(By.className("a-price-whole"));
		//Declare a list
		List<Integer> list = new ArrayList<>();
		//to print all the mobilePrices
		for (WebElement each : prices) {
			String allPriceText = each.getText();//6,499
			String replacedString = allPriceText.replaceAll(",", "");//6499
			//System.out.println(replacedString);
			if (!replacedString.isEmpty()) {
				int covertedString = Integer.parseInt(replacedString);
				list.add(covertedString);
			}
			
		}
	
		Collections.sort(list);
		System.out.println(list.get(0));
		
		

	}

}

package week8.day2;

import java.util.NoSuchElementException;

import org.testng.annotations.Test;

public class LeafTapsTestCases {

	@Test(timeOut = 500)
	public void createLead() throws InterruptedException {
		int randomNumber = (int) (Math.random() * 1000);
		System.out.println(randomNumber);
		Thread.sleep(randomNumber);
		System.out.println("Create Lead");

	}

	@Test(retryAnalyzer = week8.day2.RetryFailedTests.class)
	public void EditLead() {
		System.out.println("Edit Lead");
		
	}

	@Test
	public void DeleteLead() {
		System.out.println("Delete Lead");

	}

}

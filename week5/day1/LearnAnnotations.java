package week5.day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LearnAnnotations {
	@Test
	public void runTest1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void runTest2() {
		System.out.println("Test 2");
	}


	@BeforeClass
	public void bc() {
		System.out.println("Before Class");
	}

	@BeforeMethod
	public void bm() {
		System.out.println("Before Method");
	}

	@AfterMethod
	public void am() {
		System.out.println("After Method");
	}

	@AfterClass
	public void ac() {
		System.out.println("After Class");
	}

	@AfterTest
	public void at() {
		System.out.println("After Test");
	}

	@AfterSuite
	public void as() {
		System.out.println("After Suite");
	}
	
	@BeforeSuite
	public void bs() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void bt() {
		System.out.println("Before Test");
	}
}

package week5.day1;

import org.testng.annotations.Test;

public class LearnAttributes2 {
	@Test(dependsOnMethods = "week5.day1.LearnAttributes2.test3",alwaysRun = true)
	public void test1() {
		System.out.println("Test 1");
	}
	@Test
	public void test2() {
		System.out.println("Test 2");
	}
	@Test
	public void test3() {
		System.out.println("Test 3");
		throw new RuntimeException();
	}
	@Test
	public void test4() {
		System.out.println("Test 4");
	}
}

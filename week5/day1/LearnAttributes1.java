package week5.day1;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes1 {
	@Test(invocationCount = 5,invocationTimeOut = 3000,priority = 1)
	public void test1() throws InterruptedException {
		System.out.println("Test 1");
		Thread.sleep(1000);
	}
	
	@Test(enabled=false)
	public void test2() {
		System.out.println("Test 2");
	}
	@Ignore
	@Test
	public void run() {
		System.out.println("Test 3");
	}
	
	@Test(invocationCount = 5,timeOut = 2000,priority = 1)
	public void test3() throws InterruptedException {
		System.out.println("Test 1");
		Thread.sleep(3000);
	}
}

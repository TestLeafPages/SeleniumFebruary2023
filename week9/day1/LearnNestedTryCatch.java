package week9.day1;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;

public class LearnNestedTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 2;
		int[] values = { 10, 20, 30 }; // 0,1,2

		try {
			System.out.println(x / y);

			try {
				System.out.println(values[3]);
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println(e);
				System.out.println(values[values.length - 1]);
			}

		} 
		
		catch (ArithmeticException e) // will catch only ArithmeticException
		{
			if (y < 1) {
				System.out.println(x / 1);
			}
		} 
		
		
		System.out.println("End of program");

	}

}

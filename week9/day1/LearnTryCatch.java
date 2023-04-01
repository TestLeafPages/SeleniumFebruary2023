package week9.day1;

import java.util.NoSuchElementException;

import org.openqa.selenium.StaleElementReferenceException;

public class LearnTryCatch {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int[] values = { 10, 20, 30 }; // 0,1,2

		try {
			System.out.println(x / y);//stop when there is exception and go to catch block

			System.out.println(values[3]);

		} 
		
		catch (ArithmeticException e) // will catch only ArithmeticException
		{
			// if there is a exception in the try bloc then catch block code will get
			// executed
			if (y < 1) {
				System.out.println(x / 1);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println(values[values.length - 1]);
		}
		catch(Exception e) { //can catch any exception
			System.out.println(e);
		}
		
		System.out.println("End of program");

	}

}

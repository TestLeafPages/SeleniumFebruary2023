package week9.day1;

public class LearnThrow {

	public static int divide(int num1, int num2) {
		int res = 0;
		if(num1 > num2) {
			res = num1 / num2; // 10 / 20 = 0.5
		}else {
			//creating object exception class
			
			throw new ArithmeticException("Not a valid input. First number should be greater than second number");
		}
		return res;
	}

	public static void main(String[] args) {
		int result=0;
		try {
			result = divide(10,20);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("Executing with default value as 1");
			result = divide(10,1);
		}
		System.out.println(result);

	}


}

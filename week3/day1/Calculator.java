package week3.day1;

public class Calculator {

	public void add() {
		int a = 5;
		System.out.println(a);

	}

	// add two numbers
	public void add(int a, int b) {
		System.out.println(a + b);

	}

	// add three numbers
	public void add(int a, int b, int c) {
		System.out.println(a + b + c);

	}

	public void getCycleNumber(String name, int number) {

	}

	public void getCycleNumber(int number) {

	}

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.add(23, 45);
		calc.add(34, 45, 56);
	}

}

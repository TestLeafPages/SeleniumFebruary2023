package week1.day2;

public class Program2 {

	public static void main(String[] args) {
		// ClassName obj = new ClassName();
		Program2 obj = new Program2();
		
		int numb = obj.getCarNumber();
		System.out.println(numb);
		
		String name = obj.getCarOwnerName();
		System.out.println(name);
		
		obj.printCarName();
		
		boolean carPunctured = obj.isCarPunctured();
		System.out.println(carPunctured);
		
		int difference = obj.subtractTwoNumbers(10, 4);
		System.out.println(difference);
		
		int product = obj.multiplyThreeNumbers(2, 3, 4);
		System.out.println(product);
		
		int divide = obj.divideTwoNumbers(24, 6);
		System.out.println(divide);
	}

	public int getCarNumber() {
		return 5012;
	}

	private String getCarOwnerName() {
		return "Ranjith";
	}

	void printCarName() {
		System.out.println("Duster");
	}

	public boolean isCarPunctured() {
		return true;
	}

	public int subtractTwoNumbers(int num1, int num2) {
		return num1 - num2;
	}

	public int multiplyThreeNumbers(int num1, int num2, int num3) {
		return num1 * num2 * num3;
	}

	public int divideTwoNumbers(int num1, int num2) {
		return num1 / num2;
	}

}

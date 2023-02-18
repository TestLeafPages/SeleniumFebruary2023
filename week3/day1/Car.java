package week3.day1;

public class Car extends Vehicle{
	
	public void noOfWheels() {
		System.out.println("No of wheels of Car is 4");

	}
	
	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.noOfWheels();
		myCar.soundHorn();
		myCar.applyBrake();
	}

}

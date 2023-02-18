package week3.day1;

public class Audi extends Car{

	public void roofTop() {
	System.out.println("Open from Audi class");

	}
	
	public static void main(String[] args) {
		 Audi au = new Audi();
		 au.applyBrake();
		 au.soundHorn();
		 au.roofTop();
		 au.noOfWheels();
	}
	
}

package week3.day1;

public class BMW extends Car{
	
	public void sunProof() {
		System.out.println("From BMW class");
	}
	
	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.sunProof();
		bmw.noOfWheels();
		bmw.applyBrake();
		bmw.soundHorn();
	}

}

package week3.day1;

public class Bajaj extends Auto{

	
	  public void selfStart() {
		System.out.println("Start");
	}
	  
	  public static void main(String[] args) {
		Bajaj baj = new Bajaj();
		baj.selfStart();
		baj.onMeter();
		baj.applyBrake();
		baj.soundHorn();
	}
}

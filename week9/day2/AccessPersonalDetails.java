package week9.day2;

public class AccessPersonalDetails {

	public static void main(String[] args) {
		PersonalInfo pi = new PersonalInfo();
		
		pi.setPinNo(1234);
		
		int pinNo = pi.getPinNo();
		System.out.println(pinNo);

	}

}

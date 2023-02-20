package week3.day2;

public class ICICIBank implements RBI{
   
	@Override
	public void withDrawLimit() {
		System.out.println("1000000");
		
	}
	
	public void knowYourCustomer() {
	  System.out.println("AADHAR");
		
	}
	
	@Override
	public void repoRate() {
		// TODO Auto-generated method stub
		
	}
	
	public void personalLoan() {
		System.out.println("500000");

	}
	
	public static void main(String[] args) {
		ICICIBank bank = new ICICIBank();
		bank.withDrawLimit();
		bank.knowYourCustomer();
		bank.personalLoan();

	}

	
	
	

}

package week3.day1;

public class StateBank extends RBI{
	
	public void fixedDeposit() {
		System.out.println("14% interest rate");
	}

	public static void main(String[] args) {
		 StateBank sb = new StateBank();
		 sb.fixedDeposit();
		 
		 RBI rbi = new RBI();
		 rbi.fixedDeposit();
	}
}

package week1.day2;

public class LearnSwitchStatement {
public static void main(String[] args) {
	String ticket = "first class";
	switch(ticket) {
	case "first class": 
		System.out.println("Print ticket for balcony");
		break;
	case "second class": 
		System.out.println("Print ticket for first class");
		break;
	case "third class": 
		System.out.println("Print ticket for second class");
		break;
	case "fourth class": 
		System.out.println("Print ticket for third class");
		break;
	default: 
		System.out.println("Please select 1,2,3,4");
		break;
	}
}
}

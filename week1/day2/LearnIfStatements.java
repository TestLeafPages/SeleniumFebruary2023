package week1.day2;

public class LearnIfStatements {
public static void main(String[] args) {
	int age = 18;
	// Check condition for casting vote
	if(age>=18) {
		// If block -> Condition is satisfied
		System.out.println("The person can cast their vote");
	}
	else {
		// Else block -> Condition is not satisfied
		System.out.println("The person is not allowed");
	}
	
	if(age>=18) {
		System.out.println("You are allowed");
	}
	
	int mark = 34;
	
	if(mark<=100 && mark>=80) { 
		System.out.println("First class");
	} else if(mark<80 && mark>=60) {
		System.out.println("Second Class");
	} else if(mark<60 && mark>=35) {
		System.out.println("Third Class");
	} else {
		System.out.println("Re-Appear");
	}
	
	
}
}

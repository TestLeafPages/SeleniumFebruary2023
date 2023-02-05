package week1.day2;

public class LearnOperators {
public static void main(String[] args) {
	System.out.println(2+2);
	System.out.println(5-2);
	System.out.println(3*2);
	System.out.println(6/2);
	System.out.println(6%2);
	
	int a = 7, b = 5;
	if(a!=b) {
		System.out.println(a + "not =" + b);
	}else {
		System.out.println("a = b");
	}
	
	// Logical Operators
		/*
		 * && -> AND || -> OR ! -> NOT
		 */
	int age = 17;
	if(age>18 && age <25) {
		System.out.println("Semi Adult");
	}
	int mark = 90;
	if(age > 18 || mark > 80) {
		System.out.println("Admission provided");
	}
	int i = 1;
//	++,--
	System.out.println(i++); // i++ -> i = i+1
	System.out.println(i); // Post inc
	int j = 1;
	System.out.println(++j); // pre inc operator
	
	int k = 5;
	System.out.println(k--); // post dec
	System.out.println(k);
	
	int l = 5;
	System.out.println(--l); // pre dec
	
	int age1 = 56;
	System.out.println("My Age is "+age1);
	
	
}
}

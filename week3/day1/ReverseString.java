package week3.day1;

public class ReverseString {

	public static void main(String[] args) {
		String input = "Subraja";//Output=ajarbus
		//pseudocode
		//Convert String to charArray
		char[] ch = input.toCharArray();
		//Iterate through a reverse loop
		for (int i = ch.length-1; i >=0; i--) {
			//Print it
			System.out.print(ch[i]);
			
		}
		
		
		

	}

}

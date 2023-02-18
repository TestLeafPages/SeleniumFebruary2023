package week3.day1;

public class Palindrome {

	public static void main(String[] args) {
		String name = "Madam";//0 1 2 3  4
		//                      m a d a  m
		String reverseString = "";
		name=name.toLowerCase();
		//convert the String to charArray
		char[] ch = name.toCharArray();
		//first reverse the string 
		for (int i = ch.length-1; i >=0; i--) {
			reverseString=reverseString+ch[i];//ma + mad + mad
		}
		System.out.println(reverseString);
		//Create another empty string
		//add the reversed string with the empty string
		//compare and check
		if (name.equalsIgnoreCase(reverseString)) {
			System.out.println("The given String "+ name + "is Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		

	}

}

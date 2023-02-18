package week3.day1;

public class LearnString {

	public static void main(String[] args) {
		// String literal (String pool memory)
		// == operator will check for the memory value
		// equals() will check for the content inside
		String str1 = "TestLeaf";//0 1 2 3 4
		                   //      T e s t l
		String str2 = "testLeaf";

		// to find the size of the String
		int length = str1.length();
		System.out.println("The length of " + str1 + "is:" + length);

		// to convert String to characterArray
		char[] charArray = str1.toCharArray();
		System.out.println(charArray[1]);

		// to print all the characters
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);// charArray[1]=T e
		}

		// to check a condition
		boolean contains = str1.contains("leaf");
		System.out.println(contains);

		if (str1.contains("Leaf") || str1.contains("leaf")) {
			System.out.println("Is Present");
		} else {
			System.out.println("No");
		}

		// to check whether two Strings are equal or not
		boolean equals = str1.equals(str2);
		System.out.println(equals);

		// to ignore the case sensitivity
		boolean equalsIgnoreCase = str1.equalsIgnoreCase(str2);
		System.out.println(equalsIgnoreCase);
		
		int indexOf = str1.indexOf("f");
		System.out.println(indexOf);
		
		String substring = str1.substring(4);
		System.out.println(substring);
		
		String substring2 = str1.substring(1, 6);
		System.out.println(substring2);

	}

}

package week2.day2;

public class LearnArrays {

	public static void main(String[] args) {
       //Exception:ArrayIndexOutOfBoundsException-If u search for the value beyond the index
	   //      datatype[] variablename = {values}		
		int[] scores = {98,89,97,91,88};
		              //0  1  2  3   4
	
		//to find the length
		int length = scores.length;
		System.out.println("The length of this array is :"+length);
		
		//to fetch a single data from an array
		System.out.println(scores[2]);
		
		//to print all the datas of this array
		
		for (int i = 0; i <= scores.length-1; i++) {
			System.out.println(scores[i]);
		}
		
		
		
		

	}

}

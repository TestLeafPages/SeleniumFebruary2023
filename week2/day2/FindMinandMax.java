package week2.day2;

import java.util.Arrays;

public class FindMinandMax {

	public static void main(String[] args) {
       
		int[] scores = {98,89,97,91,88};
		              //0  1  2  3   4
		int length = scores.length;
		//Sort an array
		Arrays.sort(scores);
		
		//find the minimum value of this array
		System.out.println("The min value of this array is :" +scores[0]);
		
		//find the maximum value                        //scores[5-1] scores[4]-98
		System.out.println("The max value of this array is : "+scores[length-1]);
		
		
		
		
		
		

	}

}

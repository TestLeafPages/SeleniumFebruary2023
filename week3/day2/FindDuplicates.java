package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class FindDuplicates {

	public static void main(String[] args) {
		
		int[] nums = {2,3,4,3,5,5,9,8,9};//3,5,9
		
		Set<Integer> unique = new TreeSet<>();
		Set<Integer> duplicates = new HashSet<>();
		
		for (int i = 0; i < nums.length; i++) {
			boolean add = unique.add(nums[i]);
			if (!add) {
				duplicates.add(nums[i]);
			}
		}
	//remove duplicates	
       System.out.println(unique);	
       //print duplicates
       System.out.println(duplicates);

	}

}

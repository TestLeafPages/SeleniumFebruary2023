package week3.day2;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//Declare a List
		List<String> mentors = new ArrayList<String>();
		
		mentors.add("Aravind");
		mentors.add("Easwar");
		mentors.add("Princilla");
		mentors.add("Dilip");
		mentors.add("Princilla");
		mentors.add("Raghu");
		
		//addAll()
		List<String> mentors2 = new ArrayList<String>();
		mentors2.addAll(mentors);
		System.out.println(mentors2);
		
		//removeAll()
		mentors2.add("Subi");
		mentors2.removeAll(mentors);
		System.out.println(mentors2);
		
		//To retrieve a particular element
		System.out.println(mentors.get(3));
		
		//To get the size a list
		System.out.println(mentors.size());
		
		//remove()
		mentors.remove(4);
		System.out.println(mentors);
		System.out.println(mentors.size());
		System.out.println(mentors);
		
		//toClear
		mentors.clear();
		
		
		
	
		
		
		
		
		
		

	}

}

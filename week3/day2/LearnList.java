package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		//starting index -0
		List<String> mentors=new ArrayList<String>();
		
		//m1 add
		mentors.add("Aravind");
		mentors.add("Gokul");
		mentors.add("Vinoth");
		mentors.add("Subraja");
		mentors.add("Vineeth");
		mentors.add("Ragu");
		mentors.add("Aravind");
		mentors.add("Vinoth");
		mentors.add("Princila");
		
		System.out.println(mentors);
		
		//m2-get length

		int size = mentors.size();
		System.out.println("List Size :"+size);

//add Name Dilip in 5th palce
		mentors.add(5, "Dilip");
		System.out.println("adding data  in the list :"+mentors);
		
		//m3 - contains
		
		boolean contains = mentors.contains("ragu");
		System.out.println("Using contains :"+contains);
		
		//m4 -remove
		mentors.remove(2);
		
		System.out.println("After remove data :"+ mentors);
		
		
		//sort value
		Collections.sort(mentors);
		
		System.out.println(mentors);
		
		//print data in console(get())
		String sort = mentors.get(2);
		System.out.println("after sorting data :"+sort);
		

		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
		//clear
		mentors.clear();
		
		System.out.println(mentors);
		//String c1 = mentors.get(0);
	//	System.out.println(c1);
		


		String price="34564";
		//string value into int
		int parseInt = Integer.parseInt(price);
		System.out.println(parseInt);




		
	}

}

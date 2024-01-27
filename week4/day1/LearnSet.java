package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LearnSet {

	public static void main(String[] args) {

		int[]  num= {20,45,34,23,20,67,45,90};
		char[] letter= {'d','e','g','z','a','r','e'};
		Set<Character> unique=new HashSet<Character>();
		
		for (int i = 0; i < letter.length; i++) {
			unique.add(letter[i]);
		}
		
		System.out.println(unique);
		//set -we cannot use sort()
		//tree set-ASCII or sorting
		//get same data 'g'
		
		//convert set into list
		List<Character> getValue=new ArrayList<Character>(unique);
		Character character = getValue.get(2);
		System.out.println(character);
		
		Collections.sort(getValue);
		
		
	}

}

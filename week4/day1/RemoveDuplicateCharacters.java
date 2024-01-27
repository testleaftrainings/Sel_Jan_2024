package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {

	public static void main(String[] args) {

		String name="Testleaf";
		//T,e,s,t,l,a,f,
		//Testlaf
		//convert string to charArray
		String lc = name.toLowerCase();
		char[] ch = lc.toCharArray();
		String empty="";
		Set<Character> unq=new LinkedHashSet<Character>();
		
		for (Character output : ch) {
			unq.add(output);	
		}
		
		System.out.println(unq);
		
		for (Character each : unq) {
			empty=empty+each;
		}
		
		System.out.println(empty);
	}

}

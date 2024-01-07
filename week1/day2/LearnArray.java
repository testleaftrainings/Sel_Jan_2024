package week1.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {

		String[] mentors= {"Aravind","Ragu","Vinoth","Gokul","Subraja"};
		//{A,G,R,S,V}
		//find length of this array
		//variable.length->ctrl+2-l 
		int length = mentors.length;
		System.out.println("Length of the array given :"+length);
		
		//i need print Aravind
		System.out.println("first name present in  the array :"+ mentors[0]);
		
		System.out.println("fourth name present in  the array :"+ mentors[3]);
		
		//last data present i the array
		
		System.out.println("last name present in  the array :"+ mentors[length-1]);


		//array sort
		Arrays.sort(mentors);
		System.out.println("After sorted the array :"+ mentors[1]);
		
		//print all the mentors
		
		for (int i = 0; i < mentors.length; i++) {
			
			System.out.println(mentors[i]);
		}
		
	}

}

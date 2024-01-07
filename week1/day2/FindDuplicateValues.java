package week1.day2;

import java.util.Arrays;

public class FindDuplicateValues {

	public static void main(String[] args) {
 
		int[] age= {23,45,12,56,45,32,66,34,12};
		
		
		//two for loop -nested for loop
		//one for loop
		
		//[0]=23,[1]=45
		//compare with next value[1]
		for (int i = 0; i < age.length; i++) { //outter for loop
			
			
			for (int j = i+1; j < age.length; j++) { //inner for loop
				
				if(age[i]==age[j]) {
					System.out.println("Duplicate ages is presented :"+age[j]);
				}
			}
			
		}
		
		System.out.println("*****************************");
		
	Arrays.sort(age);
		//12,12,23,32,34,45,45,56,66
		
		//23,45,12,56,45,32,66,34,12
		//0-9
		//last = 9+1
		for (int i = 0; i < age.length-1; i++) {
			if(age[i]==age[i+1]) {
				System.out.println(age[i+1]);
			}
			
		}
	}

}

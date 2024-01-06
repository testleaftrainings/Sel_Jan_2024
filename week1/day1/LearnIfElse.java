package week1.day1;

public class LearnIfElse {

	public static void main(String[] args) {
		
		int number=5;
		
		//if-ctrl+space -> select 2nd one 
		if (number>0) {
			//if(-5>0)-false-then it will go else
			
			System.out.println("Positive Number :"+number );
		} else {
 
			System.out.println("Negative Number :"+ number);
		}
		
		
		
		//if->elseif->else
		int num=0;
		
		if (num>0) {
			System.out.println("Positive Number :"+num );
		}
		else if(num==0) {
			System.out.println("Neutral Number : "+num);
		}
		else {
 
			System.out.println("Negative Number :"+ num);
		}

	}

}

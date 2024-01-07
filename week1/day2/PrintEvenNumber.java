package week1.day2;

public class PrintEvenNumber {

	public static void main(String[] args) {
		
		//0,2,4,6,7,8
		int data=30;
		//0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30
		//for loop
	   // if condition
		//if(30%2==0)
		//if(data%2==0)
		
		for (int i = 0; i <=data; i++) {
			
			//if(i%2!=1)
			if(i%2==0) {
				
				System.out.println("Get Even Numbers :"+ i);
			}
		}

	}

}

package week1.day2;

public class LearnJumpStmts {

	public static void main(String[] args) {
		
		for (int i = 0; i <6; i++) {
			
			if(i==4) {
				System.out.println("i used break stmt :" +i);
				break;
			}
			System.out.println(i);
		}
		
		System.out.println("*******************************");
		
		
		for (int i = 0; i < 10; i++) {
			
			if(i==5) {
				continue;
				
			}
			System.out.println(i);
		}
	}
}

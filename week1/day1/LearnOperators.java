package week1.day1;

public class LearnOperators {

	public static void main(String[] args) {

		int a=15;
		int b=3;
		
		System.out.println("Add :"+ (a+b)); //18
		System.out.println("Sub :"+ (a-b));  //12
		System.out.println("Mul :"+ (a*b)); //45
		System.out.println("Div :"+ (a/b)); //5
		System.out.println("Rem :"+ (a%b)); //0 
		
		System.out.println(a+=5 );
		
		System.out.println("equal to : "+ (a==b));
		System.out.println("greater  than :" + (a>b));
		System.out.println("lesser than :" + (a<b));

	}

}

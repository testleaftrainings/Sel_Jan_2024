package week1.day2;

public class LearnObject {

	public static void main(String[] args) {
		
		//i can able create object LearnMethod -yes
		
		LearnMethod obj=new LearnMethod();
		
		System.out.println(obj.add(5, 5));
		obj.browserName();
		obj.browserVersion();
		obj.name();
		System.out.println(obj.regDetails("Testleaf", 2024));
		
		
	}
	

}

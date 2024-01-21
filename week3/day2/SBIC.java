package week3.day2;

public abstract class SBIC implements RBI{
	//interface
	public void deposits() {
System.out.println("10L above amount");		
	}
	//interface
	public void personalLoan() {
System.out.println("10.99%");		
	}
	//owned method
	public void goldLoan() {
		System.out.println("offer");
	}
	//abstract class
//owned methods
	public abstract void limit();

	//deposits,kyc,personalLoan
	//deposits,personalLoan-this build

	//abstract class will not force to implement all method at same time 
	
	public static void main(String[] args) {
		
		//we cannot create object abstract class
		//SBIC s= new SBIC();
	}
}

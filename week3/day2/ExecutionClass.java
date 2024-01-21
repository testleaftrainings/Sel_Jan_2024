package week3.day2;

public class ExecutionClass extends SBIC{

	//interface
	public void kyc() {
		System.out.println("Pan Card");
	}
	//abstract class
	public void limit() {
		System.out.println("500rs");
	}
	
	public static void main(String[] args) {
		ExecutionClass ec=new ExecutionClass();
		ec.deposits();
		ec.kyc();
		ec.personalLoan();
		ec.goldLoan();
		ec.limit();
	}

}

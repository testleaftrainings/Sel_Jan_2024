package week3.day2;

public class Sbi implements RBI{

	public void deposits() {
	System.out.println("10L is amount");	
	}

	public void kyc() {
		System.out.println("pan card");
	}

	public void personalLoan() {
		
	}
	
	
	public static void main(String[] args) {
		
		//we can create object for Interface?- NO
		//RBI rbi=new RBI();
		
		Sbi s=new Sbi();
	
		s.deposits();
		s.kyc();
	}

	
}

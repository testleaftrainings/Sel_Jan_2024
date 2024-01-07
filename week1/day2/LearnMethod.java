package week1.day2;

public class LearnMethod {
	
	//return as void -UPI payment
	public void browserName() {
		System.out.println("Chrome");
	}
	
	//return as datatype -cash payment
	public int add(int a,int b) {
		return a+b;

	}
	
	public String regDetails(String name,int rollNo) {
		return name+" "+rollNo;
		
	}
	
	//private
	private void cardPinNo() {
		System.out.println("my pin number is ****");
	}
	
	//default -class and within same package
	void browserVersion() {
		System.out.println("default modifier");
	}
	
	protected void name() {
		System.out.println("i protected my id");
	}
	
	
	public static void main(String[] args) {
		//step 1-creating object 
		LearnMethod lm=new LearnMethod();
		
		//step 2:lm.methodName()
		
		//type 1: for return types
		System.out.println(lm.add(10, 15));
		lm.browserName();
		lm.browserVersion();
		lm.cardPinNo();
		lm.name();
		//type 2: ctrl+2-L => we are assign variable to main method
	 String regDetails = lm.regDetails("TESTLEAF", 2024);
		System.out.println(regDetails);
			
	
		
				
	}
	
	
}


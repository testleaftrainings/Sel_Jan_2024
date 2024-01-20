package week3.day1;

public class BMWC extends CarP {

	public void automaticGear() {

		System.out.println("its coming from C-automaticGear");
	}	
	
	
	public void brake() {
		System.out.println("ABS brake grandchild overrides");
	}
	
	public static void main(String[] args) {
		
		BMWC b=new BMWC();
		b.automaticGear();
		b.brake();
		b.gear();
		b.horn();
		b.steering();
	}
}

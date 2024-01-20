package week3.day1;

public class AutoP extends VehicelGP {

	public void meter() {

		System.out.println("its coming from P-meter");
	}
	
	public static void main(String[] args) {
		
		AutoP a = new AutoP();
		a.brake();
		a.horn();
		a.meter();
	}
}

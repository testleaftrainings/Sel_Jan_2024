package week3.day1;

public class CarP extends VehicelGP{

	public void gear() {
		System.out.println("its coming from P-Gear");
}
	
	public  void steering() {
System.out.println("its coming from p-Steering");
	}
	
	public static void main(String[] args) {
		
		CarP c=new CarP();
		c.brake();
		c.horn();
		c.gear();
		c.steering();
	}
}

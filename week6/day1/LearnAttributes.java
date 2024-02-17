package week6.day1;

import org.testng.annotations.Test;

public class LearnAttributes {
	
	@Test(priority = 1)
	public void createLead() {
	     System.out.println("Lead created successfully");

	}
	
	@Test
	public void editLead() {
	     System.out.println("Lead editted successfully");

	}
	
	@Test(priority = 3,enabled=false)
	public void mergeLead() {
	     System.out.println("Leads merged successfully");

	}
	
	@Test(priority = -1)
	public void deleteLead() {
	     System.out.println("Lead deleted successfully");

	}

}

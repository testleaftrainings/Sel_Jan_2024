package week6.day1;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class TC_001CreateLead extends BaseClass{
	
	@DataProvider(name="fetchData")
	public String[][] sendData() {
		
		String[][] data = new String[2][4];
		
		//1st set of data
		data[0][0]="TestLeaf";
		data[0][1]="Subraja";
		data[0][2]="S";
		data[0][3]="91";
		
		//2nd set of data
		data[1][0]="Qeagle";
		data[1][1]="Princilla";
		data[1][2]="R";
		data[1][3]="99";
		
		
		return data;
	}
	

	@Test(dataProvider = "fetchData")//(groups="Durga")
	public void runCreateLead(String cName, String fName, String lName, String phNo) {
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phNo);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}

	}

}

package steps;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreateLeadStepDefintion extends BaseClass{
	
	@When("Click on crmsfa link")
	public void clickCRMSFALink() {
		driver.findElement(By.partialLinkText("CRM")).click();
	}

	@And("Click Leads link")
	public void clickLeadsLink() {
		driver.findElement(By.linkText("Leads")).click();
	}

	@And("Click CreateLead Link")
	public void clickCreateLeadLink() {
		driver.findElement(By.linkText("Create Lead")).click();
	}

	@Given("Enter the companyname as (.*)$")
	public void enterCompanyName(String cName) {
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);

	}

	@And("Enter the firstname as (.*)$")
	public void enterFirstname(String fName) {
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
	}

	@And("Enter the lastname as (.*)$")
	public void enterLastName(String lName) {
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
	}
	
	@When("Click on CreateLead button")
	public void clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
	}
	
	@Then("ViewLeads page should be displayed as (.*)$")
	public void verifyViewLeadsPage(String cName) {
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains(cName)) {
			System.out.println("Lead is created Successfully");
		}else {
			System.out.println("Lead is not created Successfully");
		}

	}

}

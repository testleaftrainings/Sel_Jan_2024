package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginApplication {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//syntax
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		WebElement leads = driver.findElement(By.linkText("Leads"));
		leads.click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		
		//return type: findElement => WebElement ;ctrl+2->l
	 WebElement  dropdown = driver.findElement(By.id("createLeadForm_dataSourceId"));
	
	 //select class syntax
	 Select opt =new Select(dropdown);
	 //object.method
	 //opt.selectByIndex(7);
	 
	 opt.selectByVisibleText("Website");
	 
	 
	 WebElement dd1 = driver.findElement(By.id("createLeadForm_industryEnumId"));
	 Select opt1=new Select(dd1);
	 opt1.selectByIndex(2);
	}

}

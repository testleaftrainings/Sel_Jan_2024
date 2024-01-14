package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnBasicXpath {

	public static void main(String[] args) throws InterruptedException {
       ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");


		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
		

		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
		

		driver.findElement(By.xpath("//input[contains(@class,'decorative')]")).click();
	
		driver.findElement(By.xpath("//span[text()='First name']/following::input")).sendKeys("Dilip");
	}

}




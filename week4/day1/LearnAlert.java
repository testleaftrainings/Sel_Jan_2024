package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) {

		 ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.leafground.com/alert.xhtml");
			
			driver.findElement(By.xpath("//span[text()='Show']")).click();
			//pass control to alert
			Alert simpleAlert = driver.switchTo().alert();
			
			String text = simpleAlert.getText();
			System.out.println("Alert Message is :"+ text);
			
			//click 'ok' button
			simpleAlert.accept();
			
			//confirm alert handled or not
			
			String text2 = driver.findElement(By.id("simple_result")).getText();
			System.out.println("Alert is handled :"+ text2);
			
			//simpleAlert.dismiss();
			
			// if not handle alert means : UnhandledAlertException
			//if trying to handle alert is not present : NoAlertPresentException
			
			
			
			
			
			
			
			
	}

}

package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnConfirmationALert {

	public static void main(String[] args) {
		 ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.leafground.com/alert.xhtml");
			driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
			
			Alert confirmAlert = driver.switchTo().alert();
			
			confirmAlert.dismiss();
			
			String text = driver.findElement(By.id("result")).getText();
			System.out.println("Alert is cancle :"+ text);
	}

}

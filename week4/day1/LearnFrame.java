package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {

		 ChromeDriver driver=new ChromeDriver();
			
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.get("https://www.leafground.com/frame.xhtml");
			
			//handle frame
			driver.switchTo().frame(0);
			driver.findElement(By.xpath("//button[text()='Click Me']")).click();
			
			//comeout of from frame to web page
			
			driver.switchTo().defaultContent();
	}

}

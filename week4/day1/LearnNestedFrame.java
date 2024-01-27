package week4.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnNestedFrame {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/frame.xhtml");
		
		//1st frame
		driver.switchTo().frame(2);
		
		//2nd frame
		driver.switchTo().frame("frame2");
		
		//click button
		driver.findElement(By.id("Click")).click();
		
		//switch to parent immediate frame
		driver.switchTo().parentFrame();
		
		//switch main page
		driver.switchTo().defaultContent();
		
		//webelement
		WebElement frame1 = driver.findElement(By.id("frame2"));
		driver.switchTo().frame(frame1);
		
	}

}

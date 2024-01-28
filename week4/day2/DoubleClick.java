package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_ondblclick");
		
		//handle frame
		driver.switchTo().frame("iframeResult");
		
		WebElement dbclick = driver.findElement(By.xpath("//p[contains(text(),'this')]"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(dbclick).perform();
		
	}

}

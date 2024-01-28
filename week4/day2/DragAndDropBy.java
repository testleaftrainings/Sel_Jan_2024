package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropBy {

	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/drag.xhtml");
		
		WebElement ddb = driver.findElement(By.id("form:conpnl"));
		//keywordboard action
		//ddb.sendKeys("phone",Keys.TAB);
		Actions act=new Actions(driver);
		
		act.dragAndDropBy(ddb, 150, 0).perform();
	}

}

package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

		  ChromeDriver driver=new ChromeDriver();
			
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phone",Keys.ENTER);
			List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
			
			List<Integer> value=new ArrayList<Integer>();
			
			for (WebElement allprices : price) {
				String text = allprices.getText();
				
				//replace',' form the text
				String replaceAll = text.replaceAll(",", "");
				
				//convert string value into integer format
				//1,30,999-130999
				int mobileprices = Integer.parseInt(replaceAll);
				value.add(mobileprices);
			}
			
			Collections.sort(value);
			System.out.println(value);
			
	}

}

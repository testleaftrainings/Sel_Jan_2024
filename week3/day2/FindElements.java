package week3.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		
		  ChromeDriver driver=new ChromeDriver();
			
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.manage().window().maximize();
			
			driver.get("https://www.leafground.com/link.xhtml");
			
			//return List<WebElement>
			List<WebElement> links = driver.findElements(By.tagName("a"));
			int size = links.size();
			System.out.println("total number links:" +size);
			
//			for (int i = 0; i < links.size(); i++) {
//				
//				String text = links.get(i).getText();
//				System.out.println(text);
//				
//			}
			
			List <String> list= new ArrayList<String>();
			//foreach loop
			for (WebElement data : links) {
				String text = data.getText();
				list.add(text);
				System.out.println(text);
				
			}
			
			Collections.sort(list);


	}

}

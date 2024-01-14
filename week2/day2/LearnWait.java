package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWait {

	public static void main(String[] args) {
		
		//https://www.facebook.com/

		ChromeDriver driver=new ChromeDriver();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("Dilip");
		
		//Methods
		String title = driver.getTitle();
		System.out.println("Title of the Page : "+title);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current Url of the page :"+currentUrl);
		
		if(title.contains("Facebook")) {
			System.out.println("its successful");
		}else {
			System.out.println("its not successful");
			
			//getText()
			String text = driver.findElement(By.id("viewContact_firstName_sp")).getText();
			System.out.println(text);
			
			if(text.contains("demo")) {
				
			}else {
				
			}
		}
	}

}

package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) throws InterruptedException {

		//step 1 -to launch browser
		ChromeDriver driver=new ChromeDriver();
		
		//step 2 to maximize the screen
		driver.manage().window().maximize();
		
		//step 3- load url
		driver.get("https://www.selenium.dev/downloads/");
		
		//java wait
		Thread.sleep(10000);
		
		//step 4 close browser
		driver.close();
	}

}

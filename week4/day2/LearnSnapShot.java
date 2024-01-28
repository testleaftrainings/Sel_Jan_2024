package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSnapShot {

	public static void main(String[] args) throws IOException {

		//create folder in current project
		
		ChromeDriver driver=new ChromeDriver();
		
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.get("https://www.leafground.com/table.xhtml");
				
				 WebElement findElement = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td"));

				
				//step 1 -it will take snap 
				File scr = findElement.getScreenshotAs(OutputType.FILE);
				
				//step 2 -save this snap inside folder path
				File dst=new File("./snap/snapshot.png");
				
				//step 3- we combine step 1 & step 2
				FileUtils.copyFile(scr, dst);
				
				
				
	}

}

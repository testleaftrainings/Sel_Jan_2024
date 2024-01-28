package week4.day2;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
		
//index will start with'1'
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/table.xhtml");
		
		String firstData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr/td")).getText();
		System.out.println("first row & first column value  :"+firstData);
		
		//get specific data
		
		String specificData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[4]/td[3]")).getText();

		System.out.println("Print SpecificData :"+specificData);
		
		//find total rows
		List<WebElement> rowCount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr"));
		int rowSize = rowCount.size();
		System.out.println("total number of rows :"+rowSize);
		
		//get all data in specific data
		String rowValue = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[3]")).getText();
		System.out.println("specific rows data"+rowValue);
		
		//find total column value
		List<WebElement> cellCount = driver.findElements(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr[1]/td"));
		int cellSize = cellCount.size();
		System.out.println("total numbers of  columns : "+cellSize);
		
		
		//10*6=60
		for (int i = 1; i <=rowSize; i++) {
			
			
			for (int j = 1; j <=cellSize; j++) {
				
				//here i am using findElement
				String allData = driver.findElement(By.xpath("//div[@class='ui-datatable-scrollable-body']/table/tbody/tr["+i+"]/td["+j+"]")).getText();

				System.out.println(allData);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

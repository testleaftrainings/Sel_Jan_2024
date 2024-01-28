package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWinowHandle {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.leafground.com/window.xhtml");
		
		String parentTitle = driver.getTitle();
		System.out.println("parent window :"+parentTitle);
		
		//get the window handle
		String pWindowHandle = driver.getWindowHandle();
		System.out.println("Parent window id :"+pWindowHandle);
		
		//click on open button
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		
		//to get all windows
		Set<String> windowHandles = driver.getWindowHandles();
		
		System.out.println("2 window id present :"+windowHandles);
		
		//convert set to list
		List<String> allwindow=new ArrayList<String>(windowHandles);
		
		//syntax
		driver.switchTo().window(allwindow.get(1));
		System.out.println("Child window name:"+driver.getTitle());
		
		driver.findElement(By.id("email")).sendKeys("dilipkumar@testleaf.com");
		
		//close-current window/tab
		driver.close();
		
		//after closing child window ,check whether control is transfer parent window
		//need transfer focus to parent window
		
		driver.switchTo().window(allwindow.get(0));
		
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		
		//quit -will close all opened window 
		//driver.quit();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		System.out.println(windowHandles2);
	}

}

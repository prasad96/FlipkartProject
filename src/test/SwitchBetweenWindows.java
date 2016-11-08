package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchBetweenWindows {

	static WebDriver driver ;
	
	public static void main(String[] args) throws Exception {
		
		driver = new FirefoxDriver();
		
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ltmpl=default");
		
		String parent_window = driver.getWindowHandle() ;
		
		System.out.println("Before switching to window title is  : "+driver.getTitle());
		
		driver.findElement(By.cssSelector(".why-information>a")).click();
		
		Set<String> window = driver.getWindowHandles() ;
		
		Iterator<String> it = window.iterator() ;
		
		while (it.hasNext()){
			
			String child_window = it.next() ;
			
			if (!parent_window.equalsIgnoreCase(child_window)){
				
				driver.switchTo().window(child_window);
				
				driver.findElement(By.cssSelector(".gb_Ha.gb_wb")).click();
				System.out.println("clicked on sign in button");
				Thread.sleep(2000);
				System.out.println("After switching to child window title is  : "+driver.getTitle());
			}
		}
		
		driver.switchTo().window(parent_window) ;
		System.out.println("After switching parent window title is : "+driver.getTitle());
	}

}

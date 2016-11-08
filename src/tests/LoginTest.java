package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	WebDriver driver ;
	
	public LoginTest(WebDriver driver){
		
		this.driver = driver ;
	}
	
	@Test
	public void testLogin(){
		
		driver = new FirefoxDriver();
		
		driver.get("http://flipkart.com");
		
        driver.findElement(By.xpath("//*[@class='_3Ji-EC']/li[9]")).click();
		
		
		
		System.out.println("login link clicked");
		
		driver.findElement(By.xpath("//*[@class='_2zrpKA']")).sendKeys("prasadbattula96@gmail.com");
		driver.findElement(By.xpath("//*[@class='_2zrpKA _3v41xv']")).sendKeys("9959036210");
		driver.findElement(By.xpath("//*[@class='_3zLR9i _1LctnI _36SmAs']")).click();
		
		driver.close();
		
		
	}

}

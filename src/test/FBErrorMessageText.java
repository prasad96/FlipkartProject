package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FBErrorMessageText {
	
	WebDriver driver ; 
	
	@Test
	public void ErrorMeggaText()
	{
		driver = new FirefoxDriver ();
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@class='inputtext' and @type = 'email']")).sendKeys("battula.testing96");
		
		driver.findElement(By.xpath("//*[@class='inputtext' and @type = 'password']")).sendKeys("9959036210");
		
		driver.findElement(By.xpath("//*[@class='uiButton uiButtonConfirm']/input")).click();
		
		WebElement errorText = driver.findElement(By.xpath("//*[@class='_4rbf _53ij']")) ;
		
		WebElement recoveryButton = driver.findElement(By.xpath("//*[@id='loginform']/div[4]/a")) ;
		
		if (recoveryButton.getText().equals("Recover Your Account" )){
			
			System.out.println("The Error Message is : "+errorText.getText());  
			
		}else{
			
			System.out.println("Login Success");
		}
		
		
	}

}

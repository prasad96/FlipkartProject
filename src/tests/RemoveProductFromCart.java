package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.HomePage;
import utility.ConfigReader;

public class RemoveProductFromCart {
	
	
	private WebDriver driver;
	private Logger logger = Logger.getLogger(RemoveProductFromCart.class) ;
	HomePage home = new HomePage(driver);
	ConfigReader config = new ConfigReader();
	
	
	
	
	@Test
	public void openBrowser(){
		
		driver = new FirefoxDriver() ;
		
		driver.get(config.getFlipkartWebURL());
		
		driver.manage().window().maximize();
		Actions builder = new Actions(driver) ;
		WebElement electronics = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")) ;
		
		builder.moveToElement(electronics).click().perform();
		
		WebElement samsung = driver.findElement(By.xpath("//*[@id='container']/div/header/div[2]/div/ul/li[1]/ul/li/ul/li[1]/ul/li[2]/a")) ;
		
		samsung.click();
				
		// click on product link in products page
		WebElement mobileProduct = driver.findElement(By.linkText("SAMSUNG Galaxy On7 (Gold, 8 GB)"));
		mobileProduct.click();
	}
	
	
	
	public void AddProduct(){
		
		
		
		
	}
public RemoveProductFromCart(){
		
		
	}
	/*
	@Test
	public void moveToCartButton(){
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='container']/div/header/div[1]/div[2]/div/div/a")) ;
		Actions builder = new Actions(driver) ;
		
		builder.moveToElement(cart).click().perform();
				
	}
	
	@Test
	public void removeProduct(){
		System.out.println("flipkart web");
	}
	
	@AfterTest
	public void closeBrowser (){
		
		driver.close();
	}
	*/
}

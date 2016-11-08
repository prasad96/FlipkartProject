package tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.apache.log4j.Logger;

import pages.BeforeYouPlaceOrderPage;
import pages.DeliveryAddressPage;
import pages.HomePage;
import pages.OrderSummaryPage;
import pages.ProductPage;
import pages.ViewCartPage;

public class TestNewMobilePurchase {
	
	
	WebDriver driver ;
	Logger logger = Logger.getLogger(TestNewMobilePurchase.class.getName()) ;
	
	public TestNewMobilePurchase(WebDriver driver)
	{
		this.driver = driver ;
	}
	
	@Test
	public void purchaseMobile(WebDriver driver) throws Exception{
		
		
		
		 //driver = new FirefoxDriver() ;
		LoginTest login = new LoginTest(driver);
		ViewCartPage cart = new ViewCartPage(driver);
		HomePage home = new HomePage(driver);
		ProductPage  product = new ProductPage(driver);
		DeliveryAddressPage address = new DeliveryAddressPage(driver);
		OrderSummaryPage orderSummary = new OrderSummaryPage(driver) ;
		
		BeforeYouPlaceOrderPage placeOrder = new BeforeYouPlaceOrderPage(driver);
		
		logger.info("Login initiated");
		// login to flipkart
		login.testLogin();
		
		logger.info("Login successfull");
		// click on view cart button
		Thread.sleep(5000);
		logger.info("Initiated search box");
		home.getSearchBox_Inpt("Refrigirator");
		
		logger.info("enter text in to search box");
		home.getSearchBox_Btn();
		
		WebElement name = driver.findElement(By.xpath("//*[@id='container']/div/div[2]/div[2]/div/div[2]/div[3]/div[1]/a/div[2]/div[1]")) ;
		
		name.click();
			
		
		// check add cart button is there
	
		if (product.getAddtoCart_Btn_Txt().equals("ADD TO CART"))
		{
			
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("arguments[0].click();", product.getAddtoCart_Btn_Element() );
			
			// product.getAddtoCart_Btn();
			
			System.out.println("aad to cart button clicked");
			
			JavascriptExecutor js = (JavascriptExecutor)driver ;
			js.executeScript("arguments[0].click();", product.getGotoCart_Btn_Element());
			System.out.println("go to cart button clicked inside if condition");
		}
		else{
			
			JavascriptExecutor jse = (JavascriptExecutor)driver ;
			jse.executeScript("arguments[0].click();", product.getGotoCart_Btn_Element());
		//product.getGotoCart_Btn();
			System.out.println("go to cart button clicked");
		}
				
		Thread.sleep(5000);
		
		WebElement element = driver.findElement(By.id("view-cart-form"));
		
		//driver.switchTo().frame(element).switchTo() ;
		
		element.submit();
		
		/// address verification
		
		
		address.getDeleveryHere_Btn();
		
		// verify
		System.out.println("message is : "+orderSummary.getoutOfStock_Message_Txt());
		if(orderSummary.getoutOfStock_Message_Txt().contains("Following item(s) have become")){
	
		orderSummary.getcontinue_Btn();
		driver.close();
		
		}else
		{
			System.out.println("products are available");
		}
		
	}

}

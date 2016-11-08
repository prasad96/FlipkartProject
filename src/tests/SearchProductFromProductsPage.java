package tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import utility.ConfigReader;

public class SearchProductFromProductsPage {
	
	
	WebDriver driver ;
	ConfigReader reader = new ConfigReader();
	
	@Test
	public void testProduct () throws InterruptedException{
		driver = new FirefoxDriver () ;
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		HighlightElement  highlight = new HighlightElement(driver);
		WebDriverWait wait = new WebDriverWait(driver, 10) ;
		
		driver.manage().window().maximize();
		
		driver.get(reader.getFlipkartWebURL());
		
		Thread.sleep(2000);
		
		//click on mobiles link under search box in home page
		WebElement mobile =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_1UsZtn required-tracking' and @data-tracking-id='Mobiles']")));
		
		// highlight element
		highlight.highlightElement(mobile);
		
		mobile.click();
		
		// click on samsung link
		WebElement samsung = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_1pRKKp']/a[starts-with(@href,'/mobiles/samsung~brand/pr?sid')]")));
		
		// highlight element
		highlight.highlightElement(samsung);
		
		samsung.click();
		
		
		List<WebElement> list = driver.findElements(By.xpath("//*[@class='_3wU53n']")) ;
		
		// total page numbers
		List<WebElement> pageNumbers = driver.findElements(By.xpath("//*[@class='_1mO8v9']")) ;
		
		
		
		System.out.println("Total number of pages  : " + pageNumbers.size() );
		
		System.out.println("Total count of links : " + list.size());
		
		Actions builder = new Actions(driver) ;
		
		
		for(int i =0 ; i< pageNumbers.size(); i++){
			
		     // get the all href links
		      for (WebElement ele : list){			
			
			String name = ele.getText() ;
			
			System.out.println(name+"\n");			
			
		}
		      
		     // WebElement page = driver.findElement(By.xpath("//*[@class='_1mO8v9']")) ;
		
		//js.executeScript("scroll(0,250)") ;
		
		WebElement previous = driver.findElement(By.xpath("//*[@class='_2kUstJ'][1]")) ;
		
		if (list.size() >= 1){
			
			
			  WebElement nextButton = driver.findElement(By.xpath("//*[@class='_2kUstJ']/a/span/span[text()='Next']"));
			js.executeScript("arguments[0].scrollIntoView(true);",nextButton) ;
			//highlight.highlightElement(page);
			//builder.moveToElement(driver.findElement(By.xpath("//*[@class='_1mO8v9'][i]"))).click().build().perform();
			// highlight element
						
			// click on next button
	         nextButton.click();
			
			System.out.println("Next button clicked");
			
		}else{
			
			//builder.moveToElement(previous).click().build().perform();
			//previous.click();
			
			System.out.println("there is no pages not more than 1");
		}
			
		
		Thread.sleep(3000);
		
		System.out.println("page number : "+pageNumbers.get(i));
		
		}
		
	}
	

}

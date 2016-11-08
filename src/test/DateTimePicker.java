package test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DateTimePicker {

	static WebDriver driver ;
	
	public static void main(String[] args) {
		
		
		driver = new FirefoxDriver() ;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS) ;
		
		driver.get("https://www.tripadvisor.in/");
		
		
		driver.findElement(By.xpath("//*[@class='tab last']")).click();
		driver.findElement(By.xpath("//*[@id='metaFlightFrom']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id='metaFlightTo']")).sendKeys("Delhi");
		driver.findElement(By.xpath("//*[@id='checkIn']")).click();
		
		String date = "10-November 2016" ;
		
		String[] splitter = date.split("-") ; 
		
		String checkInDay = splitter[0] ;
		
		String month_Year = splitter[1] ;
		
		
		// Enter date in check in date field
		selectMonth(month_Year,checkInDay) ;
		
		
		// click on check out datafield
		driver.findElement(By.xpath("//*[@id='checkOut']")).click();
		
		
		// check out date
		date = "10-December 2016" ;
		
		splitter = date.split("-") ; 
		
		String checkOutDay = splitter[0] ;
		
		String CheckOutmonth_Year = splitter[1] ;
		
		// Enter date in check out date field
		selectMonth(CheckOutmonth_Year,checkOutDay) ;
		
		//System.out.println("Clicked on submit button");
		driver.findElement(By.xpath("//button[@class='submit ui_button original large']")).submit();
		System.out.println("Clicked on submit button");

	}

	
	public static void selectMonth(String month_Year,String day){
		
		
		List<WebElement> months = driver.findElements(By.xpath("//div[@class='month']/table/thead/tr/th[@class='caption']")) ;
		
		for (int i =0; i<months.size();i++){			
			
			// return all months from months
			System.out.println(months.get(i).getText());
			
			// compare month
			if(months.get(i).getText().equals(month_Year)){
				
				List<WebElement> totaldays = driver.findElements(By.xpath("//div[@class='month']["+(i+1)+"]/table/tbody/tr/td")) ;
				
				for(WebElement days : totaldays){
					
					System.out.println(days.getText());
					
					// compare selected date
					if (days.getText().equals(day)){
						
					// click on particula date
				            days.click();
				            return ;
					}
				
				}
				
			}
		}
		
	}
}

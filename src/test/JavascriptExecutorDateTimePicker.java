package test;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class JavascriptExecutorDateTimePicker {

	 WebDriver driver ;
	
	ExtentTest test ;
	ExtentReports extent ;
	
	@BeforeTest
	
		public void startReport ()
		{
			
		// extent= (ExtentReports) (System.getProperty("user.dir")+"/test-output/MyReport.html",true) ;
			extent.addSystemInfo("Hostname", "Prasad")
				.addSystemInfo("Environment", "QA")
				.addSystemInfo("User Name", "Prasad Battula") ;
			extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
				
		
	}
	
	@Test
	public void mainTest() {
		
		test = extent.startTest("mainTest");
		
		driver = new FirefoxDriver() ;
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS) ;
		
		driver.get("https://www.tripadvisor.in/");
		
		
		driver.findElement(By.xpath("//*[@class='tab last']")).click();
		driver.findElement(By.xpath("//*[@id='metaFlightFrom']")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//*[@id='metaFlightTo']")).sendKeys("Delhi");
		// driver.findElement(By.xpath("//*[@id='checkIn']")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		//js.executeScript("document.getElementById('checkIn').value='13/11/2016'") ;
		
		
		// to enter date with CSS selector		
		js.executeScript("document.querySelector('.med_text.input.focusInput.no_cpu').value='13/11/2016'") ;
		
		
		//js.executeScript("document.getElementById('checkOut').value='15/12/2016'") ;
		 
		// enter date with css selector
		js.executeScript("document.querySelector('.med_text.input.calendarIcon.focusInput.no_cpu').value='13/11/2016'") ;
		
		String actual = driver.getTitle();
		System.out.println(actual);
		Assert.assertEquals(actual, actual.contains("TripAdvisor"));
		System.out.println("trip advisror title success");
	}

}

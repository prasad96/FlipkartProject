package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.LoginPage;
import utility.ConfigReader;

public class Test_SearchtBox_HomePage {

	WebDriver driver;
	
	Logger log = Logger.getLogger(Test_SearchtBox_HomePage.class);
	
	@Test
	public void testSearchBoxHomePage() throws Exception
	 {
		
		PropertyConfigurator.configure("./Properties/Log4j.properties");
		driver = new FirefoxDriver() ;
		
		LoginPage login = new LoginPage(driver);
		HomePage home = new HomePage(driver) ;
		ConfigReader config= new ConfigReader();
		driver.get(config.getFlipkartWebURL());
		
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		
		login.init();
		
		//Click on Log in link from Home page
		login.getlogin_Lnk();
		
		log.info("Clicked on Login Link");
		
		// Enter user name
		login.getusername_InBx();
		
		login.getpassword_InBx();
		
		login.gesubmit_Btn();
		// enter text in search box
		home.getSearchBox_Inpt("refrigerators");
				
		List<WebElement> count = driver.findElements(By.xpath("//a[@class='_2XvRSN']")) ;
		
		System.out.println("Total count of suggested Links of refrigirator : "+count.size());
		
		AssertJUnit.assertEquals(count.size(), 5);
		
		// getting all suggested link names
		for(WebElement ele : count)
		{
			String links = ele.getText();
			
			System.out.println(links);
		}
				
		//click on search box
		home.getSearchBox_Btn();	
		
		// getting list of refrigirator links after search
		List<WebElement> countitems = driver.findElements(By.xpath("//*[@class='_3wU53n']"));
		
		System.out.println("Total count of links in refrigirator list : "+countitems.size());
		
		for(WebElement ele :countitems )
		{
			String lnknames = ele.getText();			
				
				System.out.println("Refrigirator type Linke name is :"+lnknames);			
			
		}
		AssertJUnit.assertEquals(countitems.size(), 60);
			System.out.println("Searching refrigirator product is successfull");
	}
	
	
	
}

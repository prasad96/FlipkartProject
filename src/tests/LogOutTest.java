package tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.LogOutPage;

public class LogOutTest {
	
	WebDriver driver;
	
	Logger log;
	
	public LogOutTest(WebDriver driver)
	{
		
		this.driver = driver;
	}
	
	@Test
	public void logOut()
	{
		
		log = Logger.getLogger("LogOutTest");
		LogOutPage lout = new LogOutPage(driver);
		
		String myAccount_Txt = lout.getMyAccount_Txt();
		 
		AssertJUnit.assertEquals(myAccount_Txt, "My Account");
		
		System.out.println("My account text is : " + myAccount_Txt);
		
		
		//mouse hover (move to element)my account link
		lout.getmyAccount_Lnk();
		
		log.info("Clicked on My Account link.. ");
		
		AssertJUnit.assertEquals(lout.getlogOut_Lnk_Txt(), "Log Out");
		
		System.out.println("Log out text is : "+lout.getlogOut_Lnk_Txt());
		
		// click on Log Out
		lout.getlogOut_Lnk();
		
		log.info("Clicked on Log Out link.. ");
		
		System.out.println("Log out successfully ");
	}

}

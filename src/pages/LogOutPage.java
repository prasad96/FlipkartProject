package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	
	WebDriver driver;
	String myAccountText;
	
	@FindBy (how = How.XPATH,using = "//a[@class='_1AHrFc _2k0gmP']")
	WebElement myAccount_Lnk;
	
	@FindBy (how = How.LINK_TEXT, using = "Log Out")
	WebElement logOut_Lnk;
	
	//constructor
	public LogOutPage(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	// to go to my account link
	public void getmyAccount_Lnk()
	{
		Actions builder = new Actions(driver);
		
		builder.moveToElement(myAccount_Lnk);
		
		builder.perform();
	}
	
	// to get my account link text
	public String getMyAccount_Txt()
	{
		return myAccount_Lnk.getText();
	}
	
	// to get log out text
	public String getlogOut_Lnk_Txt()
	{
		return logOut_Lnk.getText();
		
	}
	// to click on log out link
	public void getlogOut_Lnk()
	{
		logOut_Lnk.click();
		
	}
}

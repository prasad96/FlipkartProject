package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BeforeYouPlaceOrderPage {
	
	
	WebDriver driver ;
	
	// enter mobile number or email input field
	@FindBy (how = How.XPATH, using = "//*[@id='email']")
	WebElement EnterMobileNumberOrEmail_Inpt ;
	
	//Continue Button 
	@FindBy (how = How.XPATH, using = "//*[@class='btn btn-large btn-blue tmargin5 ng-scope']")
	WebElement Continue_Btn ;
	
	@FindBy (how = How.XPATH, using = "//*[@id='password']")
	WebElement Password_Inpt ;
	
	@FindBy (how = How.XPATH, using = "//*[@class='btn btn-large btn-orange login_btn ng-scope']")
	WebElement SignIn_Btn ;
	
	@FindBy (how = How.XPATH, using = "//*[@class='forgot-pwd-link fk-display-block tmargin10']")
	WebElement ForgotPassword_Lnk ;
	
	//****************************************************************************************
	public BeforeYouPlaceOrderPage(WebDriver driver)
	{
		this.driver = driver ;
		
		PageFactory.initElements(driver, this) ;
	}
	
	public void getEnterMobileNumberOrEmail_Inpt(String mobileOrEmail)
	{
		EnterMobileNumberOrEmail_Inpt.sendKeys(mobileOrEmail);
	}
	
	public String getEnterMobileNumberOrEmail_Inpt_Txt()
	{
		return EnterMobileNumberOrEmail_Inpt.getText() ;
	}

	// continue button
	public void getContinue_Btn()
	{
		Continue_Btn.click();
	}
	
	
	public String getContinue_Btn_Txt()
	{
		return Continue_Btn.getText() ;
	}
	
	
	// enter password into input field
	public void getPassword_Inpt(String password)
	{
		Password_Inpt.sendKeys(password);
	}
	
	
	// get password input field text
	
	public String getPassword_Inpt_Txt()
	{
		return Password_Inpt.getText() ;
	}
	
	// click on sign in 
	
	public void getSignIn_Btn()
	{
		SignIn_Btn.click();
	}
	
	// get sign in button text
	public String getSignIn_Btn_Txt()
	{
		return SignIn_Btn.getText() ;
	}
	
	
	// click on forgot password button
	public void getForgotPassword_Lnk()
	{
		ForgotPassword_Lnk.click();
	}
	
	// get forgot password text
	public String getForgotPassword_Lnk_Txt()
	{
		return ForgotPassword_Lnk.getText() ;
	}
	
}

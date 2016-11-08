package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DeliveryAddressPage {

	
	WebDriver driver ;
	
	
	// delete address	
	@FindBy (how = How.XPATH, using ="//*[@class='item text-center ng-isolate-scope active']/div[2]")
	WebElement deleteAddress_Btn ;
	
	//  address	
		@FindBy (how = How.CLASS_NAME, using ="address-edit-icon margin5 ng-scope")
		WebElement editAddress_Btn ;
	
	
	// Address title
	@FindBy (how = How.CLASS_NAME, using ="name rposition")
	WebElement AggressTitle_Lbl ;
	
	
	// Address text paragraph
		@FindBy (how = How.CLASS_NAME, using ="ng-binding")
		WebElement Address_Txt ;
	
	// Delivery here button
	@FindBy (how = How.XPATH, using ="//*[@class='item text-center ng-isolate-scope active']/div[2]")
	WebElement DeleveryHere_Btn ;
	
	// new address button
	@FindBy (how = How.CLASS_NAME, using ="add_address_btn btn btn-white-yellow")
	WebElement newAddress_Btn ;
	
	//*************************************
	
	// Warning - session expired in shipping address
		@FindBy (how = How.XPATH, using ="//button[@class='btn btn-blue ng-binding']")
		WebElement warningAlert_Btn ;
	
	
		public DeliveryAddressPage(WebDriver driver)
		{
			this.driver = driver ;
			PageFactory.initElements(driver, this) ;
		}
		
		public WebElement getDeleveryHere_Btn_Element()
		{
			return DeleveryHere_Btn;
		}
	public void getDeleveryHere_Btn(){
		
		DeleveryHere_Btn.click();
	}
	
	public String getDeleveryHere_Btn_Txt()
	{
		return DeleveryHere_Btn.getText() ;
	}
	
	
}
	

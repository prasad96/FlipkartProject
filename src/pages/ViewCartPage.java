package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ViewCartPage {
	
	
	WebDriver driver;
	
	// post code input box in view cart page
	@FindBy (how = How.XPATH, using= "//input[@class='pincode-textbox fk-input']")
	WebElement postCode_Inpt ;

	// check button
	@FindBy (how = How.XPATH, using = "//input[@class='btn btn-blue']")
	WebElement checkBlue_Btn ;
	
	// Place order button
	@FindBy (how = How.XPATH, using = "//button[@class='btn btn-orange btn-buy-big place-order-button no-underline']")
	WebElement placeOrder_Btn ;
	
	// continue shopping
	@FindBy (how = How.XPATH, using = "//*[@class='btn btn-white fk-font-14 continue-button close']")
	WebElement continueShopping_Btn ;
	
	//*******************************************************************************
	// constructor
	public ViewCartPage(WebDriver driver){
		
		this.driver = driver ;
		
		PageFactory.initElements(driver, this) ;
		
	}
	
	
	// enter post code in to input field
	public void getPostCode_Inpt(String postcode)
	{
		postCode_Inpt.sendKeys(postcode);
	}
	
	// get post code input field text
	public String getPostCode_Inpt_Txt()
	{
		return postCode_Inpt.getText() ;
	}
	
	//click on check button
	
	public void getCheckBlue_Btn()
	{
		checkBlue_Btn.click();
	}
	
	// get check button text
	public String getCheckBlue_Btn_Txt()
	{
		return checkBlue_Btn.getText() ;
	}
	
	// get place order
	
	public WebElement getplaceOrder_Btn_Element()
	{
		return placeOrder_Btn ;
	}
	
	// click on place order button
	public void getPlaceOrder_Btn()
	{
		placeOrder_Btn.click();
	}
	
	// get place order button text
	public String getPlaceOrder_Btn_Txt()
	{
		return placeOrder_Btn.getText();
	}
	
	
	public void getContinueShopping_Btn()
	{
		continueShopping_Btn.click();
		
	}
	
	public String getcontinueShopping_Btn_Txt()
	{
		return continueShopping_Btn.getText() ;
	}
	
}

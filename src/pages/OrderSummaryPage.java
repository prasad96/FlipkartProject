package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrderSummaryPage {
	
	
	WebDriver driver ;
	

	@FindBy (how = How.CLASS_NAME, using ="//*[@class='title ng-binding']")
	WebElement productname_Lnk ;
	
	// order summary mobile number
	@FindBy (how = How.XPATH, using ="//*[@id='os_mobileNumber']")
	WebElement SMSAlertNum_Inpt ;
	
	@FindBy (how = How.XPATH, using ="//*[@class='btn btn-orange btn-large btn-continue no-underline']")
	WebElement continue_Btn ;
	
	// order summary mobile number
		@FindBy (how = How.XPATH, using ="//*[@class='qty-box fk-input ng-scope ng-pristine ng-valid ng-valid-pattern']")
		WebElement Quantity_Inpt ;
	
		// order summary mobile number
		@FindBy (how = How.XPATH, using ="//*[@class='fk-bold price ng-scope']/span")
		WebElement price_Lnk ;
	
	//*****************************************
		
		//  message out of stock
		
		@FindBy(how = How.XPATH, using = "//*[@class='ns-message']")
		WebElement outOfStock;
		
		// order summary mobile number
		@FindBy (how = How.XPATH, using ="//*[@class='btn btn-blue ng-binding']")
		WebElement warningAlert_Lnk ;
		
		
		public OrderSummaryPage(WebDriver driver)
		{
			this.driver = driver ;
			PageFactory.initElements(driver, this);
		}
		
		public WebElement getcontinue_Btn_Element()
		{
			return continue_Btn ;
		}
		
		// click on  continue button
		public void getcontinue_Btn(){
			
			continue_Btn.click();
		}
		public void getoutOfStock_Message()
		{
			outOfStock.click();
		}
		
		public WebElement getoutOfStock_Message_Element()
		{
			return outOfStock;
		}
		
		public String getoutOfStock_Message_Txt()
		{
			return outOfStock.getText() ;
		}
}

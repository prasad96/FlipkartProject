package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class EnterNewShippingAddress {
	
		WebDriver driver ;
	
	// Enter new shipping address
		@FindBy (how = How.XPATH, using ="//input[@id='name']")
		WebElement name_Inpt ;
		
		@FindBy (how = How.XPATH, using ="//*[@id='pincode']")
		WebElement pinCode_Inpt ;
		
		@FindBy (how = How.XPATH, using ="//*[@id='address']")
		WebElement address_Inpt ;
		
		@FindBy (how = How.XPATH, using =".//*[@id='landmark']")
		WebElement landMark_Inpt ;
		
		
		@FindBy (how = How.XPATH, using ="//input[@class ='btn btn-large btn-orange address_submit']")
		WebElement phone_Inpt ;
		
		@FindBy (how = How.XPATH, using ="//*[@class='unitExt fk-font-15 rpadding20']")
		WebElement cancelX_Btn ;
		
		
		public EnterNewShippingAddress(WebDriver driver)
		{		
			this.driver = driver ;
			
			PageFactory.initElements(driver, this) ;
		}

}

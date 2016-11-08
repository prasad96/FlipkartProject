package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethodPage {
	
	
			WebDriver driver ;
			// order summary mobile number
			@FindBy (how = How.LINK_TEXT, using ="Credit Card")
			WebElement creditCard_Btn ;
			
			// credit card input box
			@FindBy (how = How.XPATH, using ="//*[@id='card-no']")
			WebElement creditCardNumber_Inpt ;
			
			@FindBy (how = How.XPATH, using ="//*[@class='exp-dt-wr txt-el-wr']")
			WebElement expiryDate_Inpt ;
			
			@FindBy (how = How.XPATH, using ="//*[@id='cvv-no']")
			WebElement cvvNumber_Inpt ;
			
			
			@FindBy (how = How.XPATH, using ="//*[@id='card-name']")
			WebElement NameOnCard_Inpt ;
			
			@FindBy (how = How.XPATH, using ="//*[@id='card-form-sub']")
			WebElement SaveAndPay_Btn ;
			
			@FindBy (how = How.XPATH, using ="//*[@id='flkp-tot-amnt-pay']")
			WebElement amountPayable_Lbl ;
			
			
			public PaymentMethodPage(WebDriver driver)
			{
				
				this.driver = driver ;
				PageFactory.initElements(driver, this) ;
			}
			
			//click on credit card button
			public void getCreditCard_Btn(){
				
				creditCard_Btn.click();
				
			}
			
			// get credit card button text
			public String getCreditCard_Btn_Txt(){
				
				 return creditCard_Btn.getText();
				
			}
			
			// credit card input field -- to input card number
			public void getCreditCardNumber_Inpt(String cardnumber){
				
				creditCardNumber_Inpt.sendKeys(cardnumber);
			}
			
			// get card number field text
			public String getCreditCardNumber_Inpt_Txt(){
				
				return creditCardNumber_Inpt.getText() ;
			}
			
			// enter expiry date
			public void getExpiryDate_Inpt(String cardexpiry){
				
				expiryDate_Inpt.sendKeys(cardexpiry);
			}
			
			// get expiry date field text
			public String getExpiryDate_Inpt_Txt(){
				
				return expiryDate_Inpt.getText() ;
			}
			
			// enter CVV number
			public void getCvvNumber_Inpt(String cvvnumber){
							
				cvvNumber_Inpt.sendKeys(cvvnumber);
			}
						
						// get CVV number field text
			public String getCvvNumber_Inpt_Txt(){
							
					return cvvNumber_Inpt.getText() ;
			}
			
			
			// enter CVV number
			public void getNameOnCard_Inpt(String name){
										
				NameOnCard_Inpt.sendKeys(name);
			}
									
									// get CVV number field text
			public String getNameOnCard_Inpt_Txt(){
										
				return NameOnCard_Inpt.getText() ;
			}
			
			//
			public void getSaveAndPay_Btn(){
				
				SaveAndPay_Btn.click();
			}
									
			// get CVV number field text
			public String getSaveAndPay_Btn_Txt(){
										
				return SaveAndPay_Btn.getText() ;
			}
			
			// get CVV number field text
			public String getAmountPayable_Lbl_Txt(){
													
				return amountPayable_Lbl.getText() ;
			}
}

package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {
	
	
	WebDriver driver ;
	
	@FindBy (how = How.XPATH, using = "//button[@class='_3zLR9i _3Plo8Q _19RW-r']")
	WebElement AddtoCart_Btn ;
	
	@FindBy (how = How.XPATH, using = "//button[@class='_3zLR9i _3Plo8Q _16LyaZ _36SmAs']")
	WebElement BuyNow_Btn ;
	
	// go to cart button
	@FindBy (how = How.XPATH, using = "//button[@class='_3zLR9i _3Plo8Q _19RW-r']")
	WebElement GotoCart_Btn ;
	
	public ProductPage(WebDriver driver){
		
		this.driver= driver;
		
		PageFactory.initElements(driver, this) ;
	}
	
	
	public WebElement getAddtoCart_Btn_Element()
	{
		return AddtoCart_Btn;
	}
	
	public void getAddtoCart_Btn()
	{
		AddtoCart_Btn.click();
	}
	
	public String getAddtoCart_Btn_Txt()
	{
		return AddtoCart_Btn.getText() ;
	}
	
	
	// buy now button

	public void getBuyNow_Btn(){
		
		BuyNow_Btn.click();
	}
	
	
	public String getBuyNow_Btn_Txt(){
		
		return BuyNow_Btn.getText() ;
	}
	
	public WebElement getGotoCart_Btn_Element()
	{
		return GotoCart_Btn;
	}
	public void getGotoCart_Btn()
	{
		GotoCart_Btn.click();
	}
	
	
	public String getGotoCart_Btn_Txt()
	{
		return GotoCart_Btn.getText() ;
	}
	
}

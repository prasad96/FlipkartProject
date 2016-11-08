package pages;


import java.lang.* ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	WebDriver driver;
	
	
	
	 
	 //*******************************+
	 // Flipkart Main logo
	 @FindBy (how = How.XPATH , using = "//*[@class='_2OJxl5']/a")
	 WebElement FlipkartLogo_Img ;
	 
	 // **************************************
	 //Top menu items
	 
	 @FindBy (how = How.LINK_TEXT, using = "F-Assured")
	 WebElement FAssured_Lnk ;
	 
	 @FindBy (how = How.LINK_TEXT, using = "Advertise")
	 WebElement Advertise_Lnk ;
	 
	 
	 @FindBy (how = How.LINK_TEXT, using = "Gift Card")
	 WebElement GiftCard_Lnk ;
	 
	 
	 @FindBy (how = How.LINK_TEXT, using = "Download App")
	 WebElement DownloadApp_Lnk ;
	 
	 
	 @FindBy (how = How.LINK_TEXT, using = "24x7 Customer Care")
	 WebElement CustomerCare_Lnk ;
	 
	 @FindBy (how = How.LINK_TEXT, using = "Track Order")
	 WebElement TrackOrder_Lnk ;
	 
	 
	 @FindBy (how = How.LINK_TEXT, using = "Signup")
	 WebElement Signup_Lnk ;
	 
	 //****************************
	 //search box and under all sub items
	 
	// search box input field
	@FindBy (how = How.XPATH, using = "//input[@class='LM6RPg']")
	WebElement searchBox_Inpt ;
	
	// search button
	@FindBy(how = How.XPATH,using = "//button[@class='vh79eN']")
	WebElement searchBox_Btn;
	
	// cart button
	@FindBy (how = How.XPATH, using = "//a[@class='_3NFO0d']")
	WebElement cart_Btn;
	// electronics link 
	@FindBy (how = How.XPATH, using = "//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span")
	WebElement Electronics_Lnk;
	
	//Appliances link
	@FindBy (how = How.LINK_TEXT, using = "Appliances")
	WebElement Appliances_Lnk;
	
	//men link
	@FindBy (how = How.LINK_TEXT, using = "Men")
	WebElement Men_Lnk;
	
	//women link
	@FindBy (how = How.LINK_TEXT, using = "Women")
	WebElement Women_Lnk;
	
	//Baby & Kids link
	@FindBy (how = How.LINK_TEXT, using = "Baby & Kids")
	WebElement BabynKids_Lnk;
	
	// Home & Furniture
	@FindBy (how = How.LINK_TEXT, using = "Home & Furniture")
	WebElement HomenFurniture_Lnk;
	
	// Books & More
	@FindBy (how = How.LINK_TEXT, using = "Books & More")
	WebElement BooksnMore_Lnk;
//*************************************************************************
	
	@FindBy (how = How.LINK_TEXT, using = "Mobiles")
	WebElement Mobiles_Lnk;
	
	@FindBy (how = How.LINK_TEXT, using = "Samsung")
	WebElement Samsung_Lnk;
	
	@FindBy (how = How.LINK_TEXT, using = "Lenovo")
	WebElement Lenovo_Lnk;
	

	
	
	//******************************************************************
	
	// Buy now button in product list
	@FindBy (how = How.XPATH, using = "_3zLR9i _3Plo8Q _16LyaZ _36SmAs")
	WebElement BuyNow_Btn ;
	
	@FindBy (how = How.XPATH, using = "_3zLR9i _3Plo8Q _19RW-r")
	WebElement AddToCart_Btn ;
	
	
	
	
	
	//*******************************************************************
	// constructor

	public HomePage(WebDriver driver){	
		
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	
	//*****************************************
	// menu items started
	//*************************
	// Menu link FAssured_Lnk
	
	
	public void getFAssured_Lnk(){
		
		FAssured_Lnk.click();
		
	}
	
	public String getFAssured_Lnk_Txt(){
		
		return FAssured_Lnk.getText() ;
	}
	
	// click on Advertise_Lnk menu item
	
	public void getAdvertise_Lnk(){
		
		Advertise_Lnk.click();
	}
	
	public String getAdvertise_Lnk_Txt(){
		
		return Advertise_Lnk.getText() ;
	}
	
	// click on DownloadApp_Lnk menu item
	
	public void getDownloadApp_Lnk(){
		
		DownloadApp_Lnk.click();
	}
	
	public String getDownloadApp_Lnk_Txt(){
		
		return DownloadApp_Lnk.getText() ;
		
	}
	
	//click on CustomerCare_Lnk menu item
	
	public void getCustomerCare_Lnk(){
		
		CustomerCare_Lnk.click();
	}
	
	public String getCustomerCare_Lnk_Txt(){
		
		return CustomerCare_Lnk.getText() ;
	}
	// click on TrackOrder_Lnk menu item
	
	public void getTrackOrder_Lnk(){
		
		TrackOrder_Lnk.click();
	}
	
	public String getTrackOrder_Lnk_Txt(){
		
		 return TrackOrder_Lnk.getText() ;
	}
	
	// click on Signup_Lnk menu item
	
	public void getSignup_Lnk(){
		Signup_Lnk.click();
	}
	
	public String getSignup_Lnk_Txt(){
		
		return Signup_Lnk.getText() ;
	}
	//****************************************
	// menu item completed
	
	//**************************************
	// to enter text in search box
	public void getSearchBox_Inpt(String text)
	{
		
		searchBox_Inpt.sendKeys(text);
		
	}
	
	//click on search button
	public void getSearchBox_Btn()
	{
		searchBox_Btn.click();
		
		
	}
	
	public void getCart_Btn()
	{
		cart_Btn.click();
	}
	
	public String getcart_Btn_Txt()
	{
		return cart_Btn.getText() ;
	}
	
	public WebElement getcart_Btn_Element(){
		
		return cart_Btn ;
	}
	//***************************************
	
	// click on Elextronics link on hme page
	public WebElement getElectronics_Lnk()
	{
		
		return Electronics_Lnk ;
		
		
	}
	
	//click on samsung link for Electronics
	public void getSamsung_Lnk()
	{
		Samsung_Lnk.click();	
	}
	
	// to get Samsung link text
	public String getSamsung_Lnk_Txt()
	{
		return Samsung_Lnk.getText();
	}
		
		
}

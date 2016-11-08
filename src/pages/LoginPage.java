package pages;


import java.io.File; 
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.TimeUnit;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import utility.ConfigReader;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

//Flipkart Home page login

public class LoginPage {

	 // static WebDriver driver = new FirefoxDriver();	
	
	static ConfigReader config = new ConfigReader();	
	
	static WebDriver driver ;	
	
	String user;
	String passwd;
	
	
	
	@FindBy (how = How.LINK_TEXT, using = "Log In")
	WebElement login_Lnk;
	
	@FindBy (how = How.CLASS_NAME, using = "_2zrpKA")
	WebElement username_InBx;

	@FindBy (how = How.XPATH, using = "//div[@class='Km0IJL col col-3-5']/div/form/div[2]/input")
	WebElement password_InBx;
	

	@FindBy (how = How.XPATH, using = "//div[@class='Km0IJL col col-3-5']/div/form/div[3]/button")
	WebElement submit_Btn;
	
	
		public LoginPage(WebDriver driver){
			this.driver = driver;
			
			PageFactory.initElements(driver, this);
			
		}
		
		public void init() throws Exception{
			
			File file = new File(config.getTestdataExcelpath());
			
			FileInputStream fis = new FileInputStream(file);
			
			Workbook wb = Workbook.getWorkbook(fis);
			
			Sheet sh = wb.getSheet(0);
			
			Cell userNameCell = sh.getCell(0, 1);
			
			Cell passwordCell = sh.getCell(1, 1);
			
			// change row data to String
			user = userNameCell.getContents();
			
			System.out.println("user name is : "+user);
			
			// change row data to String
			passwd = passwordCell.getContents();
			
			System.out.println("Password name is : "+passwd);
		}
		
		
		// to get log in link text
		public String getlogin_Lnk_Txt()
		{					
			return login_Lnk.getText();
					
				}
		
		
		// click on login link on home page
		public void getlogin_Lnk()
		{			
			login_Lnk.click();
			
		}
		
		public String getusername_InBx_Txt()
		{					
			return username_InBx.getText();		
					
				}
		// to enter username
		public void getusername_InBx()
		{					
			username_InBx.sendKeys(user);		
					
				}
		
		
		public String getpassword_InBx_Txt()
		{			
			return password_InBx.getText();
			
		}
			// to enter password
			public void getpassword_InBx()
			{			
				password_InBx.sendKeys(passwd);
				
			}
		
			public String gesubmit_Btn_Txt()
			{			
				return submit_Btn.getText();
							
				}
			//click on submit button
			public void gesubmit_Btn(){
							
				submit_Btn.click();
							
						}
		

			public void login() throws Exception
			{
				
				
				
				
				driver.get(config.getFlipkartWebURL());
				
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				
				/*
				File file = new File(config.getTestdataExcelpath());
				
				FileInputStream fis = new FileInputStream(file);
				
				Workbook wb = Workbook.getWorkbook(fis);
				
				Sheet sh = wb.getSheet(0);
				
				Cell userNameCell = sh.getCell(0, 1);
				
				Cell passwordCell = sh.getCell(1, 1);
				
				// change row data to String
				String user = userNameCell.getContents();
				
				System.out.println("user name is : "+user);
				// change row data to String
				String passwd = passwordCell.getContents();
				
				System.out.println("Password name is : "+passwd);
				
				login_Lnk.click();
				
				//pass user name string to username field
				username_InBx.sendKeys(user);
				
				//pass user name string to username field
				password_InBx.sendKeys(passwd);
				
				//pass user name string to username field
				
				submit_Btn.click();
				
				*/
				
				
			}
			
			
			/*
			public static void main(String[] args) throws Exception
			{
				
				System.setProperty("webdriver.chrome.driver", config.getChromeDriver());
				 
				driver = new ChromeDriver();
				
				driver.get(config.getFlipkartWebURL());
				
				driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
				LoginPage log = PageFactory.initElements(driver, LoginPage.class);
				
				log.init();
				log.getlogin_Lnk();
				
				log.getusername_InBx();
				log.getpassword_InBx();
				log.gesubmit_Btn();
	
			}
			
			
			*/
			
			
			
			
			
			
}

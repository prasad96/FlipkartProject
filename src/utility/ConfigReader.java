package utility;
import java.io.*;
import java.util.Properties;


public class ConfigReader {

	Properties prop;
	
	public ConfigReader(){
		
		
		try {
			File file = new File ("./Configuration/Config.property");
			
			FileInputStream fis = new FileInputStream(file);
			
			prop = new Properties ();
			
			prop.load(fis);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
		// get Naukri URL
		public String getNaukriURL()
		{
			return prop.getProperty("NaukriURL");
		}
		
				
		public String getgeckopath()
		{
			return prop.getProperty("geckopath");
		}
	
		// get flipkart web url
		public String getFlipkartWebURL()
		{
			return prop.getProperty("FlipkartWebURL");
		}
		
		// get chrome driver path
			public String getChromeDriver()
			{
				return prop.getProperty("ChromeDriver");
			}
			
			public String getTestdataExcelpath()
			{
				return prop.getProperty("TestdataExcelpath");
			}
		
			public String getIEDriver(){
				return prop.getProperty("InternetExplorer");
			}
			
			public String getlogin_Lnk()
			{
				return prop.getProperty("login_Lnk");
			}
		
		
}

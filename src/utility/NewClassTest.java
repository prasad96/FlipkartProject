package utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class NewClassTest {

	public NewClassTest(){
		
	}
	public static void main(String[] args) {
		
WebDriver driver = new FirefoxDriver();

       ConfigReader con = new ConfigReader();
		
		driver.get(con.getNaukriURL());
		
		

	}

}

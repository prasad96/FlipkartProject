package tests;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TotalLinks {
	
	WebDriver driver ;
	
	@Test
	public void countLinks()throws Exception{
		
		
		driver = new FirefoxDriver() ;
		
		driver.get("http://google.com");
		
		List<WebElement> list = driver.findElements(By.tagName("a")) ;
		
		System.out.println("total count of links : " + list.size());
		
		for (int i =0; i <list.size();i++){
			
			
			WebElement ele = list.get(i) ;
			
			
			String names = ele.getAttribute("href") ;
			
			verifyURL(names) ;
		}
	}
	
	public String verifyURL(String urlString) throws Exception
	{
		URL obj = new URL(urlString);
		
		        HttpURLConnection httpConnection = (HttpURLConnection) obj
		
		                .openConnection();
		
		        httpConnection.setRequestMethod("GET");
		
		       // httpConnection.setRequestProperty("User-Agent", USER_AGENT);
		
		        int responseCode = httpConnection.getResponseCode();
		
		        if (responseCode == 200) {
		
		 
		
		            BufferedReader responseReader = new BufferedReader(new InputStreamReader(
		
		                    httpConnection.getInputStream()));
		
		            String responseLine;
		
		            StringBuffer response = new StringBuffer();
		
		            while ((responseLine = responseReader.readLine()) != null) {
		
		                response.append(responseLine+"\n");
		
		            }
		
		            responseReader.close();
		
		            // print result
		
		            return response.toString();
		
		        }
		
		        return null;

	     }
	

}

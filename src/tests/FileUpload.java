package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUpload {
	
    public static void main(String[] args)  {
        try{            
       
        WebDriver driver = new FirefoxDriver();
        driver.get("http://www.sendspace.com/");
System.out.println(" Page Opened is: "+driver.getCurrentUrl()+"\n"+driver.getTitle() );
        driver.findElement(By.xpath("//*[@id='upload_file']")).click();
        System.out.println(" Browse button clicked");
        Runtime.getRuntime().exec("C:\\Users\\user\\Desktop\\demo.exe"); //call Autoit script
        System.out.println(" Execution Finished ");
        //driver.close();
         }catch(Exception e)
         {       
e.printStackTrace();
        System.out.println(e.getMessage());    
       
}
}

}

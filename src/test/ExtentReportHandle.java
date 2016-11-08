package test;

import java.io.File;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class ExtentReportHandle {
	
	ExtentReports extent ;
	ExtentTest tests ;

	@Test
	
	public void startReport ()
	{
		
		extent = new ExtentReports (System.getProperty("user.dir")+"/test-output/MyOwnReport.html",true) ;
		extent.addSystemInfo("Hostname", "Prasad")
			.addSystemInfo("Environment", "QA")
			.addSystemInfo("User Name", "Prasad Battula") ;
		extent.loadConfig(new File(System.getProperty("user.dir")+"/extent-config.xml"));
			
	}
	
	
	
}

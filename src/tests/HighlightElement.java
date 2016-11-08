package tests;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HighlightElement {
	WebDriver driver ;
	public HighlightElement(WebDriver driver){
		this.driver = driver ;
		
	}

	public void highlightElement(WebElement element){
		
		JavascriptExecutor js = (JavascriptExecutor)driver ;
		
		js.executeScript("arguments[0].setAttribute('style','border : solid 2px red')", element) ;
	}
}

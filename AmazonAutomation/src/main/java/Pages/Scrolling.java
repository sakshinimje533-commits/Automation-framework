package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scrolling {
	
	@FindBy (xpath = "//a[text()='Bestsellers'][1]")
	private WebElement bestSeller ;
	
	public Scrolling(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

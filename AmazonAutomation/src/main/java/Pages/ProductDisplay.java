package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductDisplay {
	
	@FindBy (xpath = "//input[@role='searchbox']")
	private WebElement search_box3 ;

	@FindBy (xpath = "//input[@type='submit']")
	private WebElement todays_deal ;
	
	@FindBy (xpath = "//span[text()='Limited time deal']")
	private WebElement limited_time_deal ;
	
	public ProductDisplay(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

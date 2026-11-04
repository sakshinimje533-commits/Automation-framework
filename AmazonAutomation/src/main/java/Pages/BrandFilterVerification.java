package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrandFilterVerification {
	
	@FindBy (xpath = "//input[@role='searchbox']")
	private WebElement search_box1 ;

	@FindBy (xpath = "//input[@type='submit']")
	private WebElement search_icon1 ;
	
	@FindBy (linkText = "Women's Kurtas & Kurtis")
	private WebElement Women ;
	
	@FindBy (xpath = "//img[@class='s-image']")
	private WebElement dress_img ;
	
	@FindBy (xpath = "//input[@id='buy-now-button']")
	private WebElement buyNow ;
	
	public BrandFilterVerification(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

}

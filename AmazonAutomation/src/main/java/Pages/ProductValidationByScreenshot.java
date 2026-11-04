package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductValidationByScreenshot {

	@FindBy (xpath = "//a[text()='Fashion']")
	private WebElement fashion ;

	@FindBy (xpath = "//img[@alt='Amazon Fashion']")
	private WebElement amazon_fashion ;
	
	@FindBy (xpath = "//img[@alt ='Jewellery']")
	private WebElement jewellery ;
	
	@FindBy (xpath = "//img[@alt='Everyday Fine Jewellery']")
	private WebElement ring ;
	
	@FindBy (xpath = "//img[@alt='Coins & Bars']")
	private WebElement coins ;
	
	public ProductValidationByScreenshot(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}

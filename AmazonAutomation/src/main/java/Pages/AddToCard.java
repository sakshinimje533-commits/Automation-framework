package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCard {
	
	@FindBy (xpath = "//input[@role='searchbox']")
	private WebElement search_box ;
	
	@FindBy (xpath = "//h2[contains(@class,'a-size-medium a-spacing')]")
	private WebElement first_product ;
	
	@FindBy (xpath = "//input[@value='Add to Cart']]")
	private WebElement add_to_card ;
	
	public AddToCard(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void sendSearchBox(String search_box) {
		this.search_box.sendKeys(search_box);
	}
	
	public void clickOnFirstProduct() {
		add_to_card.click();
	}
	
	public void clickOnAddToCard() {
		add_to_card.click();
		
	}

}

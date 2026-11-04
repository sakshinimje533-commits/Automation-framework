package POM_CLASS_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	@FindBy(xpath = "//li[@data-hover='Health']") 
	private WebElement HealthButton;
	
	public Home_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ClickOnHealthButton() {
		HealthButton.click();
	}

}

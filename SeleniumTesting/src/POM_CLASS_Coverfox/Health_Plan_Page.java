package POM_CLASS_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Health_Plan_Page {
	
	@FindBy(xpath = "(//div[text()='Female'])[2]") 
	private WebElement Female1;
	
	@FindBy(xpath = "//div[text()='You']") 
	private WebElement You;
	
	@FindBy(xpath = "//div[@class='next-btn']")
	private WebElement NextButton;
	
	//constructor
	public Health_Plan_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void ClickOnFemale1() {
		Reporter.log("Clicking On Female Button", true);
		Female1.click();
	}
	
	public void ClickOnYou() {
		Reporter.log("Clicking On You Button", true);
		You.click();
	}
	
	public void ClickOnNext() {
		Reporter.log("Clicking On Next Button", true);
		NextButton.click();
	}

}

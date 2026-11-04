package coverFoxUsingPOMAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHealthPlanPage {
	
	@FindBy(xpath = "(//div[text()='Female'])[2]") 
	private WebElement Female1;
	
	@FindBy(xpath = "//div[text()='You']") 
	private WebElement You;
	
	@FindBy(xpath = "//div[@class='next-btn']")
	private WebElement NextButton;
	
	//constructor
	public CoverFoxHealthPlanPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//method
	public void ClickOnFemale1() {
		Female1.click();
	}
	
	public void ClickOnYou() {
		You.click();
	}
	
	public void ClickOnNext() {
		NextButton.click();
	}

	

}

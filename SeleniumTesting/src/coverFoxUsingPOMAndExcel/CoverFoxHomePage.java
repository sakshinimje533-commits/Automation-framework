package coverFoxUsingPOMAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxHomePage {
	
	@FindBy(xpath = "//li[@data-hover='Health']") 
	private WebElement HealthButton;
	
	@FindBy(xpath = "//div[text()='Female']")  // //div[text()='Female']
    private WebElement Female;
			
	@FindBy(xpath = "(//input[@type='tel'])[1]") 
    private WebElement MobileNo; //mobile no = 9898989898
			
	@FindBy(xpath = "//button[@title='View Quotes']") 
	private WebElement View_Quotes_Button;
	
	
//	public CoverFoxHomePage(WebDriver driver) { 
//		PageFactory.initElements(driver, this); 
//}
	
	

	public CoverFoxHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}



	//method
	public void ClickOnHealthButton() {
		HealthButton.click();
	}
	
	public void ClickOnFemaleButton() {
		Female.click();
	}
	
	public void EnterMobileNo(String MobileNumber) {
		MobileNo.sendKeys(MobileNumber);
	}
	
	public void ClickOnQuotesButton() {
		View_Quotes_Button.click();
	}





	

}

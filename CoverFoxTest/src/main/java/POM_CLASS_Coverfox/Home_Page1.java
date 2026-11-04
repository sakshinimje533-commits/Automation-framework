package POM_CLASS_Coverfox;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Home_Page1 {
	//WebElement = Data members
	@FindBy(xpath = "//div[text()='Female']")  // //div[text()='Female']
	private WebElement Female;
	
	@FindBy(xpath = "(//input[@type='tel'])[1]") 
	private WebElement MobileNo; //mobile no = 9898989898
	
	@FindBy(xpath = "//button[@title='View Quotes']") 
	private WebElement View_Quotes_Button;
	
	//constructor
	public Home_Page1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Method
	public void ClickOnFemaleButton() {
		Reporter.log("Clicking On Gender Button", true);
		Female.click();
	}
	
	public void EnterMobileNo(String MobileNumber) {
		MobileNo.sendKeys(MobileNumber);
	}
	
	public void ClickOnQuotesButton() {
		Reporter.log("Clicking On Quotes Button", true);
		View_Quotes_Button.click();
	}
	
	

}

package POM_CLASS_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Health_Plan_Address_Details {
	
	@FindBy(xpath = "(//input[@type='number'])[1]") 
	private WebElement PincodeNo;
	
	@FindBy(xpath = "//input[@maxlength='10']")
	private WebElement MobileNoField;

	@FindBy(xpath = "//div[text()='Continue']")
	private WebElement ContinueButton;
	
	public Health_Plan_Address_Details(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}


		public void EnterPinCodeNo(String Pincode) {
			PincodeNo.sendKeys(Pincode); //411001
		}

		
		public void MobileNumField(String MobileNum) {
			MobileNoField.sendKeys(MobileNum);
		}
		
		public void ClickOnContinue() {
			Reporter.log("Clicking On Continue Button", true);
			ContinueButton.click();
		}
		
		
		
	}


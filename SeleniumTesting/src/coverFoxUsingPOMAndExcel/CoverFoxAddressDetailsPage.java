package coverFoxUsingPOMAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CoverFoxAddressDetailsPage {
	
	@FindBy(xpath = "(//input[@type='number'])[1]") 
	private WebElement PincodeNo;
	
	@FindBy(xpath = "//input[@maxlength='10']")
	private WebElement MobileNoField;

	@FindBy(xpath = "//div[text()='Continue']")
	private WebElement ContinueButton;
	
	
	public CoverFoxAddressDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPinCodeNo(String Pincode) {
		PincodeNo.sendKeys(Pincode);
	}
	
	
	public void MobileNumFiled(String MobileNum) {
		MobileNoField.sendKeys(MobileNum);
	}
	
	public void ClickOnContinueButton() {
		ContinueButton.click();
		
	}
}

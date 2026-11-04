package POM_CLASS_Coverfox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class Health_Plan_Member_Details {
	
	@FindBy(xpath = "//select[@id='Age-You']") 
	private WebElement AgeField;
	
	@FindBy(xpath = "//div[@class='next-btn']") 
	private WebElement NextButton;
	
	public Health_Plan_Member_Details(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterAge(String Age) {
		Reporter.log("Handling dropdown", true);
		Select s = new Select(AgeField);
		s.selectByValue(Age+ "y");
		//System.out.println(Age+ "y"); //27
	}
	
	public void ClickOnNextButton() {
		Reporter.log("Clicking On Next Button", true);
		NextButton.click();
	}

}

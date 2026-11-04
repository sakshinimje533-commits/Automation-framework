package coverFoxUsingPOMAndExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CoverFoxMemberDetailsPage {
	
	@FindBy(xpath = "//select[@id='Age-You']") 
	private WebElement AgeField;
	
	@FindBy(xpath = "//div[@class='next-btn']") 
	private WebElement NextButton;
	
	public CoverFoxMemberDetailsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void EnterAge(String Age) {
		Select s = new Select(AgeField);
		s.selectByValue(Age+ "y");
		//System.out.println(Age+ "y"); //27
	}
	
	public void ClickOnNextButton() {
		NextButton.click();
	}

}

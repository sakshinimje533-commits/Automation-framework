package coverFoxUsingPOMAndExcel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class CoverFoxResultPage {
	
	@FindBy(xpath = "//div[text()='10 matching Health Insurance Plans']") 
	private WebElement NoOfInsurancesMatches;
	
	@FindBy(xpath = "//div[@class='plan-card-container']")
	private List<WebElement> Banners;
	
	
	public CoverFoxResultPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ValidNoOfBanner(){
		String str = NoOfInsurancesMatches.getText();
		String arr[] = str.split(" ");
		String r = arr[0];
		int res1 = Integer.parseInt(r);
		System.out.println(res1);
		System.out.println(Banners.size());
		if(res1 == Banners.size()) {
			System.out.println("Result is matching with banners, TC passed");	
		} else {
			System.out.println("banners are Notmatches with the given list TC FAIL");
		}

	}

	
	
	
	public int getPlanNumersFromString() 
	 { 
	  WebElement resultText = null;
	  String ar[]=resultText.getText().split(" "); 
	  int result = Integer.parseInt(ar[0]); 
	  return result; 
	 } 
//	  
	 public int getPlanNumersFromBanners() 
	 { 
	  int bannerSize = Banners.size(); 
	  return bannerSize; 
	 } 

	 public boolean sortPlanFilterIsDisplayed() {
		 Reporter.log("Checking if sortPlanFilterIsDisplayed", true);
		  
		 
		 WebElement sortPlanFilter = null;
		 boolean result = sortPlanFilter.isDisplayed();
		return result;
		 
	 }
	
	
	
	

}



package POM_CLASS_Coverfox;


import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Health_Plan_Result_Page {
	
	

	@FindBy(xpath = "//div[text()='10 matching Health Insurance Plans']") 
	private WebElement NoOfInsurancesMatches;

	@FindBy(xpath = "//div[@class='plan-card-container']")
	private List<WebElement> Banners;
	
	@FindBy(xpath = "//div[text()='Sort Plans']") 
	private WebElement sortPlanFilter;

	private WebElement resultText;

	//private WebElement getPlanNumersFromString;

	//private WebElement resultText;
	
	
	public Health_Plan_Result_Page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void ValidNoOfBanner(){
		Reporter.log("getting String results", true);
		String str = NoOfInsurancesMatches.getText();
		String arr[] = str.split(" ");
		String r = arr[0];
		Reporter.log("getting total banners", true);
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
	 
	 String ar[]=resultText.getText().split(" ");
	 // String ar[]=getPlanNumersFromString.getText().split(" ");
	  Reporter.log("getting Plan Numbers From String", true);
	  int result = Integer.parseInt(ar[0]); 
	  return result; 
	 } 
	  
	 public int getPlanNumersFromBanners() 
	 { 
	  int bannerSize = Banners.size(); 
	  Reporter.log("getting Plan Numbers From Banners", true);
	  
	  return bannerSize; 
	 }
	
	
	 public boolean sortPlanFilterIsDisplayed() {
		 Reporter.log("Checking if sortPlanFilterIsDisplayed", true);
		  
		 
		 boolean result = sortPlanFilter.isDisplayed();
		return result;
		 
	 }
	
}

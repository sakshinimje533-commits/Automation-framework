package POM_CLASS_Coverfox;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class TestCase {
	
	public static void main(String[] args) {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notifications");
		opt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Home_Page home = new Home_Page(driver);
		home.ClickOnHealthButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Home_Page1 home1 = new Home_Page1(driver);
		home1.ClickOnFemaleButton();
		home1.EnterMobileNo("9898989898");
		home1.ClickOnQuotesButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Health_Plan_Page health_plan = new Health_Plan_Page(driver);
//		health_plan.ClickOnFemale1();
//		health_plan.ClickOnYou();
		health_plan.ClickOnNext();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Health_Plan_Member_Details MemberDetails = new Health_Plan_Member_Details(driver);
		MemberDetails.EnterAge("27");	
		MemberDetails.ClickOnNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Health_Plan_Address_Details AddressDetails = new Health_Plan_Address_Details(driver);
		AddressDetails.EnterPinCodeNo("411001");
		AddressDetails.MobileNumField("9898989898");
		AddressDetails.ClickOnContinue();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Health_Plan_Result_Page Result = new Health_Plan_Result_Page(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Result.ValidNoOfBanner();
		Result.getPlanNumersFromString();
		Result.getPlanNumersFromBanners();
		Result.sortPlanFilterIsDisplayed();
		driver.close();
	
	}

}

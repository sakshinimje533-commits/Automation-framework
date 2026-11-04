package coverFoxTest;

import static org.testng.Assert.fail;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import Common_Methos.Utility3;
import coverFoxBase.Base;
import coverFoxUsingPOMAndExcel.CoverFoxAddressDetailsPage;
import coverFoxUsingPOMAndExcel.CoverFoxHealthPlanPage;
import coverFoxUsingPOMAndExcel.CoverFoxHomePage;
import coverFoxUsingPOMAndExcel.CoverFoxMemberDetailsPage;
import coverFoxUsingPOMAndExcel.CoverFoxResultPage;
import coverFoxUtility.Utility;

@Listeners(coverFoxUtility.Listener.class)
public class CoverFoxTC1 extends Base{
	WebDriver driver;
	CoverFoxHomePage homePage;
	CoverFoxHealthPlanPage  healthPlanPage;
	CoverFoxMemberDetailsPage  memberDetailsPage;
	CoverFoxAddressDetailsPage  addressDetailsPage;
	CoverFoxResultPage resultPage;
	String filePath;
	
	
	@BeforeTest
	public void launchBrowser() {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notifications");
		//opt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		homePage = new CoverFoxHomePage(driver);
		healthPlanPage = new CoverFoxHealthPlanPage(driver);
		memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		resultPage = new CoverFoxResultPage(driver);
		filePath = System.getProperty("user.dir")+"\\TestData.xlsx";
		
	}
	
	@BeforeClass
	public void preConditions() throws EncryptedDocumentException, IOException {
		homePage.ClickOnHealthButton();
		homePage.ClickOnFemaleButton();
		homePage.EnterMobileNo(Utility.readDataFromExcel(filePath, "Sheet5",1,0));
		homePage.ClickOnQuotesButton();
		
		healthPlanPage.ClickOnFemale1();
		healthPlanPage.ClickOnYou();
		healthPlanPage.ClickOnNext();
		
		memberDetailsPage.EnterAge(Utility.readDataFromExcel(filePath, "Sheet5",1,1));
		memberDetailsPage.ClickOnNextButton();
		
		addressDetailsPage.EnterPinCodeNo(Utility.readDataFromExcel(filePath, "Sheet5", 1,2));
		addressDetailsPage.MobileNumFiled(Utility.readDataFromExcel(filePath, "Sheet5",1,0));
		addressDetailsPage.ClickOnContinueButton();
	}
	
	
	@Test 
	 public void validateBanners() throws InterruptedException { 
	  Thread.sleep(4000); 
	  Assert.fail();
	  int bannerPlanNumbers = resultPage.getPlanNumersFromBanners(); 
	  int StringplanNumbers = resultPage.getPlanNumersFromString(); 
	 
	  Assert.assertEquals(StringplanNumbers, bannerPlanNumbers, 
	    "Plans on banners not matching with results, TC failed"); 
	 } 
	
	@Test
	//public void ValidNoOfBanner() throws InterruptedException {
		public void validatePresenceOfSortButton() throws InterruptedException, IOException { 
		  Thread.sleep(4000); 
		  Assert.fail();
		  Assert.assertTrue(resultPage.sortPlanFilterIsDisplayed(), "Sort Plan filter is not displayed,TC is failed"); 
		  Utility.takeScreenShot(driver, "validatePresenceOfSortButton"); 
		 
		 }
		
		
	
	
	@AfterClass
	public void closeBrowser() {
		driver.close();
	}
	

}





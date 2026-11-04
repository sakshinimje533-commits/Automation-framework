package coverFoxUsingPOMAndExcel;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import Common_Methos.Utility3;


public class CoverFoxTC {


public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("disable-notifications");
		opt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("https://www.coverfox.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String filePath = "C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx";
		String MobileNumber = Utility3.readDataFromExcel(filePath, "Sheet5",1,0);
		String Age = Utility3.readDataFromExcel(filePath, "Sheet5",1,1);
		String Pincode = Utility3.readDataFromExcel(filePath, "Sheet5", 1,2);
		String MobileNum = Utility3.readDataFromExcel(filePath, "Sheet5",1,0);
		
		
		//Create Object
		
		CoverFoxHomePage homePage = new CoverFoxHomePage(driver);
		homePage.ClickOnHealthButton();
		homePage.ClickOnFemaleButton();
		homePage.EnterMobileNo(MobileNumber);
		homePage.ClickOnQuotesButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		CoverFoxHealthPlanPage  healthPlanPage = new CoverFoxHealthPlanPage(driver);
		healthPlanPage.ClickOnFemale1();
		healthPlanPage.ClickOnYou();
		healthPlanPage.ClickOnNext();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		CoverFoxMemberDetailsPage  memberDetailsPage = new CoverFoxMemberDetailsPage(driver);
		memberDetailsPage.EnterAge(Age);
		memberDetailsPage.ClickOnNextButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		CoverFoxAddressDetailsPage  addressDetailsPage = new CoverFoxAddressDetailsPage(driver);
		addressDetailsPage.EnterPinCodeNo(Pincode);
		addressDetailsPage.MobileNumFiled(MobileNum);
		addressDetailsPage.ClickOnContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		CoverFoxResultPage resultPage = new CoverFoxResultPage(driver);
		resultPage.ValidNoOfBanner();
		driver.close();
		
		





	
}
}
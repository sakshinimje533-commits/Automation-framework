package Common_Methos;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {
	
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		FluentWait <WebDriver> fluentWait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		
		
		//WebElement textbox = driver.findElement(By.xpath("//input[@type='text']"));
		String path = "C:\\Users\\SakshiNimje\\OneDrive\\Documents\\TestData.xlsx";
		String str = Utility3.FetchDataFromExcel(path,"Sheet3", 1, 0);
		
		FluentWait <WebDriver> fluentWait1 = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(1))
				.ignoring(NoSuchElementException.class);
		
		fluentWait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='text']")));
		
		textbox.sendKeys(str);
		System.out.println("Print");
		
		
		
	}

	private static FluentWait<WebDriver> withTimeout(Duration ofSeconds) {
		// TODO Auto-generated method stub
		return null;
	}

}

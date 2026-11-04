package coverFoxBase;


import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;

public class Base {
	
	static protected WebDriver driver;
	
	
	public void openBrowser() {
	ChromeOptions opt = new ChromeOptions();
	opt.addArguments("--disable-notifications");
	opt.addArguments("start-maximized");
	
	WebDriver driver = new ChromeDriver(opt);
	
	driver.manage().window().maximize();
	
	driver.get("https://www.coverfox.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    Reporter.log("waiting...", false);
}

	public void browserClose() throws InterruptedException {
		Reporter.log("Closing Browser", false);
		Thread.sleep(1000);
		
	//driver.close();
	}
}

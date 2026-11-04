package Parallel_Execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class parallel3 {
	@Test
	  public void kiteLogin() throws InterruptedException {
		  
		  //System.setProperty("webdriver.chrome.driver", "");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://kite.zerodha.com/");
		  Reporter.log("KiteLoginLaunched", true);
		  Thread.sleep(5000);
		  driver.close();
	  }
}

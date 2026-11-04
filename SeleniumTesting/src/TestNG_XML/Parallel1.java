package TestNG_XML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel1 {
  @Test
  public void instaLogin() throws InterruptedException {
	 // System.setProperty("webdriver.chrome.driver", null);
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.instagram.com/");
	  Reporter.log("Insta Login Launched", true);
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}

package TestNG_XML;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Parallel2 {
  @Test
  public void FacebookLogin() throws InterruptedException {
	  //System.setProperty("webdriver.chrome.driver", "");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com/");
	  Reporter.log("Facedbook Login Launched", true);
	  Thread.sleep(5000);
	  driver.close();
	  
  }
}
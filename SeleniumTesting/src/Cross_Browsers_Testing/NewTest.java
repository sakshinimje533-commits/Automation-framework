package Cross_Browsers_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
	WebDriver driver;
	@Parameters("browserName") 
	
  @Test
  public void f(String bName) throws InterruptedException {
		
		if(bName.equalsIgnoreCase("chrome")) {
			   driver = new ChromeDriver();
		}
		
		else if(bName.equalsIgnoreCase("fireFox")) {
			   driver = new FirefoxDriver();
		}
		
		else if(bName.equalsIgnoreCase("edge")) {
			   driver = new EdgeDriver();
		}
	  
	//  WebDriver driver = new ChromeDriver();
	  driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	  driver.manage().window().maximize();
	  //Thread.sleep(4000);
	  
	  WebElement Username = driver.findElement(By.xpath("//input[@id='autocomplete']"));
	  Username.sendKeys("Sakshi");
	  Thread.sleep(4000);
	  driver.close();
  }
}


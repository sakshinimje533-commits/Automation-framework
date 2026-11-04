package Data_Provider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBSignUp {
  @Test(dataProvider="cricketPlayers",dataProviderClass=Data_Provider.Sample1.class)
  public void f(String name, String Lastname ,String MobileNum ) {
	  
	  WebDriver driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1000));
	  driver.get("https://www.facebook.com/signup");
	  
	  WebElement FirstN = driver.findElement(By.xpath("//input[@type='text']"));
	  FirstN.sendKeys(name);
	  
	  WebElement Surname = driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	  Surname.sendKeys(Lastname);
	  
	  WebElement Mobile = driver.findElement(By.xpath("(//input[@type='text'])[3]"));
	  Mobile.sendKeys(MobileNum);
	  
  }
}

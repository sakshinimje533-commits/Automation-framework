package Practice;




import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import Common_Methos.Utility3;

public class ScrollIntoView_WithoutUsingSendKeys {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		WebElement inputfield = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		js.executeScript("arguments[0].value='watches';",inputfield);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		WebElement SearchButton=driver.findElement(By.xpath("//input[@type='submit']"));
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		 js.executeScript("arguments[0].click();",SearchButton);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		
		 WebElement View =driver.findElement(By.xpath("//h2[text()='Need help?']"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		js.executeScript("arguments[0].scrollIntoView(true);",View);
		
		Thread.sleep(4000);
		js.executeScript("window.scrollBy(0,-500000)"); //up
		
		Utility3.Screenshot(driver, "C:\\Users\\SakshiNimje\\eclipse-workspace\\SeleniumTesting\\src\\Practice\\image.png");
       //argument[0] represent the WebElement passed as an argument to executeScript().
		driver.close();
	}
}

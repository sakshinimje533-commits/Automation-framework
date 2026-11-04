package Practice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingOpeartion {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.facebook.com/");
		//driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.get("https://www.amazon.in/");
        Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,5000)"); //scroll down
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-3000)"); //scroll up
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(5000,0)"); 
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(-4000,0)");
		Thread.sleep(3000);
		
		
		
		driver.close();
	}

}

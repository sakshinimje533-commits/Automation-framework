package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/");
		driver.manage().window().maximize();
		//Thread.sleep(3000);
		
		//WebElement Featuread_Course = driver.findElement(By.xpath("//h2[text() = 'Featured Courses']"));
		//Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,50000)");// Scroll down
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,-30000)"); //scroll up
		js.executeScript("window.scrollBy(500,0)"); //right
		js.executeScript("window.scrollBy(0,-300)"); //left
		
	 
	}

}

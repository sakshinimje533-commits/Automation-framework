package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Product_Display {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement search_box3 = driver.findElement(By.xpath("//input[@role='searchbox']"));
		
		//search_box.click();
		search_box3.sendKeys("Gift for Women");
		search_box3.sendKeys(Keys.ENTER);
		
		WebElement todays_deal = driver.findElement(By.xpath("//span[text()='Today's Deals']"));
		//todays_deal.click();
		Actions act = new Actions(driver);
		act.moveToElement(todays_deal).click().build().perform();
		
		WebElement limited_time_deal = driver.findElement(By.xpath("//span[text()='Limited time deal']"));
		limited_time_deal.click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(-4000,0)");
		
		boolean result = limited_time_deal.isDisplayed();
		
		if(result == true) {
			System.out.println("Test Passed");
			System.out.println("Limited time deal are displayed");	
		}
		else {
			System.out.println("Test Failed");
			System.out.println("Limited time deal are not displayed");	
		}
		
	}

}

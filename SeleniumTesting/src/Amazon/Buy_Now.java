package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Buy_Now {
	
public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement search_box2 = driver.findElement(By.xpath("//input[@role='searchbox']"));
		search_box2.sendKeys("CLOTHES");
		
		WebElement search_icon2 = driver.findElement(By.xpath("//input[@type='submit']"));
		search_icon2.click();
		
		WebElement Women = driver.findElement(By.linkText("Women's Kurtas & Kurtis")); 
		Actions act = new Actions(driver);
		act.moveToElement(Women).click().build().perform();
		
		WebElement dress_img = driver.findElement(By.xpath("//img[@class='s-image']"));
		dress_img.click();
		
		WebElement buyNow = driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		
		boolean result = buyNow.isEnabled();
		
		if(result == true) {
			System.out.println("Test Passed");
			System.out.println("Element is enabled");
		}
		else {
			System.out.println("Test Failed");
			System.out.println("Element is disabled");
			
		}
	}
	
	


}

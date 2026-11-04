package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement testframe1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(testframe1);
		Thread.sleep(5000);
		
		WebElement testframe2 = driver.findElement(By.xpath("//iframe[contains(@title,'W3Schools Free Online')]"));
		driver.switchTo().frame(testframe2);
		Thread.sleep(5000);
		
		WebElement HTML = driver.findElement(By.xpath("//a[text()='HTML']"));
		HTML.click();
		
		System.out.println("Sakshi");
	}

}

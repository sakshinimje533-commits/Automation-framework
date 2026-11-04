package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
//		Thread.sleep(2000);
//		
//		WebElement The_Iframe_Element1 = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
//		driver.switchTo().frame(The_Iframe_Element1);
//		Thread.sleep(2000);
//		
//		WebElement Iframe2 = driver.findElement(By.xpath("//iframe[contains(@title,'W3Schools Free Online')]"));
//		//iframe[contains(@title,'W3Schools Free Online Web Tutorials')]
//		driver.switchTo().frame(Iframe2);
//		Thread.sleep(2000);
//		
//		WebElement HTML = driver.findElement(By.xpath("//a[text()='HTML']"));
//		HTML.click();
//		
//		System.out.println("IFrame");
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.switchTo().frame("SingleFrame");

		// Perform action inside iframe
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Hello");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();

		// Switch back to main page
		//driver.switchTo().defaultContent();

		// Now interact with elements on the main page
		//driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		//driver.switchTo().defaultContent();
	}
	

}

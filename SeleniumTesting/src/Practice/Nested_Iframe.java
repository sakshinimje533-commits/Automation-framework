package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nested_Iframe {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
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



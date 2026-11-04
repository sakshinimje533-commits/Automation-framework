package Amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

        driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement bestSeller = driver.findElement(By.xpath("//a[text()='Bestsellers'][1]"));
		bestSeller.click();
		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)"); //Scroll Down 5000 pixel
     	Thread.sleep(3000);
	
		js.executeScript("window.scrollBy(0,-6000)");//Scroll Up 3000 pixel
		Thread.sleep(3000);

	    js.executeScript("window.scrollBy(5000,0)"); //Scroll Right 5000 pixel
        Thread.sleep(3000);

		js.executeScript("window.scrollBy(-4000,0)"); //Scroll left 4000 pixel

	}

}

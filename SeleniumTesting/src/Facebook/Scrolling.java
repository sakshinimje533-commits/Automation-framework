package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		//driver.get("https://www.facebook.com/");
        driver.get("https://www.amazon.in/");
		//driver.manage().window().maximize();
		
		WebElement bestSeller = driver.findElement(By.xpath("//span[text()='Best Sellers in Clothing & Accessories']"));
		//WebElement Date_of_Birth = driver.findElement(By.xpath("//div[text()='Date of birth']"));
       //WebElement Login = driver.findElement(By.xpath("//button[@value='1']"));
        Thread.sleep(3000);

		

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)"); //Scroll Down 5000 pixel
     	Thread.sleep(3000);
//		
		js.executeScript("window.scrollBy(0,-3000)");//Scroll Up 3000 pixel

		Thread.sleep(3000);

	    js.executeScript("window.scrollBy(5000,0)"); //Scroll Right 5000 pixel

		Thread.sleep(3000);

		js.executeScript("window.scrollBy(-4000,0)"); //Scroll left 4000 pixel

//		
		//Scroll Down until expected element is not visible
		//js.executeScript("arguments[0].scrollIntoView(true);", Login);

		js.executeScript("arguments[0].scrollIntoView(true);", bestSeller);
		Thread.sleep(3000);

		js.executeScript("window.scrollBy(0,-200)");

		

		
	}

}

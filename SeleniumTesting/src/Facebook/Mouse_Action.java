package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Action {
	
	public static void main(String[] args) throws InterruptedException {

		 WebDriver driver = new ChromeDriver();

		 driver.get("https://www.flipkart.com/");

		 

		 Thread.sleep(5000);

		 WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));

		 WebElement seller = driver.findElement(By.xpath("(//span[text()='Become s Seller'])[1]"));

		 WebElement women = driver.findElement(By.xpath("(//span[text()='Become s Seller'])[1]"));

		 WebElement sarres = driver.findElement(By.xpath("(//span[text()='Become s Seller'])[1]"));

		 

		 Actions act = new Actions(driver);

		 act.moveToElement(women).moveToElement(sarres).click().build().perform();

		 System.out.println("============================");

	}

}

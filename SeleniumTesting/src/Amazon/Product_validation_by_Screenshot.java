package Amazon;

import java.io.File;
import java.io.IOException;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Product_validation_by_Screenshot {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement fashion = driver.findElement(By.xpath("//a[text()='Fashion']"));
		fashion.click();
		//Actions act = new Actions(driver);
		//act.moveToElement(fashion).click().build().perform();
		
		WebElement amazon_fashion = driver.findElement(By.xpath("//img[@alt='Amazon Fashion']"));
		amazon_fashion.click();
		
		WebElement jewellery = driver.findElement(By.xpath("//img[@alt ='Jewellery']"));
		//jewellery.clear();
		Actions act = new Actions(driver);
		act.moveToElement(jewellery).click().build().perform();
		
		WebElement ring = driver.findElement(By.xpath("//img[@alt='Everyday Fine Jewellery']"));
		act.moveToElement(ring).click().build().perform();
		
		WebElement coins = driver.findElement(By.xpath("//img[@alt='Coins & Bars']"));
		act.moveToElement(coins).click().build().perform();
		
		TakesScreenshot t = (TakesScreenshot)driver;
		File src = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\SakshiNimje\\Documents\\sakshi.png");
		FileHandler.copy(src, des);
		Thread.sleep(5000);
	}

}

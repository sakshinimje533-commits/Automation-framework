package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_TO_Card {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Search_Box = driver.findElement(By.xpath("//input[@type='text']"));
		Search_Box.sendKeys("Iphone17pro");
		Search_Box.sendKeys(Keys.ENTER);
		
	}
	

}

package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mouse_Action1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		WebElement Search_Box = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		Search_Box.sendKeys("watch");
		
		
		//driver.close();
		
		
		
	}

}

package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10000));
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
	}

}

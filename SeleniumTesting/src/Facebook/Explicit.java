package Facebook;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10000));
		
		WebElement userName = driver.findElement(By.xpath("//input[@name='email']"));
		
		WebElement passWord = driver.findElement(By.xpath("//input[@name='pass']"));
		
		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		WebElement create = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Create new account']")));
	
	    userName.sendKeys("velocity");
	}

}

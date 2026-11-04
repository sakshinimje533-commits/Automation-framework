package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_And_List_Down {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
		WebElement Password = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement LoginBtn = driver.findElement(By.xpath("//span[text()='Log in']"));
		WebElement CreateAcc = driver.findElement(By.xpath("//span[text()='Create new account']"));
		
		CreateAcc.click();
		
	//	WebElement month = driver.findElement(By.xpath("//div[@aria-label='Select month']"));
//		
		WebElement month = driver.findElement(By.xpath("//select[@id='month']"));
		//WebElement month = driver.findElement(By.id("Month"));
		
		Select s = new Select(month);
		
		s.selectByIndex(10);
		Thread.sleep(2000);
		
		s.selectByValue("3");
		Thread.sleep(2000);
		
		s.selectByVisibleText("Mar");
		Thread.sleep(2000);
		
		s.selectByContainsVisibleText("Ju");
		Thread.sleep(2000);
	}

}

package Practice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
	//driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
		WebElement ForgotPass = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
		
		login.click();
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
//		alt.accept();
//		Thread.sleep(5000);
//		alt.dismiss();
//		Thread.sleep(8000);
//		alt.sendKeys("asdfg");
//        alt.getText();
		String text = alt.getText();
		System.out.println(text);
		
		
//		
		alt.sendKeys("velocity");
//	    Thread.sleep(3000);
    //ForgotPass.click();
//	
	}

}

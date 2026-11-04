package Practice;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Pop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.w3schools.com/jsref/met_win_open.asp");
		driver.get("https://www.w3schools.com/js/js_popup.asp");
		
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement Alert_TryItYour =  driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[1]"));
		WebElement Confirm_TryItYour = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[2]"));
		WebElement Prompt_TryItYour = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[3]"));
		WebElement Line_TryItYour = driver.findElement(By.xpath("(//a[text()='Try it Yourself »'])[4]"));
		
		String url = driver.getCurrentUrl();
		System.out.println(url);
		
		Alert_TryItYour.click();
		Confirm_TryItYour.click();
		Prompt_TryItYour.click();
		Line_TryItYour.click();
		
		url = driver.getCurrentUrl();
		System.out.println(url);
		
		String mainPageAddr = driver.getWindowHandle();
		System.out.println(mainPageAddr);
		
		ArrayList <String> addr = new ArrayList <String> (driver.getWindowHandles());
		System.out.println(addr.get(0));
		System.out.println(addr.get(1));
		System.out.println(addr.get(2));
		System.out.println(addr.get(3));
		System.out.println(addr.get(4));

		driver.switchTo().window(addr.get(0));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(1));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(2));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(3));
		System.out.println(driver.getCurrentUrl());
		
		driver.switchTo().window(addr.get(4));
		System.out.println(driver.getCurrentUrl());
	}

}
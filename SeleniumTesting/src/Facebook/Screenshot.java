package Facebook;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		

		for(int i = 0 ; i <5; i++) {
			TakesScreenshot t = (TakesScreenshot)driver;
			File src = t.getScreenshotAs(OutputType.FILE);
			File des = new File("Documents"+ i + ".png");
			FileHandler.copy(src, des);
			Thread.sleep(5000);
		}
	}

	
}

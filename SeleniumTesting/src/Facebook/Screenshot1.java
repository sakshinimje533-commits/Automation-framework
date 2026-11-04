package Facebook;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.latest.filesystem.model.File;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	
private static void main(String[] args) throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in/");
	Thread.sleep(3000);
	
//	TakesScreenshot t = (TakesScreenshot)driver;
//	java.io.File src = t.getScreenshotAs(OutputType.FILE);
//	
//	File des = new File("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\SS.png");
//	
//	FileHandler.copy(src, des);
//	Thread.sleep(5000);
//	
//	TakesScreenshot t = (TakesScreenshot)driver;
//	java.io.File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//	File des = new File("C:\\Users\\SakshiNimje\\OneDrive\\Documents\\SS.png", null, null, null);
//	FileHandler.copy(src, des);
//	Thread.sleep(5000);
	
//	TakesScreenshot t = (TakesScreenshot)driver;
//	File src = t.getScreenshotAs(OutputType.FILE);
//	File des = new File("C:\\Users\\SakshiNimje\\Documents\\sakshi.png");
//	FileHandler.copy(src, des);
//	Thread.sleep(5000);
	
	
	
	
}

}

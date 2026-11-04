package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Exp1 {
	public static void main(String[] args) throws InterruptedException {
		
	
	
//	WebDriver driver=new ChromeDriver();
//	driver.manage().window().maximize();
//	driver.get("https://www.facebook.com/");
//	Thread.sleep(2000);
//	List<WebElement> TotalNobutton = driver.findElements(By.tagName("button"));
//	Thread.sleep(3000);
//	System.out.println(TotalNobutton.size());
	//System.out.println(TotalNoofLinks);
	
//	for(WebElement t:TotalNobutton) {
//		System.out.println(t.getText());
//	}
//	

		

	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	       // driver.get("https://www.facebook.com/");
	        //driver.get("https://www.instagram.com/?hl=en");
	        driver.get("https://demoqa.com/");
	        //driver.get("https://demo.guru99.com/");
	        
	        Thread.sleep(5000);

//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("button")));

	       List<WebElement> totallink = driver.findElements(By.tagName("a")); // link show
	       //List<WebElement> totalButtons = driver.findElements(By.tagName("button")); //button show
	       // List<WebElement> totalimg = driver.findElements(By.tagName("img")); // img show

	       System.out.println("Total Link: " + totallink.size()); 
	       //System.out.println("Total Buttons: " + totalButtons.size());
	       // System.out.println("Total img: " + totalimg.size());

	       for (WebElement link : totallink) {
	            System.out.println(link.getText());
	        }
	       
//	        for (WebElement button : totalButtons) {
//	            System.out.println(button.getText());
//	        }
//	        
//	        for (WebElement img : totalimg) {
//	            System.out.println(img.getText());
//	        }

	        driver.close();

}
}
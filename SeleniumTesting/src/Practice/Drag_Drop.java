package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Drag_Drop {
	
//	public static void main(String[] args) throws InterruptedException {
//		WebDriver driver = new ChromeDriver();
//		driver.get("https://www.facebook.com/");
//		driver.manage().window().maximize();
//		
//		Thread.sleep(2000);
//		
//		
//		WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
//		WebElement Password = driver.findElement(By.xpath("//label[text()='Password']"));
//		//WebElement CreateAcc = driver.findElement(By.xpath("//span[text()='Create new account']"));
//		
//		Actions act = new Actions(driver);
//		//act.dragAndDrop(CreateAcc, Username).perform();
//		//act.moveToElement(CreateAcc).clickAndHold().moveToElement(Username).release().build().perform();
//		//act.dragAndDrop(Password, Username).perform();
//		act.moveToElement(Password).clickAndHold().moveToElement(Username).release().build().perform();
//		driver.close();
//	}

	

	public static void main(String args[]) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.flipkart.com/");
	driver.manage().window().maximize();
	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));

	//pop up close
	 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='b3wTlE']")));

    WebElement popup=driver.findElement(By.xpath("//span[@class='b3wTlE']"));
    popup.click();
	
	
	WebElement searchbar=driver.findElement(By.xpath("(//input[@class='nw1UBF v1zwn25'])[1]"));
	searchbar.sendKeys("samsung");
	Thread.sleep(2000);
	
	String productname="samsung fold 8 ultra";
	
	//wait for suggestion to appear
 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[contains(@class,'Swx5kP')]")));
 
List<WebElement> products = driver.findElements(By.xpath("//li[contains(@class,'Swx5kP')]"));


	boolean productfound=false;
	
	for(int i=0;i<products.size();i++)
	{
		if(products.get(i).getText().equalsIgnoreCase(productname)) 
		{
			System.out.println("samsung fold 8 ultra available");
			products.get(i).click();
			productfound=true;
			break;
	}
		
	}
	if(productfound==false)
	{
	System.out.println("product not available")	;
	}
	Thread.sleep(4000);
	driver.close();
	}
	

}

package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Searchgetalloptions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		
		WebElement searchbar=driver.findElement(By.xpath("//input[@class='nw1UBF v1zwn25'] [1]"));
		searchbar.sendKeys("samsung");
		Thread.sleep(3000);
		//pop up close
	    WebElement popup=driver.findElement(By.xpath("//span[@class='b3wTlE']"));
	    popup.click();
		
		//searchbar.sendKeys(Keys.ENTER);
		String productname="samsung fold 8 ultra";
		
		List<WebElement> products = driver.findElements(
		        By.xpath("//div[@class='dKRkjn']//li"));
		
		for(int i=0;i<=products.size();i++)
		{
			if(products.get(i).getText().equalsIgnoreCase(productname)) 
			{
				System.out.println("samsung fold 8 ultra available");
				products.get(i).click();
			}
			else
			{
			System.out.println("product not available")	;
			}
		}
		
		driver.close();
		}
		
	

	}



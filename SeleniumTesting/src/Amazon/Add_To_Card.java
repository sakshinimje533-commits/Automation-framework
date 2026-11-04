package Amazon;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Add_To_Card {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		WebElement search_box = driver.findElement(By.xpath("//input[@role='searchbox']"));
		
		//search_box.click();
		search_box.sendKeys("ONEPLUS");
		search_box.sendKeys(Keys.ENTER);
		//h2[contains(@aria-label,'OnePlus 13s')][1]
		
		List<WebElement> first_product = driver.findElements(By.xpath("//h2[contains(@class,'a-size-medium a-spacing')]"));
		first_product.get(1).click();
		
		//Verify that a product can be added to the cart.
		WebElement add_to_card = driver.findElement(By.xpath("//input[@value='Add to Cart']"));
		add_to_card.click();
		

	}

}

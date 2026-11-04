package Practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exp2 {
	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		//options.addArguments("incognito");
		options.addArguments("start-maximized");
		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("velocity");
		Thread.sleep(3000);
		List<WebElement> result = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		Thread.sleep(3000);
		System.out.println(result.size());//10
		
		for(int i = 0 ; i <= 10 ; i++) {
			System.out.println(result.get(i).getText());
		}
		driver.close();
		
		
	}

}

//Output
//=======
//10
//velocity
//velocity formula
//velocity meaning
//velocity group
//Velocity · 1st Floor, Pradnya Empire Deep Bunglow Chowk, Gokhale Rd, Model Colony, Shivajinagar, Pune, Maharashtra
//velocity shipping
//velocity classes pune
//velocity meaning in marathi
//Velocity Entertainmentz
//Amusement park · Village Bhose, Panchgani, Mahabaleshwar Road, Mahabaleshwar, Bhose, Maharashtra
//velocity business solutions
//velocity definition

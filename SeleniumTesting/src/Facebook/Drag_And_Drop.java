package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	
       public static void main(String[] args) {

		

		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

		WebElement userName = driver.findElement(By.xpath("//input[@type='text']"));
        WebElement passWord = driver.findElement(By.xpath("//input[@type='password']"));
       passWord.click();

		WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));
		//WebElement loginBtn = driver.findElement(By.xpath("//button[@name='login']"));

		//loginBtn.click();

		//WebElement createAcc = driver.findElement(By.xpath("//a[text()='Create new account']"));
		WebElement CreateAcc = driver.findElement(By.xpath("//span[text()='Create new account']"));
		CreateAcc.click();

		

		WebElement firstName = driver.findElement(By.xpath("//input[@name='firstname']"));
		WebElement learnMore = driver.findElement(By.xpath("//a[text()='Learn more']"));	
		Actions act = new Actions(driver);

		act.dragAndDrop(learnMore ,firstName).perform();

		//Alternative for drag and drop

		act.moveToElement(learnMore).clickAndHold().moveToElement(firstName).release().build().perform();

	}



}

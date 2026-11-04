package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDown {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        WebElement Username = driver.findElement(By.xpath("//input[@name='email']"));
        Username.click();
        WebElement Password = driver.findElement(By.xpath("//input[@type='password']"));
        Password.click();
        WebElement LoginBtn = driver.findElement(By.xpath("//div[@role='button']"));
        LoginBtn.click();
        
        WebElement CreateAcc = driver.findElement(By.xpath("//span[text()='Create new account']"));
        CreateAcc.click();
        
        WebElement Firstname = driver.findElement(By.xpath("//label[text()='First name']"));
        WebElement Lastname = driver.findElement(By.xpath("//label[text()='Surname']"));
        
        Actions act = new Actions(driver);
        act.dragAndDrop(Lastname, Firstname).perform();
        


}
}
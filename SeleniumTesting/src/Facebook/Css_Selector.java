package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css_Selector {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		                                                          //tagname
		WebElement serach_box = driver.findElement(By.cssSelector("input"));
		
		                                            //ID
		                                            //cssSelector("#attributeValue of ID")
		WebElement serach_box1 = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
		
		                                           //class
                                                   //cssSelector(".AttributeValue of class")
        WebElement serach_box2 = driver.findElement(By.cssSelector(".class=\"nav-input nav-progressive-attribute\""));
        
                                                   //tagname with ID
                                                   //cssSelector("tagname#attributeValue of ID")
        WebElement serach_box3 = driver.findElement(By.cssSelector("input#twotabsearchtextbox"));
        
                                                   //tagname with class
                                                  //cssSelector(".AttributeValue of class")
        WebElement serach_box4 = driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute"));

                                                  //any attribute
                                                  //cssSelector("tagname[attribute = 'AttributeValue']")
        WebElement serach_box5 = driver.findElement(By.cssSelector("//input[@type='text']"));

        
	}

}

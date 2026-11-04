package Practice;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Set_Position {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		Point p = new Point(600, 300);
//		driver.manage().window().setPosition(p);
		//OR
		driver.manage().window().setPosition(new Point(300,500));
		//driver.manage().window().setPosition(new Point(0,0));//top left
		//driver.manage().window().setPosition(new Point(100,0));// 100 pixel right
		//driver.manage().window().setPosition(new Point(0,300));//300 pixel down
		//driver.manage().window().setPosition(new Point(1000,0)); //
		driver.get("driver.get(\"https://www.facebook.com/\");");
		
	}

}

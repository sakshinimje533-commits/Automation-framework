package Practice;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Set_Size {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		Dimension d = new Dimension(1200,400);
		driver.manage().window().setSize(d);
    
		//driver.manage().window().setSize(new Dimension(300,500));
//		
		driver.get("https://www.facebook.com/");
	}

}

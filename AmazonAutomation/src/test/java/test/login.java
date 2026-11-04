package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	public static void main(String[] args) {
		
		System.out.println("Hello Maven");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://mvnrepository.com/");
		
	}

}

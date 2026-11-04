package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClassNG {
	
	//A method under @BeforeClass annotation will be execute before the class (tagname)
	@BeforeClass
	public void launchBrowser() {
		System.out.println("Before Class TestClass");
	}
	
	//A method under @BeforeMethod annotation will be execute before the every @Test (test method)
	@BeforeMethod
	public void stepRequirement() {
		System.out.println("Before Methods TestClass");
	}
		
	@Test
	public void addToCard() {
		System.out.println("Test Add To Card Test Class");
	}
	
	@Test
	public void buyProduct() {
		System.out.println("Test buyProduct Test Class");
	}
	
	//A method @AfterMethod annotation will be execute after the every @Test (test method)
	@AfterMethod
	public void postVerification() {
		System.out.println("After Method TestClass");
	}
	
	//A method @AfterMethod annotation will be execute after the every @Test (test method)
		@AfterClass
		public void closeBrowser() {
			System.out.println("After Class TestClass");
		}

}

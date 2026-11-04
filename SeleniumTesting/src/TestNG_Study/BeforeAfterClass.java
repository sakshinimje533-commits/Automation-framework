package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterClass {
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Before Class is running",true);
	}
	
  @Test
  public void f() {
	  Reporter.log("Test Method is running",true);
  }
  
  @Test
  public void f1() {
	  Reporter.log("Test Method1 is running",true);
  }
  
//  Before Class is running
//  Test Method is running
//  Test Method1 is running
//  After Class is running
//  PASSED: TestNG_Study.BeforeAfterClass.f
//  PASSED: TestNG_Study.BeforeAfterClass.f1
  
  @AfterClass
  public void afterClass() {
		Reporter.log("After Class is running",true);
	}
  
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method is Running",true);
  }
  
  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method is Running",true);
  }
  
 //jitkya vela @Test method ahe titkya vela before after method run hoil
//  Before Class is running
//  Before Method is Running
//  Test Method is running
//  After Method is Running
//  Before Method is Running
//  Test Method1 is running
//  After Method is Running
//  After Class is running
//  PASSED: TestNG_Study.BeforeAfterClass.f
//  PASSED: TestNG_Study.BeforeAfterClass.f1
}

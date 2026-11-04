package TestNG_Study;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNew {
	
  @Test
  public void test() {
	  Reporter.log("Test Method is running", true);
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  Reporter.log("Before Method is running", true);	  
  }

  @AfterMethod
  public void afterMethod() {
	  Reporter.log("After Method is running", true);
  }

  @BeforeClass
  public void beforeClass() {
	  Reporter.log("Before Class is running", true);
  }

  @AfterClass
  public void afterClass() {
	  Reporter.log("After Class is running", true);
  }

  @BeforeTest
  public void beforeTest() {
	  Reporter.log("Before Test is running", true);
  }

  @AfterTest
  public void afterTest() {
	  Reporter.log("After Test is running", true);
  }

  @BeforeSuite         //@BeforeSuit ekdach run honar
  public void beforeSuite() {
	  Reporter.log("Before Suite is running", true);
  }

  @AfterSuite
  public void afterSuite() {
	  Reporter.log("After Suite is running", true);
  }

}


//Output
//=============
//Before Suite is running
//Before Test is running
//Before Class is running
//Before Method is running
//Test Method is running
//After Method is running
//After Class is running
//After Test is running
//PASSED: TestNG_Study.TestNew.test
//
//===============================================
//    Default test
//    Tests run: 1, Failures: 0, Skips: 0
//===============================================
//
//After Suite is running
//
//===============================================
//Default suite
//Total tests run: 1, Passes: 1, Failures: 0, Skips: 0
//===============================================
//
//

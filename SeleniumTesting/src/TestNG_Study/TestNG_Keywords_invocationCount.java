package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG_Keywords_invocationCount {
	
	
	@Test (invocationCount = 2)
  public void Grieet() {
	  Reporter.log("Hello Good Morning Sakshi", true);
  }
  
  @BeforeMethod
  public void Hi() {
	  Reporter.log("Before Method is running", true);
  }
  
  @AfterMethod
  public void Helli() {
	  Reporter.log("After Method is running", true);
  }

  @Test 
  public void Bye() {
	  Reporter.log("Good Night Sakshi", true);
  }
}

package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EXP1 {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running", false);
	  Assert.fail();
  }
  
  @Test
  public void TC2() {
	  Reporter.log("TC2 is running", false);
  }
}


//In a test class if one of the test method is fail 
//then TestNG will stop execution of failed test methods 
//& after test methods execution will be continued

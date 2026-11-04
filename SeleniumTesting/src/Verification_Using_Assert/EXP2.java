package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EXP2 {
  @Test
  public void TC1() {
	  Reporter.log("TC1 is running", false);//output- failed
	  Assert.fail();
  }
  
  @Test(dependsOnMethods = "TC1")
  public void TC2() {
	  Reporter.log("TC2 is running", false); //output-skiped
  }
}

//In a test class if one of the test method is failed 
//and that test method execution required for 
//other test method execution then other test methods will be skipped.

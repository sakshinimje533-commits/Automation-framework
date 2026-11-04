package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertFalse4 {
  @Test(enabled = false)
  public void TC4() {
	  
	  boolean Result = true;
	  Assert.assertFalse(Result, "Result is True");
	  Reporter.log("TC4 is runnig", true);
  }
}



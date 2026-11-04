package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertTrue3 {
  @Test
  public void TC3() {
	  
	 boolean Result = true;
	 Assert.assertTrue(Result, "Result is false");
	 Reporter.log("TC3 is running", true);
  }
}

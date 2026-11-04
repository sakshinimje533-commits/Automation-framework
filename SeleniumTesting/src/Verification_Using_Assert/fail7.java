package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class fail7 {
  @Test
  public void TC7() {
	  
	  Reporter.log("Assert fail check", true);
	  Assert.fail();
	  Reporter.log("TC7 is running", true);
  }
}

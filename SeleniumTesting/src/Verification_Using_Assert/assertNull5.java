package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNull5 {
  @Test
  public void TC5() {
	  
	 // String str = "ABC";
	  String str = null;
	  Assert.assertNull(str, "Value is not null");
	  Reporter.log("TC5 is running", true);
  }
}

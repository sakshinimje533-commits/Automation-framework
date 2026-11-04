package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNotNull6 {
	
  @Test
  public void TC6() {
	  
	  String str = "ABC";
	  Assert.assertNotNull(str, "Value is not null");
	  Reporter.log("TC6 is running", true);
	  
	  
  }
}

package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertEquals1 {
  @Test
  public void TC1() {
	  
	  String ExpectedResult = "SinhgadPune";
	  String ActualResult = "Sinhgad";
	  
	  Assert.assertEquals(ActualResult, ExpectedResult,"Result is not matching");
	  Reporter.log("TC1 is running", true);
	  
  }
}

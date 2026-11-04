package Verification_Using_Assert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class assertNotEquals2 {
	
	@Test
	public void TC2() {
		
		String ExpectedResult = "SinhgadPune";
		String ActualResult = "Sinhgad";
		
		
		Assert.assertNotEquals(ActualResult, ExpectedResult, "Result is not matching");
		Reporter.log("TC2 is running", true);
	}

	
	
  
}


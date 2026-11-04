package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Hard_Assert {
  @Test
  public void sample() {
	  
	  String str = "Hello";
	  Assert.assertEquals(str, "Hi");
	  
	  String str1 = "Hi";
	  Assert.assertEquals(str1, "Hi");
	  
	  Reporter.log("Hi", true);
  }
}

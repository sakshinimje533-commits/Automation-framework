package Verification_Using_Assert;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class HardAssert {
 

  @Test
  public void f() {
	  
	  String str = "Sakshi";
	  String str1 = "Sakshi";
	  //String str1 = "sakshi";//error assert equal
	  
	  Assert.assertEquals(str, str1, "str and str1 are not match");
	  Reporter.log("TC1 is running", true);
  }
  
  @Test
  public void f1() {
	  
	  String str = "Sakshi";
	  String str1 = "sakshi";
	 // String str1 = "Sakshi";//error assert not equal
	  
	  Assert.assertNotEquals(str, str1, "str and str1 are match");
	  Reporter.log("TC2 is running", true);
  }
  
  @Test
  public void f2() {
	  
	  int a = 10;
	  //int b = 20; error
	  int b = 10;
	  
     // Object result = a.equals(b);
	  
	  boolean reult = a == b;
	  
	  Assert.assertEquals(reult, "a and b are not match");
      Reporter.log("TC3 is running", true);
  }
  
  @Test
  public void f3() {
	  
	  String str = "Sakshi";
	  String str1 = "Sakshi";
	  
	  boolean result = str.equals(str1);
	  
	  Assert.assertEquals(result, "str and str1 are not match");
	  Reporter.log("TC4 is running", true);
	  
  }
  
  @Test
  public void f4() {
	  
	  String str = "Sakshi";
	  String str1 = "akshi";
	  
	  boolean result = str.equals(str1);
	  
	  Assert.assertNotEquals(result, "str and str1 are  match");
	  Reporter.log("TC5 is running", true);
	  
  }
  
  @Test
  public void f5() {
	  
	  String str = null;
	  //String str = "Sakshi";
	 
	  Assert.assertNull(str, "Value is not null");
	  Reporter.log("TC6 is running", true);
	  
  }
  
  
  @Test
  public void f6() {
	  
	  //String str = null;
	  String str = "Sakshi";
	 
	  Assert.assertNotNull(str, "Value is null");
	  Reporter.log("TC7 is running", true);
	  
  }
  
  @Test
  public void f7() {
	  
	  Reporter.log("TC is running", true);
	  Assert.assertNull("Value is not null");
	  //Assert.fail(); 
	  Reporter.log("TC8 is running", true);
	  Assert.fail();
  }
  
  
 
  
}

package Verification_Using_Assert;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SOFTAssert {
  @Test
  public void f() {
	  
	  String str = "Sakshi";
	  String str1 = "Sakshi";
	 // String str1 = "akshi";
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertEquals(str, str1, "str and str1 are not same");
	  Reporter.log("TC is running");
	  
	  soft.assertAll();
  }
  
  @Test
  public void f1() {
	  String str = "Sakshi";
	//  String str1 = "Sakshi";
	  String str1 = "akshi";
	  
	  SoftAssert soft = new SoftAssert();
	  soft.assertNotEquals(str, str1, "str and str1 are not same");
	  Reporter.log("TC is running");
	  
	  soft.assertAll();
  }
  
  @Test
  public void f2() {
	  int a = 10;
	  int b = 10; 
	 // int b = 20; error yenar assert true
	  
	  //boolean result = (a.equals(b));
	  boolean result =  a == b;
	  
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertTrue(result, "a and b are not same");
	  Reporter.log("TC is running");
	  soft.assertAll();
	  
  }
  
  @Test
  public void f3() {
	  int a = 10;
	  int b = 20; 
	 // int b = 10; error yenar assert false
	  
	  boolean result =  a == b;
	  
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertFalse(result, "a and b are same");
	  Reporter.log("TC is running");
	  soft.assertAll();
	  
  }
  
  @Test
  public void f4() {
	 
	  String str = null;
	  //String str = "Sakshi";
	  
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertNull(str, "value is not null");
	  Reporter.log("TC is running");
	  soft.assertAll();
  }
  
  @Test
  public void f5() {
	 
	  //String str = null;
	  String str = "Sakshi";
	  
	  SoftAssert soft = new SoftAssert();
	  
	  soft.assertNotNull(str, "value is null");
	  Reporter.log("TC is running");
	  soft.assertAll();
  }
  
  @Test
  public void f6() {
	 
	  
	  SoftAssert soft = new SoftAssert();
	  
	 // Assert.fail();
	  soft.assertNotNull("Assert fail check");
	  //Assert.fail();
	  Reporter.log("TC is running");
	  Assert.fail();
	  soft.assertAll();
  }
  
}

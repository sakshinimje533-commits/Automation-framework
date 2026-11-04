package Verification_Using_Assert;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class Soft_Assert {
	
	SoftAssert soft = new SoftAssert();
	
  @Test
  public void myTest() {
	  
	  String a = "Pune";
	  String b = "Mumbai";
	  
	//Soft_Assert soft = new Soft_Assert();
	
	  
	  soft.assertEquals(a, b, "a and b are not equals , TC is failed");
	  //soft.assertNotNull(a, "a is not null , TC is failed ");
	  soft.assertNull(a, "a is not null , TC is failed ");
	  
	 soft.assertAll();// assert.all nhi dil tr testng prenr pohchnar nhi	
  }
  
  

  @Test
  public void myTest1() {
	  boolean x = true;
	  SoftAssert soft = new SoftAssert();

	  soft.assertTrue(x, "x is false , TC is failed");
	  
	  soft.assertAll();
	  
  }
}

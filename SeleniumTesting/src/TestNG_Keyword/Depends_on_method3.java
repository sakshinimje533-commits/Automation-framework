package TestNG_Keyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_method3 {
	@Test(dependsOnMethods = {"b"} )
	  public void a() {
		  Reporter.log("A is running", true);
	  }
	  
	  @Test(invocationCount = 3)
	  public void b() {
		  
		  Reporter.log("B is running", true);
	  }
	  
	  @Test
	  public void c() {
		  Reporter.log("C is running", true);
	  }
}

//B is running
//B is running
//B is running
//C is running
//A is running
//PASSED: TestNG_Keyword.Depends_on_method3.c
//PASSED: TestNG_Keyword.Depends_on_method3.a
//PASSED: TestNG_Keyword.Depends_on_method3.b
//PASSED: TestNG_Keyword.Depends_on_method3.b
//PASSED: TestNG_Keyword.Depends_on_method3.b

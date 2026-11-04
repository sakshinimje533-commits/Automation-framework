package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_method4 {
	@Test(dependsOnMethods = {"b"} , priority = -4)
	  public void a() {
		  Reporter.log("A is running", true);
	  }
	  
	  @Test
	  public void b() {
		  
		  Reporter.log("B is running", true);
	  }
	  
	  @Test
	  public void c() {
		  Reporter.log("C is running", true);
	  }
}

//B is running
//A is running
//C is running
//PASSED: TestNG_Keyword.Depends_on_method4.b
//PASSED: TestNG_Keyword.Depends_on_method4.c
//PASSED: TestNG_Keyword.Depends_on_method4.a
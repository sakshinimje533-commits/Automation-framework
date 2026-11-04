package TestNG_Keyword;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Depends_on_method2 {
	@Test(dependsOnMethods = {"b"} )
	  public void a() {
		  Reporter.log("A is running", true);
	  }
	  
	  @Test
	  public void b() {
		  Assert.fail();
		  Reporter.log("B is running", true);
	  }
	  
	  @Test
	  public void c() {
		  Reporter.log("C is running", true);
	  }
}

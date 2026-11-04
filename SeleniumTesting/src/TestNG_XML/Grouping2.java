package TestNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping2 {
	@Test(groups = {"sanity"})
	  public void a() {
		  Reporter.log("A is running", true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void b() {
		  Reporter.log("B is runnin g", true);
	  }
	  
	  @Test(groups = {"sanity"})
	  public void c() {
		  Reporter.log("C is running", true);
	  }
	  
	  @Test
	  public void d() {
		  Reporter.log("D is running", true);
	  }
}

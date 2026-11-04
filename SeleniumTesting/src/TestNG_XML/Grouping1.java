package TestNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Grouping1 {
	@Test(groups = {"regression"})
	  public void e() {
		  Reporter.log("E is running", true);
	  }
	  
	  @Test(groups = {"sanity"})
	  public void f() {
		  Reporter.log("F is runnin g", true);
	  }
	  
	  @Test(groups = {"sanity"})
	  public void g() {
		  Reporter.log("G is running", true);
	  }
	  
	  @Test(groups = {"regression"})
	  public void h() {
		  Reporter.log("H is running", true);
	  }
  
}

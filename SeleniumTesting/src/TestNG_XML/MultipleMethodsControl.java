package TestNG_XML;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleMethodsControl {
	@Test
	  public void a() {
		  Reporter.log("A is running", true);
	  }
	  
	  @Test
	  public void b() {
		  Reporter.log("B is runnin g", true);
	  }
	  
	  @Test
	  public void c() {
		  Reporter.log("C is running", true);
	  }
	  
	  @Test
	  public void d() {
		  Reporter.log("D is running", true);
	  }
}

package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Priority1 {
	
	//Alphabetical print honar
	@Test(priority = -4)
	  public void d() {
		  Reporter.log("D is running", true);
	  }
	  
	  @Test (priority = -4)
	  public void b() {
		  Reporter.log("B is running", true);
	  }
	  
	  @Test(priority = -4)
	  public void a() {
		  Reporter.log("A is running", true);
	  }
	  
	  @Test(priority = -4)
	  public void c() {
		  Reporter.log("C is running", true);
	  }
}

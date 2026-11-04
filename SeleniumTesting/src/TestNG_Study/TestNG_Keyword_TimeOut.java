package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keyword_TimeOut {
	@Test
	  public void TC1() 
	  {
		  Reporter.log("TC1 is running", true);
	  }
	  
	@Test
	  public void TC3() 
	  {
		  Reporter.log("TC3 is running", true);
	  }

	  
	  @Test (timeOut = 2000) //failed
	  public void TC2() throws InterruptedException {
		  Reporter.log("TC2 is running", true);
		  Thread.sleep(3000);
	  }
	  
	  @Test (timeOut = 5000) // run
	  public void TC4() throws InterruptedException {
		  Reporter.log("TC2 is running", true);
		  Thread.sleep(3000);
	  }
	  
	  
	  

}

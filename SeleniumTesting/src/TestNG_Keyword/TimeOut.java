package TestNG_Keyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOut {
  @Test(timeOut = 5000 )
  public void a() throws InterruptedException {
	  
	 Reporter.log("A is running", true);
	 Thread.sleep(1000);
  }
}

package TestNG_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG_Keyword_DependsOnMethod {
	 @Test
	  public void Login()
	  {
		  Reporter.log("Login sucess",true);
		  
	  }
	
	@Test
	public void VerifyPin()
	{
	  Reporter.log("Pin Verified",true);
	}
	
	
	@Test (dependsOnMethods = "VerifyPin")
		public void Logout()
	{
		Reporter.log("Logout success", true);
	}

}
